public class Cadastro {
    public String login;
    public String senha;

    public Cadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Cadastro() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "Login = " + login + ", senha = " + senha + '}';
    }
}
