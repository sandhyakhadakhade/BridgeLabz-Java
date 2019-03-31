/**************************************************************************************
    * Purpose  : To deploy all the business logic
    * 
    * @description 
    * @file     : utilityDataStructure.js
    * @overview : All the business logic are coded here.
    * @author   : Bhavana Sai <bhavanab1506@gmail.com>
    * @version  : 1.0
    * @scince   : 30/01/2019
    * 
*****************************************************************************************/


/************************************LinkedListImplementation**************************************
 * 1.UnorderedLinkedList
 * 2.OrderedLinkedList
 ***************************************************************************************************/


var utility = require('../utility/utility');
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }
    addPos(arr, num) {
        console.log(num + "  in addpos");
        for (let i = 0; i < arr.length - 1; i++) {
            if (arr[0] >= num)
                return 0;
            else if (arr[i] < num && arr[i + 1] > num) {
                return i + 1;
            }
        }
        return arr.length;
    }
    insertAt(element, index) {
        if (index > 0 && index > this.size)
            return false;
        else {
            var node = new Node(element);
            var curr, prev;
            curr = this.head;
            if (index == 0) {
                node.next = head;
                this.head = node;
            } else {
                curr = this.head;
                var it = 0;
                while (it < index) {
                    it++;
                    prev = curr;
                    curr = curr.next;
                }
                node.next = curr;
                prev.next = node;
            }
            this.size++;
        }
    }
    add(data) {
        var node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }
        else {
            var temp = this.head;
            while (temp.next) {
                temp = temp.next;
            }
            temp.next = node;
        }
        this.size++;
    }
    contain(data1) {
        //var c = 0;
        // if (this.head == null)
        //     console.log("list is empty");
        // else {
            var temp = this.head;
            while (temp) {
                if (temp.data == data1) {
                    return true;
                }
                else
                    temp = temp.next;
            }
        //}
        return false;
    }
    insert(element) {
        var n = new Node(element);
        if (this.head == null) {
            this.head = n;
            this.size++;
            return;
        } else {
            n.next = this.head;
            this.head = n;
            this.size++;
            return;
        }
    }
    remove(data) {
        var temp = this.head;
        var t = null;
        while (temp != null) {
            if (temp.data == data) {
                if (t == null) {
                    this.head = temp.next;
                }
                else {
                    t.next = temp.next;
                }
                this.size--;
                return temp.data;
            }
            t = temp;
            temp = temp.next;
        }
        return -1;
    }
    print() {
        var st = "";
        var temp = this.head;
        while (temp) {
            st = st + " " + temp.data;
            temp = temp.next;
        }
        //console.log(st)
        return st;
    }
    getsize() {
        return this.size;
    }
    printele(){
        var temp=this.head
        while(temp){
            var str=""
            str=str+"name : "+temp.data.name+", share : "+temp.data.share+", price : "+temp.data.price
            console.log(str);
            temp=temp.next
        }
    }
      
printShares(){
    var arr = [];
    if (this.head == null) {
      return null;
    } else {
      var temp = this.head;
      while (temp) {
        arr.push(temp.data);
        temp = temp.next;
      }
      return arr;
    }
  }

  removeStock(element) {
    var temp = this.head;
    var prev = null;
    while (temp != null) {
      var stock = temp.data;
      if (stock.name == element) {
        if (prev == null) {
          this.head = temp.next;
        } else {
          prev.next = temp.next;
        }
        this.size--;
        return temp.data;
      }
      prev = temp;
      temp = temp.next;
    }
    return -1;
  }


}

/***********************************StackImplementation*******************************************
 * 3.BalancedParentheses
 *************************************************************************************************/

class Stack {
    constructor() {
        this.item = [];
        this.capacity;
        this.top = -1;
        this.size = 0;
    }
    size() {
        return this.size;
    }
    isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }
    push(data) {
        if (this.top == this.capacity - 1) {
            console.log("Stack overflow");
            return;
        }
        this.size++;
        this.item[++this.top] = data;
    }
    pop() {
        if (this.top == this.capacity - 1)
            console.log("Stack is empty");
        this.size--;
        return this.item.pop();
    }
    peek() {
        if (this.top == -1)
            console.log("Stack is empty");
        else
            return this.item[top];
    }
    print() {
        var str = "";
        for (let i = 0; i < this.size; i++) {
            str = str + " " + item[i];
           }
        return str;
    }

}

/***************************************QueueImplementation******************************************
 * 4.BankingCashCounter
 ****************************************************************************************************/

class Queue {
    constructor() {
        this.items = [];
    }

    enQueue(data) {
        // adding element to the queue 
        this.items.push(data)
    }
    deQueue() {
        if (this.isEmpty())
            return " ";
        return this.items.shift();
    }
    isEmpty() {
        // return true if the queue is empty. 
        return this.items.length == 0;
    }
    printList() {
        var str = "";
        for (var i = 0; i < this.items.length; i++)
            str += this.items[i] + " ";
        return str;
    }
}


/******************************************DeQueueImplementation************************************
 *5.PalindromeChecker 
 ***************************************************************************************************/

class Dequeue {
    constructor() {
        this.front = -1;
        this.rear = 0;
        this.size = 30;
        this.arr = new Array(30);
    }
    isFull() {
        if (this.front == 0 && this.rear == this.size - 1 || (this.rear + 1 == this.front)) {
            return true;
        }
        return false;
    }
    isEmpty() {
        return this.front == -1;
    }
    addFront(item) {
        if (this.isFull()) {
            console.log("Queue overflow");
            return;
        }
        if (this.front == -1) {
            this.front = 0;
            this.rear = 0;
        }
        else if (this.front == 0) {
            this.front = this.arr.length - 1;
        }
        else {
            this.front--;
        }
        this.arr[this.front] = item;
    }
    addRear(item) {
        if (this.isFull()) {
            console.log("Queue overflow");
            return;

        }
        if (this.front == -1) {
            this.front = 0;
            this.rear = 0;
        }
        else if (this.front == this.arr.length - 1) {
            this.rear = 0;
        }
        else {
            this.rear++;
        }
        this.arr[this.rear] = item;
    }
    removeFront() {
        if (this.isEmpty()) {
            console.log("Queue underflow");
            return;

        }
        var item;
        if (this.front == this.rear) {
            item = this.arr[this.front];
            this.front = -1;
            this.rear = -1;
        }
        else if (this.front == this.arr.length - 1) {
            item = this.arr[this.front];
            this.front--;
        }
        else {
            item = this.arr[this.front];
            this.front++;
        }
        return item;
    }
    removeRear() {
        if (this.isEmpty()) {
            console.log("Queue underflow");
            return;

        }
        var item;
        if (this.arear == this.front) {
            item = this.arr[this.rear];
            this.rear = -1;
            this.front = -1;
        }
        else if (this.rear == 0) {
            item = this.arr[this.rear];
            this.rear = this.rear--;
        }
        return item;
    }
    getFront() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.arr[this.front];
    }
    getRear() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.arr[this.rear];
    }
    palindromeChecker(str) {
        for (let i = 0; i < str.length; i++) {
            this.addRear(str.charAt(i));
        }
        while (this.front != this.rear && this.front < this.rear) {
            if (this.getFront() != this.getRear()) {
                return false;
            }
            this.front++;
            this.rear--;
        }
        return true;
    }
}

/***************************************************************************************************
*@purpose : to add the elements into queue and get first inserted element inthe first
*@param   : user input data
******************************************************************************************************/
class QueueLinkedList {
    constructor() {
        this.top = null;
        this.size = 0;
        this.front = null;
    }

    push(data) {

        if (this.isEmpty()) {

            var node = new Node(data)
            this.top = node;
            this.front = node;
            this.size++;
            return;
        }
        var node = new Node(data);
        this.top.next = node;
        this.top = node;
        this.size++;
    }
    pop() {
        if (this.isEmpty()) {
            console.log('no elemets found')
            return;
        }
        var dat = this.front.data
        this.front = this.front.next;
        return dat;
    }
    peek() {
        return this.top.data
    }
    print() {
        var t = this.front;
        while (t != null) {
            console.log(t.data);
            t = t.next;
        }
    }
    getData() {
        var temp = this.front;
        var str = "";
        while (temp) {
            str = str + temp.data;
            if (temp.next != null) {
                str = str + " ";
            }
            temp = temp.next;
        }
        
        return str;
    }

    isEmpty() {
        if (this.size === 0) {
            return true;
        }
        else
            return false
    }
    getSize() {
        return this.size;
    }
}

/*************************************StackLinkedList*********************************************/

class StackLinkedList {

    constructor() {
        this.size = 0
        this.head = null;
    }
    size() {

        return this.size
    }
    isEmpty() {
        /**
         * Condition to check the size is zero.
         */
        return top == null;
    }
    push(data) {
        var n = new Node(data)
        if (this.head == null) {
            this.head = n
            this.size++
        }
        else {
            var temp = this.head
            while (temp.next) {
                temp = temp.next
            }
            temp.next = n
            this.size++
        }
    }
    pop() {
        if (this.head == null) {
            console.log("Stack underflow");
            return null;
        }
        var curr = this.head;
        var pre = this.head;
        if (curr.next == null) {
            this.head = null;
            return curr.data;
        }
        while (curr.next) {
            pre = curr;
            curr = curr.next;
        }
        var data = curr.data
        pre.next = null;
        this.size--;
        return data;
    }
    peek() {
        // check for empty stack 
        if (!isEmpty()) {
            return high.data;
        }
        else {
            console.log("Stack empty");
            return -1;
        }
    }
    print() {
        var st = ""
        var temp = this.head
        while (temp) {
            //console.log(temp.data)
            st = st + " " + temp.data
            temp = temp.next
        }
        return st;
    }
    // printShares(){
    //     var arr = [];
    //     if (this.head == null) {
    //       return null;
    //     } else {
    //       var temp = this.head;
    //       while (temp) {
    //         arr.push(temp.data);
    //         temp = temp.next;
    //       }
    //       return arr;
    //     }
    // }
        printShares() {
            var arr = [];
            if (this.head == null) {
              return null;
            } else {
              var temp = this.head;
              while (temp) {
                arr.push(temp.data);
                temp = temp.next;
              }
              return arr;
            }
      }
    //   removeStock(element) {
    //     var temp = this.head;
    //     var prev = null;
    //     while (temp != null) {
    //       var stock = temp.data;
    //       if (stock.name == element) {
    //         if (prev == null) {
    //           this.head = temp.next;
    //         } else {
    //           prev.next = temp.next;
    //         }
    //         this.size--;
    //         return temp.data;
    //       }
    //       prev = temp;
    //       temp = temp.next;
    //     }
    //     return -1;
    //   }
    
    
}
/*************************************LinledListQueue****************************************** */
class LinledListQueue {
    constructor() {
      this.tail = null;
      this.head = null;
    }
    enQueue(item) {
      let node = new Node(item);
      if (!this.head) {
        this.head = node;
        this.tail = node;
      } else {
        this.tail.next = node;
        this.tail = node;
      }
    }
    deQueue() {
      if (!this.head) {
        return "No item";
      } else {
        let itemToPop = this.head;
        this.head = this.head.next;
        return itemToPop.data;
      }
    }
    isEmpty() {
      return this.size() < 1;
    }
    size() {
      let current = this.head;
      let counter = 0;
      while (current) {
        counter++;
        current = current.next;
      }
      return counter;
    }
    printList() {
        var st = ""
        var temp = this.head
        while (temp) {
            //console.log(temp.data)
            st = st + " " + temp.data
            temp = temp.next
        }
        return st;
    }
    printShares() {
        var arr = [];
        if (this.head == null) {
          return null;
        } else {
          var temp = this.head;
          while (temp) {
            arr.push(temp.data);
            temp = temp.next;
          }
          return arr;
        }
    }
        removeStock(element) {
                var temp = this.head;
                var prev = null;
                while (temp != null) {
                  var stock = temp.data;
                  if (stock.name == element) {
                    if (prev == null) {
                      this.head = temp.next;
                    } else {
                      prev.next = temp.next;
                    }
                    this.size--;
                    return temp.data;
                  }
                  prev = temp;
                  temp = temp.next;
                }
                return -1;
              }
            
            
  
}
module.exports = {
    LinkedList, Node, Stack, Queue, Dequeue, LinledListQueue,StackLinkedList,


    /*******************************************BinaryTree************************************************
     * 7.getBinaryTree
     * ************************************
     * @purpose     : To find the number of binary search tree.
     * @function    : To accept the number from the user and find the binary tree by using the formula
     *                factorial=(2n)!/(n+1)n!.
     * @param       : It accepts the number from the user and print the result in factorial. 
     *****************************************************************************************************/


    getBinaryTree(num) {
        var fact = 1;
        for (let i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    },

    /************************************PrimeNumber*********************************************
    * @pupose   :   To find the Prime numbers in the given range.
    * @function :   It stores the prime numbers in a 2D Array, the first dimension represents the
    *               range 0-100, 100-200, and so on. While the second dimension represents the prime
    *               numbers in that range.
     
     ***********************************************************************************************/

    isPrime(i, j) {
        var flag = 0;
        k = 0;
        var prime = [];

        for (var index1 = i; index1 <= j; index1++) {
            for (var index2 = 2; index2 < index1; index2++) {
                if (index1 % index2 == 0) {
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                prime[k++] = index1;
            }
        }
        return prime;
    },

    /****************************dArray********************************************************** 
    * @purpose      : Prime Numbers that are Anagram in the Range of 0 - 1000 .
    * @overview     : Prime Numbers that are Anagram in the Range of 0 - 1000 store in a 2D Array
                      the numbers that are Anagram and numbers that are not Anagram.
    **********************************************************************************************/ 
    dArray() {
        var arr = [];
        var arr2 = [];
        var array = [["0-100 "], ["100-200 "], ["200-300 "], ["300-400 "], ["400-500 "], ["500-600 "], ["600-700 "], ["700-800 "], ["800-900 "], ["900-1000 "]];
        for (let i = 2; i < 1000; i++) {
            if (utility.isPrime(i)) {
                arr.push(i);

            }
        }
        var range = 100, k = 0;
        for (let i = 0; i < arr.length; i++) {
            for (let j = i + 1; j < arr.length; j++) {
                if (utility.isAnagram(arr[i], arr[j])) {
                    if (arr[i] <= range) {
                        if (arr[j] <= range) {
                            array[k].push(arr[i]);

                            arr2.push(arr[i])
                            arr2.push(arr[j])
                            array[k].push(arr[j]);
                        }
                    } else {
                        range = range + 100;
                        k++;
                        if (arr[j] <= range) {
                            array[k].push(arr[i]);
                            array[k].push(arr[j]);
                        }
                    }
                }
            }
        }
        console.log("The Number which are prime and anagram ");
        var req=require('util')
        for (let i = 0; i < array.length; i++) {

            for (let j = 0; j < array[i].length; j++) {
                req.print(array[i][j]);
                if (j == 0) {
                    req.print(" => ");
                } else {
                    if (j != array[i].length - 1)
                        req.print(",")
                }
            }
            console.log();
        }
        return arr2
    },

}




