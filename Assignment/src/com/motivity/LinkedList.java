package com.motivity;

class LinkedList
{
    Linked head;  
    class Linked
    {
        int data;
        Linked next;
        Linked(int d) 
      {
        data = d;
        next = null; 
        }
    }
    void removeDuplicates()
    {
    	Linked curr = head;
 
      
        while (curr != null) {
        	Linked temp = curr;
           
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
    public void push(int values)
    {
    	Linked ob1 = new Linked(values);
        ob1.next = head;      
        head = ob1;
    }  
     void printList()
     {
    	 Linked temp = head;
         while (temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         } 
         System.out.println();
     }
    public static void main(String args[])
    {
        LinkedList ob = new LinkedList();
        ob.push(1);
        ob.push(1);
        ob.push(2);
                 
        System.out.println("display before removing duplicate values");
        ob.printList();
         
        ob.removeDuplicates();
         
        System.out.println("display after removing duplicate values");
        ob.printList();
    }
}