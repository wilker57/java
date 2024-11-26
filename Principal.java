
public class Principal {

	public static void main(String[] args) {

		Funcionario[] listaFuncionario = new Funcionario[10];

		while (true) {
			int operacao = Teclado.lerInteiro("1-Cad 2-Alt 3-Exc 4-Cons 5-Sair");
			switch (operacao) {
			case 1:
				int matricula = Teclado.lerInteiro("Digite a matrícula: ");
				String nome = Teclado.lerString("Digite o nome: ");
				double salario = Teclado.lerDouble("Digite o salário: ");
				Funcionario funcionario = new Funcionario();
				funcionario.matricula = matricula;
				funcionario.nome = nome;
				funcionario.salario = salario;
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] == null) {
						listaFuncionario[i] = funcionario;
						System.out.println("Funcionário incluído com sucesso!");
						break;
					}
				}
				break;
			case 2:
				matricula = Teclado.lerInteiro("Digite a matrícula: ");
				nome = Teclado.lerString("Digite o novo nome: ");
				salario = Teclado.lerDouble("Digite o novo salário: ");
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
						listaFuncionario[i].nome = nome;
						listaFuncionario[i].salario = salario;
						System.out.println("Funcionário alterado com sucesso!");
						break;
					}
				}
				break;
			case 3:
				matricula = Teclado.lerInteiro("Digite a matrícula: ");
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null && listaFuncionario[i].matricula == matricula) {
						listaFuncionario[i] = null;
						System.out.println("Funcionário excluído com sucesso!");
						break;
						
					}
				}
				break;
			case 4:
				for (int i = 0; i < listaFuncionario.length; i++) {
					if (listaFuncionario[i] != null) {
						System.out.println(listaFuncionario[i].verInformacoes());
					}
				}
				break;
			case 5:
				System.out.println("Sair do sistema!");
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}
}
