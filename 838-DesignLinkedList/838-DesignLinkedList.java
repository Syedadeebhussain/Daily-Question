// Last updated: 31/7/2025, 2:25:17 pm
class MyLinkedList {
     static class Node{
            int val;
            Node next;
         public Node(int val) {
            this.val = val;
            this.next = null;
        }
}
        private Node head;
          private Node tail;
            private int size;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
    if (index < 0 || index >= size) return -1;
      Node temp=head;
      for(int i=0;i<index;i++){
        temp=temp.next;
      }
      return temp.val; 
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(size==0){
            addAtHead(val);
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
        
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if(index==0)
        {
         addAtHead(val);
         return ;
        }
        else if(index==size){
            addAtTail( val);
            return ;
        }
        else
        {
          Node temp=head;
            for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
            }
            Node nn=new Node(val);
            nn.next=temp.next;
            temp.next=nn;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (size == 1) tail = null;
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if (index == size - 1) tail = temp;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */