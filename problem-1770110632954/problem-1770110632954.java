// Last updated: 3/2/2026, 2:53:52 pm
1class MyHashSet {
2    class Node{
3        int key ;
4        Node next;
5     }
6     private int size=0;
7     ArrayList<Node> bkt=new ArrayList<>();
8    public MyHashSet() {
9        for(int i=0;i<4;i++){
10            bkt.add(null);
11        }
12    }
13    public int hashcode(int key){// hash code
14        int idx=key % bkt.size();
15        if(idx<0){
16            idx+=bkt.size();
17        }
18        return idx;
19    }
20    public void add(int key) {
21          int idx=hashcode(key);
22        Node temp=bkt.get(idx);
23        while(temp!=null){
24            if(temp.key==key)return;
25            temp=temp.next;
26        }
27        Node nn=new Node();
28        nn.key=key;
29        temp=bkt.get(idx);
30        nn.next=temp;
31        bkt.set(idx,nn);
32        size++;
33        double lf=(1.0*size)/bkt.size();
34        if(lf>2.0){
35            rehashing();
36        }
37    }
38    
39     public void rehashing(){
40        ArrayList<Node> new_bkt=new ArrayList<>();
41        for(int i=0;i<2*bkt.size();i++){
42            new_bkt.add(null);
43        } 
44        ArrayList<Node> old=bkt;
45        bkt=new_bkt;
46        size=0;
47        for (Node head : old) {
48            while (head != null) {
49                add(head.key);
50                head = head.next;
51            }
52        }
53    }
54    public void remove(int key) {
55         int idx=hashcode(key);
56        Node curr=bkt.get(idx);
57        Node prev=null;
58        while(curr!=null){
59            if(curr.key==key){
60                break;
61            }
62            prev=curr;
63            curr=curr.next;
64        }
65        if(curr==null) return ;
66        else if(prev==null){
67        bkt.set(idx,curr.next);
68        }
69        else{
70            prev.next=curr.next;
71        }
72        curr.next=null;
73        size--;
74    }
75    
76    public boolean contains(int key) {
77        int idx=hashcode(key);
78        Node temp=bkt.get(idx);
79        while(temp!=null){
80            if(temp.key==key){
81                return true;
82            }
83            temp=temp.next;
84        }
85        return false;
86    }
87}
88
89/**
90 * Your MyHashSet object will be instantiated and called as such:
91 * MyHashSet obj = new MyHashSet();
92 * obj.add(key);
93 * obj.remove(key);
94 * boolean param_3 = obj.contains(key);
95 */