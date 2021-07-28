import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentManerger manerger = new DocumentManerger();
        int number =1 ;
        while (number !=0){
            System.out.println("Mời bạn chọn");
            System.out.println("Ấn 1  để thêm sách");
            System.out.println("Ấn 2 để thêm tạp chí");
            System.out.println("Ấn 3 đê thông báo");
            System.out.println("Ấn 4 để xem thông tin của thư viện ban muốn xem");
            System.out.println("Ấn 5 để xoá 1 thư viện");
            System.out.println("ẤN 6 để sửa 1 thư viện");
            System.out.println("Ấn 0 để thoát chương trình");

            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    System.out.println("Nhập mã tài liệu");
                    String documentCode = sc.nextLine();
                    System.out.println("Nhập số bản phát hành");
                    int releaseNumber = sc.nextInt();
                    System.out.println("Nhập tên nhà sản xuất");
                    String product = sc.nextLine();
                    System.out.println("Nhập tên tác giả");
                    String author = sc.nextLine();
                    System.out.println("Nhập số trang");
                    int page = sc.nextInt();
                    manerger.addDocument(new Book(documentCode,releaseNumber,product,author,page));
                    break;
                case 2:
                    System.out.println("Nhập mã tài liệu");
                    String documentCode1 = sc.nextLine();
                    System.out.println("Nhập số bản phát hành");
                    int releaseNumber1 = sc.nextInt();
                    System.out.println("Nhập tên nhà sản xuất");
                    String product1 = sc.nextLine();
                    System.out.println("Nhập số phát hành");
                    int issueNumber = sc.nextInt();
                    System.out.println("Nhập tháng phát hành");
                    int month = sc.nextInt();
                    manerger.addDocument(new Magazine(documentCode1,releaseNumber1,product1,issueNumber,month));
                    break;
                case 3:
                    System.out.println("Nhập mã tài liệu");
                    String documentCode2 = sc.nextLine();
                    System.out.println("Nhập số bản phát hành");
                    int releaseNumber2 = sc.nextInt();
                    System.out.println("Nhập tên nhà sản xuất");
                    String product2 = sc.nextLine();
                    System.out.println("Nhập ngày phát hành");
                    int day = sc.nextInt();
                    System.out.println("Nhập tháng phát hành");
                    int month1 = sc.nextInt();
                    System.out.println("Nhập năm phát hành");
                    int year = sc.nextInt();
                    LocalDate date = LocalDate.of(year,month1,day);
                    manerger.addDocument(new Newspaper(documentCode2,releaseNumber2,product2,date));
                case 4:
                    System.out.println("Nhập tên thư viện bạn muốn xoá");
                    String name = sc.nextLine();
                    manerger.deleteDocument(manerger.getIndexDocument(name));
                    break;
                case 5:
                    System.out.println("Nhập tên thư viện bạn muốn sửa");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;



            }
        }
    }
}
