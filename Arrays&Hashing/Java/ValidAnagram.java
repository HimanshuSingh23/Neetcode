Valid Anagram(An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.)

1-My Approach(Using HashMap)

Time Complexity -> O(n)
Space Complexity -> O(n)

[I am creating 2 Hashmaps(mapS,mapT) with the number of occurences of each character as value of the map elements. After forming the 2 maps I am checking whether the 2 maps are equal or not and then returning true if they equal and vice-versa]

class Solution {
    public boolean isAnagram(String s, String t) 
    {
      HashMap<Character,Integer> mapS=new HashMap<>();
      HashMap<Character,Integer> mapT=new HashMap<>();
      if(s.length()!=t.length())
      {
          return false;
      }
      for(int i=0;i<s.length();i++)
      {
          if(mapS.containsKey(s.charAt(i))==false) // checking if the element is already there in the map or not
          {
              mapS.put(s.charAt(i),1);
          }
          else
          {
              mapS.put(s.charAt(i),mapS.get(s.charAt(i))+1); // updating the number of occurence of the character by 1 if it is already present
          }
      }
        for(int i=0;i<t.length();i++)
      {
          if(mapT.containsKey(t.charAt(i))==false)
          {
              mapT.put(t.charAt(i),1);
          }
          else
          {
              mapT.put(t.charAt(i),mapT.get(t.charAt(i))+1);
          }
      }
        if(mapS.equals(mapT))
        {
            return true;
        }
        return false;
      
        
    }
}

