import java.util.ArrayList;
import java.util.List;

public class Search {
    private final String[] docs;
    public Search(String[] docs) {
        this.docs = docs;
    }

    public List<Integer> findDocs(String keyword){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<docs.length; i++){
            if(docs[i].contains(keyword)){
                list.add(i);
            }
        }return list;
    }
}
