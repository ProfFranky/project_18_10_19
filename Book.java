/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author francescosapioli
 */
public class Book {
    private String title;
    private String writer;
    private String editor;
    private String isbn;
    private Double price;

    
    public Book() {
        
    }
    
    public Book(String title, String writer, String editor, String isbn, Double price) {
        this.title = title;
        this.writer = writer;
        this.editor = editor;
        this.isbn = isbn;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getEditor() {
        return editor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Double getPrice() {
        return price;
    }

    public String printIt(){
        return title + " - " + writer + " - " + editor + " - " + isbn + " - " + price.toString();
    }
    
    
  
    
}
