public class Grades2 {
    public static void main(String[] args){
        Grades gradebook = new Grades ();
        gradebook.add(3);
        gradebook.add(2);
        gradebook.add(5);
        System.out.println(gradebook.size);
        System.out.println(gradebook.getLastGrade());
        System.out.println(gradebook.getAverage());
        System.out.println(gradebook.sum);
    }
}
