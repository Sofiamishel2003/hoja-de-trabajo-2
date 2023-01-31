/**
 * @author sofia.velasquez, Julio garcias salas, Jose
 */
public interface IStack<T>{
	
	void push(T e);
    /***
	 * ingresa un valor al stack
	 * @param e  el valor a ingresar
	 */
	T peek();
	/***
	 * @return retorna el que se encuentra en Top
	 */
	T pull();
	/***
	 * @return retorna el valor actual despúes del pop
	 */
	boolean isEmpty();
	/***
	 * @return retorna si está vacio o no (True-False)
	 */
    int count();
	/***
	 * @return retorna si está vacio o no (True-False)
	 */
}