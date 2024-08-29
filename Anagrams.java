static boolean isAnagram(String a, String b) {
        // Complete the function
         int alen=a.length();
        int blen=b.length();
          a = a.toLowerCase();
          b = b.toLowerCase();
        if(alen!=blen){
            return false;
        }else {
      char[] A=a.toCharArray();
      char[] B=b.toCharArray();
       java.util.Arrays.sort(A);
       java.util.Arrays.sort(B);
       return java.util.Arrays.equals(A, B);
        }
 }

