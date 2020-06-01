package model.data_structures;

/**
 * Clase Nodo para ser utilizada en Lista Enlazada Sencilla
 * @author Julian Padilla y Pablo Pastrana
 * @param <E> Tipo de dato Genrico
 */
public class Node <E> 
{	
	// Atributos
	
	/**
	 * Objeto en el nodo correspondiente
	 */
	private E item;
	
	/**
	 * Nodo siguiente
	 */
	private Node<E> next;
	
	// Metodo Constructor
	
	/**
	 * Al nodo se le traspasa el objeto que ingresa por parametro
	 * El nodo siguiente es null por que no tiene una referencia en este punto
	 * @param pDato Dato a almacenar en el nodo
	 */
	public Node(E pItem)
	{
		this.item = pItem;
		this.next = null;
	}
	
	// Metodos
	
	/**
	 * Indica y apunta al nodo siguiente 
	 * @return Nodo siguiente
	 */
	public Node<E> getNext()
	{
		return this.next;
	}
	
	/**
	 * Establece el nodo siguiente al que tengo
	 * @param pSiguiente Nodo siguiente
	 */
	public void setNext(Node<E> pNext)
	{
		this.next = pNext;
	}
	
	/**
	 * Devuelve el objeto almacenado en el nodo actual 
	 * @return Dato almacenado en el nodo
	 */
	public E getItem()
	{
		return this.item;
	}
	
	/**
	 * Ingresa el objeto por parametro para establecerse en el nodo actual
	 * @param pObjeto Objeto a colocar en el nodo
	 */
	public void setItem(E pItem)
	{
		this.item = pItem;
	}
}
