package BinarySearchTree;

public class Node{
    int value;
    Node leftchildnode;
    Node rightchildnode;

    public Node(int value){
        this.value=value;
       this.leftchildnode=null;
        this.rightchildnode=null;
    }
    public void display() {
        System.out.print(this.value + "\t");
    }

    public String toString() {
        return String.valueOf(value);
    }
}
