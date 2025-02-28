package com.amazon.www.main;

public class InventarioDispositivos {
	
	static Dispositivo[] listaDispositivo = new Dispositivo[10];
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void alterar() {
	
		String codigoIdentificaco = Teclado.lerString("Insira o Código");
		
		for (int i = 0 ; i < listaDispositivo.length; i++) {
			
			if (listaDispositivo[i]!= null && listaDispositivo[i].getCodigoIdentificacao().equals(codigoIdentificaco)) {
				
			if (listaDispositivo[i] instanceof Computador) {
				
				Computador computador = (Computador) listaDispositivo[i];
				
				String marca = Teclado.lerString("Insira a Marca");
				String modelo = Teclado.lerString("Insira o Modelo");
				int anoFabricacao = Teclado.lerInteiro("Insira o Ano Fabricação");
				int capacidadeRam = Teclado.lerInteiro("Capacidade (GB): ");
				
				computador.setMarca(marca);
				computador.setModelo(modelo);
				computador.setAnoFabricacao(anoFabricacao);
				computador.setCapacidadeRam(capacidadeRam);
			
			}else if(listaDispositivo[i] instanceof Smartphone) {
				
				Smartphone smartphone = (Smartphone) listaDispositivo[i];
				
				String marca = Teclado.lerString("Insira a Marca");
				String modelo = Teclado.lerString("Insira o Modelo");
				int anoFabricacao = Teclado.lerInteiro("Insira o Ano");
				String sistemaOpercaional = Teclado.lerString("Sistema Operacional");
				
				smartphone.setMarca(marca);
				smartphone.setModelo(modelo);
				smartphone.setAnoFabricacao(anoFabricacao);
				smartphone.setSistemaOperacional(sistemaOpercaional);
				
			}
			
			}
		}
			menu();
		}

		public static void menu() {
			
			int opcao = Teclado.lerInteiro("\n 1-Cadastrar 2- Alterar 3- Excluir 4- Consultar 0- Sair");
			
			switch(opcao) {
			
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
				
			case 0:
				
				default:
					break;
				}
				
			}
		
			public static void cadastrar() {
				
				int tipoDispositivo = Teclado.lerInteiro("\n 1- Computador 2- Smartphone");
				
				switch(tipoDispositivo) {
				
				case 1:
					String codigoIdentificacao = Teclado.lerString("Insira o Código Identificação");
					String marca = Teclado.lerString("Insira a Marca");
					String modelo = Teclado.lerString("Insira Modelo");
					int anoFabricacao = Teclado.lerInteiro("Insira o Ano");
					int capacidadeRam = Teclado.lerInteiro("Capacidade (GB): ");
					
				for (int i=0 ; i < listaDispositivo.length; i++) {
					
					Computador computador = new Computador(codigoIdentificacao, marca, modelo, anoFabricacao, capacidadeRam);
					
					if(listaDispositivo[i]==null) {
						listaDispositivo[i] = computador;
						break;
					}
				}
			
				break;
				
				case 2:
					
					codigoIdentificacao = Teclado.lerString("Inisira o Código Identificação");
					marca = Teclado.lerString("Insira a Marca");
					modelo = Teclado.lerString("Insira o Modelo");
					anoFabricacao = Teclado.lerInteiro("Insira o Ano");
					String sistemaOperacional = Teclado.lerString("Sistema Operacional");
					
					Smartphone smartphone = new Smartphone(codigoIdentificacao, marca, modelo, anoFabricacao, sistemaOperacional);
					
					for (int i=0; i < listaDispositivo.length; i++) {
						
						if(listaDispositivo[i]==null) {
							
							listaDispositivo [i]= smartphone;
							break;
							
						}
						
					}
					break;
					
					default:
						
					break;
			}

			menu();
			}
			
			public static void excluir() {
				
				String codigoIdentificacao = Teclado.lerString("Insira o Código Identificação");
				
				for (int i=0; i < listaDispositivo.length; i++) {
					
					if (listaDispositivo[i]!= null && listaDispositivo[i].getCodigoIdentificacao().equals(codigoIdentificacao)) {
						
						listaDispositivo[i] = null;
						
						System.out.println("Dispositivo Excluído");
						menu();
						return;
					}
				}
			}
			
			public static void consultar() {
				
				for ( int i=0; i < listaDispositivo.length; i ++) {
					
					if(listaDispositivo[i] != null) {
						
						System.out.println(listaDispositivo[i]);
					}
				}
				
				menu();
			}
				

}
