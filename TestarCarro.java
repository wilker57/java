package wilker57;

public class TestarCarro {
	
	
	public static void main (String [] args) {
		
		Carro c1 = new Carro ();
		Carro c2 = new Carro ();
		
		c1.marca = "Fusca";
		
		
		c1.acelerar();
		c1.acelerar();
		c1.freiar();
		c1.acelerar();
		
		c2.marca= "Uno";
		
		c2.acelerar();
		c2.freiar();
		
		System.out.println(c1.verInfo());
		System.out.println(c2.verInfo());
		
		
				
			
	}

}
