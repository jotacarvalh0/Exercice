package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class Teste {
	public static void main(String[] args) {
	Aluno a1 = new Aluno();
	
	a1.setNome("Rafael");
	
	Vetor <Aluno> lista = new Vetor<Aluno>();
	
		lista.adiciona(a1);
		lista.pega(0);
		lista.pega(1);
		lista.pega(100000000);
	}
}
