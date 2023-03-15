class Solution {
    public int solution(int slice, int n) {
        int pizza = n / slice;
        
        return n % slice == 0 ? pizza : pizza + 1;
    }
}