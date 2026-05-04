      import org.junit.Test;
    import static org.junit.Assert.*;

     public class TestUnit {
        @Test
        public void testCountHi() {
         assertEquals(1 , TestingRecursion.countHi("xxhixx") );
    }
        @Test
         public void testCountHi2() {
         assertEquals(1 , TestingRecursion.countHi("xxhixx") );
    }
           @Test
         public void testCountHi3() {
         assertEquals(4 , TestingRecursion.countHi("xxhixxhixxhihi") );
    }
            @Test
         public void testCountHi4() {
         assertEquals(2 , TestingRecursion.countHi("xxhixxhi") );
    }
                @Test
         public void testCountHi5() {
         assertEquals(0 , TestingRecursion.countHi("") );
    }
    
        

    // This is for the second recursion test
    
                @Test
        public void stringClean() {
       
         assertEquals("abcd", TestingRecursion.stringClean("aabbccdd") );
    }
          @Test
        public void stringClean2() {
       
         assertEquals("abcd", TestingRecursion.stringClean("aaaaaabbccddd") );
    }

          @Test
        public void stringClean3() {
       
         assertEquals("abcd", TestingRecursion.stringClean("aabbbbbccd") );
    }

          @Test
        public void stringClean4() {
       
         assertEquals("abcd", TestingRecursion.stringClean("aaaaaaaabbbbbbccccccccddd") );
    }

      @Test
        public void stringClean5() {
       
         assertEquals("abcd", TestingRecursion.stringClean("aaaaaaaabbbbbbccccccccddd") );
    }    

     // This is for the third recursion test


// This is for the fourth recursion test
     
          @Test
        public void strCount() {
     assertEquals(  2, TestingRecursion.strCount("catcowcat" , "cat") ) ;
        

        }

       @Test
        public void strCount2() {
     assertEquals( 1, TestingRecursion.strCount("catcowcat" , "cow") ) ;

        }
       @Test
        public void strCount3() {
     assertEquals( 0, TestingRecursion.strCount("catcowcat" , "dog") ) ;
        }

       @Test
        public void strCount4() {
     assertEquals(  0, TestingRecursion.strCount("catcowcat" , "fish") ) ;
        }

       @Test
        public void strCount5() {
     assertEquals( 0, TestingRecursion.strCount("catcowcat" , "rat") ) ;
        } 

     // This is for the fifth recursion test   

            @Test
        public void countHi2() {
     assertEquals( 4, TestingRecursion.countHi2("hihixhiHihixhi" ) ) ;
        } 

         @Test
        public void countHi2_2() {
     assertEquals( 3, TestingRecursion.countHi2("hixhihixhi" ) ) ;
        } 


         @Test
        public void countHi2_3() {
     assertEquals( 2, TestingRecursion.countHi2("hihixhiHixhihhi" ) ) ;
        } 


          

         @Test
        public void countHi2_4() {
     assertEquals( 3, TestingRecursion.countHi2("hihixhixhixhiHihiHIhi" ) ) ;
        } 


         @Test
        public void countHi2_5() {
     assertEquals( 2, TestingRecursion.countHi2("hihihixhiHIxhiHIhi" ) ) ;
        } 



     }    // End the recursion tests  

