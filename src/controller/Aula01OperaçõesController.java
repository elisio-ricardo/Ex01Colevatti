package controller;

public class Aula01OperaçõesController {

	public Aula01OperaçõesController() {
		super();
	}

	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		// tempoTotal ns = 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);

		System.out.println("String => " + tempoTotal + " s");
	}

	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		// tempoTotal ns = 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);

		System.out.println("Buffer => " + tempoTotal + " s");
	}
	
	//Receba uma frase, divide em palavras, imprima as palavras
	
	public void divideFrases(String frase) {
		String[] vetorPalavra = frase.split("");
		System.out.println(vetorPalavra[6]);
//		int length = vetorPalavra.length;
//		for(int i = 0; i<length;i ++)
//		foreach - for(tipoDado var : vetor)
//		for(String palavra : vetorPalavra) {
//			System.out.print(vetorPalavra[6]);
//		}
		
		
	}

}
