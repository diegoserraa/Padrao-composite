package padroesestruturais.composite;

public class Ingrediente extends Conteudo {

    private int valor;

    public Ingrediente(String descricao, int valor) {
        super(descricao);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getConteudo() {
        return "Ingrediente: " + this.getDescricao() + " - valor: " + this.valor + "\n";
    }

}
