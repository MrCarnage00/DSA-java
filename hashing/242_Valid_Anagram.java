/*
Problem: 242. Valid Anagram
Pattern: Sorting / Hashing
Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class _242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1==n2){
            for(int i = 0 ; i < n1 ; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}