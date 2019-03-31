/*
 *@purpose : To get user input value 
 *@description : we can call this method whenever we want take input from user
 and can return the string by replacing username.
 */

/**
 * To create a new node which contains datas and holds the next data in it.
 */
class Node {
    constructor(data) {
        this.data = data;
        /**
        * next holds next data, here as the node created is new it points to null.
        */
        this.next = null;
    }
}
/*
 *@purpose : to add the elements into stack and get last inserted element inthe first
 *@param : user input data
 */
//stack implementation
class Stack {
    constructor() {
        this.top = null;
        this.size = 0;
    }

    push(data) {// it will add the data into stack 
        if (this.isEmpty()) {//if the stack is empty the data will add as first node into the stack
            var node = new Node(data);
            this.top = node;//adding first data into stack
            this.size++;
            return;
        }
        else {
            var node = new Node(data);
            node.next = this.top;
            this.top = node
            this.size++
        }
    }
    pop() {//return datas which are in the stack
        if (this.isEmpty()) {
            return 'no datas'
        }

        var dat = this.top.data;
        this.top = this.top.next;
        this.size--;
        //console.log("popped value "+data);
        return dat;

    }
    peek() {
        return this.top.data//return the top value i.e added in the last
    }
    print() {//printing the values
        var t = this.top;
        while (t != null) {
            console.log(t.data);
            t = t.next;
        }
    }
    isEmpty() {//checking wether the stack contain any data if it is not return true
        if (this.size === 0) {
            return true;
        }
        else
            return false
    }
    getSize() {
        return this.size;//it will return the size of the stack
    }
}
module.exports = {
    Stack
}



