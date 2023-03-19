import java.util.*;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}