import java.util.*;
public class ArrayMerge {

    public static void main(String[] args) {

        String[] Array1 = {"kazuya", "jin", "lee"};
        String[] Array2 = {"kazuya", "feng"};
        mergeUniqueValues(Array1, Array2);
    }

    public static void mergeUniqueValues(String[] arr1, String[] arr2) {
        Set noDuplicateSet = new HashSet();
        noDuplicateSet.addAll(Arrays.asList(arr1));
        noDuplicateSet.addAll(Arrays.asList(arr2));

        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);

        Arrays.sort(noDuplicateArray);

        System.out.println("Output: ");
        for (String str : noDuplicateArray) {
            System.out.print(str + ",");
        }
    }
}