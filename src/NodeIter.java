/**
 * Created by green on 12.02.2015.
 */
public class NodeIter
{
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            String result = "";
            for (Node tail = this; tail != null; tail = tail.next){
                result += tail.value + "->";
            }
            return result + "*";
        }
    }

    public static void main(String[] args) {
        System.out.println(_(3, 2, 1, 0));
    }

    public static Node _(int... values) {
        Node tail = null;
        for (int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }
}
