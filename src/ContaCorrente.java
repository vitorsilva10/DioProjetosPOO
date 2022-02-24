
public class ContaCorrente extends Conta{


	@Override
	public void Sacar(double valor) {

		double valorTaxa = valor/100;

		if(this.saldo>valor) {
			this.saldo-=(valor+valorTaxa);
			System.out.println("Saque Efetuado com Sucesso ! ");
			System.out.println("Saldo atual " + this.saldo);
		}else {
			System.out.println("Saldo Insuficiente");
		}


	}
	
	

}
