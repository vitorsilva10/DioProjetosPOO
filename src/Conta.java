import java.util.Random;
import java.util.Scanner;

public abstract class Conta {

	protected double saldo = 1000;
	Cliente cliente;
	Scanner nc = new Scanner(System.in);



	public Conta() {
		cliente = new Cliente("Vitor Silva","33666-9");

	}


	public double Depositar(double valor) {

		return this.saldo+=valor;


	}


	public void Sacar(double valor) {

		if(this.saldo>valor) {
			System.out.println("Saldo Insuficiente");
		}else {

			this.saldo-=valor;
			System.out.println("Saldo Atual " + this.saldo);
			
			
		}

	}


	public void emprestimo(double valor) {

		if(this.saldo>500 && valor <500) {
			this.saldo+=valor;
			System.out.println("Solicita��o Aceita seu saldo atual �: " + this.saldo);

		}else {
			System.out.println("No Momento n�o Podemos Liberar ");
		}

	}


	public void extrato() {
		System.out.println("N� Conta: " + this.cliente.getNome());	
		System.out.println("N� Conta: " + this.cliente.getCodigo());	
		System.out.println("Saldo: " + this.saldo);	

	}


}
