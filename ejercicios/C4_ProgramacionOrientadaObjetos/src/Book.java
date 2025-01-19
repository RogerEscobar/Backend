public class Book {
    String title = "";
    String author = "";
    int pages = 0;

    public Book (String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void author() {
        System.out.println("El escritor de "+ title + " es " + author);
    }

    public void pages() {
        System.out.println("y tiene " + pages + " paginas");
    }

    public void readpage(){
        System.out.println("estoy leyendo la pagina " + pages/2);
    }
}
