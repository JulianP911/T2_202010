package controller;

import java.util.Iterator;
import java.util.Scanner;

import model.logic.Comparendo;
import model.logic.Modelo;
import view.View;

public class Controller 
{

	/**
	 * Instancia del Modelo
	 */
	private Modelo modelo;

	/**
	 * Instancia de la Vista
	 */
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	/**
	 * Metodo run
	 */
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;

		
		while( !fin )
		{
			view.printMenu();
     		String opcion = lector.next();
			
			switch(opcion)
			{
			   case "Opcion1":
				   int tamanio1 = modelo.darTamanoPila();
				   int tamanio2 = modelo.darTamanoCola();
				   view.printMessage("El numero total de comparendos es para la pila: " + tamanio1 + " \n");    // Imprime el tamanio de la pila
				   view.printMessage("El numero total de comparendos es para la cola: " + tamanio2 + " \n");    // Imprime el tamanio de la cola
				   view.printMessage("El primer comparendo de la pila es: "); 
				   view.printMessage(modelo.darDatosPila(0) + " \n");                             // Imprime el elemento en la cabeza de la pila
				   view.printMessage("El primer comparendo de la cola es: "); 
				   view.printMessage(modelo.darDatosCola(0) + " \n");
				   break;
				   
			   case "Opcion2": 
				   view.printMessage("Ingrese la infraccion a consultar en la cola: ");
				   String entrada = lector.next();
				   view.printMessage("Los siguiente comparendos de este tipo: " + entrada + "estan consecutivos: ");
				   Iterator<Comparendo> resultado1 = modelo.consultarMasComparendosConsecutivos(entrada).iterator();
				   while(resultado1.hasNext())
				   {
					   Comparendo elemento = resultado1.next();
					   view.printMessage(elemento.getInfraccion() + ", " + elemento.getObjective() + ", " + elemento.getFecha_hora() + ", " + elemento.getClase_vehi() + ", " + elemento.getTipo_servi() + ", " + elemento.getLocalidad());
				   }
				   break;
				   
			   case "Opcion3": 
				   view.printMessage("Ingrese los n ultimos comparendos a consultar y el tipo de infracción: ");
				   int entrada1 = lector.nextInt();
				   String entrada2 = lector.next();
				   view.printMessage("Los siguientes: " + entrada1 + " ultimos del tipo de infracion: " + entrada2);
				   Iterator<Comparendo> resultado2 = modelo.reportarComparendoUlitmosDadoN(entrada1, entrada2).iterator();
				   while(resultado2.hasNext())
				   {
					   Comparendo elemento = resultado2.next();
					   view.printMessage(elemento.getInfraccion() + ", " + elemento.getObjective() + ", " + elemento.getFecha_hora() + ", " + elemento.getClase_vehi() + ", " + elemento.getTipo_servi() + ", " + elemento.getLocalidad());
				   }
				   break;
				   
			   case "Cerrar":
				   view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				   lector.close();
				   fin = true;
				   break;

		       default: 
				   view.printMessage("--------- \n Opcion Invalida !! \n---------");
				   break;
		    }
		}
	}	
}
