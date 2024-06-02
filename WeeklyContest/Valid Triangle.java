=========problem statement========
  https://practice.geeksforgeeks.org/contest/gfg-weekly-157-rated-contest/problems
=========solution=========
  


class Solution {
    public static String isPossible(int a, int b, int c) {
        // code here
        if(a+b>c && b+c>a && a+c>b) return "YES";
        return "NO";
    }
}
