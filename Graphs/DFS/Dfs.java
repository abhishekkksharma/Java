package Graphs.DFS;

import java.util.ArrayList;

public class Dfs {
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] visited=new int[adj.size()];
        visited[0]=1;
        ArrayList<Integer> ans= new ArrayList<>();
        dfsHelper(adj,ans,0,visited);
        return ans;
        
    }
    static void dfsHelper(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans, int curr, int[] visited){
        visited[curr]=1;
        ans.add(curr);
        for(int i=0;i<adj.get(curr).size();i++){
            int temp=adj.get(curr).get(i);
            if(visited[temp]==0){
                dfsHelper(adj,ans,temp,visited);
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        // adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]
        for (int i = 0; i < 5; i++) {
        adj.add(new ArrayList<>());
    }

    adj.get(0).add(2);
    adj.get(0).add(3);
    adj.get(0).add(1);

    adj.get(1).add(0);

    adj.get(2).add(0);
    adj.get(2).add(4);

    adj.get(3).add(0);

    adj.get(4).add(2);

    ArrayList<Integer> list = dfs(adj);
    System.out.println(list);

    }
}
