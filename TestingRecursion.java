// Carlos Lopez 
//5/3/26
//Testing recursion 

public class TestingRecursion {  

public static int countHi2(String str) {

    // Base case
     if(str.length() < 1) {
        return 0 ;
     }  


    // check if the first 2 letters are h and i and no x before it 
    char firstLetter = str.charAt(0) ;
     char secondLetter = str.charAt( 1) ;  
    char thirdLetter = str.charAt(2) ;

      if (firstLetter != 'x' && secondLetter == 'h' && thirdLetter == 'i') {  
        return 1 + countHi2( str.substring( 3)) ;
        
        
      }



return countHi2(str.substring( 1)) ;
}







public static int strCount(String str, String sub) { 

if(str.length() <sub.length()) {

     return 0; 
}  

if(str.substring( 0, sub.length()).equals(sub))
    return 1 + strCount(str.substring(sub.length()),sub); 
else 
    return strCount(str.substring(1), sub) ;


} 

    
    // Test recursion #3 

public static int count8(int n) {
    if (n == 8) {
        return 0;
    }

    if(n< 10)
        if(n==8) 
            return 1;
        else 
            return 0; 


    int onesPlace = n % 10;
    int rest = count8(n / 10);

    if (onesPlace == 8) {
        if ((n / 10) % 10 == 8) {
            return 2 + rest;
        }
        return 1 + rest;
    }

    return rest;
}
       

    
                    
                
        //TestRecursion #2 

    public static String stringClean(String str) {
        // Base case
        if (str.length() == 1) {
            return str;
        }

         // Loop at the first and second letters to see if they match
        char firstLetter = str.charAt(0);
        char secondLetter = str.charAt(1);

        if(firstLetter == secondLetter) {
        // Take out first letter 
        return stringClean(str.substring(1)); 
        }
    return firstLetter + stringClean(str.substring(1)); 
    }


    // Recurstion test #1
    
public static int countHi(String str) { 
    
  // Base case 
     if(str.length() <= 1 ) {
        return 0;  
     }
    // Testing for null
    if( str== null) {
        return 0; 
    }
 // check if the first 2 letters are h and i

  char firstLetter = str.charAt(0);
  char secondLetter = str.charAt(1);

if(firstLetter == 'h' && secondLetter == 'i'){
    // found a hi and make it count and take it out the string 
    return 1 + countHi(str.substring(2)); 
    
}

 return countHi(str.substring(1));
} 

public static void main (String [] args) {
//  TestRecursion1 
// System.out.println(countHi("xxhixxhixhi"));
// TestRecursion2 
// //System.out.println(stringClean("aabbcc")) ;

// TestRecursion 3 
//  //System.out.println(count8(8818)); 
//  Testrecursion 4
// // System.out.println(strCount("catcowcat" , "cat"))   
System.out.println(countHi2("hihixhiHIhixhihi ")) ;
    }
}


