package CatalogoDeFilmes.src;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String dataLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        this.atores.add(ator);
    }

    public String getNome() {
        return nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    @Override
    public String toString() {
        return "Filme: " + nome + "\n" +
                "Data de Lançamento: " + dataLancamento + "\n" +
                "Orçamento: " + orcamento + "\n" +
                "Descrição: " + descricao + "\n" +
                "Diretor: " + diretor + "\n" +
                "Atores: " + atores;
    }
}