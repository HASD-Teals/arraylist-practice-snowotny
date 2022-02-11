import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0,"idk");
        arrayList2.add(1,"idk2");
        arrayList2.add(2,"idk23");
        arrayList2.add(3,"idk478");

        removeEvenLength(arrayList2);
    }    
  
    
    public static void removeEvenLength(ArrayList arrayList){
        for(int i =0; i<arrayList.size(); i++){
            if (((CharSequence) arrayList.get(i)).length()%2 == 0){
                arrayList.remove(i);
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
