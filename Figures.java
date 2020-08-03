import java.util.Scanner;

public class Figures {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("NAME: Sebastian Rodriguez \nProgramming Assignment 2");
        int size = getSize();

        int option = 0;
        while (true) {
            System.out.print("MENU:");
            System.out.println("\n1. Print box\n2. Print diamond\n3. Print X\n4. Quit Program\n");
            System.out.print("Please select an option: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    printBox(size);
                    break;
                case 2:
                    printDiamond(size);
                    break;
                case 3:
                    printX(size);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
            if (option == 4) break;
        }
        System.out.println("Good Bye!");


    }

    private static void printX(int size) {

        System.out.println();
        int spaces = size - 2;
        int startSpace = 0;
        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
            for (int space = 1; space <= startSpace; space++)
                System.out.print(" ");
            System.out.print("X");
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
            spaces -= 2;

            startSpace += 1;

        }
        for (int space = 1; space <= startSpace; space++)
            System.out.print(" ");
        System.out.println("X");
        spaces = 1;

        for (int topRow = 1; topRow <= (size - 1) / 2; topRow++) {
            startSpace -= 1;
            for (int space = 1; space <= startSpace; space++)
                System.out.print(" ");
            System.out.print("X");
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
            spaces += 2;

        }


    }

    private static void printDiamond(int size) {
    	int i,j,mid;
    	size=size+1;
    	mid = (size/2);
    	for(i = 1; i<= mid; i++) {
    		for(j = 1; j<=(mid-i); j++){
    			System.out.print(" ");
    	}
    		if(i == 1) {
    			System.out.print("XX");
    	} 	else {
    		System.out.print("X");

    		for(j = 1; j<=2*i-3; j++){
    			System.out.print(" ");
    	}
    		System.out.print("X");
    	}
    		System.out.print("\n");
    	}
    	for(i = mid+1; i<size; i++) {
    		for(j = 1; j<=i-mid; j++) {
    			System.out.print(" ");
    	}
    		if(i == size-1) {
    			System.out.print("XX");
    		} else {
    			System.out.print("X");

    	for(j = 1; j<=2*(size - i)-3; j++) {

    		System.out.print(" ");
    	}
    		System.out.print("X");
    	}
    		System.out.print("\n");
    	}

    }

    private static void printBox(int size) {

        System.out.println();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static int getSize() {

        int size = 0;
        while (true) {

            System.out.print("Enter the size of the figure (odd number): ");
            size = scan.nextInt();
            if (size % 2 == 1) return size;
            System.out.println("Size should be an odd number.");
        }
    }
}