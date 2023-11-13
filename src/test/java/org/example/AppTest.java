package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {

    @Test
    void DeveDarDez() {
   Operacao operacao = new Operacao();

   assertEquals(10, operacao.Multiplicar(5, 2));
    }


    @Test
    void verExcecaoLancada() {

        Operacao operacao = new Operacao();

        assertThrows(RuntimeException.class, () -> {

            operacao.lancarExcecao();
        });
        };
}