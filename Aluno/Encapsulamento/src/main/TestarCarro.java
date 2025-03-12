package Encapsulamento;

public class TestarCarro {
	
public static void main (String [] args) {
		
		Carro c1 = new Carro ("Fusca",10);
		Carro c2 = new Carro ("Uno",20);
		Carro c3= new Carro ();
		
		c1.marca = "Fusca";
		
		
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		c1.acelerar();
		
		c2.marca= "Uno";
		
		c2.acelerar();
		c2.freiar();
		
		c3.marca="Camaro";
		c3.acelerar();
		c3.freiar();
		
		System.out.println(c1.verInfo());
		System.out.println(c2.verInfo());
		System.out.println(c3.verInfo());
		
		
		
	}

}
