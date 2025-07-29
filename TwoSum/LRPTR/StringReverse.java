package TwoSum.LRPTR;

class Solution {
    public void reverseString(char[] s) {

        //  Stack<Character> st = new Stack<>();
        // int idx = 0;
        
        // while(idx<s.length){
            
        //     st.push(s[idx]);
        //     idx++;
        // }
        
        //  char arr[] = new char[s.length];
        //  int i=0;

        // while(!st.isEmpty()){
            
        //     s[i] = st.pop();
        //     i++;
            
        // }

        // Using two pointers

        int left = 0 ,  right = s.length-1;

        while(left <= right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

       
        
        
        
    }
}