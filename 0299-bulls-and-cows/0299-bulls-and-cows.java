class Solution {
    public String getHint(String secret, String guess) {
        String s="";
        int bull =0,cow=0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            } else {
                s += secret.charAt(i);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                String ch = String.valueOf(guess.charAt(i));
                if (s.contains(ch)) {
                    cow++;
                    s = s.replaceFirst(ch, "");
                }
            }
        }
        return bull+"A"+cow+"B";
    }
}