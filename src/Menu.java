import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner nc = new Scanner(System.in);

		
		ContaCorrente conta = new ContaCorrente();
		
		
		conta.Depositar(200);
		conta.extrato();
		conta.Depositar(200);
		conta.extrato();
		conta.Sacar(500);
		
	}

}



