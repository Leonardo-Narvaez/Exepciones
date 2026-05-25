package com.krakedev.Taller.Exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContacto {

	private static final Logger log = LoggerFactory.getLogger(LeerContacto.class);

	public void leerContacto() {

		FileReader lectorArchivo = null;

		BufferedReader lector = null;
		
		try {
			lectorArchivo = new FileReader("contactos.txt");

			lector = new BufferedReader(lectorArchivo);

			for (int i = 0; i < 3; i++) {
				log.info(lector.readLine());
			}
			
			// el archivo nos solicita los errores provocados a proposito, pero para el correcto funcionamiento en la entrega se mantiene
			// el orden en el cual es funcional para su revision
			
		} catch (FileNotFoundException e) {

			log.error("Error: " + e.getMessage());

		} catch (IOException e) {

			log.error("ERROR: " + e.getMessage());

		} finally {
			if (lector != null) {
				try {
					lector.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					log.error("Error al cerrar el archivo: " + e.getMessage());
				}
			}

		}

	}
}
