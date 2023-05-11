package unis.rayane;

public class ConfiguracaoSistemaSingleton {

    private static ConfiguracaoSistemaSingleton instancia = null;
    private String url;
    private String usuario;
    private String senha;

    private ConfiguracaoSistemaSingleton() {
        // Construtor privado para impedir que a classe seja instanciada externamente.
    }

    public static ConfiguracaoSistemaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistemaSingleton();
        }
        return instancia;
    }

    // getters e setters para url, usuario e senha.

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
