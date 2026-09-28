
class Solution {
    public boolean isPalindrome(String s) {


        int left =0;
        int right = s.length() -1;
while (left < right) {
    if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
        continue;         // 1. keyword: jump to the next loop iteration
    }
    if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
       continue;         // 2. same keyword
    }
    if (Character.toLowerCase(s.charAt(left)) !=  Character.toLowerCase(s.charAt(right))) {   // 3. what comparison means "don't match"?
        return false;
    }
    right--;
    left++;         // 4. move both pointers inward
}
return true;
       }
    }