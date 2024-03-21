package back;
public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean logIn() {
        if (this.nome.equals("admin") && this.senha.equals("admin")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", senha=" + senha + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}