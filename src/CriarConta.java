
public class CriarConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.saldo = 100.0;
		conta1.agencia = 1234;
		conta1.numero = 123456;
		conta1.titular = "maria";
		
		
		Conta conta2 = new Conta();
		conta2.saldo = 100.0;
		conta2.agencia = 1234;
		conta2.numero = 123456;
		conta2.titular = "maria";
		
		if(conta1.agencia == conta2.agencia) {
			System.out.println("contas iguais!");
			
	    } else{ 
		
	    System.out.println("contas diferentes");
		System.out.println(conta1);	
		System.out.println(conta2);
	
		}
	}	

}