/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tiegancozzie
 */
public class Hashing {

    
    public void pt1() throws FileNotFoundException{
        File file=new File("inhash.txt"); // reads in file
        Scanner in=new Scanner(file); // makes a new scanner 
        String[] storage=new String[26]; // will store all the unique characters
        String[] checkerStorage=new String[26]; // will store ever character
        boolean unique=true; 
        String line;
        
        while(in.hasNext()){ // for every line in the file
            line=in.nextLine(); // go to the next line
            String[] lineSplit=line.split(""); // splits the line up into an array
            for(int i=0;i<lineSplit.length;i++){ // goes through the whole array
                int hash=lineSplit[i].hashCode()%26; // hashes the characters to fit inside the array
                if(storage[hash]==null){ // if the character hasnt been read in yet, put it in unique array
                    storage[hash]=lineSplit[i]; // puts into array
                }else{
                    checkerStorage[hash]=lineSplit[i]; // if the character was already read in. put into regular storage
                }
                if(checkerStorage[hash]!=null){ // if there are characters in this array. it wouldnt be unique
                    unique=false;
                    storage[hash]=null; // clear unique array
                }
            }
            
            
            System.out.println("Is string "+line+" unique? "+unique);
            System.out.print("Unique characters are ");
            for(int i=0;i<storage.length;i++){ // print whole unique array
                if(storage[i]!=null){ // wont read in the null spaces
                    System.out.print(storage[i]);
                }
            }
            System.out.println();
            storage=new String[26]; // clear storage array
            checkerStorage=new String[26]; // clear checker array
            unique=true;
            System.out.println();
        }
    }

    
    public static void main(String[] args) throws FileNotFoundException{
        Hashing run=new Hashing();
        run.pt1();
        
        SeperateChainingHashST<String,Integer> hashST=new SeperateChainingHashST(5); // initializing Hash Searxh table with 5 spots
        String[] input=new String[] {"V","R","Y","E","A","S","Q","U","T","I","O","N"};
        for(int i=0;i<input.length;i++){ // inputting input array into table
            hashST.put(input[i], i);
        }
        hashST.print(); // printing whole Hash table
    }
}
