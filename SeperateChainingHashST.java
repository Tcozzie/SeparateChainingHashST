/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing;

/**
 * // Code came from Algorithms Fourth Edition
 * @author tiegancozzie
 */
public class SeperateChainingHashST<Key,Value> {
    private int m; // Size
    private LinkedList<Key,Value>[] LL; // initializing Linked List array
    
    
    public SeperateChainingHashST(int m){ // creating the list with its initial size sent in
        this.m=m; // setting size
        LL=(LinkedList<Key,Value>[]) new LinkedList[m]; // made array with size m
        for(int i=0;i<m;i++){ // iterating over each spot
            LL[i]=new LinkedList(); // making a new linked list in each spot
        }
    }
    
    private int hash(Key key){ // hashing a key
        return ((key.hashCode()-64)*11%m); // returns hashcode of key
    }
    
    public Value get(Key key){ // gets value of a key
        return (Value) LL[hash(key)].get(key); // hashes to key's specific hashcode then returns its value
    }
    
    public void put(Key key,Value value){ // puts Something into the Hash Table
        LL[hash(key)].add(key,value); // adding into the hash table while hashing to the right spot
    }
    
    public void print(){ // printing 
        for(int i=0;i<m;i++){ // going over all m elements
            int s=LL[i].size(); // gets the size of individual LL
            for(int x=0;x<s;x++){ // going over each element in the LL
                LL[i].print(x); // printing
                System.out.println(" Hash: "+i); // printing hash position
            }
        }
    }
    
}
