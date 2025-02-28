import java.util.Scanner;

public class CalculadoraImc{
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu peso (kg): ");
        
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura: ");
        
        double altura = scanner.nextDouble();
        
        double imc = peso/(altura*altura);
        
        if (imc < 18.5){
            
            System.out.println("IMC "+ imc + " é considerado abaixo do Peso");
            
        } else if(imc >= 18.5 && imc <= 24.9){
            
            System.out.println("IMC " + imc + " é considerado Peso Normal");
            
            
        }else if(imc >= 25 && imc < 29.9){
            
            System.out.println("IMC " + imc + " é considerado Sobre Peso");
            
        }else{
            System.out.println("IMC " + imc + " é considerado Obesidade");
        }
        
        scanner.close();
        
    }
}