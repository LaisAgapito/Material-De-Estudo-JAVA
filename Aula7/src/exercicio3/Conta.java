package exercicio3;

public class Conta {
	private String tipoConta;
	private long numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(String tipoConta,long numeroConta, String nomeCliente, double saldo) {
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    public void sacar(double valor) {
    	if(saldo >= valor) {
    		saldo = saldo - valor;
    		System.out.println("Saque realizado com sucesso. Valor sacado: " + valor);	
    		}else {
    			System.out.println("Saque não realizado. Saldo insuficiente.");
    		}
    }
    public void depositar(double valor) {
    	saldo = saldo + valor;
    	System.out.println("Deposito realizado no valor de: " + valor);
    }
    public void imprimir() {
    	System.out.println("Tipo da conta: " + tipoConta + "\nNumero da conta: "+ numeroConta + "Nome do titular: " + nomeCliente + "Saldo atual: " + saldo);
    }
}
