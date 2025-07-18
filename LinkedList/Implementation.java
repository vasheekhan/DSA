
class Implementation {

    public static class LinkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }

        // public  void displayr() {
        //     if (head == null) {
        //         return;
        //     }
        //     System.out.print(head.data + "->");
        // }
        public void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                size++;
                return;
            }
            temp.next = head;
            head = temp;
            size++;
        }
      public void deleteAtIndex(int idx) {
    if (idx < 0 || idx >= size) {
        System.out.println("Invalid index " + idx);
        return;
    }

    // Deleting head
    if (idx == 0) {
        head = head.next;
        // If list becomes empty, update tail as well
        if (head == null) {
            tail = null;
        }
        size--;
        return;
    }

    // Traverse to (idx - 1)th node
    Node prev = head;
    for (int i = 0; i < idx - 1; i++) {
        prev = prev.next;
    }

    // If deleting tail
    if (idx == size - 1) {
        prev.next = null;
        tail = prev;
    } else {
        prev.next = prev.next.next;
    }

    size--;
}
        public void insertAtGivenIndex(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Index " + idx);
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
            } else if (idx == size) {
                insertAtEnd(val);
            } else {
                Node temp = new Node(val);
                Node curr = head;
                for (int i = 0; i < idx - 1; i++) {
                    curr = curr.next;
                }
                temp.next = curr.next;
                curr.next = temp;
                size++;
            }
        }

        public int getAt(int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Index" + idx);
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);
        l1.insertAtHead(3);
        l1.insertAtGivenIndex(2, 0);
    //    l1.deleteAtIndex(2);

        l1.display();
        // System.out.println(l1.getAt(2));
        // System.out.println(l1.size);
        //  System.out.println(l1.head.data);
        //  System.out.println(l1.tail.data);
    }
}
