package lab1;

public class Student {

    //default fields
    private String nameOfSudent;
    private double heightOfStudentInMeters;
    private double ratingOfStudent;

    //2 additional private fields
    private int ageOfStudent;
    private int courseOfStudying;

    //1 static field
    private static double quantityOfScholarshipInUAN = 1300.0;

    //2 additional protected fields
    protected String nameOfUniversity;
    protected String nameOfGroup;


    //default constructor
    public Student(){}

    //constructor with all fields
    public Student(String nameOfSudent, double heightOfStudentInMeters, double ratingOfStudent, int ageOfStudent, int courseOfStudying, String nameOfUniversity, String nameOfGroup) {
        this.nameOfSudent = nameOfSudent;
        this.heightOfStudentInMeters = heightOfStudentInMeters;
        this.ratingOfStudent = ratingOfStudent;
        this.ageOfStudent = ageOfStudent;
        this.courseOfStudying = courseOfStudying;
        this.nameOfUniversity = nameOfUniversity;
        this.nameOfGroup = nameOfGroup;
    }
    //constructor with 4 fields
    public Student(int ageOfStudent, int courseOfStudying, String nameOfUniversity, String nameOfGroup) {
        this(null, 0, 0, ageOfStudent, courseOfStudying, nameOfUniversity, nameOfGroup);
    }



    //GETTERS AND SETTERS TO ALL FIELDS
    public String getNameOfSudent() {
        return nameOfSudent;
    }

    public void setNameOfSudent(String nameOfSudent) {
        this.nameOfSudent = nameOfSudent;
    }

    public double getHeightOfStudentInMeters() {
        return heightOfStudentInMeters;
    }

    public void setHeightOfStudentInMeters(double heightOfStudentInMeters) {
        this.heightOfStudentInMeters = heightOfStudentInMeters;
    }

    public double getRatingOfStudent() {
        return ratingOfStudent;
    }

    public void setRatingOfStudent(double ratingOfStudent) {
        this.ratingOfStudent = ratingOfStudent;
    }

    public int getAgeOfStudent() {
        return ageOfStudent;
    }

    public void setAgeOfStudent(int ageOfStudent) {
        this.ageOfStudent = ageOfStudent;
    }

    public int getCourseOfStudying() {
        return courseOfStudying;
    }

    public void setCourseOfStudying(int courseOfStudying) {
        this.courseOfStudying = courseOfStudying;
    }

    public static double getQuantityOfScholarshipInUAN() {
        return quantityOfScholarshipInUAN;
    }

    public static void setQuantityOfScholarshipInUAN(double quantityOfScholarshipInUAN) {
        Student.quantityOfScholarshipInUAN = quantityOfScholarshipInUAN;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }


    //ToString method
    @Override
    public String toString() {
        return "\n\n\nStudent "+ nameOfSudent
                + ";\nAge: " + ageOfStudent
                + " m;\nHeight: " + heightOfStudentInMeters
                + ";\nUniversity: " + nameOfUniversity
                + ";\nGroup: " + nameOfGroup
                + ";\nCourse: " +  courseOfStudying
                + ";\nRating: " + ratingOfStudent;
    }

    //Static method printStaticField()
    public static void printStaticQuantityOfScholarshipInUAN(){
        System.out.println("\nStatic method \nEverage scholarship: " + Student.quantityOfScholarshipInUAN + "UAN");
    }
    //Non-static method printField() with static field
    public void printQuantityOfScholarshipInUAN(){
        System.out.println("\nNon-static method \nEverage scholarship: " + Student.quantityOfScholarshipInUAN + "UAN");
    }


    //resetValues method
    public void resetValues(String name, double height, double rating, int age, int course, String university, String group) {
        nameOfSudent = name;
        heightOfStudentInMeters = height;
        ratingOfStudent = rating;
        ageOfStudent = age;
        courseOfStudying = course;
        nameOfUniversity = university;
        nameOfGroup = group;
    }
}
