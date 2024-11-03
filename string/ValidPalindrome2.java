class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "abc";
        boolean result = validPalindrome(s);
        System.out.print(result);
    }

    public static boolean validPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    

    public static boolean validPalindrome(String s) {
        String realString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (realString.length() <=2) return true;
        int left, right;
        left = 0;
        right = realString.length() - 1;

        while (left < right) {
            if (realString.charAt(left) != realString.charAt(right)) {
                return validPalindrome(realString, left + 1, right) || validPalindrome(realString,left, right - 1);
            }
            left++;
            right--;
        }

        return true;   
    }
}