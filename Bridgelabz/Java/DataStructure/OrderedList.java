package com.Bridgelabz.DataStructure;
/******************************************************************************
 * Purpose: Implementation of ordered(sorted) list with its common operation
 *
 * @author sandhyarani
 * @version 1.0
 * @since 27-02-2019
 *
 ******************************************************************************/
public class OrderedList<T extends Comparable<T>> {
	UnorderedNode head;
	UnorderedNode tail;
	int size = 0;

	/**
	 * function to add a new item in the list and returns nothing
	 * 
	 * @param data the item which to be added
	 */
	@SuppressWarnings("unchecked")
	public void add(T data) {

		UnorderedNode n = head;
		UnorderedNode temp = new UnorderedNode(data);
		size++;
		if (head == null) {
			// System.out.println("1st");
			head = temp;
			head.next = tail;
			tail = head;
		} else if (data.compareTo((T) head.data) < 0) {
			// System.out.println("2nd");
			temp.next = head;
			head = temp;
		} else {
			if (data.compareTo((T) tail.data) > 0) {
				tail.next = temp;
				tail = temp;
				return;
			}
			UnorderedNode prev = null;
			while (data.compareTo((T) n.data) > 0 && n.next != null) {
				prev = n;
				n = n.next;
			}
			prev.next = temp;
			temp.next = n;
		}
	}

	/**
	 * Function to remove the item from the list
	 * 
	 * @param item
	 */
	public void remove(T item) {
		UnorderedNode n = head;
		UnorderedNode prev = null;
		if (head.data.equals(item)) {
			head = head.next;
			size -= 1;
			return;
		} else if (tail.data.equals(item)) {
			while (!n.next.data.equals(tail.data)) {
				n = n.next;
			}
			n.next = null;
			tail = n;
			return;
		} else {
			while (!n.data.equals(item)) {
				prev = n;
				n = n.next;
			}
			n = n.next;
			prev.next = n;
			n = null;
			size -= 1;
		}
	}

	/**
	 * function to search the item in the list
	 * 
	 * @param item the item to be searched
	 * @return true if found and false if not found
	 */
	public boolean search(T item) {
		UnorderedNode n = head;
		while (n != null) {
			if (n.data.equals(item)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	/**
	 * function to check if the list is empty or not
	 * 
	 * @return true if empty and false if not empty
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	/**
	 * Function to check the size of list and return it
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Function to return the index of the item assuming it is present
	 * 
	 * @param item the item to return the index of
	 * @return the index of the passed item
	 */
	public int index(T item) {
		int index = 0;
		UnorderedNode n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}

	/**
	 * function to remove the item from the last of list and return it
	 * 
	 * @return the last element of list after removing
	 */
	public T pop() {
		UnorderedNode n = head;
		UnorderedNode prev = null;
		while (n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = null;
		tail = prev;
		size -= 1;
		return (T) n.data;
	}

	/**
	 * Function to return the element at the given position
	 * 
	 * @param pos the index at which the item to return
	 * @return the element at the given index after removing it
	 */
	public T pop(int pos) {
		int index = 0;
		UnorderedNode prev = null;
		UnorderedNode n = head;
		if (pos == 0) {
			head = head.next;
			return (T) n.data;
		} else if (pos == size - 1) {
			return pop();
		} else {
			while (index != pos) {
				prev = n;
				n = n.next;
				index++;
			}
			prev.next = n.next;
			size -= 1;
			return (T) n.data;
		}
	}

	/**
	 * overriden method to give elents of list as string
	 */
	@Override
	public String toString() {

		StringBuffer s = new StringBuffer();
		s.append("[ ");
		UnorderedNode node = head;
		while (node != null) {
			s.append(node.data);
			node = node.next;
			s.append(",");
		}
		s.append(" ]");
		return s.toString();

	}

	/**
	 * method to show the items in the list
	 */
	public void show() {
		System.out.println(toString());
	}

}