Group Anagrams

1-Best approach(Using HashMaps)

Time complexity -> O(n)
Space complexity -> O(n^2)

Here I have used Hashmaps inside a HashMaps. Also at the end I have converted an ArrayList into List<List<String>>.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> bigMap=new HashMap<>();
        for(String s:strs)
        {
            HashMap<Character,Integer> fMap=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(fMap.containsKey(s.charAt(i))==false)
                {
                    fMap.put(s.charAt(i),1);
                }
                else
                {
                    fMap.put(s.charAt(i),fMap.get(s.charAt(i))+1);
                }
            }
            if(bigMap.containsKey(fMap)==false)
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(s);
                bigMap.put(fMap,list);
            }
            else
            {
                ArrayList<String> list=bigMap.get(fMap);
                list.add(s);
            }
        }
        List<List<String>> finalList=new ArrayList<List<String>>();
        for(ArrayList<String> val:bigMap.values())
        {
            finalList.add(val);
        }
        return finalList;
    }
}