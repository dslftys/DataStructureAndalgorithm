package util.SingleLinkedList;
import java.lang.*;
public class SingleLinkList implements MyList {
     Node head;//ͷָ��
	 Node current;//��ǰ�ڵ����
	 int size;//�ڵ����
	//��ʼ��һ��������
	public SingleLinkList(){
		//��ʼ��ͷ�ڵ㣬��ͷָ��ָ��ͷ��㣬�����õ�ǰ�ڵ�������ͷ���
		this.head=current=new Node(null);
		this.size=0;
	}
	
	public void index(int index)throws Exception{
		if(index<-1||index>size-1){
			throw new Exception("��������");
		}
		//˵����ͷ���֮�����
		if(index==-1)//��Ϊ��һ������Ԫ�ؽڵ���±���0����ôͷ�����±���Ȼ��-1
			return;
		current=head.next;
		int j=0;
		while(current!=null&&j<index){
			current=current.next;
			j++;
		}
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size==0;
	}

	@Override
	public void insert(int index, Object obj) throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>size){
			throw new Exception("��������");
		}
		index(index-1);//��λ��Ҫ�����ڵ��ǰһ���ڵ����
		current.setNext(new Node(obj,current.next));
		size++;
	}

	@Override
	public void delete(int index) throws Exception {
		// TODO Auto-generated method stub
		//�ж������Ƿ�Ϊ��
		if(isEmpty())
		{
			throw new Exception("����Ϊ�գ��޷�ɾ��");
		}
		if(index<0||index>size)
		{
			throw new Exception("��������");
		}
		index(index-1);//��λ��Ҫ�����ڵ��ǰһ���ڵ����
		current.setNext(current.next.next);
		size--;
	}

	@Override
	public Object get(int index) throws Exception {
		// TODO Auto-generated method stub
		 if(index <-1 || index >size-1){
		     throw new Exception("�����Ƿ���");
		 }
		index(index);
		return current.getElement();
	}
}
