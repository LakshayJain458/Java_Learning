public class LL1 {
    node head;
    private int size;
    LL1(){
        this.size=0;
    }
    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void printlist() {
        if(head==null){
            System.out.println("list is empty");
        }
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node secondlast=head;
        node lastnode=head.next;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getsize(){
        return size;
    }
    public void reverseiterate(){
        if(head==null || head.next==null){
            return;
        }
        node prevnode=head;
        node currnode= head.next;
        while(currnode!=null){
            node nextnode=currnode.next;
            currnode.next=prevnode;
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
    }
    public node reverserecursive(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newhead=reverserecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("sex");
        list.addLast("good");
        list.addLast("thing");
        list.printlist();
//        list.printlist();
//        list.deleteFirst();
//        list.printlist();
//        list.deleteLast();
//        list.printlist();
//        System.out.println(list.getsize());
//        list.reverseiterate();
        list.head=list.reverserecursive(list.head);
        list.printlist();
    }
}
