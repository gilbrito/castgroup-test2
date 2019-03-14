Assignment Java Cast Group

========================================================================
Maximum Difference in an Array
========================================================================
 
You are given an array of integers and must compute the maximum difference between any item and any lower indexed smaller item for all the possible pairs, i.e., for a given array a find the maximum value of a[j] - a[i] for all i, j where 0 ≤ i < j < n and a[i] < a[j]. If there are no lower indexed smaller items for all the items, then return -1.
 
For example, given an array [ 1, 2, 6, 4], you would first compare 2 to the elements to its left.  1 is smaller, so calculate the difference 2 - 1 = 1.  6 is bigger than 2 and 1, so calculate the differences 4 and 5.  4 is only bigger than 2 and 1, and the differences are 2 and 3.  The largest difference was 6 - 1 = 5.
 
============================Function Description==============================
  
Complete the function maxDifference that must return an integer representing the maximum difference in a.
 
    // Complete the maxDifference function below.
    static int maxDifference(int[] a) {
    }
 
maxDifference has the following parameter(s):
 
    a[a[0],a[1],...a[n-1]]:  an array of integers
 
Constraints
1 ≤ n ≤ 2 × 105
−106 ≤ a[i] ≤ 106 ∀ i ∈ [0, n − 1]
 
=====================Input Format For Custom Testing===========================
Input from stdin will be processed as follows and passed to the function:
 
The first line contains a single integer, n, denoting the number of elements in the array a.
 
Each of the n subsequent lines contains a single integer describing element a[i] where 0 ≤ i < n.    
 
 
=============================Sample Case 0==================================
Sample Input 0
7
2
3
10
2
4
8
1
 
Sample Output
8
 
Explanation
n = 7, a = [2, 3, 10, 2, 4, 8, 1]
 
Differences are calculated as:
3 - [2] = [1]
10 - [3, 2] = [7, 8]
4 - [2, 3, 2] = [2, 1, 2]
8 - [4, 2, 3, 2] = [4, 6, 5, 6]
 
 
The maximum is found at 10 - 2 = 8.


=============================Sample Case 1=================================
Sample Input 1
6
7
9
5
6
3
2
 
Sample Output
2
 
Explanation
n = 6, a = [7, 9, 5, 6, 3, 2]
 
Differences are calculated as:
9 - [7] = 2
6 - [5] = 1
 
The maximum difference is 2.
