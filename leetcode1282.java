import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1282 {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer, List<Integer>> hashMap =  new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int index = groupSizes[i]; // index = size
            
            // If the key doesn't exist, create a new list
            hashMap.putIfAbsent(index, new ArrayList<>());
            
            // Add the current index to the list corresponding to the group size
            hashMap.get(index).add(i); // added to array size

            if (hashMap.get(index).size() == index) { // check is array size is equal to group size/index
                ans.add(new ArrayList<>(hashMap.get(index)));
                hashMap.get(index).clear();
            }
        }

        

        return ans;
    }


    public static void main(String[] args) {
        int[] case1 = {3,3,3,3,3,1,3};
        int[] case2 = {2,1,3,3,3,2};

        System.out.println("case: " + Arrays.toString(case1));

        System.out.println("ans: " + groupThePeople(case1));
    }
}
