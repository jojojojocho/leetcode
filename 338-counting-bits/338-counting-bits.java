class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        for(int i=0; i<=n; i++) {
            String s = Integer.toBinaryString(i);
            String binaryString = s.replaceAll("0", "");
            answer[i] = binaryString.length();
        }
        return answer;


    }
}