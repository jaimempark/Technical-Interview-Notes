﻿// Given a 32-bit signed integer, reverse digits of an integer.

// Example 1:

// Input: 123
// Output: 321

// Example 2:

// Input: -123
// Output: -321

// Example 3:

// Input: 120
// Output: 21

// Note:
// Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

// Solution:

class Solution {
    public int reverse(int x) {
        int sign = 1;
        int result = 0;
        if(x < 0){
            sign = -1;
            x = x * -1;
        }
        while(x > 0){
            result = result*10 + x%10;
            x = x/10;
            if(result > Integer.MAX_VALUE/10 && x > 0){
                return 0;
            }
        }
        return result * sign;
    }
}