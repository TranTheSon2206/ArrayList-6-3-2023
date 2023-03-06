package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        numbers.add(133);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : "+numbers);

        //Sorting an ArrayList using Collection.sort() method
        Collections.sort(numbers);

        System.out.println("After : "+numbers);
    }
}
