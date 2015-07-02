package br.edu.iftm.testProva;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.prova.CalculoDeImposto;

public class TesteProva {
	
	@Test
	public void testCotacaoMenorQue0() 
	{
		CalculoDeImposto c = new CalculoDeImposto();
		c.setCotacaoDoDolar(-3.75);
		c.setProduto(15.80);
		
		Double experado = c.getProduto();
		
		assertEquals(experado, c.conversaoEmDolares());
	}
	@Test
	public void testImpostoDeImportacao() 
	{
		CalculoDeImposto c = new CalculoDeImposto();
		c.setCotacaoDoDolar(2.5);
		c.setProduto(-15.80);
		c.impostoDeImportacao();
		
		Double experado = 0.0;
		
		assertEquals(experado, c.impostoDeImportacao());
	}	
	
	@Test
	public void testImpostoDeImportacaoProdutoMaiorQue50dolares() 
	{
		CalculoDeImposto c = new CalculoDeImposto();
		c.setCotacaoDoDolar(2.5);
		c.setProduto(35.80);
		c.impostoDeImportacao();
		
		Double experado = c.impostoDeImportacao();
		
		assertEquals(experado, c.impostoDeImportacao());
	}	
	
	@Test
	public void testImpostoDeImportacaoProdutoMenorQue50dolares() 
	{
		CalculoDeImposto c = new CalculoDeImposto();
		c.setCotacaoDoDolar(2.5);
		c.setProduto(15.80);
		c.impostoDeImportacao();
		
		Double experado = c.getProduto();
		
		assertEquals(experado, c.impostoDeImportacao());
	}	

	@Test
	public void testImpostoDeImportacaoProdutoIgual50dolares() 
	{
		CalculoDeImposto c = new CalculoDeImposto();
		c.setCotacaoDoDolar(2.0);
		c.setProduto(25.0);
		c.impostoDeImportacao();
		
		Double experado = c.impostoDeImportacao();
		
		assertEquals(experado, c.impostoDeImportacao());
	}	


}
