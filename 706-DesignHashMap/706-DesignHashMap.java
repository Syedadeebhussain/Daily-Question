// Last updated: 3/2/2026, 2:44:40 pm
1class MyHashMap {
2     class Node{
3        int key ;
4        int value;
5        Node next;
6     }
7     private int size=0;
8     ArrayList<Node> bkt=new ArrayList<>();
9    public MyHashMap() {
10        for(int i=0;i<4;i++){
11            bkt.add(null);
12        }
13    }
14     public int hashcode(int key){// hash code
15        int idx=key % bkt.size();
16        if(idx<0){
17            idx+=bkt.size();
18        }
19        return idx;
20    }
21    public void put(int key, int value) {
22        int idx=hashcode(key);
23        Node temp=bkt.get(idx);
24        while(temp!=null){
25            if(temp.key==key){
26                temp.value=value;
27                return ;
28            }
29            temp=temp.next;
30        }
31        Node nn=new Node();
32        nn.key=key;
33        nn.value=value;
34        temp=bkt.get(idx);
35        nn.next=temp;
36        bkt.set(idx,nn);
37        size++;
38        double lf=(1.0*size)/bkt.size();
39        if(lf>2.0){
40            rehashing();
41        }
42    }
43    public void rehashing(){
44        ArrayList<Node> new_bkt=new ArrayList<>();
45        for(int i=0;i<2*bkt.size();i++){
46            new_bkt.add(null);
47        } 
48        ArrayList<Node> old=bkt;
49        bkt=new_bkt;
50        size=0;
51        for (Node head : old) {
52            while (head != null) {
53                put(head.key, head.value);
54                head = head.next;
55            }
56        }
57    }
58   
59    public int get(int key) {
60        int idx=hashcode(key);
61        Node temp=bkt.get(idx);
62        while(temp!=null){
63            if(temp.key==key){
64                return temp.value;
65            }
66            temp=temp.next;
67        }
68        return -1;
69    }
70    
71    public void remove(int key) {
72        int idx=hashcode(key);
73        Node curr=bkt.get(idx);
74        Node prev=null;
75        while(curr!=null){
76            if(curr.key==key){
77                break;
78            }
79            prev=curr;
80            curr=curr.next;
81        }
82        if(curr==null) return ;
83        else if(prev==null){
84        bkt.set(idx,curr.next);
85        }
86        else{
87            prev.next=curr.next;
88        }
89        curr.next=null;
90        size--;
91    }
92}
93
94/**
95 * Your MyHashMap object will be instantiated and called as such:
96 * MyHashMap obj = new MyHashMap();
97 * obj.put(key,value);
98 * int param_2 = obj.get(key);
99 * obj.remove(key);
100 */