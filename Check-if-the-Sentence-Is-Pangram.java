/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
      //creating an arr 
        int[] arr = new int[26];
    
       
       for(int i=0;i<sentence.length();i++){

            int val = sentence.charAt(i)-97; // As value of 'a' ASCII - 97
            
            arr[val] = -1;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;   
   }
}