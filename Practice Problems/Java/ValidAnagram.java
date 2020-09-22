//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char tempArray1[] = s.toCharArray(); 
        char tempArray2[] = t.toCharArray(); 
        Arrays.sort(tempArray1); 
        Arrays.sort(tempArray2); 
        return (new String(tempArray1).equals(new String(tempArray2)));
        }
}