package DSAQuestions.graphs;


import java.util.ArrayList;
import java.util.List;

public class Solution {

   /* boolean dfs(int i, List<List<Integer>>graph , boolean[] visiting, boolean[] visited){
        visiting[i]=true;

        for(int neighbor: graph.get(i)){ // visiting neighbors
            if(visited[neighbor]==true)
                return false;
            else{
                visiting[neighbor]=true;
                if(!dfs(neighbor, graph, visiting, visited)){
                    return false;
                }
            }
        }
        visiting[i]=false;
        visited[i]=true;
        return true;
    }*/

    boolean dfs(int i, List<List<Integer>>graph , boolean[] visiting, boolean[] visited){
        visiting[i]=true;

        for(int neighbor: graph.get(i)){ // visiting neighbors
            if(visiting[neighbor]==true)
                return false;

            if(visited[neighbor]==false){
                if(!dfs(neighbor, graph, visiting, visited)){
                    return false;
                }
            }
        }

        visiting[i]=false;
        visited[i]=true;
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph = new ArrayList<>();
        int n = numCourses;

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] prerequisite: prerequisites){
            int u= prerequisite[0]; int v = prerequisite[1];// directed edge from v -- to --> u
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n]; //default false all;
        boolean[] visiting = new boolean[n];

        //since there can be disconnected comps
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                if(!dfs(i, graph, visiting, visited)){
                    return false; //cycle found
                }
            }
        }
        return true;

    }
}
