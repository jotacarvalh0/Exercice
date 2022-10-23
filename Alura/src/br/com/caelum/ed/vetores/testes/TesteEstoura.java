package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Vetor;
import br.com.caelum.ed.Aluno;

public class TesteEstoura {
	public static void main(String[] args) {
		Vetor <Aluno> vetor = new Vetor <Aluno>();
		for (int i = 0; i < 100001; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
	}
}