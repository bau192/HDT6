import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int numero2;
		String nombre;
		String ciclo;
		final String instruccion1 = "Ingrese los siguientes numeros para utilizar las distintas implementaciones: \n 1. HashSet \n 2.TreeSet \n 3.LinkedHashSet";
		final String instruccion2 = "Ingrese el nombre del desarrollador: ";
		final String instruccion3 = "Ingrese los siguientes numeros dependiendo el tipo de desarrolador que sea: \n 1.Desarrollador Java. \n 2.Desarrollador Web. \n 3.Desarrollador Movil.";
		final String instruccion4 = "Si desea continuar ingresando datos ingrese 0, de lo contrario ingrese cualquier caracter: ";
		

		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		Scanner scanner4 = new Scanner(System.in);
			
		ciclo = "0";
			while(ciclo.equals("0"))
			{	
				System.out.println(instruccion1);
				numero = scanner.nextInt();
				
				
				Factory conjunto = new Factory();
				conjunto.crearObj(numero);
				
				System.out.println(instruccion2);
				nombre = scanner2.nextLine();
				
				
				Sort sort = new Sort();
				sort.setNombre(nombre);
				
				System.out.println(instruccion3);
				numero2 = scanner3.nextInt();
				
				
				sort.setNumero(numero2);
				
				System.out.println(instruccion4);
				ciclo = scanner4.next();
				
		
			}
		
		Sort sort1 = new Sort();
	
		
		if(sort1.javaMayor()==true)
		{
			System.out.println("El conjunto de desarrolladores java es el mayor.");
		}
		if(sort1.celularesMayor()==true)
		{
			System.out.println("El conjunto de desarrolladores moviles es el mayor.");
		}
		if(sort1.webMayor()==true)
		{
			System.out.println("El conjunto de desarrolladores web es el mayor.");
		}
		
		
		scanner.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();

	}

}
