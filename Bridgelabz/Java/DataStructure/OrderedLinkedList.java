package com.Bridgelabz.DataStructure;
/**
 * @problem statement -Helper class for common operation of other class 
 * @author sandhyarani khadakhade
 * @date  1/03/2019
 * @version 1.0
 */
public class OrderedLinkedList<T extends Comparable<T>>{

	MyNode<T> head;	//starting node
	MyNode<T> current;	//last node
	int position;	//position of last node

	
	public OrderedLinkedList(){
		head = null;
		current = null;
		position = -1;
	}

	/**
	 * function to add and sort data into list
	 * @param data
	 */
	public void add(T data) 
	{
		
		MyNode<T> newNode = new MyNode<T>(data);
		if(head == null) {
			head = newNode;
			current = head;
		}
		else if(head.data.compareTo(data) > 0) 
		{
			newNode.next = head;
			head = newNode;
		}
		else if(current.data.compareTo(data) < 0) {
			current.next = newNode;
			current = newNode;
		}
		else {
			MyNode<T> tempPrev = head;
			MyNode<T> tempCurrent = head.next;
			
			while((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				
			}
			tempPrev.next = newNode;
			newNode.next = tempCurrent;
		}
		position++;
	}
	
	/**
	 * function to remove data from list
	 * @param data
	 */
	public void remove(T data){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		while(!tempCurrent.data.equals(data)){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if(tempCurrent == head){
			head = head.next;
		}
		else{
			tempPrev.next = tempCurrent.next;
		}
		if(tempCurrent == current){
			current = tempPrev;
		}
		position--;
	}
	
	/** 
	 * function to search data into list 
	 * @param data
	 * @return 
	 */
	public boolean search(T data){
		return index(data) == -1 ? false : true; 
	}
	
	public boolean isEmpty(){
		return position == -1 ? true : false;
	}
	
	
	
	public int size(){
		return position + 1;
	}
	
	
	
	public void append(T data){
		add(data);
	}
	
	
	/**
	 * function to return given data index
	 * @param data
	 * @return
	 */
	public int index(T data){
		if(position == -1){
			return -1;
		}
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(!tempCurrent.data.equals(data)){
			if(tempCurrent == current) {
				return -1;
			}
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		return tempPosition;
	}

	
	/**
	 * function to insert data into given index
	 * @param pos /index
	 * @param data 
	 */
	public void insert(int pos , T data){

		if((pos == position+1) || (position == -1)){
			add(data);
		}
		else if(pos == 0){
			MyNode<T> tempNode = head;
			head = new MyNode<T>(data);
			head.next = tempNode;
		}
		else{
			MyNode<T> tempCurrent = head;
			MyNode<T> tempPrev = null;
			int tempPosition = 0;
			while(tempPosition <= pos + 1){
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPosition++;
			}
			MyNode<T> newNode = new MyNode<T>(data);
			newNode.next = tempCurrent;
			tempPrev.next = newNode;
		}
		position++;
	}
	
	/**
	 * function to remove data into the given index on list
	 * @param location
	 * @return
	 */
	public T pop(int location){
		MyNode<T> tempCurrent = head;
		MyNode<T> tempPrev = null;
		int tempPosition = 0;
		position--;
		while(tempPosition != location){
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		if(tempCurrent == head){
			head = head.next;
			return tempCurrent.data;
		}
		else if(tempCurrent == current){
			current = tempPrev;
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
		else{
			tempPrev.next = tempCurrent.next;
			return tempCurrent.data;
		}
	}
	/**
	 * function to remove the element and return top of the element
	 * @return T
	 */
	public T pop(){
		return pop(position);
	}
	/**
	 * function to retrieve the element of given index
	 * @param location
	 * @return T
	 */
	public T get(int location) {
		MyNode<T> tempCurrent = head;
		int tempPosition = 0;
		
		while(tempPosition != location){
			tempCurrent = tempCurrent.next;
			tempPosition++;
		}
		
		return tempCurrent.data;
		
	}
	
	public void list(){
		MyNode<T> tempCurrent = head;
		while(tempCurrent != null){
			System.out.print(tempCurrent.data+",");
			tempCurrent = tempCurrent.next;
		}
		
}
}
