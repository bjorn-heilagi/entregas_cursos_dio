// Constraints de Unicidade para os IDs
CREATE CONSTRAINT user_id_unique IF NOT EXISTS FOR (u:User) REQUIRE u.id IS UNIQUE;
CREATE CONSTRAINT movie_id_unique IF NOT EXISTS FOR (m:Movie) REQUIRE m.id IS UNIQUE;
CREATE CONSTRAINT series_id_unique IF NOT EXISTS FOR (s:Series) REQUIRE s.id IS UNIQUE;
CREATE CONSTRAINT actor_id_unique IF NOT EXISTS FOR (a:Actor) REQUIRE a.id IS UNIQUE;
CREATE CONSTRAINT director_id_unique IF NOT EXISTS FOR (d:Director) REQUIRE d.id IS UNIQUE;
CREATE CONSTRAINT genre_id_unique IF NOT EXISTS FOR (g:Genre) REQUIRE g.id IS UNIQUE;

// Criar Gêneros
UNWIND [{id: 'g1', name: 'Sci-Fi'}, {id: 'g2', name: 'Drama'}, {id: 'g3', name: 'Action'}] AS genre
CREATE (:Genre {id: genre.id, name: genre.name});

// Criar 10 Usuários
UNWIND range(1, 10) AS i
CREATE (:User {id: 'u' + i, name: 'User ' + i, email: 'user' + i + '@example.com'});

// Criar 06 Filmes
UNWIND range(1, 6) AS i
CREATE (:Movie {id: 'm' + i, title: 'Movie ' + i, release_year: 2020 + i});

// Criar 04 Séries
UNWIND range(1, 4) AS i
CREATE (:Series {id: 's' + i, title: 'Series ' + i, seasons: i + 1});

// Criar Atores e Diretores
CREATE (:Actor {id: 'a1', name: 'Actor One'}), (:Actor {id: 'a2', name: 'Actor Two'});
CREATE (:Director {id: 'd1', name: 'Director Alpha'}), (:Director {id: 'd2', name: 'Director Beta'});

// --- Relacionamentos ---

// 1. in_genre
MATCH (m:Movie), (g:Genre {name: 'Sci-Fi'}) WHERE m.id IN ['m1', 'm2'] CREATE (m)-[:IN_GENRE]->(g);
MATCH (s:Series), (g:Genre {name: 'Drama'}) WHERE s.id IN ['s1', 's2'] CREATE (s)-[:IN_GENRE]->(g);

// 2. acted_in e directed
MATCH (a:Actor {id: 'a1'}), (m:Movie {id: 'm1'}) CREATE (a)-[:ACTED_IN]->(m);
MATCH (d:Director {id: 'd1'}), (m:Movie {id: 'm1'}) CREATE (d)-[:DIRECTED]->(m);
MATCH (a:Actor {id: 'a2'}), (s:Series {id: 's1'}) CREATE (a)-[:ACTED_IN]->(s);

// 3. watched (com propriedade rating)
// Usuário 1 assistiu Filme 1 (Nota 5) e Série 1 (Nota 4)
MATCH (u:User {id: 'u1'}), (m:Movie {id: 'm1'}) CREATE (u)-[:WATCHED {rating: 5, date: datetime()}]->(m);
MATCH (u:User {id: 'u1'}), (s:Series {id: 's1'}) CREATE (u)-[:WATCHED {rating: 4, date: datetime()}]->(s);

// Outros usuários assistindo conteúdos aleatórios
MATCH (u:User), (m:Movie) 
WHERE u.id <> 'u1' AND m.id IN ['m2', 'm3', 'm4']
WITH u, m LIMIT 15
CREATE (u)-[:WATCHED {rating: collect([3,4,5])[0]}]->(m);