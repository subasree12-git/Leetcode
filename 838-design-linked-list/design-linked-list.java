class Node
{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList 
{
    Node front;
    int size;
    public MyLinkedList() 
    {
        front = null;
        size = 0;
    }
     public int get(int index) 
     {
        if (index < 0 || index >= size) return -1;
        Node temp = front;
        for (int i = 0; i < index; i++) 
        {
            temp = temp.next;
        }
        return temp.data;
    }   
    public void addAtIndex(int index, int val) 
    {
       if (index <= 0) 
       {
            addAtHead(val);
            return;
        }
        if (index > size) return;
        Node temp = front;
        for (int i = 0; i < index - 1; i++) 
        {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++; 
    }
    public void deleteAtIndex(int index) 
    {
        if (index < 0 || index >= size || front == null) return;
        if (index == 0) 
        {
            front = front.next;
        } 
        else 
        {
            Node temp = front;
            for (int i = 0; i < index - 1; i++) 
            {
                temp = temp.next;
            }
            if (temp.next != null) 
            {
                temp.next = temp.next.next;
            }
        }
        size--;
    }
    public void addAtHead(int val) 
    {    
        Node node = new Node(val);
        node.next = front;
        front = node;
        size++;
    }
    void addAtTail(int data)
    {
        Node node = new Node(data);
        if(front == null)
            front = node;
        else
        {
            Node head = front;
            while (head.next != null) 
            {
                head = head.next;
            }
            head.next = node;
        }
        size++;
    }
}
