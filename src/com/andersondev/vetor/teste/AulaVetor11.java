package com.andersondev.vetor.teste;

import java.util.ArrayList;

public class AulaVetor11 {

	//APRENDENDO ARRAYLIST<>
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
	
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Elemento existe no Array");
		}else {
			System.out.println("Elemento não existe no Array");
		}
		
		int pos = arrayList.indexOf("B");
		
		if(pos > -1) {
			System.out.println("Elemento existe no Array " +pos);
		}else {
			System.out.println("Elemento não existe no Array " +pos);
		}
		
		System.out.println(arrayList.get(2));
		
		//removendo
		arrayList.remove(1);
		arrayList.remove("A");
		
		System.out.println(arrayList);
		//Tamanho 		
		System.out.println(arrayList.size());
		
	}

}
