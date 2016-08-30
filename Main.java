//Univerisidad del Valle de Guatemala
//ADT seccion 10
//Gerardo Molina 14492
//Erick Bautista 15192

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
		final String instruccion5="Desea imprimir Lista? s/n";

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		Scanner scanner4 = new Scanner(System.in);
			
		ciclo = "0";
			while(ciclo.equals("0"))
			{	
				System.out.println(instruccion1);
				numero = scanner.nextInt();
				if(numero<4 && numero>0)
					
				{
					Factory conjunto = new Factory();
					conjunto.crearObj(numero);
				
					System.out.println(instruccion2);
					nombre = scanner2.nextLine();
					
					Sort sort = new Sort();
					sort.setNombre(nombre);
					
					System.out.println(instruccion3);
					numero2 = scanner3.nextInt();
					if (numero2<4 && numero2>0)
					{
						
						sort.setNumero2(numero2);
						
						sort.SortInfo(conjunto);
						System.out.println("#######################################################################");
						System.out.println("El desarrollador "+nombre+" se almaceno como un desarrollador de tipo :"+numero2);
						System.out.println("/n#######################################################################");
						System.out.println("");
						System.out.println(instruccion4);
						ciclo = scanner4.next();
					}
					else{
						System.out.println("Ingrese un numero correcto!");
					}
				}
				
				else 
				{
					System.out.println("Ingrese un numero correcto!");
				}
			}
			
			Sort sort1 = new Sort();
			
			/*sort1.printJava();
			sort1.printWeb();
			sort1.printMovil();
			
			sort1.printJavaWebMovil();
			sort1.printJavaNoWeb();
			sort1.printWebMovil();
			sort1.printSubconjunto();
			
			sort1.conjuntoMayor();
			sort1.conjuntoMenor();*/
		
		System.out.print("Adios!");
		scanner.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();

	}

}
