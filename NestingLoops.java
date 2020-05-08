public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"

        //Answer to #1
        // n is going faster
        for ( char c='A'; c <= 'E'; c++ )
        {
            for ( int n=1; n <= 3; n++ )
            {
                System.out.println( c + " " + n );
            }
        }
        //Answer to number #2
        //Now the numbers are repeating 3 times and the letter are showing in sequential order
        for (int n=1; n<=3; n++){

            for(char c='A'; c <= 'E'; c++){

                System.out.println(c + " " + n);

            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                //Answer to question #3
                //When using println each iteration is not on its on line, instead of inline
                System.out.print( a + "-" + b + " " );
                // System.out.println(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            //Answer to question #4
            //The code is now arranged by the three iterations of the outer loop and also on their own line.
            System.out.println();
        }

        System.out.println("\n");
    }
}