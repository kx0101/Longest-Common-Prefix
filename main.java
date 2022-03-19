class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs[0].length() == 0) //if the first string in strs is of length 0
            return ""; //return empty string
        
        int i = 0; //holds the last index upto which the strings have common characters
        int flag = 1; //flag to end the loop
        
        //the loop runs from 0 till the length of the first string in strs 
        //( i have taken the first string as the reference)
        for(i = 0; i < strs[0].length(); i++)
        {
             //the ith character first string is compared each time
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++)
            {
                //the comparison is done 2nd string onwards
                //if the length of the jth string is less than or equal to i
                //or if the characters do not match
                if(strs[j].length() <= i || strs[j].charAt(i) != ch)
                   { 
                        flag = 0; //flag is set to 0
                        break; //loop breaks
                   }
            }
            
            if(flag == 0) //if the flag is 0
                break; //outer loop breaks too
        }
        
        String ans = strs[0].substring(0,i); //substring from 0-i is the answer
        return ans;
    }
}
