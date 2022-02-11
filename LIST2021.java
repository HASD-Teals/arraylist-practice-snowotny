import java.util.ArrayList;
import java.util.List;

public class LIST2021{
    public static void main(String[] args){
        List myList = new ArrayList();
        System.out.println(myList);
        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        System.out.println(myList);
        myList.add(2,"Cat");
        System.out.println(myList);
        myList.set(2,"Crab");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        int lengthAnimalname = (myList.get(1)).toString().length();
        System.out.println(lengthAnimalname);
    }
}
