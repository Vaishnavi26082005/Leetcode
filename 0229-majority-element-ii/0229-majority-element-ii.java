class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int first=0;
        int second= 0;
        int fc=0;
        int sc=0;
        int n=nums.length;
       
        for(int i=0;i<nums.length;i++){
            if(first==nums[i]){
                fc++;
            }
            else if(second==nums[i]){
                sc++;
            }
            else if (fc==0){
                first=nums[i];
                fc=1;
            }
            else if(sc==0){
                second=nums[i];
                sc=1;
            }
            else{
                fc--;
                sc--;
            }
        }
    
       fc=0;
       sc=0;
       ArrayList<Integer>l= new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(first==nums[i])fc++;
        else if(second==nums[i])sc++;
       }
       if(fc>n/3)l.add(first);
       if(sc>n/3)l.add(second);
       return l;
    }
}