
/**
 * Print the LinkedList
 */
public class PrintList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    Node head;
    //insert node at end
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // add on a special index
    public void insert(int data, int index){
        Node newNode = new Node(data);

        if(index == 0){
            newNode.next = head;
            head = newNode;
            // return;
        }else{
        
            Node temp = head;
            for(int i = 0; i<index-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            // return;
        }
        // return head;
    }
    //print list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[]args){
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);
        // Node n4 = new Node(40);
        // Node n5 = new Node(50);
        // Node n6 = new Node(60);
        // Node n7 = new Node(70);
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n5;
        // n5.next = n6;
        // n6.next = n7;
        PrintList list = new PrintList();

        //perform insert operation
        list.insert(10);
        list.insert(20);
        list.insert(30);

        //i want to add 35 on 3 index
        list.insert(35, 3);

        list.insert(40);
        list.insert(50);

        

        //    display(n1);
        list.display();

    }
}