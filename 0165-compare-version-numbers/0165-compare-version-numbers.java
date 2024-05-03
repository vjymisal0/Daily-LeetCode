class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int s1=0;
        int s2=0;
        int len1=a.length;
        int len2=b.length;

        while(s1<len1&&s2<len2)
        {
            int val1=Integer.parseInt(a[s1]);
            int val2=Integer.parseInt(b[s2]);

            s1++;
            s2++;

            if(val1>val2)
            {
                return 1;
            }
            else if(val1<val2)
            {
                return -1;
            }
            else{
               
            }
        }
         while(s1<len1){
            int val1 = Integer.parseInt(a[s1]);
            s1++;
            if(val1>0){
                return 1;
            }
        }


        while(s2<len2){
            int val2 = Integer.parseInt(b[s2]);
            s2++;
            if(val2>0){
                return -1;
            }
        }

        return 0;
    }
}