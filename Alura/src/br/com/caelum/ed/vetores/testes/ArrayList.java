package br.com.caelum.ed.vetores.testes;
import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class ArrayList {
	public static void main(String[] args) {
		Vetor <Aluno> arrayList = new Vetor <Aluno>();
		System.out.println(arrayList.tamanho());
		Object vetor = null;
		System.arraycopy(vetor, 0, arrayList, 0, 1000);
		System.out.println(arrayList.tamanho());
	}

}
