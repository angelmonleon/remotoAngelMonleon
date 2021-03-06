package calculadora;

import java.util.Scanner;

public class Calculadora {
	private static final String ERROR = "?Error!";
	static Scanner scanner = new Scanner(System.in);
	private static int select;
	private static int num1;
	private static int num2;
	
	public static void main(String[] args) {
		select = -1;
		num1 = 0;
		num2 = 0;
		while(select != 0){
			try{
				System.out.println( "Elige opci?n:\n1. Sumar" +
									"\n2. Restar\n" +
									"3. Multiplicar\n" +
									"4. Dividir\n" +
									"0. Salir");
				select = Integer.parseInt(scanner.nextLine()); 
				switch(select){
				case 1:
					suma();
					break;
				case 2: 					
					restar();
					break;
				case 3: 
					multiplicar();
					break;
				case 4: 
					dividir();
					break;
				case 0: 
					System.out.println("Has seleccionado: SALIR");
					break;
				default:
					System.out.println("N?mero no v?lido");
					break;
				}
				
				System.out.println("\n");
				
			}catch(Exception e){
				System.out.println(ERROR);
			}
		}
	}

	private static void dividir() {
		pedir2Numeros();
		System.out.println("\n"); 	
		System.out.println("Has seleccionado: DIVIDIR");				
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}

	private static void pedir2Numeros() {
		System.out.println("Introduce n?mero 1:");
		num1 = Integer.parseInt(scanner.nextLine());	
		System.out.println("Introduce n?mero 2:");
		num2 = Integer.parseInt(scanner.nextLine());
	}

	private static void multiplicar() {
		pedir2Numeros();
		System.out.println("\n"); 
		System.out.println("Has seleccionado: MULTIPLICAR");
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}

	private static void restar() {
		pedir2Numeros();
		System.out.println("\n"); 
		System.out.println("Has seleccionado: RESTAR");
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}

	private static void suma() {
		pedir2Numeros();
		System.out.println("\n");
		System.out.println("Has seleccionado: SUMAR");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
}