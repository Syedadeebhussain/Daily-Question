// Last updated: 3/2/2026, 11:05:34 am
1class MyCircularQueue {
2    int [] arr;
3    int front;
4    int size;
5    public MyCircularQueue(int k) {
6         arr=new int[k];
7         front=0;
8         size=0;
9    }
10    public boolean enQueue(int value) {
11        if(isFull()) return false;
12        arr[(front+size)%arr.length]=value;
13        size++;
14        return true;
15    }
16    
17    public boolean deQueue() {
18        if(isEmpty()) return false;
19        front=(front+1)%arr.length;
20        size--;
21        return true;
22    }
23    
24    public int Front() {
25        if(isEmpty()) return -1;
26        int ans=arr[front];
27        return ans;
28    }
29    
30    public int Rear() {
31        if(isEmpty()) return -1;
32        return arr[(front+size-1)%arr.length];
33    }
34    
35    public boolean isEmpty() {
36        return size==0;
37    }
38    
39    public boolean isFull() {
40        return size==arr.length;
41    }
42}
43
44/**
45 * Your MyCircularQueue object will be instantiated and called as such:
46 * MyCircularQueue obj = new MyCircularQueue(k);
47 * boolean param_1 = obj.enQueue(value);
48 * boolean param_2 = obj.deQueue();
49 * int param_3 = obj.Front();
50 * int param_4 = obj.Rear();
51 * boolean param_5 = obj.isEmpty();
52 * boolean param_6 = obj.isFull();
53 */