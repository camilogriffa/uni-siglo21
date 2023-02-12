package main;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.*;
import entidades.Persona;
import entidades.Auto;
import entidades.Moto;

public class Menu1{
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int opt = 0;
		int [] preciosVehiculos = {1000, 1500, 500, 2800};
		Auto audiA3 = new Auto("Audi", "A3", "Blanco", "Urbano",0);
		Auto bmwX4 = new Auto("BMW", "X4", "Negro", "Todo Terreno",0);
		Moto hondaFalcon = new Moto("Honda", "Falcon 400", "Rojo", "Todo Terreno",0);
		Moto hondaWave = new Moto("Honda", "Wave 100", "Gris", "Urbana",0);
		
		System.out.println("Bienvenido al menu de compra de Griffa-Duran");
		System.out.println("\nIngrese su nombre:");
		String n1 = sc.nextLine();
		System.out.println("\nIngrese su apellido:");
		String a1 = sc.nextLine();
		Persona p1 = new Persona(n1, a1);
		boolean activador;

	do{do{try{activador = false;
				System.out.println("\nHola " + p1.getNombre() + " " + p1.getApellido() + "!");
				System.out.println("MENÚ PRINCIPAL");
				System.out.println("Presione para seleccionar un vehiculo.");
				System.out.println("1.Auto \n2.Moto \n0.Salir");
				opt = sc.nextInt();
				
				do{switch(opt){
		 	 			case 1: do{System.out.println("\nMENÚ: Autos.");
		 	 						  System.out.println("Presione para seleccionar un auto:");
		 	 						  System.out.println("1.Nombre: " + audiA3.getMarca() + " " + audiA3.getModelo() + " - Color: " + audiA3.getColor() + " - Tipo: " + audiA3.getTipo());
		 	 						  System.out.println("2.Nombre: " + bmwX4.getMarca() + " " + bmwX4.getModelo() + " - Color: " + bmwX4.getColor() + " - Tipo: " + bmwX4.getTipo());
		 	 						  System.out.println("3.Volver atrás");
		 	 						  opt = sc.nextInt();
		 	 						  switch(opt) {
		 	 						  case 1:do { audiA3.setPrecio(preciosVehiculos[1]);
		 	 						  				  System.out.println("\nEl valor del auto seleccionado es: $" + audiA3.getPrecio());
		 	 						  				  System.out.println("Desea comprar este vehiculo?");
		 	 						  				  System.out.println("1.Si, por favor. \n0.No, salir.");
		 	 						  				  opt = sc.nextInt();
		 	 						  				  audiA3.setSumaTotal(1, audiA3.getPrecio());
		 	 						  				  System.out.println("Genial! A continuacion tienes el detalle de tu compra:");
		 	 						  				  System.out.println(audiA3.getDetalle());
		 	 						  				  System.out.println("Total: $" + audiA3.getTotal());
		 	 						  				  System.out.println("\n¿Desea realizar otra compra? \n3.Si, volver al menu \n0.No, salir.");
		 	 						  				  opt = sc.nextInt();
		 	 						  				  }while((opt>0) && (opt <2));
		 	 						  
		 	 						  				  System.out.println("A continuacion tienes el detalle de tu compra:");
		 	 						  				  System.out.println(audiA3.getDetalle());
		 	 						  				  System.out.println("Total: $" + audiA3.getTotal());
		 	 						  				  System.out.println(bmwX4.getDetalle());
		 	 						  				  System.out.println("Total: $" + bmwX4.getTotal());
					  				  				
		 	 						  break;
		 	 						  case 2: do{	bmwX4.setPrecio(preciosVehiculos[3]);
						  				  				System.out.println("\nEl valor del auto seleccionado es: $" + bmwX4.getPrecio());
						  				  				System.out.println("Desea comprar este vehiculo?");
						  				  				System.out.println("1.Si, por favor. \n0.No, salir.");
						  				  				opt = sc.nextInt();
						  				  				bmwX4.setSumaTotal(1, bmwX4.getPrecio());
						  				  				System.out.println("Genial! A continuacion tienes el detalle de tu compra:");
						  				  				System.out.println(bmwX4.getDetalle());
						  				  				System.out.println("Total: $" + bmwX4.getTotal());
						  				  				System.out.println("\n¿Desea realizar otra compra? \n3.Si, volver al menu \n0.No, salir.");
						  				  				opt = sc.nextInt();
						  				  				}while((opt>0) && (opt <2));
						  
						  				  				System.out.println("A continuacion tienes el detalle de tu compra:");
						  				  				System.out.println(audiA3.getDetalle());
		 	 						  				  	System.out.println("Total: $" + audiA3.getTotal());
						  				  				System.out.println(bmwX4.getDetalle());
						  				  				System.out.println("Total: $" + bmwX4.getTotal());
						  				  				
						  				  				break;
		 	 						  }}while((opt>0) && (opt <3));
		 	 			break;
		 	 			case 2: do{System.out.println("MENU: Motos.");
		 	 						  System.out.println("Presione para seleccionar una moto:");
		 	 						  System.out.println("1.Nombre: " + hondaFalcon.getMarca() + " " + hondaFalcon.getModelo() + " - Color: " + hondaFalcon.getColor() + " - Tipo: " + hondaFalcon.getTipo());
		 	 						  System.out.println("2.Nombre: " + hondaWave.getMarca() + " " + hondaWave.getModelo() + " - Color: " + hondaWave.getColor() + " - Tipo: " + hondaWave.getTipo());
		 	 						  System.out.println("3.Volver atrás");
		 						     opt = sc.nextInt();
		 						    switch(opt) {
		 	 						  case 1:do { hondaFalcon.setPrecio(preciosVehiculos[1]);
		 	 						  				  System.out.println("\nEl valor de la mota seleccionada es: $" + hondaFalcon.getPrecio());
		 	 						  				  System.out.println("Desea comprar este vehiculo?");
		 	 						  				  System.out.println("1.Si, por favor. \n0.No, salir.");
		 	 						  				  opt = sc.nextInt();
		 	 						  				  hondaFalcon.setSumaTotal(1,hondaFalcon.getPrecio());
		 	 						  				  System.out.println("Genial! A continuacion tienes el detalle de tu compra:");
		 	 						  				  System.out.println(hondaFalcon.getDetalle());
		 	 						  				  System.out.println("Total: $" + hondaFalcon.getTotal());
		 	 						  				  System.out.println("\n¿Desea realizar otra compra? \n3.Si, volver al menu \n0.No, salir.");
		 	 						  				  opt = sc.nextInt();
		 	 						  				  }while((opt>0) && (opt <2));
		 	 						  
		 	 						  				  System.out.println("A continuacion tienes el detalle de tu compra:");
		 	 						  				  System.out.println(hondaFalcon.getDetalle());
		 	 						  				  System.out.println("Total: $" + hondaFalcon.getTotal());
		 	 						  				  System.out.println(hondaWave.getDetalle());
					  				  				  System.out.println("Total: $" + hondaWave.getTotal());
		 	 						  break;
		 	 						  case 2: do{	hondaWave.setPrecio(preciosVehiculos[2]);
						  				  				System.out.println("\nEl valor del auto seleccionado es: $" + hondaWave.getPrecio());
						  				  				System.out.println("Desea comprar este vehiculo?");
						  				  				System.out.println("1.Si, por favor. \n0.No, salir.");
						  				  				opt = sc.nextInt();
						  				  				hondaWave.setSumaTotal(1,hondaWave.getPrecio());
						  				  				System.out.println("Genial! A continuacion tienes el detalle de tu compra:");
						  				  				System.out.println(hondaWave.getDetalle());
						  				  				System.out.println("Total: $" + hondaWave.getTotal());
						  				  				System.out.println("\n¿Desea realizar otra compra? \n3.Si, volver al menu \n0.No, salir.");
						  				  				opt = sc.nextInt();
						  				  				}while((opt>0) && (opt <2));
						  
						  				  				System.out.println("A continuacion tienes el detalle de tu compra:");
						  				  				System.out.println(hondaFalcon.getDetalle());
		 	 						  				  	System.out.println("Total: $" + hondaFalcon.getTotal());
						  				  				System.out.println(hondaWave.getDetalle());
						  				  				System.out.println("Total: $" + hondaWave.getTotal());
						  				  				
						  				  break;
		 	 						  }} while((opt>0) && (opt <3));
		 						     
		 	 			break;}
		 	  		}while((opt>0) && (opt<3));
				
		 		}catch(InputMismatchException ex){	
		 		System.out.println("Error, debe ingresar un valor numerico (tipo entero).");
		 		sc.next();
		 		activador = true;}
	
	  }while(activador);
	}while(opt!=0);
	System.out.println("\nTOTAL de tu/s compra/s:");
			System.out.println(audiA3.getDetalle());
		  	System.out.println("Total: $" + audiA3.getTotal());
			System.out.println(bmwX4.getDetalle());
			System.out.println("Total: $" + bmwX4.getTotal());
			System.out.println(hondaFalcon.getDetalle());
		  	System.out.println("Total: $" + hondaFalcon.getTotal());
			System.out.println(hondaWave.getDetalle());
			System.out.println("Total: $" + hondaWave.getTotal());
			JOptionPane.showMessageDialog(null,"Has salido con éxito. Esperamos tu regreso pronto!","Alert",JOptionPane.WARNING_MESSAGE);
			sc.close();
 }
}