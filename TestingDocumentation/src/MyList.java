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

    public  void addMultipleElement(T [] elements){
        for (T eachElement : elements)
            holdedList.add(eachElement);
    }

    public  String addMultipleElement(T [] elements,int Size){
        for (T eachElement : elements)
            holdedList.add(eachElement);
        return "hi";
    }


    public T getElementAtThePosition(int position){
        return holdedList.get(position);
    }

    public static void main(String[] args) {

        MyList<String> myStringList = new MyList<String>();
        myStringList.addSingleElement("Surajit");
        myStringList.addSingleElement("Chongder");
        String [] someWords = {"Is","A","Good","Boy"};
        myStringList.addMultipleElement(someWords);
        myStringList.printMyList();
        System.out.println("----------------------------------------------");
        MyList<Integer> myIntegerList = new MyList<Integer>();
        myIntegerList.addSingleElement(2);
        myIntegerList.addSingleElement(6);
        myIntegerList.printMyList();
    }

}
