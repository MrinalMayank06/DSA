package algorithm;

import java.util.Arrays;

public class Boyer_mooreAlgo {
    private final int R;
    private int[] right;
    private String pat;

    public Boyer_mooreAlgo(String pat) {
        this.R = 256;
        this.pat = pat;

        right = new int[R];
        Arrays.fill(right, -1);
        for (int j = 0; j < pat.length(); j++) {
            right[pat.charAt(j)] = j;
        }
    }

    public void search(String txt) {
        int M = pat.length();
        int N = txt.length();
        int skip;

        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = Math.max(1, j - right[txt.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                System.out.println("Pattern found at index " + i);
                skip = 1;
            }
        }
    }

    public static void main(String[] args) {
        String txt1 = "THIS IS A TEST TEXT";
        String pat1 = "TEST";
        Boyer_mooreAlgo bm1 = new Boyer_mooreAlgo(pat1);
        bm1.search(txt1);

        String txt2 = "AABAACAADAABAABA";
        String pat2 = "AABA";
        Boyer_mooreAlgo bm2 = new Boyer_mooreAlgo(pat2);
        bm2.search(txt2);
    }
}
