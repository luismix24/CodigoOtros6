/*
 * Programa que enlista 20 números aleatorios del 0 al 381 donde 
 * al ingresar un número de los que aparecen en consola te mostrara los multiplos de 5, 2 y 7 dentro
 * de los mismo números aleatorios
 * */


import java.util.Random;
import java.util.Scanner;

public class codigo6 {

	public static void main(String[] args) { // Se agrega método main
		int[] n = new int[20];
		Random rand = new Random(); // Se inicia el Random
		for (int i = 0; i < 20; i++) {// faltaba u + al incrementar
		      n[i] = rand.nextInt(381) + 20;
		      System.out.print(n[i] + " "); // arreglar el Sysout
		    }// for
		    
		    System.out.println("\n¿Qué números quiere resaltar? "); //faltaba la n
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    Scanner sc = new Scanner(System.in); // se inicia Scanner
		    int opcion = Integer.parseInt(sc.nextLine()); // se cambia el input 

		    int multiplo = (opcion == 1)? 5 : 7; // se revierte el ? :

		    for (int e : n) { // se cambia por un for y a número entero
		      if (e % multiplo == 0) {
		        System.out.print("[" + e + "] ");
		      }else { // se cierra el if
		        System.out.print(e + " "); // out en vez de in
		      }//if
		  }//for
		    sc.close();// se cierra Scanner
	}//main

}//class codigo6

