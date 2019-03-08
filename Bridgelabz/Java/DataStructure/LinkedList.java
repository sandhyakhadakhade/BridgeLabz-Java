package com.Bridgelabz.DataStructure;
/**
 * @purpose -helper class for common list related operation 
 * @author sandhyarani
 * @version 1.0
 * @date 1/03/2019
 */
public class LinkedList<T> {
	Node<T> head;
	public void add(Object obj) {
		Node<T> newNode = new Node<T>();
		newNode.obj = obj;
		newNode.nextNode = null;
		
		if(head==null) head = newNode;
		else {
			Node<T> tempNode = head;
			while(tempNode.nextNode!=null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = newNode;
		}
	}
	
	public void remove(Object obj) {
		Node tempNode = head;
		Node previousNode = tempNode;
		 do{
			 if(obj.equals(head.obj)) {
				 head = tempNode.nextNode;
			 }
			 else if(!tempNode.obj.equals(obj)) {
				previousNode = tempNode;
				tempNode = tempNode.nextNode;
			}else {
				previousNode.nextNode = tempNode.nextNode;
				break;
			}
		}while(tempNode!=null);
	}	

	public boolean search(Object obj) {
		Node<T> tempNode = head;
		while(tempNode!=null){
				if(tempNode.obj.equals(obj)) return true;
				tempNode = tempNode.nextNode;
			}
		 return false;
	}

	public Object pollFirst() {
		Object obj = head.obj;
		head = head.nextNode;
		return obj;
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}

	public int size() {
		Node<T> tempNode = head;
		int count = 0;
		
		if(tempNode!=null) {
			while(tempNode!=null){
				count++;
				tempNode = tempNode.nextNode;
			}
		}else return 0;
		return count;
	}

	public void display() {
		Node<T> tempNode = head;
		while(tempNode!=null){
			System.out.print(tempNode.obj.toString()+" ");
			tempNode = tempNode.nextNode;
		}
	}
	
	private void addAfter(Node<T> previousNode,Node<T> newNode) {
		newNode.nextNode=previousNode.nextNode;
		previousNode.nextNode=newNode;
	}
	
	public void sort(Object obj) {
		Node<T> newNode = new Node<>();
		newNode.obj = obj;
		newNode.nextNode = null;
		if(head==null) {
			head = newNode;
		}else {
			Node tempNode = head;
			Node previousNode=head;
			if(Math.abs(head.obj.hashCode())>Math.abs(obj.hashCode())) {
				newNode.nextNode = tempNode;
				head = newNode;
			}else {
				while(true) {
					if(Math.abs(tempNode.obj.hashCode())>Math.abs(obj.hashCode())) {
						addAfter(previousNode, newNode);
						break;
					}
					else if(tempNode.nextNode==null && Math.abs(tempNode.obj.hashCode())<Math.abs(obj.hashCode())) {
						tempNode.nextNode=newNode;
						break;
					}
					if(tempNode.nextNode==null) {
						break;
					}
					previousNode = tempNode;
					tempNode = tempNode.nextNode;
				}
			}
		}
	}

	public Object getLast() {
		Node<T> tempNode = head;
		while(tempNode.nextNode!=null) {
			tempNode = tempNode.nextNode;
		}
		return tempNode.obj;
	}
	
	public void removeLast() {
		Node<T> tempNode = head;
		Node<T> previousNode = tempNode;
		if(tempNode.nextNode==null) {
			head=null;
			return;
		}
		while(tempNode.nextNode!=null) {
			previousNode = tempNode;
			tempNode = tempNode.nextNode;
		}
		previousNode.nextNode=null;
	}
	
/*
	public void modifyAmount(String name,double amount) {
		Node tempNode = head;
		Customer cust =(Customer) tempNode.obj;
		while(!cust.getName().equals(name)) {
			tempNode = tempNode.nextNode;
			cust =(Customer) tempNode.obj;
			if(tempNode==null) {
				System.out.println("User not available.");
			}
		}
		Customer ob =(Customer) tempNode.obj;
		ob.setAmount(amount);;
	}

	public void getUsersData() {
		Restore res = new Restore();
		String data[] = res.readFromFile().split(" ");
		for(int i=0; i<data.length-1; i+=2) {
			Customer cust = new Customer();
			cust.setName(data[i]);
			cust.setAmount(Double.parseDouble(data[i+1]));
			add(cust);
		}
	}
	
	public Object getAmount(Customer cust) {
		Node tempNode = head;
		while(tempNode!=null){
			Customer ob =(Customer) tempNode.obj;
				if(ob.getName().equals(cust.getName())) return tempNode.obj;
				tempNode = tempNode.nextNode;
			}
		 return null;
	}
	
	public boolean search(Customer cust) {
		Node tempNode = head;
		while(tempNode!=null){
			Customer ob =(Customer) tempNode.obj;
				if(ob.getName().equals(cust.getName())) return true;
				tempNode = tempNode.nextNode;
			}
		 return false;
	}*/

}
