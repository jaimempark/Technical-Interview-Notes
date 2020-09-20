//https://leetcode.com/problems/valid-anagram/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        StringBuilder temp = new StringBuilder(t);
        int val;
        for(int i=0; i < s.length(); i++){
            val = temp.indexOf(Character.toString(s.charAt(i)));
            if(val == -1){
                return false;
            } else {
                temp.deleteCharAt(val);
            }
        }
        return true;
    }
}