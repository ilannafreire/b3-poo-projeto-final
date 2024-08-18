package CatalogoDeFilmes.src;

import java.util.ArrayList;
import java.util.List;


public class CatalogoDeFilmes {
    private List<Filme> filmes;

    public CatalogoDeFilmes() {
        this.filmes = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public Filme pesquisarFilmePorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null; // Filme não encontrado
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catálogo de Filmes:\n");
        for (Filme filme : filmes) {
            sb.append(filme).append("\n\n");
        }
        return sb.toString();
    }
}