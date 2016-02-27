package br.com.testmaroto;

import br.com.testmaroto.util.annotations.ManagedInterface;

@ManagedInterface
public class SuperTest {
	
	@ManagedInterface
	static AcaoUsuario testMethods;
	
	/**
	 * Espera a página carregar caso ela esteja esperando a resposta de alguma requisição ou renderizando.
	 */
	public static void esperaPaginaCarregar(){
		testMethods.esperaPaginaCarregar();
	}

}