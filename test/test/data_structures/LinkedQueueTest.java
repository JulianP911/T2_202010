package test.data_structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import model.data_structures.LinkedQueue;


/**
 * Clase de test para verificar que la LinkedQueue si esta funcionando correctamente
 * @author Julian Padilla - Pablo Pastrana
 */
class LinkedQueueTest 
{

	/**
	 * Lista-cola de tipo intger
	 */
	private LinkedQueue<Integer> listaPila1;
	
	/**
	 * Lista-cola de tipo String
	 */
	private LinkedQueue<String> listaPila2;

	/**
	 * Verifica que la lista-cola si se este creando
	 */
	@Test
	void testLinkedStack() 
	{
		listaPila1 = new LinkedQueue<Integer>();
		listaPila2 = new LinkedQueue<String>();
	}
	
	/**
	 * Escenario 1: Crea una lista-cola de tipo integer
	 */
	@Before
	public void setupEscenario1( )
	{
		listaPila1 = new LinkedQueue<Integer>();
		listaPila1.enqueue(1);
		listaPila1.enqueue(2);
		listaPila1.enqueue(3);
		listaPila1.enqueue(4);
	}
	
	/**
	 * Escenario 1: Crea una lista-cola de tipo String
	 */
	@Before
	public void setupEscenario2( )
	{
		listaPila2 = new LinkedQueue<String>();
		listaPila2.enqueue("Hola");
		listaPila2.enqueue("como");
		listaPila2.enqueue("estas");
		listaPila2.enqueue("hoy");
		listaPila2.enqueue("?");
	}

	/**
	 * Prueba 1: Verifica que el primer elemento dentro de la lista-cola si corresponda con el del escenario 1 y 2
	 */
	@Test
	void testGetFirst() 
	{	
		setupEscenario1();
		assertEquals( 1, listaPila1.getFirst().getItem().intValue());
		
		setupEscenario2();
		assertEquals("Hola", listaPila2.getFirst().getItem());
	}

	/**
	 * Prueba 2: Verifica que el tamanio de la lista-cola si corresponda adecdamente con el de los escenarios 1 y 2
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
	 * Prueba 3: Verifica que las lista-cola no se encuentren vacias
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
	 * Prueba 4: Verifica que si estan agregando objetos a la lista-cola
	 */
	@Test
	void testPush() 
	{
		setupEscenario1();
		listaPila1.enqueue(5);
		assertEquals(5, listaPila1.getSize());
		
		setupEscenario2();
		listaPila2.enqueue("?");
		assertEquals(6, listaPila2.getSize());
	}

	/**
	 * Prueba 5: Verifica que si estan eliminando objetos a la lista-cola
	 */
	@Test
	void testPop() 
	{
		setupEscenario1();
		listaPila1.dequeue();
		assertEquals(3, listaPila1.getSize());
		
		setupEscenario2();
		listaPila2.dequeue();
		assertEquals(4, listaPila2.getSize());
	}

}
