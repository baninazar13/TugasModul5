
package Slinkedlist;

public class SinglyLinkedListApp {
    
    public static void main(String[] ar)
    {
        SinglyLinkedList lk = new SinglyLinkedList ();

        lk.insertAwal(100); 
        lk.display();
        lk.insertAkhir(200);
        lk.display();
        lk.insertAtPos(50,1);
        lk.display();
        lk.insertAtPos(80,2);
        lk.display();
        lk.deleteAtPos(1);
        lk.display();
    }
}
