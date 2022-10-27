package curso.java.inicio.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import curso.java.funciones.Utilidades;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	       int opcion=0; //Guardaremos la opcion del usuario
	        
	       do{
//	    	   String [] menu= {"1. Pintar cuadrado\n2. Validar email\n3. Serie Fibonacci\n4. Insertar Nombres\n5. Salir"};
	    	   Utilidades.pintaMenu();
	           opcion = Integer.parseInt(Utilidades.pideValor());
	          
	           switch (opcion) {
				case 1:
					pintaCuadrado();
				    break;
				case 2:
					introduceEmail();
				    break;
				case 3:
					serieFibonacci();
				    break;
				case 4:
					pintarAlumnos();
				    break;
				case 5:
					System.out.println("Salir");
				    break;
				    
				    default: System.out.println("Opcion incorrecta");

				}
	       }while(opcion!=5);
				System.out.println("Termina");
	       }
	
	/**
	 * Funcion para pintar un cuadrado usando bucles
	 */
	static void pintaCuadrado() {
        int tamanio = Integer.parseInt(Utilidades.pideValor("Por favor ingrese el tamaño del cuadrado: "));
        for(int fila=0; fila<tamanio; fila++) {
        	for(int columna=0; columna<tamanio; columna++) {
        		if(fila==0 || fila==tamanio-1 || columna==0 || columna==tamanio-1)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
                     
 
    }
	
	/**
	 * Funcion para validar email
	 */
	static void introduceEmail() {
       /* System.out.print("Introduce un email: ");        
        // Patrón para validar el email
		Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
        }*/
		

        String email = Utilidades.pideValor("Introduce un email:");
        email = email.trim();
        String mensajeError = "";
        
        //VALIDACIONES DEL EMAIL 
        //No puede contener espacios en blanco
        if(email.contains(" ")) {
        	mensajeError += "El email no puede tener espacios en blanco";
        }
        
        //Solo tiene que haber 1 @
        if(email.indexOf("@")==-1 || email.indexOf("@")!=email.lastIndexOf("@")) {
        	mensajeError += "Tiene que haber 1 @";
        }
        
        //Despues del @ tiene que haber un punto
        if(!email.substring(email.indexOf("@")).contains(".")) {
        	mensajeError += "Tiene que haber un punto despues de la @";
        }else {
        	
        String subcadena = email.substring(email.lastIndexOf(".")+1);
        int tamanioDominio = email.substring(email.lastIndexOf(".")+1).length();
        if(tamanioDominio<2 || tamanioDominio>6) {
        	mensajeError += "El tamaño del dominio tiene que estar entre 2 y 6";
        	}
        }	
        
        if(mensajeError.equals("")) {
        	System.out.println("El email "+email+ " es correcto");
        }else {
        	System.out.println("El email "+email+ " es incorrecto "+mensajeError);
        	
        }
	}
	  
    
    /**
     * 
     */
    static void serieFibonacci() {
    	int numElementos = Integer.parseInt(Utilidades.pideValor("Introduce el numero de elemetos de la serie de Fibonacci: "));

    	
    	int num1=0, num2=1, suma=num1+num2;
    	
    	System.out.print(num1+",");
    	System.out.print(num2+",");
    	for (int i=0; i<numElementos-2; i++) {
    		System.out.print(suma+",");
    		num1 = num2;
    		num2 = suma;
    		suma = num1+num2;
    		

    	}

    }
    
	/**
	 * 
	 */
    static void pintarAlumnos() {
    	int numAlumnos = Integer.parseInt(Utilidades.pideValor("Introduce el numero de alumnos: "));    	
    	String[] alumnos = new String[numAlumnos];
    	
    	for(int j=0; j<alumnos.length; j++) {
    		alumnos[j] = Utilidades.pideValor("Introduce nombre del alumno" + (j+1));
    	}
    	
    	for(String nombreAlumno : alumnos) {
    		System.out.println(nombreAlumno);
    	}
    }
}
	        
	    
	     
	
	

