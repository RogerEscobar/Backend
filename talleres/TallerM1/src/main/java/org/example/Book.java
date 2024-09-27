package org.example;

public class Book {
    private String title = "";
    private String author = "";
    private int year = 0;

    //Constructor por defecto para libro de muestra
    public Book () {
        this.title = "Cien años de soledad";
        this.author = "Gabriel Garcia Marquez";
        this.year = 1987;
    }

    //Constructor con parametros modificables

    public Book (String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    //Establecer metodos de acceso para titulo, autor y año
    public String getTitle (){
        return title;
    }

    public String getAuthor (){
        return author;
    }

    public int getYear (){
        return year;
    }
}