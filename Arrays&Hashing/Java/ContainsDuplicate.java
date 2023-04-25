

Contains Duplicate 

1-My Approach[Using Sorting]

Time Complexity -> O(nlogn)
Space Complexity -> O(1)

Imp Tips -> Arrays.sort(nums)[Does the sorting in O(nlogn) time , nums.length gives me the size of array.

[Firstly I am sorting the array and then I am checking if the consecutive numbers in the array are same or not. If the numbers are same then I am setting the flag as true (initially it is set to false so if there are no duplicates then flag will show false)] 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // modified version of the quicksort algorithm as it uses the concept of 2 pivot elements rather than 1 of the quick sort algorithm 
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++) // traversing till length-1 index in order to avoid array index out of bounds exception
        {
            if(nums[i]==nums[i+1])
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            return true;
        }
        else
            return false;
    }
}

2-Best Approach(Using HashSet)

Time Complexity -> O(n)
Space Complexity -> O(n)

[I am basically storing the values in hashet(storing is done in O(1) time) and then checking if the value is present is the hashset or not. If it is present return true else return false]

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
     
    }
}

