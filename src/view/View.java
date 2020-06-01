package view;

import model.logic.Modelo;

public class View 
{
    /**
     * Metodo constructor
     */
    public View()
    {
    	
    }
    
	public void printMenu()
	{
		System.out.println("Ingrese la opcion que le interesa saber:");
		System.out.println("Opcion1: Mostrar el total de comparendos en la pila - cola, la información básica del primer comparendo de la pila y la informacion basica del primer comparendo en la cola.");
		System.out.println("Opcion2: Procesar la cola resultante para buscar el grupo de comparendos consecutivos (cluster) más grande por su código de INFRACCION.");
		System.out.println("Opcion3: Procesar la pila resultante para reportar los últimos N comparendos para una INFRACCION dada.");
		System.out.println("Si quiere finaliza ingrese la cadena: Cerrar");
	}

	public void printMessage(String mensaje) 
	{

		System.out.println(mensaje);
	}		
	
	public void printModelo(Modelo modelo)
	{
		System.out.println(modelo);
	}
}
