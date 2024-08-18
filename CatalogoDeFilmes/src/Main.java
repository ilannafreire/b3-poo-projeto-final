package CatalogoDeFilmes.src;


public class Main {
    public static void main(String[] args) {
        CatalogoDeFilmes catalogo = new CatalogoDeFilmes();

        Ator ator1 = new Ator("Leonardo DiCaprio");
        Diretor diretor1 = new Diretor("Christopher Nolan");

        Filme filme1 = new Filme("Inception", "2010-07-16", 160000000, "Um ladrão especializado em extrair segredos do subconsciente durante o sonho.");
        filme1.setDiretor(diretor1);
        filme1.adicionarAtor(ator1);

        catalogo.cadastrarFilme(filme1);

        System.out.println(catalogo);

        Filme pesquisado = catalogo.pesquisarFilmePorNome("inception");
        if (pesquisado != null) {
            System.out.println("Filme encontrado:\n" + pesquisado);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
