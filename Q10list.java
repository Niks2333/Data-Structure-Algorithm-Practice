
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q10list {
    public static void main(String ar[])
    {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 6);
        Set<Integer> hashset=new HashSet<>(list1);
        hashset.retainAll(list2);
        System.out.println(hashset);



    }
}
