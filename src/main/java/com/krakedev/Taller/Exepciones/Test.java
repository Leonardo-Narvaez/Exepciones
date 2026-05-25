package com.krakedev.Taller.Exepciones;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

	public static void main(String[] args) {

		try {
			ValidarContacto.validarTelefono("123");

			GuardarContacto guardar = new GuardarContacto();
			guardar.guardarContacto();


			LeerContacto leer = new LeerContacto();
			leer.leerContacto();
			
			log.info("Proceso completado exitosamente");

		} catch (IllegalArgumentException e) {
			log.error("Error: " + e.getMessage());
		}
		
		// prueba con numero correcto

		try {
			ValidarContacto.validarTelefono("0981234567");

			GuardarContacto guardar = new GuardarContacto();
			guardar.guardarContacto();
			
			LeerContacto leer = new LeerContacto();
			leer.leerContacto();
			
			log.info("Proceso completado exitosamente");

		} catch (IllegalArgumentException e) {
			log.error("Error: " + e.getMessage());
		}
	}
}
