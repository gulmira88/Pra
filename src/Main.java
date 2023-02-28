public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Tolstoy", 245.7, 400);
        Book book1 = new Book("Jamilya", "Aytmatov", 340.2, 600);
        Book book2 = new Book("Zima", "Pushkin", 238.6, 300);
        Book[] books = {book, book1, book2};
        for (Book b : books) {
            System.out.println(b.getBookName()+ " "+ b.getAuthor()+" "+ b.getPrice()+" " + " "+b.getQty());


        }
    }
}