package padroesestruturais.composite;

public class Pizza  {

    private Conteudo sabor;

    public void setSabor(Conteudo sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        if (this.sabor == null) {
            throw new NullPointerException("Pizza sem sabor");
        }
        return this.sabor.getConteudo();
    }
}
