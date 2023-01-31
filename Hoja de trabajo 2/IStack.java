//
//
//  @ Project : hoja de trabajo 2
//  @ File Name : IStack.java
//  @ Date : 31/01/2023
//  @ Author : Sofía Velásquez, Joaquín Campos, Julio García Salas
// 
//
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