package com.example.jse.m01.s05;

public class Variable {

	public static void main(String[] args) {
		// camelCase
		int aVariabilePrimitiva = 88;
		String aVariabileReference = "parola";

		System.out.println(aVariabilePrimitiva);
		System.out.println(aVariabileReference);

		// il compilatore capisce automaticamente di che tipo di variabile si tratta
		var variabileAutomatica = 10;
		var variabileAutomatica2 = "lettera";

		System.out.println(variabileAutomatica);
		System.out.println(variabileAutomatica2);

		// COSTANTE non si pu� modificare. tipo_variabile preceduto da keyword FINAL.
		// Nome variabile scritto in MAIUSCOLO.
		final int COSTANTE_1 = 8;
		final var COSTANTE_AUTOMATICA = 4;
		System.out.println(COSTANTE_1 - COSTANTE_AUTOMATICA);
	}

}
