// Last updated: 12/3/2026, 11:08:42 pm
1class NumArray {
2    int [] tree;
3    int [] nums;
4    public NumArray(int[] nums) {
5        this.nums=nums;
6        tree=new int[nums.length*4];
7        build(1,0,nums.length-1,nums);
8    }
9    public void build(int node,int start,int end,int []arr){
10        if(start==end){
11            tree[node]=arr[start];
12            return ;
13        }
14        int mid=(start+end)/2;
15        build(2*node,start,mid,arr);
16        build(2*node+1,mid+1,end,arr);
17        tree[node]=tree[2*node]+tree[2*node+1];
18    }
19    
20    public void update(int index, int val) {
21         upda(1,0,nums.length-1,index,val);
22    }
23    public void upda(int node,int start,int end,int idx,int val){
24        if(start==end){
25            tree[node]=val;
26            return ;
27        }
28        int mid=(start+end)/2;
29        if(idx<=mid){
30            upda(2*node,start,mid,idx,val);
31        }
32        else{
33            upda(2*node+1,mid+1,end,idx,val);
34        }
35        tree[node]=tree[2*node]+tree[2*node+1];
36    }
37    
38    public int sumRange(int left, int right) {
39       return sum(1,0,nums.length-1,left,right);
40    }
41    public int sum(int node,int start,int end,int l,int r){
42        if(r<start || l>end){
43            return 0;
44        }
45        if(l<=start && end<=r){
46            return tree[node];
47        }
48        int mid=(start+end)/2;
49        int left=sum(2*node,start,mid,l,r);
50        int right=sum(2*node+1,mid+1,end,l,r);
51        return left+right;
52    }
53}
54
55/**
56 * Your NumArray object will be instantiated and called as such:
57 * NumArray obj = new NumArray(nums);
58 * obj.update(index,val);
59 * int param_2 = obj.sumRange(left,right);
60 */