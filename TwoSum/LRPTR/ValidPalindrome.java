package TwoSum.LRPTR;

class Solution {
    public boolean isPalindrome(String s) {

       int left = 0 , right = s.length()-1;

       while(left<right){

            // skipping non alphanumeric on left

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            // skipping non alphanumeric on left

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }


           if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }


            left++;
            right--;

            


       }


       return true;
        
    }
}