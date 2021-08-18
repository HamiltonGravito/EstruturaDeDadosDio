package br.com.github.hamilton.pilha;

public class NoPilha {

	private int dado;
	private NoPilha refNo;
	
	public NoPilha() {
		
	}
	public NoPilha(int dado) {
		this.dado = dado;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public NoPilha getRefNo() {
		return refNo;
	}
	public void setRefNo(NoPilha refNo) {
		this.refNo = refNo;
	}
	
	@Override
	public String toString() {
		return "Nó {dado = " + dado + "}";
	}
}
