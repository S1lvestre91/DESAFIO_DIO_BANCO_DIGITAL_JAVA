
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.Depositar(100);
		cc.Sacar(400);
		
		cc.imprimirDados();
		cp.imprimirDados();
	}
}
