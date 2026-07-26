package ST1.RECUSION;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class SubSeq {
    // print all sub sequences of a given string
    /*
     * Input : abc
     * Output : "", "a", "b", "c", "ab", "ac", "bc", "abc"
     */
    public static List<String> Printsubseq(String str) {
        ArrayList<String> list = new ArrayList<>();
        helper(list, "", str);  
        return list;
    }

    private static void helper(ArrayList<String> list, String p, String up) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        // include
        helper(list, p + ch, up.substring(1));
        // exclude
        helper(list, p, up.substring(1));
    }

    // Array Subset
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper2(nums, result, 0, new ArrayList<>());
        return result;
    }

    public static void helper2(int[] nums, List<List<Integer>> result, int index, List<Integer> subset) {
        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // include
        subset.add(nums[index]);
        helper2(nums, result, index + 1, subset);

        // exclude
        subset.remove(subset.size() - 1);
        helper2(nums, result, index + 1, subset);
    }

    public static void main(String[] args) {
        System.out.println(Printsubseq("abc"));
        int[] arr = { 1, 2, 3,};
        System.out.println(subsets(arr));
    }
}
