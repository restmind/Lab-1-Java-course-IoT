package lab1;

public class StudentsGroup {

    private static final int sizeOfGroupOfStudents = 4;

    public static void main(String[] args) {
        Student studentHarryPotter = new Student();
        Student studentHermonyGranger = new Student(18, 2, "Hogwarts", "CS13");
        Student studentJamesBond = new Student("James Bond", 190.5, 200, 19, 3, "LNU", "AI-11");

        System.out.println(studentHarryPotter);
        System.out.println(studentHermonyGranger);
        System.out.println(studentJamesBond);

        Student.printStaticQuantityOfScholarshipInUAN();
        //Student.printQuantityOfScholarshipInUAN();non-static method printQuantityOfScholarshipInUAN() cannot be referenced from a static context


        //Second part of lab with array
        Student[] groupOfStudents = new Student[sizeOfGroupOfStudents];

        for (int counterOfStudentsFromTheGroup = 0; counterOfStudentsFromTheGroup < sizeOfGroupOfStudents; counterOfStudentsFromTheGroup++){
            groupOfStudents[counterOfStudentsFromTheGroup] = new Student();
        }

        System.out.println("\n\n---------GROUP OF STUDENTS---------\n");
        for(Student counterOfStudentsFromTheGroup: groupOfStudents){
            System.out.println(counterOfStudentsFromTheGroup);
        }
    }
}
