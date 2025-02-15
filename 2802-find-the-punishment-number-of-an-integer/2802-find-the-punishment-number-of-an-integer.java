class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(istrue(i)){
                sum+=i*i;
            }
        }
        return sum;
    }
    public boolean checkpartition( String str,int sum,int index,int target){
        if(index==str.length()){
            return sum==target;
        }
        for(int i=index;i<str.length();i++){
            int part=Integer.parseInt(str.substring(index,i+1));
            if(checkpartition(str,sum+part,i+1,target))return true;
        }
     return false;
    }
    public boolean istrue(int n){
        int k=n*n;
        String numStr = Integer.toString(k);
        return checkpartition(numStr,  0, 0,n);

    }
}