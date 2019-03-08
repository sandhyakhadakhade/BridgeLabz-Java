package com.Bridgelabz.DataStructure;

class NodeQueue {
	protected int data;
	protected NodeQueue link;

	/* Constructor */
	public NodeQueue() {
		link = null;
		data = 0;
	}

	/* Parameterized Constructor */
	public NodeQueue(int d, NodeQueue n) {
		data = d;
		link = n;
	}

	/* Function to set data to current Node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get link to next node */
	public NodeQueue getLink() {
		return link;
	}

	/* Function to set link to next Node */
	public void setLink(NodeQueue n) {
		link = n;
	}

	/* Function to get data from current Node */
	public int getData() {
		return data;
	}
}
