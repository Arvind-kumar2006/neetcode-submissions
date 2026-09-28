class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,ArrayList<String>> map = new HashMap<>();

        List<List<String>> l = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if(!map.containsKey(str)){
                map.put(str , new ArrayList());
            }
             map.get(str).add(s);
            
        }
       return new ArrayList<>(map.values());

    }
}
