/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing;

/**
 *
 * @author tiegancozzie
 */
public class Node<Key,Value> {
    Key key;
    Value value;
    private Node next;
    private Node prev;
    
    // initializing variables
    Node(Key key,Value value){
        next = null;
        prev = null;
        this.key=key;
        this.value=value;
    }
    
    // setting next
    public void setNext(Node n){
            next = n;
    }
    // getting next
    public Node getNext(){
        return next;
    }
    // setting previous
    public void setPrev(Node p)
    {
        prev = p;
    }
    //gettting previous
    public Node getPrev(){
        return prev;
    }
    // getting data
    public Value getData()
    {
        return value;
    }
    // getting key
    public Key get(){
        return key;
    }
    
    @Override
    public String toString()
    {
        return "The data is " + value;
    }
    
}
