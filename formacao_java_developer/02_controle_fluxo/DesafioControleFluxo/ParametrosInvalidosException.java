
/**
 * Classe que representa a exceção de negócio no sistema.
 * 
 * @author Breno Santos
 * @version 1.0
 */
public class ParametrosInvalidosException extends Exception
{
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro!");
    }
}