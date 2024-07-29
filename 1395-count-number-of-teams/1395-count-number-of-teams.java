class Solution {
    public int numTeams(int[] rating) {
       int res = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            // ascending
            int leftandsmall = 0;
            int rightandlarge = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftandsmall++;
                }
            }
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[j] > rating[i]) {
                    rightandlarge++;
                }
            }
            res += rightandlarge * leftandsmall;
            int leftandlarge = i - leftandsmall;
            int rightandsmall = rating.length - i - 1 - rightandlarge;

            res += leftandlarge * rightandsmall;

        }


        return res; 
    }
}