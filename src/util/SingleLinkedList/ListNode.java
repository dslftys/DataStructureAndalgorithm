package util.SingleLinkedList;

//结点类
public class ListNode {

	  public  int val; //数据域
	  public ListNode next;  //指针域
	
	  //头结点的构造方法
	  public ListNode(ListNode nextval) {
	      this.next = nextval;
	  }
	  public ListNode(int val){
		  this.val=val;
	  }
	  //非头结点的构造方法
	  public ListNode(int obj, ListNode nextval) {
	      this.val = obj;
	      this.next = nextval;
	  }
	
	  //获得当前结点的指针域
	  public ListNode getNext() {
	      return this.next;
	  }
	
	  //获得当前结点数据域的值
	  public Object getval() {
	      return this.val;
	  }
	  //设置当前结点的指针域
	  public void setNext(ListNode nextval) {
	      this.next = nextval;
	  }
	
	  //设置当前结点数据域的值
	  public void setval(int obj) {
	      this.val = obj;
	  }
	
}