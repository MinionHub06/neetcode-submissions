class Solution {
    public int[] countBits(int n) {
        int[] out=new int[n+1];
        // out[0]=0;
        // for(int i=1;i<=n;i++){
        //     int x=i;
        //     int res=0;
        //     while(x!=0){
        //         res+=(x&1)==1?1:0;
        //         x>>=1;
        //     }
        //     out[i]=res;
        // }
        for (int i = 1; i <= n; i++) {
            out[i] = out[i >> 1] + (i & 1);
        }
        return out;
    }
}
