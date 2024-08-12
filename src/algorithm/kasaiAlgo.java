package algorithm;

import java.util.Arrays;

public class kasaiAlgo {
    private static int[] buildsuffixArray(String s){
        int n = s.length();
        Integer[] suffixArr = new Integer[n];
        for (int i =0; i< n; i++){
            suffixArr[i] =i;
        }
        Arrays.sort(suffixArr,(a,b) -> s.substring(a).compareTo(s.substring(b)));
        int[] suffixArray = new int[n];
        for (int i =0; i< n; i++){
            suffixArray[i] = suffixArr[i];
        }
        return suffixArray;
    }
    public static int[] buildLCPArray(String s,int[] suffixArray){
        int n =s.length();
        int[] rank = new int[n];
        int[] lcp = new int[n];

        for (int i = 0; i<n; i++){
            rank[suffixArray[i]] =i;
        }
        int h =0;
        for (int i = 0; i<n; i++){
            if(rank[i]>0){
                int j = suffixArray[rank[i] - 1];
                while (i+h<n&&j+h<n&&s.charAt(i+h)== s.charAt(j+h)){
                    h++;
                }
                lcp[rank[i]] = h;
                if (h>0){
                    h--;
                }
            }
        }
        return lcp;
    }


    public static void main(String[] args) {
String text = "banana";

int[] suffixArray = buildsuffixArray(text);
        System.out.println("Suffix Array: "+Arrays.toString(suffixArray));

        int[] lcpArray = buildLCPArray(text, suffixArray);
        System.out.println("LCP Array: "+ Arrays.toString(lcpArray));

    }
}
