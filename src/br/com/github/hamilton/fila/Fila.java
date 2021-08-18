package br.com.github.hamilton.fila;

public class Fila {

	private NoFila refEntradaNoFila;
	
	public Fila() {
		this.refEntradaNoFila = null;
	}
	
	//Não existe um Nó
	public boolean isEmpty() {
		return refEntradaNoFila == null ? true : false;
	}
	
	//Enfileirar
	public void enqueue(NoFila novoNo) {
		novoNo.setRefNo(refEntradaNoFila);
		refEntradaNoFila = novoNo;
	}
	
	public NoFila first() {
		if(!isEmpty()) {
			NoFila primeiroNo = refEntradaNoFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	//Desinfileirar
	public NoFila dequeue() {
		if(!isEmpty()) {
			NoFila primeiroNo = refEntradaNoFila;
			NoFila noAuxiliar = refEntradaNoFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String retorno = "---------------------\n";
		retorno += "Fila\n";
		retorno += "---------------------\n";
		
		NoFila noAuxiliar = refEntradaNoFila;
		if(refEntradaNoFila != null) {
			while (true) {
				retorno += "[No {objeto = " + noAuxiliar.getObject() + "}] ---> ";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar =noAuxiliar.getRefNo();
				}else {
					retorno += "null";
					break;
				}
				
			}
		}else {
			retorno = "null";
		}
		
		return retorno + "\n";
	}
	
	public void testarFila() {
		Fila minhaFila = new Fila();
		minhaFila.enqueue(new NoFila("Primeiro"));
		minhaFila.enqueue(new NoFila("Segundo"));
		minhaFila.enqueue(new NoFila("Terceiro"));
		minhaFila.enqueue(new NoFila("Quarto"));
		System.out.println(minhaFila);
		minhaFila.dequeue();
		System.out.println(minhaFila);
		minhaFila.enqueue(new NoFila("Último"));
		System.out.println(minhaFila);
	}
}
