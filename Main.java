/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_18_10_19;

import bibblioteca.Book;
import bibblioteca.Library;

/**
 *
 * @author francescosapioli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Library libA = new Library("Library A");
        Library libB = new Library("Library B");
        Library libC = new Library("Library C");
        
        Book a1 = new Book("TPSI", "Francesco", "hoepli", "arh33", 12.9);
        Book a2 = new Book("sistemi", "Giovanni", "hoepli", "cdisuhi", 14.0);
        Book a3 = new Book("informatica", "Michele", "hoepli", "dsnjdsk", 11.3);
        Book a4 = new Book("italiano", "De CArlo", "hoepli", "sddj", 15.23);
        Book a5 = new Book("storia", "De Chirico", "hoepli", "h4md2", 21.5);
        Book a6 = new Book("matematica", "Quelali", "hoepli", "m5os3", 23.1);
        
        libA.addBook(a1);
        libA.addBook(a2);
        libA.addBook(a3);
        libA.addBook(a4);
        libA.addBook(a5);
        libA.addBook(a6);
        
        
        Book b1 = new Book("TPSI", "Francesco", "hoepli", "arh33", 11.9);
        Book b2 = new Book("sistemi", "Giovanni", "hoepli", "cdisuhi", 12.3);
        Book b3 = new Book("ICT", "Michele", "hoepli", "h7f67", 9.3);
        Book b4 = new Book("italiano", "De CArlo", "hoepli", "sddj", 16.23);
        Book b5 = new Book("diritto", "mieli", "hoepli", "4m32", 11.5);
        Book b6 = new Book("elettrotecnica", "Quelali", "hoepli", "mk452b", 13.1);
        
        libB.addBook(b1);
        libB.addBook(b2);
        libB.addBook(b3);
        libB.addBook(b4);
        libB.addBook(b5);
        libB.addBook(b6);
        
        Book c1 = new Book("TPSI", "Francesco", "hoepli", "arh33", 21.0);
        Book c2 = new Book("PGI", "Giovanni", "hoepli", "nio34n", 54.3);
        Book c3 = new Book("ICT", "Michele", "hoepli", "h7f67", 14.0);
        Book c4 = new Book("italiano", "De CArlo", "hoepli", "sddj", 16.54);
        
        libC.addBook(c1);
        libC.addBook(c2);
        libC.addBook(c3);
        libC.addBook(c4);
        
        
        
        
        
        //TO-DO: function: search for a book by title in All the Libraries
        //return Not Availabe or All the results ordered by price
        
        String findIt = "TPSI";
        Book foundIt = new Book();
        //Book temp = new Book();
        //temp.setTitle(" ");
        
        System.out.println(foundIt);
        
         for(Book temp : libA.getBooks().values()){
               if(temp.getTitle().toString().compareTo(findIt) == 0) {
                 foundIt.setTitle(temp.getTitle());
                 foundIt.setWriter(temp.getWriter());
                 foundIt.setEditor(temp.getEditor());
                 foundIt.setIsbn(temp.getIsbn());
                 foundIt.setPrice(temp.getPrice());
            }     
            
         }
         for(Book temp : libA.getBooks().values()){
             if(temp.getTitle().toString().compareTo(findIt) == 0) {
                 foundIt.setTitle(temp.getTitle());
                 foundIt.setWriter(temp.getWriter());
                 foundIt.setEditor(temp.getEditor());
                 foundIt.setIsbn(temp.getIsbn());
                 foundIt.setPrice(temp.getPrice());
            }        
            
         }
          for(Book temp : libA.getBooks().values()){
             if(temp.getTitle().toString().compareTo(findIt) == 0) {
                 foundIt.setTitle(temp.getTitle());
                 foundIt.setWriter(temp.getWriter());
                 foundIt.setEditor(temp.getEditor());
                 foundIt.setIsbn(temp.getIsbn());
                 foundIt.setPrice(temp.getPrice());
            }        
            
         }
          
         System.out.println(foundIt.printIt());
         
        
    }
    
}
