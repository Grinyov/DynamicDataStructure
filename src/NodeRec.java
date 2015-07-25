/**
 * Created by green on 12.02.2015.
 */
public class NodeRec
{
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return value + "->" + (next == null ? "*" : next.toString());
        }
    }


        public static void main(String[] args) {
            Node tail = generate(3);
            System.out.println(toString(tail));
        }

        public static Node generate(int length) {
            if (length > 0) {
                return new Node(length, generate(length - 1));
            } else {
                return null;
            }
        }

        public static String toString(Node tail) {
            return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
        }
// или в одну строчку рекурсивно
    /*
    public static Node generate(int length) {
        return (length == 0) ? null : new Node(length, generate(length - 1));
    }

    public static String toString(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
    }
     */

}
