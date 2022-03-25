package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Nome extends Conteudo {

    private List<Conteudo> conteudos;

    public Nome(String descricao) {
        super(descricao);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Nome: " + this.getDescricao() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }
}
