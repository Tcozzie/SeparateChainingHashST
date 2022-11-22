/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing;

/**
 *
 * @author tiegancozzie
 */
public class LinkedList<Key,Value> {
      private Node first;
      private Node last;
      private int size=0;
      
      LinkedList(){}
      
      // adding Node into the array
      public void add(Key key,Value value){
          Node temp=new Node(key,value); // setting temp node to the one being inserted
          size++; // increasing the size by one
          if(first==null){ // if first is null
              temp.setNext(temp); // setting next to new Node
              temp.setPrev(temp); // setting previous to new node
              last=temp; // setting last to new node
          }else{
              temp.setNext(first); // makes first the second in the LL
              temp.setPrev(last);  // making the previous to new node last
              first.setPrev(temp); // setting old previous to new node
              last.setNext(temp); // setting lasts next to new node
          }
          first=temp; // first is now new node
      }
      
     // returns the value of a node
      public Value get(Key key){
          Node temp=first; // temp node
          while(temp!=last){ // going through the whole list
              if(temp.key==key){ // if temp ever equals the sent in key
                  return (Value) temp.getData(); // return value
              }else{
                  temp=temp.getNext(); // go to the next one
              }
              if(last.key==key){ // if the last node equals the sent in key
                  return (Value) last.getData(); // return value
              }
          }
          return null;
      }
      // return the size of the LL
      public int size(){
          return size;
      }
      // prints the specific spot in the LL
      public void print(int x){
          Node temp=first; // temp node 
          for(int i=0;i<x;i++){ // goes to correct spot
              temp=temp.getNext();
          }
          System.out.print(temp.get()+" "+temp.getData()); // prints the node desired
      }
}
