package сom.homework;

public class Student {
    private String name;
    private double rating;

    public Student () {}

    public Student (String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public static boolean betterStudent (Student leftStudent, Student rightStudent){
        return leftStudent.rating >= rightStudent.rating;
    }

    public String toString() {
        return new String("Student: " + this.name + "\nRating: " + this.rating);
    }

    public void changeRating(double newRating) {
        setRating(newRating);
    }

    public static double getAverage (Student... st){
        double result = 0;
        for (Student student : st) {
            result += student.getRating();
        }
        result /= st.length;
        return result;
    }

    public static void main(String[]args){
        Student st1 = new Student("Jack", 5);
        Student st2 = new Student("Mary", 2);
        Student st3 = new Student("Tom", 3);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

        System.out.println("Average rating:" + Student.getAverage(st1, st2, st3));

        st1.changeRating(10);

        System.out.println("New average rating:" + Student.getAverage(st1, st2, st3));

    }

}
