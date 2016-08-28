import java.util.*;

public class Sort{

	private Set <String> java;
	private Set <String> web;
	private Set <String> celulares;
	private boolean conjunto = false;
	private String nombre;
	private int numero;
	
	public Sort()  {
		// TODO Auto-generated constructor stub				
	}
	
	public Set SortInfo(){
		try{
			switch(numero)
			{
				case 1:
					java.add(nombre);
				case 2:
					web.add(nombre);
				case 3:
					celulares.add(nombre);
			}
		}
		catch (Exception e){
			System.out.println("Ingrese un numero correcto!");
		}
		return null;
	}
	
	public void printJava(){
	
	}
	
	public void printWeb(){
		
	}
	
	public void printMovil(){
		
	}
	
	public void printJavaWebMovil(){
		
	}
	
	public void printJavaMovil(){
		
	}
	
	public void printWebMovil(){
		
	}
	
	public boolean javaMayor()
	{
		if (celulares.size()<web.size() && web.size()<java.size())
		{
			conjunto = true;
		}
			return conjunto;
		
	}
	
	public boolean webMayor()
	{
		if (web.size()<web.size() && java.size()<celulares.size())
		{
			conjunto = true;
		}
			return conjunto;
		
	}
	
	public boolean celularesMayor()
	{
		if (java.size()<web.size() && web.size()<celulares.size())
		{
			conjunto = true;
		}
			return conjunto;
		
	}

	
	public String getNombre(String nombre){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	
}
