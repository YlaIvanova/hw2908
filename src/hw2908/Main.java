package hw2908;

public class Main {


    public static void main(String[] args) {

        var author = new Author("Лев","Толстой");
        var author1 = new Author("Павел","Иванов");
        var author2 = new Author("Анна","Полетаева");
        var book = new Book(author,"Война и мир", 1987);
        var book1 = new Book(author1,"Радуга", 2007);
        var book2 = new Book(author2,"Неизвестность", 1999);

        //System.out.println( book.getAuthor() +" "+ book.getTitleOfTheBook()+" "+book.getYearOfPublication());
        System.out.println(book);
        System.out.println(book.hashCode() == book1.hashCode());
        System.out.println(book.equals(book1));

        //book1.setYearOfPublication(2022);
        //System.out.println( book1.getAuthor() +" "+ book1.getTitleOfTheBook()+" "+book1.getYearOfPublication());
    }
}
