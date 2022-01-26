public class Main {
    public static void main(String arg[]) {
        // Printing name
        System.out.println("Hello, I am Hui Qi");

        // Variable
        String modules = "CSC1009";
        switch (modules) {
            case "CSC1006":
                System.out.println("Mathematics II");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2902":
                System.out.println("Career and Professional");
                break;
        }

        // Loop to print odd numbers
        for (int x = 102; x >= 66; x--) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }

    }
}
