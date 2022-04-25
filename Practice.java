import java.util.Arrays;
import java.util.List;
public class Practice {
	
	 public static void main (String[] args) {
        int[][] arr = {{0,1,1,0},{0,1,0,0},{1,0,0,0}};
        boolean allZombi = false;
        int[][] swipearr= new int[arr.length][arr[0].length];
        int result = 0;
        do {
            int temp =0;
            for(int i=0; i< arr.length; i++)
            {
                for(int j=0; j< arr[i].length; j++){
                    // if zombi found
                   if(arr[i][j] == 1){
                        // replace adjacent 0 to 1
                        // check for array out of bound at right side
                        System.out.println("Zombilocation in original:"+i+","+j);
                        swipearr[i][j] =1;
                        if(j+1 < arr[i].length){
                            System.out.println("going right i,j ["+i+","+j+"]");
                            swipearr[i][j+1] = 1;
                        } if(j-1 >=0)// search left
                       {
                        System.out.println("going left :: i,j ["+i+","+j+"]");
                        swipearr[i][j-1] = 1;
                       } if(i-1 >= 0) // search for up
                       {
                        System.out.println("going up :: i,j ["+i+","+j+"]");
                           swipearr[i-1][j] =1;
                       } if(i+1 < arr.length) // search for down
                       {
                        System.out.println("going down :: i,j ["+i+","+j+"]");
                        swipearr[i+1][j] =1;
                       }
                    }
                    
                }
            }
            for(int i=0; i<swipearr.length; i++)
                for(int j=0; j<swipearr[i].length; j++)
                    arr[i][j] = swipearr[i][j];
            // logic to get all zombi or not!
            if(temp == 0){
                allZombi= true;
            }else{
                allZombi = false;
            }
            result++;
        } while (!allZombi);// !allZombi
        System.out.println("result :: "+ result);
	}
}