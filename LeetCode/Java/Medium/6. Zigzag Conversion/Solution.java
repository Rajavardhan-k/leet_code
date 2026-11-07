class Solution {
    public String convert(String s, int r) {
        if (r == 1) return s;

        String[] a = new String[Math.min(r, s.length())];
        for (int i = 0; i < a.length; i++) a[i] = "";

        int x = 0;
        int d = 1;

        for (int i = 0; i < s.length(); i++) {
            a[x] += s.charAt(i);
            if (x == 0) d = 1;
            else if (x == r - 1) d = -1;
            x += d;
        }

        String ans = "";
        for (int i = 0; i < a.length; i++) ans += a[i];
        return ans;
    }
}