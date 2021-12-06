
        
package convertdecimaltobinary;
import java.util.Scanner;
/**
 *
 * @author Vinh
 */

class NodeS
{
int infor;
NodeS next;
NodeS(int x)
{
this.infor=x;
this.next=null;
}
}
//define stack
class StackDecimalToBinary
{
NodeS top;
StackDecimalToBinary()
{
this.top=null;
}
boolean isEmpty()
{
if (top==null)
return true;
else
return false;
}
void push(int x)
{
NodeS tmp=new NodeS(x);
if(isEmpty())
{
this.top=tmp;
}
else
{
tmp.next=top;
top=tmp;
}
}
NodeS pop()
{
NodeS tmp;
if(isEmpty())
{
return null;
}
else
{
tmp=top;
top=top.next;
tmp.next=null;
return tmp;
}
}
}



public class ConvertDecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
int remander;
int quotient;
NodeS tmp;

StackDecimalToBinary stack=new StackDecimalToBinary();
Scanner scanner = new Scanner(System.in);
System.out.println("input decimal number:");
number =scanner.nextInt();
do
{
remander=number%2;
quotient=number/2;
stack.push(remander);
number=quotient;
}
while(number!=0);

System.out.println("output binary number");
tmp=stack.top;
while (!stack.isEmpty())
{

System.out.print(stack.pop().infor);
}

}

}
