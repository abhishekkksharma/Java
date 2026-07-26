package Graphs.Representation;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        int n=3,m=3;
        // n-vertices m-edges 
        int[][] matrix=new int[n+1][n+1];
        
        //edge 1--2
        matrix[1][2]=1;
        matrix[2][1]=1;

        //edge 2--3
        matrix[2][3]=1;
        matrix[3][2]=1;

        //edge 1--3
        matrix[1][3]=1;
        matrix[3][1]=1;
        /*
            0 1 1
            1 0 1
            1 1 0
        */
       // This takes O(nxn) space which is not optimal so we use arraylist
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       //add n+1 lists in the original list
       for(int i=0;i<=n;i++){
        list.add(new ArrayList<>());
       }
       // edge 1--2
       list.get(1).add(2);
       list.get(2).add(1);

       // edge 2--3
       list.get(2).add(3);
       list.get(3).add(2);

       //edge 1--3
       list.get(1).add(3);
       list.get(3).add(1);

    }
}
