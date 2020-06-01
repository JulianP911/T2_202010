package test.data_structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import model.data_structures.LinkedStack;

/**
 * Clase de test para verificar que la LinkedStack si esta funcionando correctamente
 * @author Julian Padilla - Pablo Pastrana
 */
public class LinkedStackTest 
{
	/**
	 * Lista-pila de tipo intger
	 */
	private LinkedStack<Integer> listaPila1;
	
	/**
	 * Lista-pila de tipo String
	 */
	private LinkedStack<String> listaPila2;

	/**
	 * Verifica que la lista-pila si se este creando
	 */
	@Test
	void testLinkedStack() 
	{
		listaPila1 = new LinkedStack<Integer>();
		listaPila2 = new LinkedStack<String>();
	}
	
	/**
	 * Escenario 1: Crea una lista-pila de tipo integer
	 */
	@Before
	public void setupEscenario1( )
	{
		listaPila1 = new LinkedStack<Integer>();
		listaPila1.push(1);
		listaPila1.push(2);
		listaPila1.push(3);
		listaPila1.push(4);
	}
	
	/**
	 * Escenario 1: Crea una lista-pila de tipo String
	 */
	@Before
	public void setupEscenario2( )
	{
		listaPila2 = new LinkedStack<String>();
		listaPila2.push("Hola");
		listaPila2.push("como");
		listaPila2.push("estas");
		listaPila2.push("hoy");
		listaPila2.push("?");
	}

	/**
	 * Prueba 1: Verifica que el primer elemento dentro de la lista-pila si corresponda con el del escenario 1 y 2
	 */
	@Test
	void testGetFirst() 
	{	
		setupEscenario1();
		assertEquals( 4, listaPila1.getFirst().getItem().intValue());
		
		setupEscenario2();
		assertEquals("?", listaPila2.getFirst().getItem());
	}

	/**
	 * Prueba 2: Verifica que el tamanio de la lista-pila si corresponda adecdamente con el de los escenarios 1 y 2
	 */
	@Test
	void testGetSize() 
	{
		setupEscenario1();
		assertEquals(4, listaPila1.getSize());

		setupEscenario2();
		assertEquals(5, listaPila2.getSize());
	}

	/**
	 * Prueba 3: Verifica que las listas no se encuentren vacias
	 */
	@Test
	void testIsNotEmpty() 
	{
		setupEscenario1();
        assertTrue(!listaPila1.isEmpty());
        
        setupEscenario2();
        assertTrue(!listaPila2.isEmpty());
	}

	/**
	 * Prueba 4: Verifica que si estan agregando objetos a la lista-pila
	 */
	@Test
	void testPush() 
	{
		setupEscenario1();
		listaPila1.push(5);
		assertEquals(5, listaPila1.getSize());
		
		setupEscenario2();
		listaPila2.push("?");
		assertEquals(6, listaPila2.getSize());
	}

	/**
	 * Prueba 5: Verifica que si estan eliminando objetos a la lista-pila
	 */
	@Test
	void testPop() 
	{
		setupEscenario1();
		listaPila1.pop();
		assertEquals(3, listaPila1.getSize());
		
		setupEscenario2();
		listaPila2.pop();
		assertEquals(4, listaPila2.getSize());
	}
}
