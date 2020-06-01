package model.data_structures;

import java.util.Iterator;

/**
 * Obtenido desde: https://www.geeksforgeeks.org/java-implementing-iterator-and-iterable-interface/
 * @param <E> Tipo Generico
 */
public class ListIterator1<E> implements Iterator<E> 
{ 
    Node<E> current; 
      
    // initialize pointer to head of the list for iteration 
    public ListIterator1(LinkedStack<E> list) 
    { 
        current = list.getFirst(); 
    } 
      
    // returns false if next element does not exist 
    public boolean hasNext() 
    { 
        return current != null; 
    } 
      
    // return current data and update pointer 
    public E next() 
    { 
        E data = current.getItem(); 
        current = current.getNext(); 
        return data; 
    } 
      
    // implement if needed 
    public void remove() 
    { 
        throw new UnsupportedOperationException(); 
    } 
} 
