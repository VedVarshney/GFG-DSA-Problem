# [Who has the majority?](https://www.geeksforgeeks.org/problems/who-has-the-majority/1)
## Easy
Given an array arr[] and two elements x and y, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one.
Examples:
Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5], x = 4, y = 5Output: 4
Explanation: frequency of 4 is 4.frequency of 5 is 1.Since 4&gt;1 so return 4

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], x = 1, y = 7
Output: 1
Explanation: frequency of 1 is 1.frequency of 7 is 1.Since 1 &lt; 7, return 1.

Constraints:1 ≤ arr.size() ≤ 1060 ≤ arr[i] , x , y ≤ 108