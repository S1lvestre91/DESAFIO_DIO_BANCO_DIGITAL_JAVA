
public abstract class Conta implements IConta {
	
	protected int agencia;
	protected int numeroConta;
	protected Cliente cliente;
	protected double saldo;
	
	private static  int AGENCIAPADRAO = 1;
	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIAPADRAO;
		this.numeroConta = SEQUENCIAL ++;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void Sacar(double valor) {
		
		if(valor > saldo) {
			System.out.println("Você não tem saldo suficiente");
		}
		else {
			saldo = saldo - valor;
		}
		
	}
	@Override
	public void Depositar(double valor) {
		saldo = saldo + valor;
		
	}
	@Override
	public void Transferir(double valor, Conta contaDestino) {
		this.Sacar(valor);
		contaDestino.Depositar(valor);
		
	}


	/*public void ImprimirExtrato() {
		// TODO Auto-generated method stub
		
	}*/
	protected void imprimirDados() {
		System.out.println(String.format("Titular: %s",this.cliente.getNomeCliente()));
		System.out.println(String.format("Agencia: %d",this.agencia));
	    System.out.println(String.format("Conta: %d",this.numeroConta));
	    System.out.println(String.format("Saldo: %.2f",this.saldo));
	}
}
