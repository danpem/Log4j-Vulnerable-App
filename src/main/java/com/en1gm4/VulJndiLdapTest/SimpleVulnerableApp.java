/*
 * 
 * 
 * 
 * 
 * @Author Daniel Peñaloza
 * 
 */


package com.en1gm4.VulJndiLdapTest;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class SimpleVulnerableApp {
	
	private static final Logger logger = LogManager.getLogger();
	

	
	public static void main(String[] args) {

         logger.info("Este es un mensaje de prueba de la aplicación");
	
         /* parte de la explicación en  https://en1gm4.com/enigma/Log4j-pruebas-penetracion-pentest.html
          *  para refrencia consultar el artículo
		 logger.info("Mi mensaje de saludo es:{}",
				 "${jndi:ldap://127.0.0.1/mensaje=0001}" ); */
         
         Path filePath = Paths.get("UsuariosModificado.txt");

         
         try (Stream<String> lines = Files.lines( filePath )) 
         {
        	 
             lines.forEach(line->{
            	 String[] tokens=line.split(",");
            	 logger.info("Nombre["+tokens[0]+"]"+ "Apellido["+tokens[1]+"]");
            	 
             });
         } 
         catch (IOException e) 
         {
             e.printStackTrace();
         }
         
         
         
	}
	
}	

