public class Book extends  Document {
    private String author;
    private int page;

    public Book(String documentCode, int releaseNumber, String product, String author, int page) {
        super(documentCode, releaseNumber, product);
        this.author = author;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", page=" + page +
                "} " + super.toString();
    }
}
