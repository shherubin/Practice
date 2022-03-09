import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[]args){
        List<String> seanList = new ArrayList();
        List<String> victorList = new ArrayList();

        for(int i = 0; i < 10; i++){
            seanList.add("sean android #: " + (i + 1)); //add to list
            victorList.add("victor clone #: " + (i + 1));
        }

        printItems(seanList);
        printItems(victorList);
    }

    public static void printItems(List<String> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)); //print out right away
        }
    }
}
