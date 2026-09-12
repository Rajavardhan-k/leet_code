class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        if(m<n) return false;
        int i=0;
        int j=0;
        while(i<n && j<m){
            char c1=name.charAt(i);
            char c2=typed.charAt(j);
            if(c1!=c2) return false;
            int count1=1;
            int count2=1;
            while(i+1<n && name.charAt(i)==name.charAt(i+1)){
                count1++;i++;
            }
            while(j+1<m && typed.charAt(j)==typed.charAt(j+1)){
                count2++;j++;
            }
            if(count2<count1) return false;
            i++;
            j++;
        }
        return i==n && j==m;
    }
}