package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase de la lista-pila que implementa la interfaz ILinkedStack
 * @author Julian Padilla - Pablo Pastrana
 * Usamos metodos del Libro Algorithms 4 edition:
 * 1. push, pop, peek and toSting los autores son: Robert Sedgewick y Kevin Wayne.
 * @param <E> Tipo Generico
 */
public class LinkedStack<E> implements ILinkedStack<E>
{
	// Atributos

	/**
	 * Tamaño de la pila
	 */
	private int size;

	/**
	 * Nodo cabeza de la pila
	 */
	private Node<E> first;

	// Metodo Constructor

	/**
	 * El nodo primero se inicializa en null
	 * El tamanio comienza desde 0
	 */
	public LinkedStack() 
	{
		first = null;
		size = 0;
	}

	/**
	 * Retorna el nodo cabezera de la lista-pila
	 * @return Nodo cabeza lista-pila
	 */
	public Node<E> getFirst()
	{
		return first;
	}

	/**
	 * Dar el tamanio de lista-pila
	 */
	public int getSize() 
	{
		return size;
	}

	/**
	 * Determina si la lista-pila esta vacia
	 * @return True si la lista-pila esta vacia y false si la pila no se encuntra vacia
	 */
	public boolean isEmpty() 
	{
		return first == null;
	}

	/**
	 * Agregar un objeto a la lista-pila 
	 * @param pItem Objeto a agregar al principio
	 */
	public void push(E pItem)
	{
		Node<E> oldfirst = first;
		first = new Node<E>(pItem);
		first.setNext(oldfirst);
		size++;
	}

	/**
	 * Eliminar un objeto de la lista-pila 
	 * @return El objeto eliminado de la lista-pila
	 */
	public E pop() 
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException("Stack underflow");
		}

		E item = first.getItem() ;      
		first = first.getNext();           
		size--;
		return item;                   
	}

	 /**
     * Devuelve (pero no quita) el artículo añadido más recientemente a esta pila.
     * Devuelve el artículo añadido más recientemente a esta pila
     * @throws java.util.NoSuchElementExcepción si esta pila está vacía
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
     * Devuelve una representación en cadena de esta pila.
     * Devuelve la secuencia de elementos de la pila en orden LIFO (last-in, first-out)
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
		return new ListIterator1<>(this);
	}
}
