package com.krakedev.Taller.Exepciones;

public class ValidarContacto {

	public static void validarTelefono(String telefono) throws IllegalArgumentException {
		if (telefono.length() != 10) {
			throw new IllegalArgumentException("Error: debe tener 10 digitos");
		}
	}
}
