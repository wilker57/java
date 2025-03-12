import java.util.Scanner;

public class Calculadora{
    //metodo para somar
    public static double somar (double a, double b){
        
        return a + b;
    }
    
    //metodo para subtrair
    
    public static double subtrair (double a, double b){
        
        return a - b;
    }
    
    //metodo para multiplicar
    
    public static double multiplicar (double a, double b){
        
        return a * b;
    }
    
    //metodo para dividir
    
    public static double dividir (double a, double b){
        if(b==0){
            System.out.println("Erro: Divisão por zero não permitida");
            return Double.NaN; //Retorna 'Not a number' se houver erro
        }
        return a / b;
    }
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bem Vindo a Calculadora!");
        System.out.println("Escolha uma operação");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        int operacao = scanner.nextInt(); //Lê a operação escolhida pelo usuário
        
        //Verifica se a operacao escolhida é válida
        
        if(operacao <1 || operacao > 4){
            
            System.out.println("Operação Inválida. Por Favor escolha uma operação válida");
            scanner.close();
            return;
        }
        
        //Lê os dois numeros que o usuário deseja operar
        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        
        // Realiza a operacao com base ba escolha do usuário
        
        switch(operacao){
            case 1:
                resultado = somar (num1, num2);
                System.out.println("Resultado da Adição: " + resultado);
                break;
        
        
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
    
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;
    
    
            case 4:
                resultado = dividir(num1, num2);
                if(!Double.isNaN(resultado)){
                     System.out.println("Resultado divisão: " + resultado);
                }
                break;
                
                default:
                
                 System.out.println("Operação Inválida");
                break;
                
                    
                }
                scanner.close();
                
        }
    }
    
    
