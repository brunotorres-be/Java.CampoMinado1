package br.com.bruno.cm;

import br.com.bruno.cm.modelo.Tabuleiro;
import br.com.bruno.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro (6, 6 , 6);
		new TabuleiroConsole(tabuleiro);
		
	}
}
