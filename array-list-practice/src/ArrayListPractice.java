import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        
    }
    public void removeEvenLength(List myList){
        for(int i =0; i<=((CharSequence) myList).length(); i++){
            if (((CharSequence) myList.get(i)).length()%2 == 0){
                myList.remove(i);
            }
        }
    }
    public void averageVowels(){

    }
    public void removeDuplicates(){

    }
    public void doubleList(){

    }
    public void minToFront(){

    }
}
