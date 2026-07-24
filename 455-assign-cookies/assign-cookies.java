class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gp=0, sp=0;
        int count=0;

        while(gp < g.length && sp < s.length){
            if(s[sp]>=g[gp]){
                count++;
                sp++;
                gp++;

            }else if(s[sp]<g[gp]){
                sp++;
            }
        }
        return count;


    }
}