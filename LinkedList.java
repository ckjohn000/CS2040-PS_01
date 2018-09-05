/**
 * LinkedList
 * Description:  linked list implementation
 * CS2040 2018
 */


/**
 * Class: LinkedList
 * Description: linked list implementation
 * All the elements in the list are integers >= 0.
 */

public class LinkedList implements List {

    protected class Node {
        protected int data;
        protected Node next;

        public Node()
        {
            data = 0;
            next = null;
        }

        public Node(int data, Node n) {
            //todo
            this.data = data;
            next = n;
        }
    };

    protected Node head;

    public LinkedList() {
        head = null;
    }


    /**
     * Method: add appends a new integer to the end of the list
     * @param key the integer to add to the list
     * @return true if the add succeeds, and false otherwise
     * Outputs an error if the key is < 0
     */
    public final boolean add(int key) {

        Node ptr = new Node(key, null);
        Node temp = head;

        if(head == null) {
            head = ptr;
            return true;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ptr;

        return true;
    }


    /**
     * Method: search checks whether the key is in the list
     * @param key the integer to search for in the list
     * @return true if key is in the list and false otherwise
     */
    public boolean search(int key) {
        Node temp = head;


        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }


    /**
     * Method: Converts the list into a printable string
     * @return a string
     */
    public String toString() {
        String output = "";
        Node temp = head;

        if(head != null) {
            output += head.data;
            temp = temp.next;
        }

        while(temp != null) {
            output = output + " " + temp.data;
            temp = temp.next;
        }
        return output;
    }
}