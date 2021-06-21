package calculadora;

import java.util.Scanner;

public class Calculadora {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int select = -1;	 //Opción elegida por el usuario
		int num1 = 0, num2 = 0; 
		while(select != 0){
			try{
				System.out.println( "Elige opción:\n1. Sumar" +
									"\n2. Restar\n" +
									"3. Multiplicar\n" +
									"4. Dividir\n" +
									"0. Salir");
				select = Integer.parseInt(scanner.nextLine()); 
				switch(select){
				case 1:
					System.out.println("Introduce número 1:");
					num1 = Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce número 2:");
					num2 = Integer.parseInt(scanner.nextLine());
					System.out.println("\n");
					System.out.println("Has seleccionado: SUMAR");
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				case 2: 					
					System.out.println("Introduce número 1:");
					num1 = Integer.parseInt(scanner.nextLine());		
					System.out.println("Introduce número 2:");
					num2 = Integer.parseInt(scanner.nextLine());
					System.out.println("\n"); 
                    System.out.println("Has seleccionado: RESTAR");
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				case 3: 
					System.out.println("Introduce número 1:");
					num1 = Integer.parseInt(scanner.nextLine());
					System.out.println("Introduce número 2:");
					num2 = Integer.parseInt(scanner.nextLine());
					System.out.println("\n"); 
					System.out.println("Has seleccionado: MULTIPLICAR");
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				case 4: 
					System.out.println("Introduce número 1:");
					num1 = Integer.parseInt(scanner.nextLine());	
					System.out.println("Introduce número 2:");
					num2 = Integer.parseInt(scanner.nextLine());
					System.out.println("\n"); 	
					System.out.println("Has seleccionado: DIVIDIR");				
					System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case 0: 
					System.out.println("Has seleccionado: SALIR");
					break;
				default:
					System.out.println("Número no válido");
					break;
				}
				
				System.out.println("\n");
				
			}catch(Exception e){
				System.out.println("¡Error!");
			}
		}
	}
}