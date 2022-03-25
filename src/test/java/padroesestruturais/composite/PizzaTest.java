package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void deveRetornarSaborDaPizza() {
        Nome nome1 = new Nome("Pizza mussarela");

        Nome nome2 = new Nome("Pizza Frango com catupiri");
        Ingrediente ingrediente21 = new Ingrediente("catupiry", 10);
        nome2.addConteudo(ingrediente21);

        Nome nome3 = new Nome("Pizza Portuguesa");
        Ingrediente ingrediente31 = new Ingrediente("pimentao", 3);
        Ingrediente ingrediente32 = new Ingrediente("milho", 4);
        nome3.addConteudo(ingrediente31);
        nome3.addConteudo(ingrediente32);

        Nome sabor = new Nome("pizza de algo");
        sabor.addConteudo(nome1);
        sabor.addConteudo(nome2);
        sabor.addConteudo(nome3);

        Pizza pizza = new Pizza();
        pizza.setSabor(sabor);

        assertEquals("Nome: pizza de algo\n" +
                "Nome: Pizza mussarela\n" +
                "Nome: Pizza Frango com catupiri\n" +
                "Ingrediente: catupiry - valor: 10\n" +
                "Nome: Pizza Portuguesa\n" +
                "Ingrediente: pimentao - valor: 3\n" +
                "Ingrediente: milho - valor: 4\n", pizza.getSabor());
    }

    @Test
    void deveRetornarExecacaoPizzaSemSabor() {
        try {
            Pizza disciplina = new Pizza();
            disciplina.getSabor();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pizza sem sabor", e.getMessage());
        }
    }
}