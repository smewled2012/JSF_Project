package com.seme.collection;

import java.util.Iterator;
import java.util.List;
import java.util.*;  


class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  


public class MyArrayList {
	
	public static void main(String[] args) {
		
		List<Book> list=new LinkedList<Book>();  
		List<Book> list2 = new ArrayList<Book>();
	//	 ArrayList<String> list=new ArrayList<String>();
		 List<String> al=new ArrayList<String>();//creating arraylist    
		 HashSet<String> set=new HashSet<String>();  
		
		Book book1 =new Book(101, "HOW_TO_WIN ", "Seme_Mewled", "Mega_Publisher", 10);
		Book book2 =new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Book book3 =new Book(103,"Operating System","Galvin","Wiley",6); 
		Book book4 = new Book(104, "System Officer, ",  "Kill Me, ",  "Accenture , ",  5 );
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		for(Book b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	
	}
	}
