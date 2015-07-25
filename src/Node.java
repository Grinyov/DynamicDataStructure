/**
 * Created by green on 11.02.2015.
 *
 * Реализация односвязного списка - Звено простейшей рекурсивной структуры данных
 */

import java.util.Arrays;
public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }


    public static void main(String[] args) {
        Node tail;
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node3.next = node2;
        node2.next = node1;
        node1.next = node0;

        tail = node3;


        Node tail2;

        tail2 = new Node(0, null);
        tail2 = new Node(1, null);
        tail2 = new Node(2, null);
        tail2 = new Node(3, null);

        // здесь используются var args

        Node tail3 = genIter(0, 1, 2, 3);

        // Node tail3 = genIter(new int[] {0, 1, 2, 3});
    }

    // public static Node genIter(int[] values)
    public static Node genIter(int... values)
    {
        Node tail = null;

        for(int k = values.length - 1; k >=0; k--)
        {
            tail = new Node(values[k], tail);
        }

        /* запись через foreach
        for(int elem : values)
        {
            tail = new Node(elem, tail);
        }

         */
        return tail;
    }

    public static Node genRec(int... v)
    {
        return v.length == 0 ? null : new Node(v[0], genRec(Arrays.copyOfRange(v, 1, v.length)));
    }

    public static Node genRecFull(int... v)
    {
        if  (v.length == 0)
        return null;
        else
        {   int[]  newArray = Arrays.copyOfRange(v, 1, v.length);
            return  new Node (v[0], genRecFull(newArray));
        }
    }
}