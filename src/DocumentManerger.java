import java.util.ArrayList;
import java.util.List;

public class DocumentManerger {
    List<Document> ListDocument = new ArrayList<>();
    public void addDocument(Document document){
        ListDocument.add(document);
    }
    public void searchDocument(String documentCode ){
        for(int i =0; i<ListDocument.size();i++){
            if(ListDocument.get(i).getDocumentCode().equals(documentCode)){
                System.out.println(ListDocument.get(i).toString());
            }
        }
    }
    public int getIndexDocument(String documentCode){
        int index =1;
        for(int i =0; i<ListDocument.size();i++){
            if(ListDocument.get(i).getDocumentCode().equals(documentCode)){
                index =i;
            }
        }
        return index;
    }
    public void deleteDocument(int index){
        ListDocument.remove(index);
    }
    public void setBook(int index, Book newBook){
        ListDocument.set(index,newBook);
    }

}
