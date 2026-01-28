package Trees;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        // int[] nums={5,2,7,1,4,6,9,8,3,10};
        int[] nums2={1,2,3,4,5,6,7,8,9,10};
        // bst.populate(nums);
        bst.populateSorted(nums2);
        // bst.display();
        System.out.println("Pre Order: ");
        bst.preOrder();
        System.out.println();
        System.out.println("In Order: ");
        bst.inOrder();
        System.out.println();
        System.out.println("Post Order: ");
        bst.postOrder();
        System.out.println();
    }
}
