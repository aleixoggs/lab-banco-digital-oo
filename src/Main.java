
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		poupanca.conferirRendimento(30);
	}

}
