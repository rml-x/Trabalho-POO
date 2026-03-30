import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


public class ContaBancaria{
    
	private double saldo;
	private List<Transacao> historico;

	//bolo
	public ContaBancaria() {
		this.saldo = 0;
		this.historico = new ArrayList<>();
	}

    //set
	public void saldo(double saldo) {
		this.saldo = saldo;
	}

    //get
	public double consulta() {
        System.out.println( "R$ "+ this.saldo);
		return this.saldo;
	}

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("saldo Insuficiente");
        }
        else {
            saldo -= valor;
            historico.add(new Transacao("Saque", valor, saldo));
        } 
    }

	public void depositar(double valor){
		saldo += valor;
		historico.add(new Transacao("Depósito", valor, saldo));
	}

    public List<Transacao> getHistorico(){
    	return this.historico;
    }


}

class Transacao {
	private String tipo; // deposito ou saque
	private double valor;
	private double saldoApos;
    private LocalDateTime dataHora;

	//bolo
	public Transacao(String tipo, double valor, double saldoApos) {
		this.tipo = tipo;
		this.valor = valor;
		this.saldoApos = saldoApos;
        this.dataHora = LocalDateTime.now();
	}

	//get
	public String getTipo() {
		return this.tipo;
	}

	public double getValor() {
		return this.valor;
	}

	public double getSaldoApos() {
		return this.saldoApos;
	}
    public LocalDateTime getDateTime(){
        return this.dataHora;
    }

    //print
	public String toString() {
		return tipo + " de R$" + valor + " | Saldo: R$" + saldoApos + " | data: " + dataHora;
	}
}