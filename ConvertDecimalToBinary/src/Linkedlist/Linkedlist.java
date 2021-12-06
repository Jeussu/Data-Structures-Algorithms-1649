/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author Vinh
 */
// define node class
class Node
{
int infor;
Node next;
public Node(int i, Node n)
{
this.infor=i;
this.next=n;
}
public Node(int in)
{
this.infor=in;
}
}

class List{
Node head,tail;
public List()
{
head=null;
tail=null;
}
public boolean isEmpty()
{
if (this.head==null)
return true;
else
return false;

}
public void addfirst(int x)
{
Node q=new Node(x);
if(isEmpty()==true)
{
head=q;
tail=q;
}
else
{
q.next=head;// manage head
head=q;//new element becomes head
}
}
public void add(int x)
{
Node q=new Node(x);
if (isEmpty()==true)
{
head=q;
tail=q;
}
else
{
tail.next=q;// link to new element
tail=q;// new element becomes tail
}
}
public void AddManyToLinkedList(int a[])
{
for(int i =0;i<a.length;i++)
add(a[i]);
}
public void AddmanytoLinkedList2(int a[])
{
for(int i=0;i<a.length;i++)
addfirst(a[i]);
}
public void traverse()
{
Node p=head;
while (p!=null) //until p=null then stop
{
System.out.print(p.infor+",");
p=p.next;// move to next element
}
}
public void delete()
{
Node q;
q=head.next;//get address of next element
head=null;// delete head
head=q;//assign head to next element
}
public void deleteend()
{
Node q;
q=head;
while(q.next!=tail)//find element previous tail
{
q=q.next;
}
q.next=null;//link to null
tail=null;//delete last element
tail=q;//move tail to q
}
// calculate sum of linked list
public int sum()
{
int s=0;
Node q=head;
while(q!=null)
{
s=s+q.infor;
q=q.next;
}
return s;
}
// print all odd numbers
public void printodd()
{
Node q=head;
while(q!=null)
{
if(q.infor%2==1)
{
System.out.print(q.infor+", ");
}
q=q.next;

}
}
}



public class Linkedlist {

public static void main(String[] args) {
// TODO Auto-generated method stub
int a[]={6,5,2,3,1,9,8,7};
List list=new List();
List list1=new List();
list.AddManyToLinkedList(a);
list1.AddmanytoLinkedList2(a);
list.traverse();
System.out.println("--------------");
list1.traverse();
list1.delete();
System.out.println("\nelements after deleting first");
list1.traverse();
list1.deleteend();
System.out.println("\nelements after deleting endding");
list1.traverse();
System.out.println("\ntest sum function");
//-----------------
int S=0;
S=list1.sum();
System.out.print("sum:"+S);

System.out.println("\ntest sum printodd");
list1.printodd();



}

}
