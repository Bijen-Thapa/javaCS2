//This is the parent class(Student)
public class Student{
    //Instance variables: start
    private int enrollmentID,courseDuration,tuitionFee;
    private String dateOfBirth,courseName,studentName,dateOfEnrollment;
    //Instance variable: end

    //This is the parameterized constructor of the class
    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee){
        courseName = "";
        dateOfEnrollment = "";
        enrollmentID = 0;
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
    }

    //This is the getter method for the private instance variable(enrollmentID), which is used to give access to other class since other class cannot directly access the instances variable when they are private
    public int getEnrollmentID(){
        return enrollmentID;
    }

    //This is a protected setter method for the private instance variable(enrollmentID)
    protected void setEnrollmentID(int enrollmentID){
        this.enrollmentID = enrollmentID;
    }

    //This is the getter method for the private instance variable(dateOfBirth)
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    //This is a protected setter method for the private instance variable(dateOfBirth)
    protected void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    //This is the getter method for the private instance variable(courseName)
    public String getCourseName(){
        return courseName;
    }

    //This is a protected setter method for the private instance variable(courseName)
    protected void setCourseName(String courseName){
        this.courseName = courseName;
    } 

    //This is the getter method for the private instance variable(studentName)
    public String getStudentName(){
        return studentName;
    }

    //This is a protected setter method for the private instance variable(studentName)
    protected void setStudentName(String studentName){
        this.studentName = studentName;
    }

    //This is the getter method for the private instance variable(dateOfEnrollment)
    public String getDateOfEnrollment(){
        return dateOfEnrollment;
    } 

    //This is a protected setter method for the private instance variable(dateOfEnrollment)
    protected void setDateOfEnrollment(String dateOfEnrollment){
        this.dateOfEnrollment = dateOfEnrollment;
    }

    //This is the getter method for the private instance variable(courseDuration)
    public int getCourseDuration(){
        return courseDuration;
    }

    //This is a protected setter method for the private instance variable(courseDuration)
    protected void setCourseDuration(int courseDuration){
        this.courseDuration = courseDuration;
    }

    //This is the getter method for the private instance variable(tuitionFee)
    public int getTuitionFee(){
        return tuitionFee;
    }

    //This is a protected setter method for the private instance variable(tuitionFee)
    protected void setTuitionFee(int tuitionFee){
        this.tuitionFee = tuitionFee;
    }

    //This is the main method of the class named display which displays all the details inserted
    public void display(){
        if(enrollmentID == 0 || this.dateOfBirth == "" || this.dateOfBirth == null ||this.courseName == ""|| this.courseName == null||
           this.studentName==""|| this.studentName==null|| dateOfEnrollment == ""|| dateOfEnrollment == null|| this.courseDuration == 0 || this.tuitionFee == 0){
            /*
             * This if statement is to check the validation of the instance variables
             * after checking it specifies and displays which parameters are missing
             */
            System.out.println("Please, check the inserted data again!!!");
            System.out.print("(Hint: ");
            if(enrollmentID == 0){
                System.out.print("'EnrollmentID' ");
            }
            if(dateOfBirth == "" || dateOfBirth == null){
                System.out.print("'Date of birth' ");
            }
            if(courseName == "" || courseName == null){
                System.out.print("'Course name' ");
            }
            if(studentName == "" || studentName == null){
                System.out.print("'Student name' ");
            }
            if(dateOfEnrollment == "" || dateOfEnrollment == null){
                System.out.print("'Date of enrollment' ");
            }
            if(courseDuration == 0){
                System.out.print("'Course Duration' ");
            }
            if(tuitionFee == 0){
                System.out.print("'Tuition fee' ");
            }
            System.out.println("is missing)");
        }
        else{
            System.out.println("EnrollmentID: "+ enrollmentID);
            System.out.println("Date of birth: "+dateOfBirth);
            System.out.println("Course name: "+courseName);
            System.out.println("Student name: "+studentName);
            System.out.println("Enrolled year: "+dateOfEnrollment);
            System.out.println("Course duration: "+courseDuration+" month/s");
            System.out.println("Tuition fee: Rs"+tuitionFee);
        }
    }
}