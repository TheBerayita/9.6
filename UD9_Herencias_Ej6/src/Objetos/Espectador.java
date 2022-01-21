package Objetos;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class Espectador {
	
	//Variables
	private String nombre;
	private int edad;
	private double dinero;
	
	//Constructor
	public Espectador(String nombre, int edad, double dinero) 
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	//Getters & Setters
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	public double getDinero() 
	{
		return dinero;
	}

	public void setDinero(double dinero) 
	{
		this.dinero = dinero;
	}
	
} //Fin del codigo
