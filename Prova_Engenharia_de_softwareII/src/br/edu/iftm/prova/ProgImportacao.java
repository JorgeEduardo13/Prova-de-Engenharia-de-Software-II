package br.edu.iftm.prova;

public class ProgImportacao {

	public static void main(String[] args) {
		CalculoDeImposto c = new CalculoDeImposto();
		c.setProduto(33.75);
		c.setCotacaoDoDolar(-3.50);
		c.conversaoEmDolares();
		c.impostoDeImportacao();

	}

}
