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
        if (leftStudent.rating >= rightStudent.rating){
            return true;
        }
        return false;
    }

    public String toString() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student rating: " + this.rating);
        return null;
    }

    public void changeRating(double newRating) {
        setRating(newRating);
    }

    public static void main(String[]args){
        Student Jack = new Student("Jack", 85);
        Jack.toString();
    }

}
