class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int lng = numbers.length;
        
        for(int i = 0; i < lng; i++) {
            answer += numbers[i];    
        }
        
        return answer / lng;
    }
}