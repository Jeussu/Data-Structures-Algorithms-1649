/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyStack;

/**
 *
 * @author Vinh
 */
//define class Node
class NodeSTACK
{
int infor;
NodeSTACK next;
public NodeSTACK(int x)
{
this.infor=x;
this.next=null;
}
}
class stack{
NodeSTACK top;
public stack()
{
top=null;
}
public boolean isEmpty()
{
if (top==null)
return true;
else
return false;
}
public void push(int newelement)
{
NodeSTACK node=new NodeSTACK(newelement);
if(top==null)
{
top=node;
}
else
{
node.next=top;
top=node;
}
}
public NodeSTACK pop()
{
NodeSTACK tmp=null;
if(isEmpty()==true)
return null;
else
{
tmp=top;// save top
top=top.next;// top move to next
tmp.next=null;//remove link with top
return tmp;
}
}
public int peek()
{
int tmp=0;
tmp=top.infor;
if(top!=null)
return tmp;
else
return 100000;
}
public void deleteall()
{
top=null;
}

}



public class MyStack {

public static void main(String[] args) {
// TODO Auto-generated method stub
NodeSTACK q=null;
stack s=new stack();
System.out.println("9, 10,8,4");
s.push(9);
s.push(10);
s.push(8);
s.push(4);

System.out.println("test peek function");
int t=s.peek();
System.out.println("value:"+t);
System.out.println("test delete all");
s.deleteall();

System.out.println("get all out");
q=s.top;
while (q!=null)
{
q=s.pop();
if (q!=null) System.out.println(q.infor);
}
}
}
