
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo= 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo  += 100;
		System.out.println(primeiraConta.saldo);
		
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem "+ primeiraConta.saldo);
		System.out.println("segunda conta tem "+ segundaConta.saldo);
		
		System.out.println("agencia: " + primeiraConta.agencia);
		System.out.println("numero:  "+ primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("o numero da agencia da segunda conta agr é "
				+ segundaConta.agencia);
	}
}
