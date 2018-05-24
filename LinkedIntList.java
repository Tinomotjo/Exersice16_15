package Exersice16_1;

import java.util.NoSuchElementException;

public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // tilføjer på det bagerste index.
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // tilføjer til et spsifickt index.
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // Fjerner et index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public int get(int index) {
        return nodeAt(index).data;
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    /*
    // Exersice_a_16_1
    public void set (int index, int value){
        nodeAt(index).data = value;
    }
    */
    /*
    // Exersice_a_16_2
    public int max(){

        // Smider en exception hvis listen = null
        if (front == null) {
            throw new NoSuchElementException();
        } else {

            ListNode current = front;
            int max = front.data;

            //Tjekker om det næste node data er større end den nuværende.
            while (current.next != null){
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }
            return max;
        }
    }
    */

    /*
    //Exersice_16_3
    public boolean isSorted (){

        ListNode current = front;
        boolean nondecreasing = false;

        // Metoden kan kun bruges hvis der er 1+ elementer.
        if (front != null){
            // Ryger til den bagerste node.
            while (current.next != null){
                current = current.next;
                nondecreasing = true;
            }
            current.next = new ListNode(front.data);
            front = front.next;

        }
        return nondecreasing;
    }
    */

    /*
    //Exersice_16_4
    public int lastIndexOf(int value){

        ListNode current = front;
        int index = -1;
        int counter = 0;

       // returnerer -1 hvis value ikke er i listen/ listen er tom.
        while (current != null){
            if (current.data == value){
                index = counter;
            }
            counter++;
            current = current.next;
        }
        return index;
    }
    */

    /*
    //Exersice_16_5
    public void countDuplicates () {

        //Sum holder på antallet af duplicates.
        int sum = 0;
        ListNode current = front;

        if (front == null) {
            System.out.println(sum);
        }

        //Sammenligner den nuværende node.data med den næste nodes data.
        while (current.next != null) {
            if (current.data == current.next.data) {
                sum++;
            }
            current = current.next;
        }
        System.out.println(sum);

    }
    */

    /*
    //Exersice_16_7
    public int deleteBack() {

        ListNode current = front;
        int deletedNodeData = 0;
        int lastIndex = 0;

        if (front == null) {
            throw new NoSuchElementException();
        }
        //tæller ned til det sidste index data.
        while (current.next != null) {
            current = current.next;
            lastIndex++;
        }

        // Gemmer den sidste index data.
        deletedNodeData = current.data;
        //Sletter sidste index
        remove(lastIndex);
        return deletedNodeData;
    }
    */

    /*
    //Exersice16_8
    public void switchPairs (LinkedIntList list){

        //Laver en midlertidig liste
        LinkedIntList list2 = new LinkedIntList();

        for (int i = 0; i < list.size()-1; i++){
            if (i % 2 == 0){
                list2.add(list.get(i+1));
                list2.add(list.get(i));
            }
        }

        if (list.size() % 2 != 0){
            list2.add(list.get(list.size()-1));
        }

        System.out.println(list2);
    }
    */

    /*
    //Exersice_16_9
    public void stutter(){

        if (front == null){
            return;
        }

        ListNode current = front;

        while (current != null){
            current.next = new ListNode(current.data,current.next);
            current = current.next.next;
        }
    }
    */

    //Exersice_16_15
    public boolean notEquals(LinkedIntList liste2){

        ListNode node1 = front;
        ListNode node2 = liste2.front;

        while (node1 != null || node2 != null){


            if (size() != liste2.size()){
                return true;
            }

            if (node1.data != node2.data){
                return true;
            }

            node1 = node1.next;
            node2 = node2.next;
        }
        return false;
    }
}