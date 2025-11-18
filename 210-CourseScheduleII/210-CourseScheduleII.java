// Last updated: 18/11/2025, 11:05:39 pm
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     List<List<Integer>> adj=new ArrayList<>();
     for(int i=0;i<numCourses;i++){
        adj.add(new ArrayList<>());
     }
     for(int [] p:prerequisites){
        adj.get(p[1]).add(p[0]);    
     }
     int [] ans=new int [numCourses];
     int [] in=indegree(adj);
     Queue<Integer> q=new LinkedList<>();
     for(int i=0;i<in.length;i++){
        if(in[i]==0){
            q.add(i);
        }
     }
     int f=0;
     while(!q.isEmpty()){
        int r=q.poll();
        ans[f]=r;
        f++;
        for(int nbrs:adj.get(r)){
            in[nbrs]--;
            if(in[nbrs]==0){
                q.add(nbrs);
            }
        }
     }
     if (f != numCourses) return new int[0];
     return ans;
    }
    public int [] indegree(List<List<Integer>> adj){
        int [] in=new int [adj.size()];
        for(List<Integer> ll:adj){
            for(int i:ll){
                in[i]++;
            }
        }
       return in;
    }
}