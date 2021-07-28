public class Document {
    private String documentCode;
    private int releaseNumber;
    private String Product;

    public Document(String documentCode, int releaseNumber, String product) {
        this.documentCode = documentCode;
        this.releaseNumber = releaseNumber;
        Product = product;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentCode='" + documentCode + '\'' +
                ", releaseNumber=" + releaseNumber +
                ", Product='" + Product + '\'' +
                '}';
    }
}
