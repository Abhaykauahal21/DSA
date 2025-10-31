class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }

        int i = 0;
        int row = 0;
        boolean down = true;  // direction flag

        while (i < s.length()) {
            ans[row] += s.charAt(i);

            if (row == 0) down = true;
            if (row == numRows - 1) down = false;

            row += (down ? 1 : -1);
            i++;
        }

        StringBuilder res = new StringBuilder();
        for (String str : ans) {
            res.append(str);
        }

        return res.toString();
    }
}