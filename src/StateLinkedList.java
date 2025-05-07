import java.util.List;

public class StateLinkedList {
    private Node head;

    public StateLinkedList() {
        head = null;
    }

    // Add a new state at the end
    public void addState(String stateName, List<String> neighbors) {
        Node newNode = new Node(stateName, neighbors);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete a state by name
    public void deleteState(String stateName) {
        if (head == null) return;
        if (head.stateName.equals(stateName)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.stateName.equals(stateName)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Print all states and neighbors
    public void printStates() {
        Node current = head;
        while (current != null) {
            System.out.println(
                    "State: " + current.stateName +
                            ", Neighbors: " + current.neighbors
            );
            current = current.next;
        }
    }
}
