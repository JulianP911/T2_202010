package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase de la lista-cola que implementa la interfaz ILinkedQueue
 * @author Julian Padilla - Pablo Pastrana
 * Usamos metodos del Libro Algorithms 4 edition:
 * 1. enqueue, dequeue, peek and toSting los autores son: Robert Sedgewick y Kevin Wayne.
 * @param <E> Tipo Generico
 */
public class LinkedQueue <E> implements ILinkedQueue<E>
{
	// Atributos

	/**
	 * Tamaño de la cola
	 */
	private int size;

	/**
	 * Nodo cabeza de la cola
	 */
	private Node<E> first;

	/**
	 * Nodo  ultimo de la cola
	 */
	private Node<E> last;

	/**
	 * El nodo primero se inicializa en null
	 * El nodo ultimo se inicializa en null
	 * El tamanio comienza desde 0
	 */
	public LinkedQueue() 
	{
		first = null;
		last = null;
		size = 0;
	}

	/**
	 * Retorna el nodo cabezera de la lista-cola
	 * @return Nodo cabeza lista-cola
	 */
	public Node<E> getFirst()
	{
		return first;
	}

	/**
	 * Retorna el nodo ultimo de la lista-cola
	 * @return Nodo ultimo lista-cola
	 */
	public Node<E> getLast()
	{
		return last;
	}

	/**
	 * Dar el tamanio de lista-cola
	 */
	public int getSize() 
	{
		return size;
	}

	/**
	 * Determina si la lista-cola esta vacia
	 * @return True si la lista-cola esta vacia y false si la cola no se encunetra vacia
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}

	/**
	 * Agrega el elemento en la lista-cola
	 * @param pItem Objeto a agregar al principio
	 */
	public void enqueue(E pItem) 
	{
		Node<E> oldlast = last;
		last = new Node<E>(pItem);
		last.setNext(null);

		if (isEmpty()) 
		{
			first = last;
		}
		else          
		{
			oldlast.setNext(last);
		}

		size++;
	}

	/**
	 * Eliminar un objeto de la lista-cola
	 * @return El objeto eliminado de la lista-cola
	 * @throws java.util.NoSuchElementExcepción si esta la cola está vacía
	 */
	public E dequeue() 
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException("Queue underflow");
		}
		
		E item = first.getItem();
		first = first.getNext();
		size--;
		
		if (isEmpty()) 
		{
			last = null;   
		}
		
		return item;
	}

	/**
	 * Devuelve (pero no quita) el artículo añadido más recientemente a esta cola.
	 * Devuelve el artículo añadido más recientemente a esta cola
	 * @throws java.util.NoSuchElementExcepción si esta la cola está vacía
	 */
	public E peek() 
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException("Stack underflow");
		}
		return first.getItem();
	}
	
	/**
	 * Devuele el objeto en la posicion que ingreso por parametro
	 * @param Posicion en la lista
	 */
	public E seeItem(int pPosicion)
	{
		Node<E> temporal = first;

		for(int i = 0; i < pPosicion; i++)
		{
			temporal = temporal.getNext();
		}

		return temporal.getItem();
	}

	/**
     * Devuelve una representación en cadena de esta cola.
     * Devuelve la secuencia de elementos de la cola en orden FIFO (First-in, First-out)
     */
	public String toString() 
	{
		StringBuilder s = new StringBuilder();
		for (E item : this)
		{
			s.append(item + " ");
		}
		return s.toString();
	} 
	
	/**
	 * Crea el iterador para recorrer la lista-pila
	 */
	@Override
	public Iterator<E> iterator() 
	{
		return new ListIterator2<>(this);
	}
}
