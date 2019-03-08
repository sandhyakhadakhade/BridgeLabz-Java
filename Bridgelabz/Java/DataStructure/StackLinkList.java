package com.Bridgelabz.DataStructure;
/**
 * Problem  statement -helper class for stack
 * @author sandhyarani
 *
 */
public class StackLinkList {
	
		Node3 top=null;
		int size=0;
		public boolean isEmpty()
		{
			if(top==null)
				return true;
			return false;
		}
		public void insert(Object data)
		{
			Node3 newnode=new Node3(data);
			if(isEmpty())
			{
				newnode.linkNext=null;
			}
			else
			{
				newnode.linkNext=top;
			}
			top=newnode;
			size++;
//			System.out.println(top.data);
		}
		public Object delete()
		{
			Node3 temp = null;
			if(isEmpty())
			{
				System.out.println("Stack is empty! Cannot delete");
			}
			else
			{
				temp=top;
				top=temp.linkNext;
				size--;
			}
			//System.out.println(temp.data);
			return temp.data;
		}
		int size(){
			return size;
		}
		public void display()
		{
			if(isEmpty())
			{
				//System.out.println("Stack is empty");
			}
			else
			{
				Node3 temp=top;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.linkNext;
				}
			}
		}
}
