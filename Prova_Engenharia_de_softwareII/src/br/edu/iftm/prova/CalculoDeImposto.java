package br.edu.iftm.prova;

public class CalculoDeImposto {
	private Double produto;
	private Double cotacaoDoDolar;
	
	public Double getProduto()
	{
		return produto;		
	}
	public void setProduto(Double produto) 
	{
		if (produto > 0) 
		{
			this.produto = produto;
		}
		else
		{
			this.produto = 0.0;
		}
		
	}
	public Double getCotacaoDoDolar() 
	{
		return cotacaoDoDolar;
	}
	public void setCotacaoDoDolar(Double cotacaoDoDolar) 
	{
		if (cotacaoDoDolar > 0) 
		{
			this.cotacaoDoDolar = cotacaoDoDolar;
		}
		else
		{
			this.cotacaoDoDolar = 0.0;	
		}
	}
	
	public Double conversaoEmDolares()
	{
		if (produto>0)
		{
			if (cotacaoDoDolar>0) 
			{
				System.out.println("Valor do produto em reais: R$ " + produto);
				produto = produto * cotacaoDoDolar;
				System.out.println("Valor do produto em Dolares: US$ " + produto);
				
				return produto;
			}
			else
			{
				System.out.println("Valor do produto em reais: R$ " + produto );
				System.out.println("Valor da cotacao do dolar em reais: R$ " + cotacaoDoDolar+ 
						"\nTente uma cotacao com valor MAIOR que zero.");
				return produto;
			}
			
		}
		
		else
		{
			System.out.println("Valor do produto em reais: R$ " + produto + 
					"\nTente um produto com valor MAIOR que zero.");
			return produto;
		}
		
	}
	
	public Double impostoDeImportacao()
	{
		if (produto>0)
		{
			Double valorTotal = 0.0;
			if (produto >= 50) 
			{
				valorTotal = produto + (produto * 0.6);
				System.out.println("O produto custa MAIS que US$ 50,00.");
				System.out.println("Será cobrado o imposto de importação no valor de: US$ " + (produto * 0.6));
				System.out.println("Valor Total " + valorTotal);
				
			}
			else
			{
				valorTotal = produto;
				System.out.println("O produto custa MENOS que US$ 50,00.");
				System.out.println("Não será cobrado o imposto de importação.");
				System.out.println("Valor Total " + valorTotal);
			}
			return valorTotal;
		}
		else
		{
			return 0.0;
		}
				
	}

}
