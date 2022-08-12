package generics;

import java.util.Arrays;

public class PilaArray<T> implements Pila<T> {
	
	Object [] pila;
	int tope = 0;
	
	public PilaArray(int capacity) {
		this.pila = new Object [capacity];
	}

	@Override
	public void push(T dato) {
		this.pila[tope] = dato;
		tope++;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		T aux = null;
		try {
			if(!this.isEmpty()) {
				tope--;
				aux = (T) pila[tope];
			} else
				throw new PilaVaciaException();
		} catch (PilaVaciaException pve) {
			System.err.println(pve.getMessage());
		}
		
		return aux;
		
	}

	@Override
	public T peek() {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		return tope == 0;
	}
	
	public String toString() {
		return Arrays.toString(pila) + "tope: " + tope;
	}

}
