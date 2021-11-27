/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Books {
    
    private String title;
    private int pages;
    private int publicationYear;

    public Books(String title, int pages, int publicationYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public String toString(){
        return this.title + ", " + pages + " pages, " + publicationYear;
    }
}
