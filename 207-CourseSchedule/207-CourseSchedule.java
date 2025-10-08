// Last updated: 8/10/2025, 10:36:29 am
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     List<List<Integer>> adj=new ArrayList<>();
     for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
     }
     for(int [] p:prerequisites){
        adj.get(p[1]).add(p[0]);    
     }
     boolean []visited=new boolean[numCourses];
     boolean []inrecursion=new boolean[numCourses];
     for(int i=0;i<numCourses;i++){
        if(!visited[i] && cycle(adj,visited,inrecursion,i)){
            return false;
        }
     }
     return true;
    }
    public boolean cycle(List<List<Integer>> adj,boolean [] visited,boolean [] inRecursion,int v){
        visited[v]=true;
        inRecursion[v]=true;
        for(int i:adj.get(v)){
            if(visited[i]==false && cycle(adj,visited,inRecursion,i)){
                return true;
            }
            else if (inRecursion[i]==true){
                return true;
            }
        }
        inRecursion[v]=false;
        return false;
    }
}