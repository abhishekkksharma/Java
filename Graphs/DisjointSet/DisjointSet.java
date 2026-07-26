package Graphs.DisjointSet;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private List<Integer> rank;
    private List<Integer> parent;

    public DisjointSet(int n) {
        this.rank=new ArrayList<>();
        this.parent=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
        }
    }

    public int findUltimateParent(int node) {
        if (node == parent.get(node))
            return node;
        int upperLevelParent = findUltimateParent(parent.get(node));
        parent.set(node, upperLevelParent);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int upl_u = findUltimateParent(u);
        int upl_v = findUltimateParent(v);

        if (upl_u == upl_v)
            return;
        if (rank.get(upl_u) < rank.get(upl_v)) {
            // smaller guy will be attached to bigger guy
            parent.set(upl_u, upl_v);
        } else if (rank.get(upl_v) < rank.get(upl_u)) {
            // smaller guy will be attached to bigger guy
            parent.set(upl_v, upl_u);
        } else {
            // if same rank, attach any one to the other
            parent.set(upl_v, upl_u);
            int rankU = rank.get(upl_u);
            rank.set(upl_u, rankU + 1);
        }
    }

    public static void main(String[] args) {
        DisjointSet ds =new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

        ds.unionByRank(3, 7);
        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}
