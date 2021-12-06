/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysort;

/**
 *
 * @author Vinh
 */
public class mysort {
    public static void selectionsort(int a[])
	{
		int i,j,pos,tmp;
		int n=a.length;
		for(i=0;i<n-1;i++)
		{
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(a[pos]>a[j])
				{
					pos=j;
				}
			}
			if(pos!=i)
			{
				tmp=a[i];
				a[i]=a[pos];
				a[pos]=tmp;
			}
			display(a);
		}
		
	}
	public static void bubblesort(int a[])
	{
		int i,j,tmp;
		int n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=n-1;j>i;j--)
				if(a[j]<a[j-1])
				{
					tmp=a[j-1];
					a[j-1]=a[j];
					a[j]=tmp;
				}	
			display(a);
		}
			
	}
	
	public static void display(int a[])
	{
		System.out.println("");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+",");
	}
	
	public static void main(String[] args)
	{
		int b[]={8,1,2,9,5,3};
		display(b);
		selectionsort(b);
		display(b);
		System.out.println("\n-----------------");
		int c[]={8,1,2,9,5,3};
		display(c);
		bubblesort(c);
		display(c);
		
	}
	
	
	
	

}
