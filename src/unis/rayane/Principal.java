package unis.rayane;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Exemplo de Singleton");
		
		ConfiguracaoSistema cs1 = new ConfiguracaoSistema();
		ConfiguracaoSistema cs2 = new ConfiguracaoSistema();
		
		System.out.println(cs1);
		System.out.println(cs2);
		
		ConfiguracaoSistemaSingleton css1 = ConfiguracaoSistemaSingleton.getInstancia();
		css1.setUrl("https://meubancodedados.com");
		css1.setUsuario("admin");
		css1.setSenha("batata");
		
		System.out.println(css1);
		
		ConfiguracaoSistemaSingleton css2 = ConfiguracaoSistemaSingleton.getInstancia();
		
		System.out.println(css2);
		System.out.println(css2.getUrl());
	}
}
