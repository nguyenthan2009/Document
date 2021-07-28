public class Magazine extends Document {
    private int issueNumber;
    private int Month;

    public Magazine(String documentCode, int releaseNumber, String product, int issueNumber, int month) {
        super(documentCode, releaseNumber, product);
        this.issueNumber = issueNumber;
        Month = month;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", Month=" + Month +
                "} " + super.toString();
    }
}
