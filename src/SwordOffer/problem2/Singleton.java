package SwordOffer.problem2;

import Algorithm.Chapter1_Base.StaticMethod;

/*
 * 静态内部类实现的线性安全的单例
 */
public class Singleton {
	
	private Singleton() {
		
	}
	private static class SingletonHolder {
		private static final Singleton unqiqueInstance = new Singleton();
	}
	public static Singleton getInstance() {
		return SingletonHolder.unqiqueInstance;
	}
}
