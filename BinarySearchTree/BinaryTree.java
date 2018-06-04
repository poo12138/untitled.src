package BinarySearchTree;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root = null;

    BinaryTree(int value) {
        root = new Node(value);
        root.leftchildnode = null;
        root.rightchildnode = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            root.leftchildnode = null;
            root.rightchildnode = null;
        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                if (value < current.value) {
                    parent = current;
                    current = current.leftchildnode;
                    if (current == null) {
                        parent.leftchildnode = node;
                        break;
                    }
                }
                    if (value > current.value) {
                        parent = current;
                        current = current.rightchildnode;
                        if (current == null) {
                            parent.rightchildnode = node;
                            break;
                        }
                    } else {
                        String error = "having same value in binary tree";
                    }

                }
            }

    }  //插入

    public Node findKey(int value) {
        Node corrent = root;
        while (true) {
            if (value == corrent.value) {
                return corrent;
            } else if (value < corrent.value) {
                corrent = corrent.leftchildnode;
            } else if (value > corrent.value) {
                corrent = corrent.rightchildnode;
            }
            if (corrent == null) {
                return null;
            }
        }

    }   //查找

    public List<Integer> findKey(Node root,int low, int high) {
        Node corrent = root;
        Node right = null;
        List<Integer> list = new ArrayList<Integer>();
//            if (high<corrent.value){
//                corrent = corrent.leftchildnode;
//
//            }
//            if (low>right.value){
//                right = right.leftchildnode;
//            }
        if(corrent==null){return null;}

//            if (low <= corrent.value && corrent.value <= high) {
//                list.add(corrent.value);
//            }
        if (low <= corrent.value && corrent.value <= high) {
            list.add(corrent.value);
        }
            right=corrent.rightchildnode;
            findKey(right,low,high);
            corrent = corrent.leftchildnode;
            findKey(corrent,low,high);

//        if (low <= corrent.value && corrent.value <= high) {
//            corrent = corrent.rightchildnode;
//            //list.add(corrent.value);
//            findKey(corrent,low,high);
//        }
//            if (low <= right.value && right.value <= high) {
//                list.add(right.value);
//                right = right.rightchildnode;
//                findKey(right,low,high);
//            }

        Collections.sort(list);
        for(int i:list){
            System.out.println(i);
        }
        return list;
    }
    public void inOrderTraverse() {
        inOrderTraverse(root);
    }

    public void inOrderTraverse(Node node) {
        if(node==null)
            return ;

            node.display();
            inOrderTraverse(node.leftchildnode);
            inOrderTraverse(node.rightchildnode);

    }
    public List<Integer> inOrderTraverse(Node node,int k1,int k2) {

        if(node==null)
            return null;

        inOrderTraverse(node.leftchildnode,k1,k2);

        List<Integer> list = new ArrayList<Integer>();
        if(k1 <= node.value && node.value <= k2){

           // node.display();
            list.add(node.value);
        }
        inOrderTraverse(node.rightchildnode,k1,k2);

        for(int i:list){
            System.out.println(i);
        }

        return list;
    }
    //中序遍历递归操作


    public void inOrderByStack() {
    }     //中序遍历非递归操作

    public void preOrderTraverse() {
    }  //前序遍历

    public void preOrderByStack() {
    }   //前序遍历非递归操作

    public void postOrderTraverse() {
    } //后序遍历

    public void postOrderByStack() {
    }  //后序遍历非递归操作
//    public int getMinValue() {} //得到最小(大)值
//    public boolean delete(int value) {} //删除

    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree(52);
//        bt.insert(580);
//        bt.insert(12);
//        bt.insert(50);
//        bt.insert(58);
//        bt.insert(9);
//        bt.insert(888);
//        bt.insert(248);
//        bt.insert(32);
//        bt.insert(666);
//        bt.insert(455);
//        bt.insert(777);
//        bt.insert(999);
        BinaryTree bt = new BinaryTree(2);
        bt.insert(1);
        // System.out.println(bt.findKey(32));
       // bt.findKey(bt.root,50,777);
      // bt.inOrderTraverse();
       bt.inOrderTraverse(bt.root,0,10);
    }
}