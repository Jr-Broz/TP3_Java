package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Operacao {

    private static final Logger LOGGER =

            LoggerFactory.getLogger(App.class);

    void Somar(int x , int y) {int result = x + y;LOGGER.info("Resultado da Operação de:  " + x + "+" + y + "=" + result);}
    public double Multiplicar(double x , double y ) {return x * y;}


    void Subtrair(int x , int y ) {

        int result = x -y;

        if(y > x) {

            LOGGER.error("Error: Y não pode ser maior que X " );
        }
        if(LOGGER.isDebugEnabled()) {

            LOGGER.debug("Debugando teste 001");
            LOGGER.debug("Debugando teste 002");
            LOGGER.debug("Debugando teste 003");
        }
}
public void lancarExcecao() {

        throw new RuntimeException("Exmpl");
}
}