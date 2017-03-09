/**
 * 
 */
package util;

public abstract interface Iterator<E>{
	public  abstract boolean hasNext();
	public abstract E next();
	public abstract void remove();
}
