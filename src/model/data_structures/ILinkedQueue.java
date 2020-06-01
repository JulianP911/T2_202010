package model.data_structures;

/**
 * Interfaz de la lista-cola
 * @author Julian Padilla - Pablo Pastrana
 * @param <E> Tipo Generico
 */
public interface ILinkedQueue<E> extends Iterable<E>
{
	/**
	 * Retornar el numero de elementos presentes en el lista-cola
	 * @return El tamanio de la lista-cola
	 */
	int getSize();
	
	/**
	 * Determina si la lista-pila esta vacia
	 * @return True si la lista-cola esta vacia y false si la cola no se encuntra vacia
	 */
	public boolean isEmpty();
	
	/**
	 * Agregar un objeto a la lista-cola (encolando)
	 * @param pItem Objeto a agregar al principio
	 */
	public void enqueue(E pItem);
	
	/**
	 * Eliminar un objeto de la lista-cola (descolando)
	 * @return El objeto eliminado de la lista-cola
	 */
	public E dequeue();
	
	 /**
     * Devuelve (pero no quita) el artículo añadido más recientemente a esta en la cola.
     */
	public E peek();
}
