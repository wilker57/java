package br.edu.ifmt.sistemaGestaoVeiculos.main;

public class Principal {
	
	static Veiculo[] listaVeiculo = new Veiculo[10];
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void alterar() {
		String placa = Teclado.LerString("Digite a Placa");
		
		for(int i=0 ; i < listaVeiculo.length ; i++) {
			
			if(listaVeiculo[i] != null && listaVeiculo[i].getPlaca().equals(placa)) {
			
			if(listaVeiculo[i] instanceof Carro) {
				
				Carro carro = (Carro) listaVeiculo[i];
				
				String marca = Teclado.LerString("Marca");
				String modelo = Teclado.LerString("Modelo");
				int anoFabricacao = Teclado.LerInteiro("Ano");
				int quantidadePortas = Teclado.LerInteiro("Portas");
				
				carro.setMarca(marca);
				carro.setModelo(modelo);
				carro.setAnoFabricacao(anoFabricacao);
				carro.setQuantidadePortas(quantidadePortas);
			}else if(listaVeiculo[i] instanceof Moto){
				
				Moto moto = (Moto) listaVeiculo[i];
				
				String marca = Teclado.LerString("Marca");
				String modelo = Teclado.LerString("Modelo");
				int anoFabricacao = Teclado.LerInteiro("Ano");
				int cilindradas = Teclado.LerInteiro("Cilindradas");
				
				moto.setMarca(marca);
				moto.setModelo(modelo);
				moto.setAnoFabricacao(anoFabricacao);
				moto.setCilindradas(cilindradas);
			}
				
				
			}
			
		}
		menu();
	}
	public static void menu() {
		
		int opcao = Teclado.LerInteiro("1-Cadastrar 2-Alterar 3-Excluir 4-Consultar 5-Exibir 0-Sair");
		
		switch (opcao) {
		case 1:
			
			cadastrar();
			
			break;
			
		case 2:
			alterar();
			break;
			
		case 3:
			excluir();
			break;
			
		case 4:
			consultar();
			break;
			
		case 5:
			exibir();
			break;
			
		case 0:
			System.exit(0);

		default:
			break;
		}
	}
	
		public static void cadastrar() {
			int tipoVeiculo = Teclado.LerInteiro("1- Moto 2-Carro");
			
			switch (tipoVeiculo) {
			
			case 1:
				String placa = Teclado.LerString("Placa");
				String marca = Teclado.LerString("Marca");
				String modelo = Teclado.LerString("Modelo");
				int anoFabricacao = Teclado.LerInteiro("Ano");
				int cilindradas = Teclado.LerInteiro("Cilindradas");
				
				Moto moto = new Moto(placa, marca, modelo, anoFabricacao, cilindradas);
				
				for(int i=0; i < listaVeiculo.length; i++) {
					
					if (listaVeiculo[i] == null) {
						listaVeiculo[i] = moto;
						
						break;
					}
				}
				break;
				
			case 2:
				
				 placa = Teclado.LerString("Placa");
				 marca = Teclado.LerString("Marca");
				 modelo = Teclado.LerString("Modelo");
				 anoFabricacao = Teclado.LerInteiro("Ano");
				int quatidadePortas = Teclado.LerInteiro("Portas");
				
				Carro carro = new Carro(placa, marca, modelo, anoFabricacao, quatidadePortas);
				
				for(int i=0 ; i < listaVeiculo.length; i++) {
					
					if(listaVeiculo[i] == null) {
						listaVeiculo[i] = carro;
						
						break;
					}
				}
				
				break;

			default:
				
				break;
			}
			menu();
		}

	public static void consultar() {
		
		for(int i=0; i < listaVeiculo.length; i++) {
			
			if(listaVeiculo[i] != null) {
				
				System.out.println(listaVeiculo[i]);
			}
		}
		
		menu();
		
	}
	
	public static void excluir() {
		
		String placa = Teclado.LerString("Placa");
		
		for(int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i]!=null && listaVeiculo[i].getPlaca().equals(placa)){
				listaVeiculo[i] = null;
				
				System.out.println("Excluído");
				menu();
			
				return;
			}
		}
	}
		
		public static void exibir() {
			
			int numeroVeiculos=0;
			for(int i=0; i < listaVeiculo.length;i++) {
				if(listaVeiculo[i] != null) {
					numeroVeiculos++;
				}
			}
			
			System.out.println("\n Total Veiculos: " + numeroVeiculos);
			menu();
	}
}
	
