import java.util.ArrayList;
import java.util.List;

/**
 * Created by brindaba on 2/25/16.
 */
public class MyList<T> {
    private List<T> holdedList;

    public MyList() {
        this.holdedList = new ArrayList<T>();
    }

    public void addSingleElement(T element){
        holdedList.add(element);
    }

    public void printMyList(){
        System.out.println(holdedList);
    }

    public static void main(String[] args) {
        MyList<String> myStringList = new MyList<String>();
        myStringList.addSingleElement("Surajit");
        myStringList.addSingleElement("Chongder");
        myStringList.printMyList();
        System.out.println("----------------------------------------------");
        MyList<Integer> myIntegerList = new MyList<Integer>();
        myIntegerList.addSingleElement(2);
        myIntegerList.addSingleElement(6);
        myIntegerList.printMyList();
    }

}
