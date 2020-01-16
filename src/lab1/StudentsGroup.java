package lab1;

public class StudentsGroup {

    private static final int sizeOfGroupOfStudents = 4;

    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student(18, 2, "Oxford University", "CS13");
        Student thirdStudent = new Student("James Bond", 190.5, 200, 19, 3, "LNU", "AI-11");

        System.out.println(firstStudent.ToString());
        System.out.println(secondStudent.ToString());
        System.out.println(thirdStudent.ToString());

        Student.printStaticQuantityOfScholarshipInUAN();
        //Student.printQuantityOfScholarshipInUAN();non-static method printQuantityOfScholarshipInUAN() cannot be referenced from a static context


        //Second part of lab with array
        Student[] groupOfStudents = new Student[sizeOfGroupOfStudents];

        for (int counter = 0; counter < sizeOfGroupOfStudents; counter++){
            groupOfStudents[counter] = new Student();
        }

        System.out.println("\n\n---------GROUP OF STUDENTS---------\n");
        for(Student counter: groupOfStudents){
            System.out.println(counter.ToString());
        }
    }
}
