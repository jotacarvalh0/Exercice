package br.com.caelum.ed;

import java.util.Arrays;

public class Vetor {
		
		// Declarando e Inicializando um array de Aluno com capacidade 100.
		private Aluno[] alunos = new Aluno[100];
		int quantity = 0;
		
		public void adiciona(Aluno aluno) {
			alunos[quantity] = aluno;
			quantity++;
		}
		
		public void adiciona(int posicao, Aluno aluno) {
		// implementação
		}
		
		public Aluno pega(int posicao) {
			return null;
		// implementação
		}
		
		public void remove(int posicao) {
		// implementação
		}
		
		public boolean contem(Aluno aluno) {
			return false;
		// implementação
		}
		
		public int tamanho() {
			return quantity;
		// implementação
		}
		
		public String toString() {
		return Arrays.toString(alunos);
		}
		
		}
