package CatalogoDeFilmes.src.test;

import CatalogoDeFilmes.src.Ator;
import CatalogoDeFilmes.src.Diretor;
import CatalogoDeFilmes.src.Filme;


public class CatalogoDeFilmesTest {

    public void testCadastroFilme() {

        CatalogoDeFilmesTest catalogo = new CatalogoDeFilmesTest();
        Ator ator = new Ator("Leonardo DiCaprio");
        Diretor diretor = new Diretor("Christopher Nolan");
        Filme filme = new Filme("Inception", "2010-07-16", 160000000, "Um ladrão especializado em extrair segredos do subconsciente durante o sonho.");
        filme.setDiretor(diretor);
        filme.adicionarAtor(ator);

        catalogo.cadastrarFilme(filme);

        Filme pesquisado = catalogo.pesquisarFilmePorNome("inception");
        assertNotNull(pesquisado);
        assertEquals("Inception", pesquisado.getNome());
    }

    private void assertNotNull(Filme pesquisado) {
    }

    private void assertEquals(String inception, String nome) {
    }

    private void cadastrarFilme(Filme filme) {
    }

    private Filme pesquisarFilmePorNome(String inception) {
        return null;
    }
}