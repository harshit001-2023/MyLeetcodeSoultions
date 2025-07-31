import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 1, 2, 4, 2, 2, 3, 4, 4,};
        String[] str = new String[]{"a", "s", "r", "w", "z"};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strlist = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }
        strlist.addAll(Arrays.asList(str));


        System.out.println(list);
        System.out.println(strlist);
        Collections.sort(list);
        Collections.sort(strlist);
        System.out.println(list);
        System.out.println(strlist);
    }


}
