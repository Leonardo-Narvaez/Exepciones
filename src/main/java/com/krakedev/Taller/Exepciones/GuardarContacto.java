package com.krakedev.Taller.Exepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter escritor = null;
		try {

			escritor = new FileWriter("contactos.txt", true);

			escritor.write("Maria\n");
			escritor.write("Gomez\n");
			escritor.write("0981234567");
			escritor.write("\n");

			log.info("Datos ingresados correctamente");

		} catch (IOException e) {
			log.error("Operacion fallida Error: " + e.getMessage());
		} finally {
			if (escritor != null) {
				try {
					escritor.close();
				} catch (IOException e) {
					log.error("Error al cerrar el archivo: " + e.getMessage());
				}
			}
		}
	}

}
