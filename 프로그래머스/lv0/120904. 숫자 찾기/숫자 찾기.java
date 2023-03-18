class Solution {
    public int solution(int num, int k) {
        int n = String.valueOf(num).indexOf(String.valueOf(k));
        return n==-1?-1:n+1;
    }
}