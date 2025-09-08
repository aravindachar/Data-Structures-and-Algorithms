package TREES;

import java.util.Scanner;

public class BT {
    private static class Node{
        int value ;
        Node right ;
        Node left ;
        public Node(int value ){
            this.value = value ;
        }

    }
    private Node root ;

    public void populate(Scanner sc ){
        System.out.println("enter the root Node value");
        int value = sc.nextInt();
        Node node = new Node(value);
        this.root = node ;
        populate(sc , node);
    }
    public void populate(Scanner sc , Node node){
        System.out.println("Do you want to enter the Left Node :" +node.value);
        boolean hasleft = sc.nextBoolean();
        if(hasleft){
            System.out.println("Enter the left Node for the elements :" + node.value);
            int newvalue = sc.nextInt();
            Node newLeftNode = new Node(newvalue);
            node.left = newLeftNode ;
            populate(sc, newLeftNode);
        }
        System.out.println("Do you want to enter the Right Node :" +node.value);
        boolean hasRight = sc.nextBoolean();
        if(hasRight){
            System.out.println("Enter the Right Node for the elements :" + node.value);
            int newvalue = sc.nextInt();
            Node newRightNode = new Node(newvalue);
            node.left = newRightNode ;
            populate(sc, newRightNode);
        }
    }
    public void dispaly(){
        System.out.println("\n--- Tree Structure ---");
        // Start the recursive display process from the root with no initial indentation.
        display(this.root, "@@@");
        System.out.println("----------------------");
    }
    private void display(Node node , String indent){
        if(node == null ){
            return ;
        }
         System.out.println(indent + "└── " + node.value);

        // 2. Recursively call for the children, adding more indentation for the next level
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

}
// first we crerate the class called Node and constucter for it with tales int vale
//  class Node as the int value , Node rihgt and Node left
// then a populate function which is public with take inout and make it as root 
//  insdie the funcutiopn there is a node take left and right depends on the user input and 
// pints the node to the riht or ledt 
// then a priavate dispaly finction which  node and stinf indentation which is nothinf bout gapt and \t that indicates tab 
//  the a private node root ;