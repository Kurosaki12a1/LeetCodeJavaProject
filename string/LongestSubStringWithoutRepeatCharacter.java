
import java.util.HashMap;

class LongestSubStringWithoutRepeatCharacter {

    public static void main(String[] args) {
        String str = "abcabcbb";
        //   int[] arr = {-2, -1, -3, 4, -1, 2, 1, -5, 4};
        int result = lengthOfLongestSubstring(str);
        System.out.print(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        HashMap<Character, Integer> seen = new HashMap<>();
        int left, longest;
        left = 0;
        longest = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (seen.get(currentChar) != null) {
                int previousSeenChar = seen.get(currentChar);
                if (previousSeenChar >= left) {
                    left = previousSeenChar + 1;
                }
            }

            seen.put(currentChar, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }

}
