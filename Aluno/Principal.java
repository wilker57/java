package Prova;

public class Principal {

	public static void main (String[]args) {
		
		Aluno[] listaAluno = new Aluno[10];
		
		while(true){
			
		int operacoes = Teclado.lerInteiro("1-Cad 2-Alt 3-Exc 4-Cons 5-Sair");
			
		
		
			switch(operacoes) {
			
			case 1:
				
				int matricula = Teclado.lerInteiro("Digite a matricula");
				String nome = Teclado.lerString("Digite o nome");
				String curso = Teclado.lerString("Digite o curso");
				
				Aluno aluno = new Aluno();
				aluno.matricula = matricula;
				aluno.nome = nome;
				aluno.curso = curso;
				
				for(int i=0; i<listaAluno.length; i++) {
					
					if (listaAluno[i]==null) {
						
						listaAluno[i] = aluno;
						
						System.out.println("Aluno cadastrado com sucesso!");
						break;
					}
				}
				
					break;
					
			case 2:
				
				matricula = Teclado.lerInteiro("Digite a matricula");
				nome = Teclado.lerString("Digite o nome");
				curso = Teclado.lerString("Digite o curso");
					for(int i=0; i<listaAluno.length; i++) {
					
					if (listaAluno[i]!=null && listaAluno[i].matricula == matricula) {
						listaAluno[i].nome=nome;
						listaAluno[i].curso= curso;
						
						System.out.println("Aluno Alterado com sucesso!");
						
					break;
						
					}
					
					}
					
					break;
					
			case 3:
				    
				    matricula = Teclado.lerInteiro("DIgite a Matrícula:");
					for(int i=0; i<listaAluno.length; i++) {
					
					if (listaAluno[i]!=null && listaAluno[i].matricula==matricula) {
						listaAluno[i]= null;
						
						
						System.out.println("Aluno Excluido com sucesso!");
						
						break;
						
					}
					
					}
					
					break;
		
			case 4:
				for (int i=0; i<listaAluno.length; i++) {
					if(listaAluno[i] != null) {
				
				System.out.println(listaAluno[i].verInformacoes());
				
					}
				}
			
				break;
				
				case 5:
					
					System.out.println("Sair");
					
					System.exit(0);
					
					break;
				
		
					default:
						
					break;
			}
		}
	
	}

}
	
