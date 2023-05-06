/**
 * <h1>Calculadora</h1>
 * A calculadora realiza operações matemáticas entre números inteiros.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author HuemersonFMG
 * @version 0.0.1
 * @sinse 06/05/2023
 */

public class Calculadora {
    /**
     * Este metodo é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   -> Este é o primeiro parametro do metodo
     * 
     * @param numeroDois -> Este é o segundo parametro do metodo
     * 
     * @return -> int o resultado deste metodo é a soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}

/*
 * Usar no terminal para gerar documentaação em HTML
 * javadoc -encoding UTF8 -docencoding ISO-8859-1 -d.. /docs src/*.java
 */