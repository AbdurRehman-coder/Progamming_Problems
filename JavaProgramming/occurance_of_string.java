package JavaProgramming;

public class occurance_of_string {
    //Function to locate the occurrence of the string x in the string s.
static int strstr(String mainString, String subString)
{
     //Your code here

    //  int sLength = s.length();
    //  int xLength = x.length();
   
    //     for(int i=0;i<= sLength-xLength;i++){
    //       String temp=s.substring(i,i+xLength);
    //       if(temp.equals(x)){
    //           return i;
    //       }
          
    //   }
    //  return -1;
      
    /// find occurance of string without built_in function
     int N = mainString.length();
     int M = subString.length();

     // outer loop to loop through the main string
     for( int i = 0; i <= N - M; i++){
        int j;
         /// inner loop; to loop through the substring and trying matching them
         for(  j = 0; j <= M; j++){
             System.out.println(("J = " + j +  "  M = " +  M));
            
            if (mainString.charAt(i + j) != subString.charAt(j))
                break;
                // return -1;
            /// when it reach here mean s2 is substring of s1
            if(j == M){
                System.out.println("J = " + j +  "  M = " +  M);
                return i;
            }
         } 
        
     }
     return -1;
}

public static void main(String[] args) {
    int index = strstr("GeeksForGeeks", "For");
    System.out.println("index: " + index );


    // finding the first index of subString if it contains in the main string,
    // using built_in function .indexOf
    System.out.println("FastFood".indexOf("Food"));
}
}
