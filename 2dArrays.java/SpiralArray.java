public class SpiralArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        get_spiralMatrix(arr);
    }
    public static void get_spiralMatrix(int arr[][]){
     int startRow =0;
     int startCol = 0;
     int endRow = arr.length-1;
     int endCol = arr[0].length-1;

     while(startRow <= endRow && startCol <= endCol){

        // top row..
        for(int i=startCol; i<= endCol; i++){
            System.out.print(arr[startRow][i]+" ");
        }

        // right column...
        for(int j = startRow+1; j<=endRow; j++){
            System.out.print(arr[j][endCol]+" ");
        }

        //bottom row...
        for(int i=endCol-1; i>=startCol; i--){
            if(startRow== endRow){
                break;
            }
            System.out.print(arr[endRow][i]+" ");
        }

        //left column...
        for(int j= endRow-1; j>=startRow+1; j--){
             if(startCol== endCol){
                break;
            }
            System.out.print(arr[j][startCol]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
     }
     System.out.println();
    }
}
