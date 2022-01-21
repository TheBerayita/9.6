package Main;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
import Objetos.Cine;
import Objetos.Espectador;
import Objetos.Pelicula;

public class MainApp {

	public static void main(String[] args) {

		Pelicula peli = new Pelicula("The Equalizer", "Ben Smith", 132, 18);
		Cine cine = new Cine(peli, 8.50);
		Espectador[] espectadores = new Espectador[10];
		String[][] sala = new String[8][9];
		
		rellenarSala(sala);
		crearEspectador(espectadores);
		
		llenarButacas(espectadores, sala, cine, peli);
		
		mostrarSala(sala);

	}
	
	//Llenar Array de la sala
	private static void llenarButacas(Espectador[] espectadores, String[][] sala, Cine cine, Pelicula peli) 
	{

		for (Espectador espectador : espectadores) 
		{
			if(espectador.getEdad() >= peli.getEdadMinima() && espectador.getDinero() >= cine.getPrecioEntrada())
			{
				boolean libre = false;
				int i, j;
				do //Bucle para llenar la sala siempre que haya sitios disponibles
				{
					i = (int)(Math.random()*(sala.length));
					j = (int)(Math.random()*(sala[0].length));
					
					if(!sala[i][j].equalsIgnoreCase("x"))
					{
						libre = !libre;
					}
				} 
				while (!libre); //Final del Bucle
				
				System.out.println("Espectador: " + espectador.getNombre() + " - " + espectador.getEdad() + " años - " + espectador.getDinero() + "€ - Silla: " + sala[i][j]);
				sala[i][j] = "XX";
			}
			else
			{
				System.out.println("Espectador: " + espectador.getNombre() + " - " + espectador.getEdad() + " años - " + espectador.getDinero() + "€ - No cumple los requisitos");
			}
		}
		System.out.println();
		
	}
	
	
	private static void rellenarSala(String[][] sala) 
	{
		int x = 8;
		for (int i = 0; i < sala.length; i++) 
		{
			char letra = 65;
			for (int j = 0; j < sala[i].length; j++) 
			{
				sala[i][j] = x + "" + letra;
				letra++;
			}
			x--;
		}
		
	}
	
	//Creacion de Espectadores
	private static void crearEspectador(Espectador[] espectadores) 
	{
		String[] nombres = {"Andres", "Paco", "Enric", "Oscar", "Carmen", "Matias", "Ferran", "Marta", "Andrea", "Luis"};
		
		for (int i = 0; i < espectadores.length; i++) 
		{
			espectadores[i] = new Espectador(nombres[(int)(Math.random()*(nombres.length))], (int)(Math.random()*60+5), (Math.round((Math.random()*30+2.5) * 100.0) / 100.0));
		}
		
	}
	
	//Mostrar la sala
	private static void mostrarSala(String[][] sala) 
	{
		for (String[] strings : sala) 
		{
			for (String strings2 : strings) 
			{
				System.out.print(strings2 + " ");
			}
			System.out.println();
		}
	}

} //Fin del codigo
