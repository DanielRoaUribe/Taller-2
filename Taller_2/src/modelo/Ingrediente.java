package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ingrediente {
	
	private String nombre;
	private int costoAdicional;
	
	public String Ingredientes(String nombre, int costoAdicional) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/ingredientes.txt"));
			String linea = br.readLine();
			
		} 
		catch(IOException e)
		{
			System.out.println("Archivo no encontrado");
		}
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCostoAdicional() {
		return costoAdicional;
	}
	
}
