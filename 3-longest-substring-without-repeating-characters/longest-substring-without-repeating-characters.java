class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,maxCount=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if((map.containsKey(ch))){
                i = Math.max(i, map.get(ch) + 1);
            }
            maxCount=Math.max(maxCount,(j-i+1));
            map.put(ch,j);
            j++;
        }
        return maxCount;
    }
}