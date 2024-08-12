package algorithm;

public class KMPAlgo {

    void computePSArray(String pat,int M,int lps[]){
        int length = 0;
        int i =1;
        lps[0] =0;

        while (i < M){
            if (pat.charAt(i)==pat.charAt(length)){
                length++;
                lps[i] =length;
                i++;
            }else{
                if (length != 0){
                    length = lps[length-1];
                }else {
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    void KMPSearch(String pat,String txt){
        int M =pat.length();
        int N =txt.length();

        int lps[] = new int[M];
       computePSArray(pat,M,lps);

       int i= 0;
       int j= 0;

       while (i < N){
           if (pat.charAt(j) == txt.charAt(i)){
               i++;
               j++;
           }
           if (j==M){
               System.out.println("Pattern found at index "+(i-j));
               j = lps[j-1];
           } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
               if (j != 0){
                   j = lps[j - 1];
               }
               else {
                   i++;
               }
           }
       }
    }
    public  static void main(String[] args) {
String txt1 ="this is a test text";
String pat1 ="test";
new  KMPAlgo().KMPSearch(pat1,txt1);


String txt2 ="this is a tasty tati";
String pat2 ="tati";
new  KMPAlgo().KMPSearch(pat2,txt2);



    }
}





















