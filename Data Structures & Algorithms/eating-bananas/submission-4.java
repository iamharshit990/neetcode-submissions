class Solution {
    public boolean helper(int arr[],int mid,int h){
        int count=0;
        for(int i:arr){
             count+=(int) Math.ceil((double)i/mid);
        }
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int max=0;
        for(int i:piles){
            max=Math.max(i,max);
        }
         high=max;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(helper(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;

        
    }
}
