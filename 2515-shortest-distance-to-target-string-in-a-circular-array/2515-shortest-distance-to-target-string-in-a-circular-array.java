class Solution {
    public int closestTarget(String[] words, String target, int j) {
        int min=Integer.MAX_VALUE;
        int n=words.length;
       for(int i=0;i<n;i++){
        if(words[i].equals(target))
           min=Math.min(min,Math.min(Math.abs(i-j),Math.abs(n- Math.abs(i - j))));
       }
        return min == Integer.MAX_VALUE ? -1 : min;

    }
}