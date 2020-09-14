// https://leetcode.com/problems/roman-to-integer/submissions/
/**
 * Converts Roman Numeral to Integers
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbol = new HashMap<Character, Integer>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);
        int prev = Integer.MAX_VALUE; // previous val in loop
        int ret = 0; // represent return val
        int curr = 0; // current in loop
        for(int i = 0; i < s.length(); i++){
            curr = symbol.get(s.charAt(i));
            if(prev < curr){
                //IV
                ret -= prev * 2;
            }
            ret += curr;
            prev = curr;
        }
        return ret;
    }
}