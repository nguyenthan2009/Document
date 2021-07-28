import java.time.LocalDate;

public class Newspaper extends Document {
    private LocalDate releaseDate;

    public Newspaper(String documentCode, int releaseNumber, String product, LocalDate releaseDate) {
        super(documentCode, releaseNumber, product);
        this.releaseDate = releaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releaseDate=" + releaseDate +
                "} " + super.toString();
    }
}
