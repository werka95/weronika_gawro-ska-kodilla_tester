public class Loops1 {
    public static void main(String[] args) {
        String[] names = new String[] {"Karolina","Elzbieta","Ola","Kamila","Beata"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }for (int i = names.length -1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
