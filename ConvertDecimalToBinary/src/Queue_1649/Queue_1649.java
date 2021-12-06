/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_1649;

/**
 *
 * @author Vinh
 */
class NodeQ
{
int infor;
NodeQ next;
public NodeQ(int x)
{
this.infor=x;
this.next=null;
}
}
class list_queue
{
NodeQ head,tail;
public list_queue()
{
head=null;tail=null;
}
public boolean isEmpty()
{
if(head==null)
return true;
else
return false;
}
public void enqueue(int y)
{
NodeQ tmp=new NodeQ(y);
if(isEmpty()==true)
{
head=tmp;
tail=tmp;
}
else
{
tail.next=tmp;
tail=tmp;
}
}
public void dequeue()
{
if(isEmpty()==false)
{
head=head.next;
}

}
public void print()
{
NodeQ tmp=head;
while(tmp!=null)
{
System.out.print(tmp.infor+",");
tmp=tmp.next;
}
}
public int peek()
{
if(isEmpty()==true)
return 1000000;
else
return head.infor;
}

}

public class Queue_1649 {

public static void main(String[] args) {
// TODO Auto-generated method stub
list_queue l=new list_queue();
l.enqueue(8);
l.enqueue(9);
l.enqueue(10);
l.enqueue(3);
System.out.println("all element in queue");
l.print();
l.dequeue();
System.out.println("all element in queue after delete one element");
l.print();
System.out.println("test peek");
int t=l.peek();
System.out.print("t="+t);
System.out.println("test after peek");
l.print();



}

}
