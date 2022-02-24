import java.util.Scanner;

public class ContaPoupanca extends Conta{
	
	Scanner nc = new Scanner(System.in);
	
	Conta conta;
	

	public ContaPoupanca() {}


	public void investirSaldo(int tipo) {
		
		
		System.out.println("Selecione o Tipo de Investimento: ");
		int op = nc.nextInt();
		
		
		switch (op) {
		case 1: System.out.println("Tesouro Direto");
				
			
		default:
		
		}
		
		
	}
	
	

}
