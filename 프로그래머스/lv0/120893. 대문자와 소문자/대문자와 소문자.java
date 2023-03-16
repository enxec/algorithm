class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i].charAt(0))) {
                answer += arr[i].toLowerCase();
            } else if(Character.isLowerCase(arr[i].charAt(0))) {
                answer += arr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}