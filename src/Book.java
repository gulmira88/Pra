public class Book {
    private String bookName;
    private String author;
    private double price;
    private int qty=0 ;

    public Book(String bookName, String author, double price, int qty) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(){
        this.qty=qty;

    }

    @Override
    public String toString() {
        return "BookName:+ bookName" + "price:"+ price + "qty:+ qty";

    }
}
