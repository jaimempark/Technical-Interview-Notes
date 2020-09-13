// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

// Examples:

// s = "leetcode"
// return 0.

// s = "loveleetcode"
// return 2.

// Note: You may assume the string contains only lowercase English letters.

// Solution:

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        boolean unique = false;
        if(s.length() < 1){
            return -1;
        }
        int solution = 0;
        for( int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 2);
            } else{
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}