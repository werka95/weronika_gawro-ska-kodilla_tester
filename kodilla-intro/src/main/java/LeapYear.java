public class LeapYear {
    public static void main(String[] args) {
        if (2100 % 4 == 0) {
            if (2100 % 100 == 0) {
                if (2100 % 400 == 0) {
                    System.out.println("To jest rok przestępny");
                } else {
                    System.out.println("To nie jest rok przestępny");
                }
            } else {
                System.out.println("To jest rok przestępny");
            }
        } else {
            System.out.println("To nie jest rok przestępny");
            }
    }
}