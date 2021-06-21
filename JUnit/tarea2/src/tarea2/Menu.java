package tarea2;

public class Menu {

      public boolean salir;    

      public Menu() {

             salir = false;

      }

      public String SeleccionaMenu(int opc) {

             switch(opc){

               case 1:

                   System.out.println("Has seleccionado la opcion 1");

                   break;

               case 2:

                   System.out.println("Has seleccionado la opcion 2");

                   break;

               case 3:

                   System.out.println("Has seleccionado la opcion 3");

                   break;

               case 4:

                   salir=true;

                   break;

                default:

                   System.out.println("Error. Solo números entre 1 y 4");

           }

             return null;

      }

}