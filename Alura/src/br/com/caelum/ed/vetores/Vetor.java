package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor <T>{

	private Object[] objetos = new Object[10000];

		private int totalDeAlunos = 0;
		
		public void adiciona(T entidade) {
			this.objetos[this.totalDeAlunos] = entidade;
			this.totalDeAlunos++;
		}
	
	public void adiciona(int posicao, T aluno) {
			
			if (!this.posicaoValida(posicao)) {
				throw new IllegalArgumentException("Posicao inválida");
			}
			
			for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
				this.objetos[i + 1] = this.objetos[i];
			}
			
			this.objetos[posicao] = aluno;
			this.totalDeAlunos++;
			}
		
			private boolean posicaoValida(int posicao) {
				return posicao >= 0 && posicao <= this.totalDeAlunos;
			}

	
	public T pega(int posicao) {
		
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		return (T) this.objetos[posicao];
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
		}

	
	public void remove(int posicao) {
		
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeAlunos--;
	}

	
	public boolean contem(T entidade) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (entidade == this.objetos[i]) {
				return true;
			}
		}
		return false;

}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}

	
	public String toString() {
		if (this.totalDeAlunos == 0) {
		return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
		builder.append(this.objetos[i]);
		builder.append(", ");
		}
		builder.append(this.objetos[this.totalDeAlunos - 1]);
		builder.append("]");
		return builder.toString();
		}
	
	private void garantaEspaco() {
		if (this.totalDeAlunos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
		}
		this.objetos = novaArray;
	}
		}

}
	
