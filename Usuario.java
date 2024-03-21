public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void locar(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro locado com sucesso [ " + livro.getTitulo() + " ]");
        } else {
            System.out.println("Livro indisponível usuário adicionado na fila de espera: [ " + usuario.getNome() + " ]");
            livro.adicionarUsuarioFilaEspera(usuario);
        }
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", senha=" + senha + "]";
    }

}