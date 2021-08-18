package br.com.github.hamilton.pilha;

public class Pilha {

	private NoPilha refNoEntradaPilha;
	
	public Pilha() {
		refNoEntradaPilha = null;
	}
	
	//Empilha
	public void push(NoPilha novoNo) {
		NoPilha refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		novoNo.setRefNo(refAuxiliar);
	}
	
	//Desempilha
	public NoPilha pop() {
		if(!isEmpty()) {
			NoPilha noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}else {
			return null;
		}
	}
	
	//Retorna o Nó do topo da pilha
	public NoPilha getTop() {
		return refNoEntradaPilha;
	}
	
	//Verifica se a pilha está vázia
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false;
	}
	
	@Override
	public String toString() {
		String retorno = "--------------------\n";
		retorno += "PILHA\n";
		retorno += "--------------------\n";
		
		NoPilha noAuxiliar = refNoEntradaPilha;
		while(true) {
			if(noAuxiliar != null) {
				retorno +=  "[No {dado = " + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		return retorno;
	}
	
	public void testePilha() {
		Pilha minhaPilha = new Pilha();
		minhaPilha.push(new NoPilha(1));
		minhaPilha.push(new NoPilha(2));
		minhaPilha.push(new NoPilha(3));
		minhaPilha.push(new NoPilha(4));
		minhaPilha.push(new NoPilha(5));
		minhaPilha.push(new NoPilha(6));
		System.out.println(minhaPilha);
		
		minhaPilha.pop();
		System.out.println(minhaPilha);
		
		minhaPilha.push(new NoPilha(10));
		System.out.println(minhaPilha);
	}
}
