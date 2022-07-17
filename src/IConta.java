
public interface IConta {
	public int agencia = 0;
	public int numeroConta = 0;
	public double saldo = 0;
	
	void Sacar( double valor);
		
	void Depositar(double valor);
		
	void Transferir(double valor, Conta contaDestino); 
		
	void ImprimirExtrato();
		
	
}
