class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, count = 0;
        String ans = "";
        int n = chars.length;
        while (j < n) {
            if (chars[i] == chars[j]) {
                count++;
                j++;
            } else {
                ans += chars[i];
                if (count>1) ans+=count;
                i=j;
                count=0;
            }
        }
        ans += chars[i];
        if (count > 1) ans += count;
        for (int k = 0; k < ans.length(); k++) {
            chars[k] = ans.charAt(k);
        }
        return ans.length();
    }
}