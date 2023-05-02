Top k frequent elements in the array












class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])==false)
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);    
            }
        }
        int[] topF=new int[k];
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet())//adding the key  values to list of pairs
        {
            Pair<Integer, Integer> pair = new Pair<>(entry.getKey(), entry.getValue());
            list.add(pair);
        }
        Collections.sort(list, new Comparator<Pair<Integer, Integer>>()//custom sorting
                         {
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                return p2.getValue().compareTo(p1.getValue());
            }
        });
        for(int i=0;i<k;i++)
        {
             Pair<Integer, Integer> pair = list.get(i);
             topF[i] = pair.getKey().intValue();//getKey returns me an Integer obj so i am type casting it
        }
        return topF;
     }
}