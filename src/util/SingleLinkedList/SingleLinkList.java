package util.SingleLinkedList;
import java.lang.*;
public class SingleLinkList implements MyList {
     Node head;//头指针
	 Node current;//当前节点对象
	 int size;//节点个数
	//初始化一个空链表
	public SingleLinkList(){
		//初始化头节点，让头指针指向头结点，并且让当前节点对象等于头结点
		this.head=current=new Node(null);
		this.size=0;
	}
	
	public void index(int index)throws Exception{
		if(index<-1||index>size-1){
			throw new Exception("参数错误");
		}
		//说明在头结点之后操作
		if(index==-1)//因为第一个数据元素节点的下标是0，那么头结点的下标自然是-1
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
			throw new Exception("参数错误！");
		}
		index(index-1);//定位到要操作节点的前一个节点对象
		current.setNext(new Node(obj,current.next));
		size++;
	}

	@Override
	public void delete(int index) throws Exception {
		// TODO Auto-generated method stub
		//判断链表是否为空
		if(isEmpty())
		{
			throw new Exception("链表为空，无法删除");
		}
		if(index<0||index>size)
		{
			throw new Exception("参数错误");
		}
		index(index-1);//定位到要操作节点的前一个节点对象
		current.setNext(current.next.next);
		size--;
	}

	@Override
	public Object get(int index) throws Exception {
		// TODO Auto-generated method stub
		 if(index <-1 || index >size-1){
		     throw new Exception("参数非法！");
		 }
		index(index);
		return current.getElement();
	}
}
