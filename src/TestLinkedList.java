import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        StateLinkedList list = new StateLinkedList();

        // Adding states
        list.addState("California", Arrays.asList("Oregon", "Nevada", "Arizona"));
        list.addState("Texas",      Arrays.asList("New Mexico", "Oklahoma", "Louisiana"));
        list.addState("Florida",    Arrays.asList("Georgia", "Alabama"));

        // Print all
        System.out.println("List of states and neighbors:");
        list.printStates();

        // Delete one
        list.deleteState("Texas");
        System.out.println("\nAfter deleting Texas:");
        list.printStates();
    }
}
