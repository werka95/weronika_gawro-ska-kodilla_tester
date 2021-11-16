public class Grades {
    public int[] grades;
    public int size;
    public double sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = 0;
    }

    public void add(int value)   {
        if (this.size == 10) {
            return;
         }
        this.grades[this.size] = value;
        this.size++;
        sum = sum + value;
    }

    public int getLastGrade() {
        return this.grades[this.size-1];
    }
     public double getAverage() {
        return sum/this.size;
     }

}
