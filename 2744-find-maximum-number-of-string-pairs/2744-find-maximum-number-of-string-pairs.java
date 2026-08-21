class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            String rev = reverse(words[i]);
           if(set.contains(rev)){
            count++;
           } 
           else{
            set.add(words[i]);
           }
        }
        return count;
    }
    public String reverse(String c){
        StringBuilder sb = new StringBuilder(c);
        sb.reverse();
        return sb.toString();
    }
}