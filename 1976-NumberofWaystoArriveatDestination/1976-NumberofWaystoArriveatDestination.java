// Last updated: 4/1/2026, 12:03:29 pm
class Solution {
    class Pair{
        long distance;
        int node;
        
        public Pair(long distance, int node){
            this.distance= distance;
            this.node= node;
           
        }
    }
    class Graph{
        int v ;
        int wt;
        public Graph(int v, int wt){
            this.v=v;
            this.wt = wt;
        }
    }
    public int countPaths(int n, int[][] roads) {
    
    
     int MOD = 1000000007;
     List<List<Graph>> graph = new ArrayList<>();
     for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
     }
     for(int i=0;i<roads.length;i++){
        int u= roads[i][0];
        int v = roads[i][1];
        int wt = roads[i][2];
        graph.get(u).add(new Graph(v,wt));
        graph.get(v).add(new Graph(u,wt));

     }
     PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> Long.compare(x.distance , y.distance));
    pq.add(new Pair(0,0));
    long dist[]= new long[n];
    long ways[]= new long[n];
    ways[0]=1;
    for(int i=0;i<n;i++){
        dist[i]=(long)(1e18); //1e18 since long max
    }
    dist[0]=0;
    // int ways =0;
     while(!pq.isEmpty()){
        Pair p = pq.poll();
        long distance= p.distance;
        int node =p.node;
        if(distance>dist[node]) continue; ///imp line
        
        for(Graph g :graph.get(node)){
            int v = g.v;
            long edgewt = g.wt;
            long newWt = distance + edgewt;
            if(newWt <dist[v]) {
                dist[v]= newWt;
                ways[v]=ways[node];
                pq.add(new Pair(newWt, v));
                // ans=ways;
            }
            else if(newWt ==dist[v]){
                ways[v]=(ways[node]+ways[v])%MOD;
            }
        }
     }
     return (int)(ways[n - 1] % MOD);
    }
}