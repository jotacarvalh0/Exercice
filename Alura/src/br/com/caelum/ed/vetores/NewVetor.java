package br.com.caelum.ed.vetores;
import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class NewVetor {
	public static void main(String[] args) {
	Vetor <Aluno> vetor = new Vetor <Aluno>();
	System.out.println(vetor);
	for (int i = 0; i < 1000; i++) {
		Aluno aluno = new Aluno();
		vetor.adiciona(aluno);
	System.out.println(vetor);
	}
  }
}
