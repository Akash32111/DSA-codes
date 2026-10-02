class Solution {
    public int reverseDegree(String s) {
        int value = 0, count = 1;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a') {
                value += 26 * count;
            } else if (ch == 'b') {
                value += 25 * count;
            } else if (ch == 'c') {
                value += 24 * count;
            } else if (ch == 'd') {
                value += 23 * count;
            } else if (ch == 'e') {
                value += 22 * count;
            } else if (ch == 'f') {
                value += 21 * count;
            } else if (ch == 'g') {
                value += 20 * count;
            } else if (ch == 'h') {
                value += 19 * count;
            } else if (ch == 'i') {
                value += 18 * count;
            } else if (ch == 'j') {
                value += 17 * count;
            } else if (ch == 'k') {
                value += 16 * count;
            } else if (ch == 'l') {
                value += 15 * count;
            } else if (ch == 'm') {
                value += 14 * count;
            } else if (ch == 'n') {
                value += 13 * count;
            } else if (ch == 'o') {
                value += 12 * count;
            } else if (ch == 'p') {
                value += 11 * count;
            } else if (ch == 'q') {
                value += 10 * count;
            } else if (ch == 'r') {
                value += 9 * count;
            } else if (ch == 's') {
                value += 8 * count;
            } else if (ch == 't') {
                value += 7 * count;
            } else if (ch == 'u') {
                value += 6 * count;
            } else if (ch == 'v') {
                value += 5 * count;
            } else if (ch == 'w') {
                value += 4 * count;
            } else if (ch == 'x') {
                value += 3 * count;
            } else if (ch == 'y') {
                value += 2 * count;
            } else if (ch == 'z') {
                value += 1 * count;
            }
            count++;
        }
        return value;
    }
}