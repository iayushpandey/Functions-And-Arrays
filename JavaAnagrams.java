static boolean isAnagram(String s1, String s2) {
       if(s1.length()!=s2.length()){
           return false;
       }
       char[]a= s1.toLowerCase().toCharArray();
       char[]b= s2.toLowerCase().toCharArray();
       boolean anagram=true;
      java.util.Arrays.sort(a);
      java.util.Arrays.sort(b);
       
       for(int i =0;i<a.length;i++){
           if(a[i]!=b[i]){
               anagram=false;
           }
       }
       return anagram;
    }
