public class CalculoDespesa {

    public static void main(String[] args) {
        
        double despesaJan = 15000.00;
        double despesaFev = 23000.00;
        double despesaMarc = 17000.00;

        double somaTrim = despesaJan + despesaFev + despesaMarc;

        double mediaGastos = somaTrim/3;
        
        System.out.println("A soma das despesas no Trimestre é: " + somaTrim + " e a média mensal dos gastos é: " + mediaGastos);

    }

}