class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] cnt1 = new int[1001];
        int[] ctn2 = new int[1001];
        for (int v : target) {
            ++cnt1[v];
        }
        for(int v: arr)
        {
            ++ctn2[v];
        }
        return Arrays.equals(cnt1, ctn2);
    }
}