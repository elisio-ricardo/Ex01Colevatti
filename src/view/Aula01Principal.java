package view;

import controller.Aula01OperaçõesController;

public class Aula01Principal {

	public static void main(String[] args) {


		Aula01OperaçõesController op = new Aula01OperaçõesController();
//		tempo.concatenaString();
//		tempo.concatenaBuffer();
		
		String frase = "Ola turma do terceiro semestre de ADS da fatec Zona leste ";
		op.divideFrases(frase);

	}

}
