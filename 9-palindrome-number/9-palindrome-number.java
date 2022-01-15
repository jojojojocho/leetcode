class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String string = String.valueOf(x);

        

        char[] charArray = string.toCharArray();
        int index = string.length() / 2;
        int j = charArray.length-1;
        for (int i = 0; i < index; i++){
            if(charArray[i] != charArray[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}