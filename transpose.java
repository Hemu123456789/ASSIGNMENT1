public class Main
{
    public static void main(String[] args) {
         //2-d array initialised with values    
        int[][] intArray = { { 1, 2 }, { 4,5 },{8,9}}; 
        //print the array
        System.out.println("Initialized Two dimensional array:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 2; j++) { 
            System.out.print(intArray [i][j] + " "); 
            } 
 
            System.out.println(); 
        } 
    }
}
