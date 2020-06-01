package model.data_structures;

/**
 * Interfaz de la lista-pila
 * @author Julian Padilla - Pablo Pastrana
 * @param <E> Tipo Generico
 */
public interface ILinkedStack<E> extends Iterable<E>
{
	/**
	 * Retornar el numero de elementos presentes en el lista-pila
	 * @return El tamanio de la lista-pila
	 */
	int getSize();
	
	/**
	 * Determina si la lista-pila esta vacia
	 * @return True si la lista-pila esta vacia y false si la pila no se encuntra vacia
	 */
	public boolean isEmpty();
	
	/**
	 * Agregar un objeto a la lista-pila 
	 * @param pItem Objeto a agregar al principio
	 */
	public void push(E pItem);
	
	/**
	 * Eliminar un objeto de la lista-pila 
	 * @return El objeto eliminado de la lista-pila
	 */
	public E pop();
	
	 /**
     * Devuelve (pero no quita) el artículo añadido más recientemente a esta pila.
     */
	public E peek();	
}
