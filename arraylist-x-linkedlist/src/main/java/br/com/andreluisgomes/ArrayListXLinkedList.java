package br.com.andreluisgomes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListXLinkedList {

	public static final int INTERACOES = 30000;

	public static void main(String[] args) {

		System.out.println("Inserindo na primeira posição do ArrayList ...");
		long arrayT0 = System.nanoTime();

		List<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < INTERACOES; i++) {
			arrayList.add(0, i);
		}

		long arrayElapsed = System.nanoTime() - arrayT0;
		System.out.printf("ArrayList: Tempo total :\t %d ns \t(%f seconds)%n", arrayElapsed, arrayElapsed / Math.pow(10, 9));
		
		System.out.println("Inserindo na primeira posição do LinkedList ...");
		long linkedT0 = System.nanoTime();

		List<Integer> linkedList = new LinkedList<>();

		for (int i = 0; i < INTERACOES; i++) {
			linkedList.add(0, i);
		}

		long linkedElapsed = System.nanoTime() - linkedT0;
		System.out.printf("LinkedList: Tempo total :\t %d ns \t(%f seconds)%n", linkedElapsed, linkedElapsed / Math.pow(10, 9));

	}
}
