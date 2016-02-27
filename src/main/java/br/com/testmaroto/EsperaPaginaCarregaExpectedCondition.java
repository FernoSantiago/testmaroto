package br.com.testmaroto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class EsperaPaginaCarregaExpectedCondition implements ExpectedCondition<Boolean>{

	//@Override
	public Boolean apply(WebDriver driver) {
		return paginaEstaCarregadaCompletamente(driver) && cabecalhoComTituloEncontradoNaTela(driver) && processandoNaoEstaPresenteNaTela(driver);
	}

	private boolean processandoNaoEstaPresenteNaTela(WebDriver driver) {
		return driver.findElements(By.xpath("//div[@id='processando']")).size() == 0;
	}

	private boolean cabecalhoComTituloEncontradoNaTela(WebDriver driver) {
		return driver.findElements(By.cssSelector("div[class='fundoSuperior']")).size() > 0;
	}

	private boolean paginaEstaCarregadaCompletamente(WebDriver driver) {
		return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
	}

}