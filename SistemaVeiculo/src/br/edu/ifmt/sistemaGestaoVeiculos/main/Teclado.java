package br.edu.ifmt.sistemaGestaoVeiculos.main;

import java.util.Scanner;

public class Teclado {
	
	 public static int LerInteiro(String rotulo){

			System.out.println(rotulo);
			Scanner scann = new Scanner (System.in);
	  		return scann.nextInt();


		}


	 public static double LerDouble (String rotulo){
		
		System.out.println(rotulo);
	 	Scanner scann = new Scanner (System.in);
		return scann.nextDouble(); 



		}


	 public static String LerString(String rotulo){

		System.out.println(rotulo);
	 	Scanner scann = new Scanner (System.in);
		return scann.nextLine();


		}
	}
	 


