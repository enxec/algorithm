import java.util.*;

class Solution {
    public static List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                result.add(num);
            }
        }
        
        return result;
    }
}