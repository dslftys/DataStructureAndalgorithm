package util.SingleLinkedList;

//�����
public class ListNode {

	  public  int val; //������
	  public ListNode next;  //ָ����
	
	  //ͷ���Ĺ��췽��
	  public ListNode(ListNode nextval) {
	      this.next = nextval;
	  }
	  public ListNode(int val){
		  this.val=val;
	  }
	  //��ͷ���Ĺ��췽��
	  public ListNode(int obj, ListNode nextval) {
	      this.val = obj;
	      this.next = nextval;
	  }
	
	  //��õ�ǰ����ָ����
	  public ListNode getNext() {
	      return this.next;
	  }
	
	  //��õ�ǰ����������ֵ
	  public Object getval() {
	      return this.val;
	  }
	  //���õ�ǰ����ָ����
	  public void setNext(ListNode nextval) {
	      this.next = nextval;
	  }
	
	  //���õ�ǰ����������ֵ
	  public void setval(int obj) {
	      this.val = obj;
	  }
	
}