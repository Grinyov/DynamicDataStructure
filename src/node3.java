/**
 * Created by green on 12.02.2015.
 */
public class node3
{

        public static void main(String[] args) {
            Node tail = _(3, 2, 1, 0);
            System.out.println(toString(tail));
        }

        public static String toString(Node tail) {
            String result = "";
            for (; tail != null; tail = tail.next){
                result += tail.value + "->";
            }
            return result + "*";
        }

        public static Node _(int... values) {
            Node tail = null;
            for (int k = values.length - 1; k >= 0; k--) {
                tail = new Node(values[k], tail);
            }
            return tail;
        }
    }

