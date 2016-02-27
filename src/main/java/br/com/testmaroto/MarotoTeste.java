package br.com.testmaroto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.testmaroto.util.annotations.InterfaceProvider;
import br.com.testmaroto.util.annotations.ManagedDriver;

@InterfaceProvider(nome = "MAROTO")
public class MarotoTeste implements AcaoUsuario, CompareLabelOperations {
	
	private static final String eq = "eq:";
	
	private static final long TEMPO_PADRAO_ESPERA_PAGINA_CARREGAR = 30L;
	
	@ManagedDriver
	WebDriver driver;

	public WebDriver getDriver() {
		return null;
	}

	public String eq(String label) {
		return eq + label;
	}

	public void esperaPaginaCarregar() {
		new WebDriverWait(driver, TEMPO_PADRAO_ESPERA_PAGINA_CARREGAR).until(new EsperaPaginaCarregaExpectedCondition());
	}

}