// Jinsik Kim
// CS 5040
// Assignment 5
// Queue

/*
This class define a queue that stores integer values.
*/

public class Queue_Jinsik_Kim
{
   private Node front, tail;
   private int size;
  
   //constructor to create a queue object with front, tail, and size. 
   public Queue_Jinsik_Kim()
   {
      front = null; 
      tail = null; 
      size = 0;
   }
  
   //method to add node to queue
   public void enqueue(int data) 
   {
      Node newNode = new Node(data); //create Node newNode before insertion into tail of queue
      if (front == null) 
         front = tail = newNode; //empty queue
      else 
      {
         tail.next = newNode; //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
      size++; //increase list size by one
   }
      
   //method remove last node from top of queue, and return data of node that was dequeue'd
   public int dequeue()
   {
      assert size > 0: "Error: empty queue cannot be dequeue'd";
      int deq_data = 0; //data of dequeue'd node
      if(size == 1)//if queue has only one node
      {
         deq_data = front.getData(); //stored data of node that will be dequeued aka front
         front = tail = null;//reference front and tail = null, removes one node from queue that has only one node
         size--;//decrease list size by one
      }
      else if(size > 1)//if queue size > 1
      {
         deq_data = front.getData(); //stored data of node that will be dequeued aka front
         Node current = front; //temp node current set to front
         front = front.next; //front pointer moved to next node
         current.next = null; //remove link from previously front node from queue
         size--; //decrease size by 1
      }
      return deq_data; //return data of node that was dequeue'd
   }
   
   //method to retrieve data of front node of queue
   public int front()
   {
      assert size > 0: "Error: empty queue cannot have a front node";
      return front.getData();
   }
   
   //method to retrieve size of queue
   public int size()
   {
      return size;
   }
   
   //method to identify if queue is empty
   public boolean isEmpty()
   {
      if(size == 0)
         return true;
      else
         return false;
   }


/////previous code
   //method to print out the queue
   public void printQueue() 
   {
      Node temp;
      temp = front;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
      public int getData()
      {
         return data;
      }
   }
}

