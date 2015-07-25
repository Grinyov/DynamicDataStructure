/**
 * Created by green on 12.02.2015.
 */
public class NodeMerge
{

        public static void main(String[] args) {
            Node tailA = new Node(1, new Node(1, new Node(10, new Node(11, null))));
            Node tailB = new Node(3, new Node(4, new Node(100, new Node(200, null))));
            System.out.println(toString(tailA));
            System.out.println(toString(tailB));
            System.out.println(toString(merge(tailA, tailB)));
        }

        public static Node merge(Node tailA, Node tailB) {
            if (tailA != null && tailB != null) {
                if (tailA.value < tailB.value) {
                    return new Node(tailA.value, merge(tailA.next, tailB));
                } else {
                    return new Node(tailB.value, merge(tailA, tailB.next));
                }
            } else {
                return (tailA == null) ? tailB : tailA;
            }
        }

        public static String toString(Node tail) {
            return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
        }
    }

