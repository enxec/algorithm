class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = java.util.Arrays.stream(arr1).sum();
        int sum2 = java.util.Arrays.stream(arr2).sum();
        
        if (arr1.length != arr2.length) {
            return Integer.compare(arr1.length, arr2.length);
        }
        
        return Integer.compare(sum1, sum2);
    }
}