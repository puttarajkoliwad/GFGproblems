//Problem statement at: https://practice.geeksforgeeks.org/problems/stickler-theif/0

//Objective: To maximize the sum of array elements such that no two elements that contribute to the sum are adjacent.

//Hints and Similar problems: https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/

/*
Solution type: Dynamic Programming
Code complexity: O(m * n). Because, We only traverse the array once linearly. 'm' is no. of test cases. 'n' is length of array for each test case. Logically O(n) is the time complexity.
Space complexity: O(1). Because, The solution doesn't use any extra space apart from the input stored.

Explanation:
1) Initially the sum is 0. 
2) At every index, We have 2 scenarios, to choose the current element OR not to choose the current element. So we need 2 variables(currinc, currexc) to determine this.
  i) In order to choose the current elemet, we shouldn't have chose previous element and the sum after choosing current element should be greater than
     sum after dropping the previous element. So we need 2 more variables(preinc, preexc) to determine whether current element should be choosen or not.
  ii) For future reference we calculate both scenarios. This changes our PREVIOUS values like this, "preinc = currinc" and "preexc = currexc".
 3) At the end of the traversal we return the max of (preinc, preexc).
 
 Reverse approach solution at: https://www.youtube.com/watch?v=XXACh6L2q5w&t=1916s
*/


import java.util.Scanner;

class GFG {
Max
    //Solution function
    public static int solve(int[] arr){
        int n=arr.length;
        int preinc=0, preexc=0;//Initially no element is choosen.
        int currinc, currexc;
        for(int i=0; i<n; i++){
            currexc = Math.max(preexc, preinc);//sum after excluding the current element
            currinc = preexc + arr[i];//sum after including the current element
            
            //changing old values before moving to next element
            preinc = currinc;
            preexc = currexc;
        }
        return Math.max(inc, exc);
    }
    
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0; i<t; i++){
		    int n = scan.nextInt();
		    int[] arr= new int[n];
		    for(int j=0; j<n;j++){
		        arr[j]=scan.nextInt();
		    }
		    System.out.println(solve(arr));
		}
	}
}
