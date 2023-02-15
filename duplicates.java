import java.io.*;
class Node {
    Node next;
    int data;
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
public class duplicates {
    public Node head = null;
    public Node tail = null;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else 
         {
            tail.next = newNode;
            tail = newNode;
        }
    }
 
    public void removeDuplicates()
    {
        Node current = head, index = null, temp = null;
        if (head == null) 
        {
            return;
        }
        else 
        {
            while (current != null) 
             {
                temp = current;
                index = current.next;
                while (index != null) 
                {
                  if (current.data == index.data) 
                   {
                       temp.next = index.next;
                   }
                    else 
                    {
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public void print()
    {
        Node current = head;
        if (head == null) {
            System.out.println("Empty list please insert some elements first");
            return;
        }
        while (current != null) 
         {
           System.out.print(current.data + " ");
           current = current.next;
        }
        System.out.println();
    }
 
    public static void main(String[] args)
    {
      duplicates List = new duplicates();
        List.add(9);
        List.add(1);
        List.add(1);
        List.add(3);
        List.add(4);
        List.add(8);
        List.add(2);
        List.add(1);
        List.print();
        List.removeDuplicates();
        List.print();
    }
}
