
public class Main {
	public static void main(String[] args) {
		Cliente clie = new Cliente();
		clie.setNomeCliente("Silvestre");
		
		
		Conta cc = new ContaCorrente(clie);
		Conta cp = new ContaPoupanca(clie);
		cc.Depositar(100);
		
		cc.Sacar(100);
		
		cc.imprimirDados();
		cp.imprimirDados();
	}
}
