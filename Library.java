/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author francescosapioli
 */
public class Library {
    
    //final int MAX_BOOKS = 100;
    
    
    private String name;
    private int numBooks; //Used to notice how many books are in the library
    private Map <String,Book> books;

     

    public Library(String name) {
        this.books = new HashMap<String,Book>();
        this.name = name;
        this.numBooks = 0;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }

   

    public String getName() {
        return name;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    /* public int getMAX_BOOKS() {
        return MAX_BOOKS;
    }
    */
    
    //TO-DO: Create a Method to add a book to the Library
    public void addBook(Book a){
        books.put(a.getTitle(), a);
        numBooks++;
        
    }
    
    
}
