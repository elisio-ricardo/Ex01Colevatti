package view;

import controller.Aula01Opera��esController;

public class Aula01Principal {

	public static void main(String[] args) {


		Aula01Opera��esController op = new Aula01Opera��esController();
//		tempo.concatenaString();
//		tempo.concatenaBuffer();
		
		String frase = "Ola turma do terceiro semestre de ADS da fatec Zona leste ";
		op.divideFrases(frase);

	}

}
