public class Student {
    private String name;
    private int[] marks = new int[5];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverage() {
        return getTotal() / 5.0;
    }

    public char getGrade() {
        double average = getAverage();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + getTotal());
        System.out.printf("Average: %.2f%%\n", getAverage());
        System.out.println("Grade: " + getGrade());
    }
}
