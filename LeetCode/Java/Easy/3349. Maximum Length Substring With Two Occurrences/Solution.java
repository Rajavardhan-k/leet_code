class Solution {
    public int maximumLengthSubstring(String s) {
        int[] cnt = new int[128];
        int left = 0, ans = 0;
        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            cnt[rc]++;
            while (cnt[rc] > 2) {
                cnt[s.charAt(left)]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}