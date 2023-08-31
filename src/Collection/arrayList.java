package Collection;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		/**
		 * Sintaxe para implementar uma lista List<Tipo da lista> nome = new
		 * ArrayList<>();
		 */

		// Implementar uma lista de tipo String
		List<String> lista = new ArrayList<>();

		// Nova lista para armazenar elementos removidos
		List<String> listaRemovidos = new ArrayList<>();

		// Adicionar elementos a lista
		lista.add("Matematica");
		lista.add("Fisica");
		lista.add("Biologia");
		lista.add("Portugues");
		lista.add("Geografia");
		lista.add("Historia");

		// Imprimir os elementos da lista
		System.out.println("Elementos na lista:");
		for (String materia : lista) {
			System.out.println(materia);
		}

		System.out.println("------------------------------");
		// inserir elemento entre um nodo
		lista.add("Quimica");
		lista.add("Ingles");
		lista.add(6, "Programação");
		for (String materias : lista) {
			System.out.println(materias);
		}

		// Verificar o tamanho da lista
		System.out.println("-------------------------------");
		System.out.println("A lista possui um tamnho de " + lista.size() + " Posuções.");

		// Remover elemento da lista
		// lista.remove(2);
		lista.remove("Fisica");

		// listar a posicao de um elemento
		System.out.println("Index de Ingles: " + lista.indexOf("Ingles"));

		// Trabalhar com predicação
		// remover todos os elementos que iniciem com a letra G.
		// para remover um elemento utilizando predicado, usamos o metodo removeif

		// Remover elementos que possuam o caracter 'G' na primeira posição
		lista.removeIf(materias -> {
			boolean removidos = materias.charAt(0) == 'G';
			if (removidos) {
				listaRemovidos.add(materias); // Adicionar elemento à lista de removidos
			}
			return removidos;
		});

		// Imprimir os elementos removidos
		System.out.println("\nElementos removidos:");
		for (String materiaremovidos : listaRemovidos) {
			System.out.println(materiaremovidos);
		}
		// Remover elementos que contenham a letra "o" em qualquer parte do texto
		lista.removeIf(materias -> {
			boolean removidos = materias.contains("o");
			if (removidos) {
				listaRemovidos.add(materias); // Adicionar elemento à lista de removidos
			}
			return removidos;
		});

		// Imprimir os elementos removidos
		System.out.println("\nElementos removidos:");
		for (String materiaremovidos : listaRemovidos) {
			System.out.println(materiaremovidos);
		}

		// Imprimir os elementos da lista após a remoção
		System.out.println("\nElementos na lista após remoção:");
		for (String materia : lista) {
			System.out.println(materia);
		}
		// Remover elementos que possuam o caracter 'm' na quarta posição
		lista.removeIf(materias -> {
			boolean removidos = materias.charAt(4) == 'm';
			if (removidos) {
				listaRemovidos.add(materias); // Adicionar elemento à lista de removidos
			}
			return removidos;
		});
		// Imprimir os elementos removidos
		System.out.println("\nElementos removidos:");
		for (String materiaremovidos : listaRemovidos) {
			System.out.println(materiaremovidos);
		}
		// Remover elementos que possuam o caracter 'm' na sexta posição
		lista.removeIf(materias -> {
			boolean removidos = materias.charAt(3) == 'm';
			if (removidos) {
				listaRemovidos.add(materias); // Adicionar elemento à lista de removidos
			}
			return removidos;
		});
		// Imprimir os elementos removidos
		System.out.println("\nElementos removidos:");
		for (String materiaremovidos : listaRemovidos) {
			System.out.println(materiaremovidos);
		}
		// Imprimir os elementos da lista
		System.out.println("\nElementos na lista:");
		for (String materia : lista) {
			System.out.println(materia);
		}
	}
}
