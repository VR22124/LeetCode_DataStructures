/* 43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.


Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088" */

Solution :

import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) 
    {
       BigInteger a=new BigInteger(num1);
       BigInteger b=new BigInteger(num2);
       BigInteger c=a.multiply(b);
       return c+"";
    }
}