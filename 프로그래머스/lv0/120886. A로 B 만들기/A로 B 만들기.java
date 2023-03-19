import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        List<Character> beforeList = before.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> afterList = after.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

        beforeList.sort(null);
        afterList.sort(null);

        if (afterList.equals(beforeList)) {
            answer = 1;
        }
        return answer;
    }
}