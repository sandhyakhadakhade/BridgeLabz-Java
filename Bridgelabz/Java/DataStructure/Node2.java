package com.Bridgelabz.DataStructure;

public class Node2 {
	Node2 linknext;
	Object data;
	public Node2()
	{
		linknext=null;
		data=null;
	}
	public Node2(Object data) 
	{
		this.data=data;
		this.linknext=null;
	}
	public Node2 getLinknext() {
		return linknext;
	}
	public void setLinknext(Node2 linknext) {
		this.linknext = linknext;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
}
}
