import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int lng = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[lng - 2] * numbers[lng - 1]);
    }
}