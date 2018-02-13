package br.com.andreluisgomes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListXSet {

	public static void main(String[] args) {
		int total = 30000;

		System.out.println("Iniciando Teste com :"+ total +"-> ArrayList ...");
	    
	    Collection<Integer> arrayList = new ArrayList<>();
	    long inicio = System.currentTimeMillis();
	    
	    for (int i = 0; i < total; i++) {
	      arrayList.add(i);
	    }
	    
	    for (int i = 0; i < total; i++) {
	      arrayList.contains(i);
	    }
	    
	    long fim = System.currentTimeMillis();
	    double tempo = (fim - inicio) / 1000.0;
	    System.out.println("Tempo gasto: " + tempo+"s");
	    
	    System.out.println("Iniciando Teste com :"+ total +"-> HashSet ...");
	    
	    Collection<Integer> hashSet = new HashSet<>();
	    long inicioHashSet = System.currentTimeMillis();
	    
	    for (int i = 0; i < total; i++) {
	      hashSet.add(i);
	    }
	    
	    for (int i = 0; i < total; i++) {
	      hashSet.contains(i);
	    }
	    
	    long fimHashSet = System.currentTimeMillis();
	    double tempoHashSet = (fimHashSet - inicioHashSet) / 1000.0;
	    System.out.println("Tempo gasto: " + tempoHashSet +"s");
	    
	  }
}
