import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        Usuario usuario1 = new Usuario("Carlos", "qwerty");
        Usuario usuario2 = new Usuario("Ana", "senha123");
        Usuario usuario3 = new Usuario("Pedro", "senha456");
        Usuario usuario4 = new Usuario("Juliana", "abc123");
        Usuario usuario5 = new Usuario("Fernando", "654321");
        Usuario usuario6 = new Usuario("Mariana", "senha789");
        Usuario usuario7 = new Usuario("Lucas", "senhaabc");
        Usuario usuario8 = new Usuario("Camila", "senhaxyz");
        Usuario usuario9 = new Usuario("Rafael", "senha456");
        Usuario usuario10 = new Usuario("Isabela", "senha789");

        Usuario usuarioPrincipal = new Usuario();

        Livro livro6 = new Livro("Crepúsculo");
        Livro livro7 = new Livro("O Código Da Vinci");
        Livro livro8 = new Livro("A Culpa é das Estrelas");
        Livro livro9 = new Livro("Orgulho e Preconceito");
        Livro livro10 = new Livro("A Menina que Roubava Livros");
        Livro livro11 = new Livro("A Revolução dos Bichos");
        Livro livro12 = new Livro("A Cabana");
        Livro livro13 = new Livro("O Pequeno Príncipe");
        Livro livro14 = new Livro("A Arte da Guerra");
        Livro livro15 = new Livro("O Poder do Hábito");

        // Criando mais categorias
        Categoria romance = new Categoria("Romance");
        Categoria suspense = new Categoria("Suspense");
        Categoria autoajuda = new Categoria("Autoajuda");

        biblioteca.adicionarCategoria(autoajuda);
        biblioteca.adicionarCategoria(romance);
        biblioteca.adicionarCategoria(suspense);

        // Adicionando livros às categorias
        romance.adicionarLivro(livro6);
        romance.adicionarLivro(livro7);
        romance.adicionarLivro(livro8);

        suspense.adicionarLivro(livro9);
        suspense.adicionarLivro(livro10);

        autoajuda.adicionarLivro(livro11);
        autoajuda.adicionarLivro(livro12);
        autoajuda.adicionarLivro(livro13);
        autoajuda.adicionarLivro(livro14);
        autoajuda.adicionarLivro(livro15);

        // Definindo disponibilidade de livros
        livro6.setDisponivel(true);
        livro7.setDisponivel(true);
        livro8.setDisponivel(true);
        livro9.setDisponivel(false);
        livro10.setDisponivel(false);
        livro11.setDisponivel(true);
        livro12.setDisponivel(true);
        livro13.setDisponivel(true);
        livro14.setDisponivel(false);
        livro15.setDisponivel(true);

        livro9.adicionarUsuarioFilaEspera(usuario1);
        livro9.adicionarUsuarioFilaEspera(usuario2);
        livro9.adicionarUsuarioFilaEspera(usuario3);
        livro9.adicionarUsuarioFilaEspera(usuario4);

        livro10.adicionarUsuarioFilaEspera(usuario5);
        livro10.adicionarUsuarioFilaEspera(usuario6);
        livro10.adicionarUsuarioFilaEspera(usuario8);
        livro10.adicionarUsuarioFilaEspera(usuario9);

        boolean continuar = true;
        boolean logado = false;
        int resposta = 0;

        // As credenciais de login são admin, admin

        do {
            System.out.println("Digite seu nome de usuário");
            usuarioPrincipal.setNome(scanner.next());

            System.out.println("Digite sua senha");
            usuarioPrincipal.setSenha(scanner.next());

            logado = usuarioPrincipal.logIn();

            if (!logado) {
                System.out.println("Usuario ou senha incorretos tente novamente");
            }

        } while (logado == false);

        do {
            System.out.println("------ Menu ------");
            System.out.println("1: Locar livro");
            System.out.println("2: Devolver livro");
            System.out.println("3: Consultar livro");
            System.out.println("4: Sair");
            resposta = scanner.nextInt();

            if (resposta == 1) {
                biblioteca.exibirCategoriasDisponiveis();
                System.out.println("Digite o número da categoria em que quer explorar");
                resposta = scanner.nextInt();

                biblioteca.getLivrosCategoria(resposta);

                System.out.println("Qual livro deseja locar ?");
                resposta = scanner.nextInt();
            }

            if (resposta == 4)
                continuar = false;

        } while (continuar == true);

    }
}
