/**
 * Created by green on 12.02.2015.
 */
public class NodeCopy
{

        public static void main(String[] args) {
            Node tailA = generate(3);
            Node tailB = copy(tailA);
            System.out.println("a: " + toString(tailA));
            System.out.println("b: " + toString(tailB));
            System.out.println("isEqual: " + isEqual(tailA, tailB));
            System.out.println("---");
            tailB.next.next.value = 1000;
            System.out.println("a: " + toString(tailA));
            System.out.println("b: " + toString(tailB));
            System.out.println("isEqual: " + isEqual(tailA, tailB));
        }

        public static Node copy(Node tail) {
            return tail == null ? null : new Node(tail.value, copy(tail.next));
        }

        public static boolean isEqual(Node t0, Node t1) {
            if (t0 != null && t1 != null) {
                return (t0.value == t1.value) && isEqual(t0.next, t1.next);
            } else {
                return t0 == t1;
            }
        }

        public static Node generate(int length) {
            return (length == 0) ? null : new Node(length, generate(length - 1));
        }

        public static String toString(Node tail) {
            return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
        }
    }


