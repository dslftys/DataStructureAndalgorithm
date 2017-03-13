package SwordOffer.problem2;

import Algorithm.Chapter1_Base.StaticMethod;

/*
 * ��̬�ڲ���ʵ�ֵ����԰�ȫ�ĵ���
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
