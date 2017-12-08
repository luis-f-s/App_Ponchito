/*
 *
 *                Applicacion Ponchito
 *
 * Authors:         ID: 153542      Luis Alberto Flores
 *                  ID: 154422      Alejandro Lobato
 *                  ID: 153424      Jose Antonio Marquez
 *
 * Date:            Dec/08/2017
 *
 */



/*
 *				Interfaz Agencia Class
 *
 * Esta clase .
 *
 */


import java.util.Scanner;


public class InterfazAgencia {

    private String usuario;
    private String contra;

    public InterfazAgencia() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Porfavor autenticate\n\n");
    }

    public void run() {
        cuenta();

        if(!autenticacion()) {
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.err.print("\n\nNo hay un empleado registrado bajo esos datos "
                            + "o sus datos estan incorrectos.\n\n");
            return;
        } else {
            System.out.println("\n\n¡Gracias por su arduo trabajo " + usuario + "!");
        }

        Scanner input = new Scanner(System.in);
        int opcion;
        do {
			mostrarMenu();
			opcion = input.nextInt();
			menu(opcion);
		} while(opcion <= 2 && opcion >= 1);

    }

 	public void mostrarMenu(){
 		System.out.println("\nEliga una opcion del menu");
 		System.out.println("\t1.- Consultar el folleto");
 		System.out.println("\t2.- Reservaciones de clientes");
 		System.out.println("\t3.- Crear clientes");
 		System.out.println("\t4.- Realizar reservaciones");
 		System.out.println("\t5.- Validar");
 		System.out.println("\t6.- Salir");
 		System.out.print("\nOpcion: ");
 	}

 	public void menu(int opcion) {

 		switch(opcion){
 		case 1:
 			System.out.println("Esta en consultar folleto");
 			break;

 		case 2:
 			System.out.println("Esta en reservaciones de clientes");
 			break;

 		case 3:
 			System.out.println("Esta en crear clientes");
 			break;

 		case 4:
 			System.out.println("Esta en realizar reservaciones");
 			break;

 		case 5:
 			System.out.println("Esta en validar");
 			break;

 		case 6:
 			System.out.println("\n\n\n!Nos vemos a la Proxima!\n\n\n");
 			System.exit(0);
 			break;
 		}
 	}

    private boolean autenticacion() {
        return true;

    }

    private void cuenta(){

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca su Usuario no mayor a 12 letras: ");
        usuario = input.nextLine();
        while (usuario.length() > 12) {
            System.out.println("El Usuario proporcionado excede las 12 letras.\n");
            System.out.print("Ingresa de nuevo el usuario: ");
		    usuario = input.nextLine();
        }

		System.out.print("Introduzca su Contrasena no mayor a 12 letras: ");
		contra = input.nextLine();
        while (contra.length() > 12) {
            System.out.println("La contraseña proporcionada excede las 12 letras.\n");
            System.out.print("Ingresa de nuevo la contrasena: ");
		    contra = input.nextLine();
        }

	}

 }