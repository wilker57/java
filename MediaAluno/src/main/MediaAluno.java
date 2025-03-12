import java.util.Scanner;

public class MediaAluno{
    
    public static void main (String[] args) {
        
        //Instancia
        Scanner scanner = new Scanner(System.in);
        
        //Obter nome do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        //obter as notas
        
        System.out.println("Digite a primeira nota: ");
        Double  nota1 = scanner.nextDouble();
        
        System.out.println("Digite a primeira nota: ");
        Double  nota2 = scanner.nextDouble();
        
        System.out.println("Digite a primeira nota: ");
        Double  nota3 = scanner.nextDouble();
        
        Double media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("O aluno " + nome + " possui a média " + media);
        
	  //Condição para aprovação

        if (media >=7.0){
            System.out.println("Aprovado");
        } else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
    
}