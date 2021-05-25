
package Slinkedlist;

public class Node {
    
    protected int data ;
    protected Node link ;
    
    public Node(){
        link = null;
        data = 0;
    }
    public Node(int d, Node e){
        data = d;
        link = e;
    }
    public void SetLink(Node e){
        link = e;
    }
    public void SetData(int d){
        data = d;
    }
    public Node GetLink(){
        return link ;
    }
    public int GetData(){
        return data;
    }
}
