import static java.util.Arrays.copyOfRange;

/**
 * Created by green on 12.02.2015.
 */

//import static java.util.Arrays.*;

public class NodeSearch
{
        public static void main(String[] args) {
            // generate list
            Node tail = _(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            // create loop
            Node head = tail;
            for (; head.next != null; head = head.next) ;
            head.next = tail.next.next.next.next;
            // check
            System.out.println(hasLoop(tail));
        }

        private static boolean hasLoop(Node a) {
            Node b = a.next;
            while (a != b && b != null) {
                a = a.next;
                b = ((b.next == null) ? null : b.next.next);
            }
            return a == b;
        }

        public static Node _(int... v) {
            return v.length == 0 ? null : new Node(v[0], _(copyOfRange(v, 1, v.length)));
        }
    }

