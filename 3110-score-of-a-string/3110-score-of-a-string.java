class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
            // char c = s.charAt(i);
            // char c1 = s.charAt(j);
            // int asciiValue = (int) c;
            // int asciiValue1 = (int) c1;
            // score = Math.abs(asciiValue - asciiValue1);

        }
        return score;
    }
}