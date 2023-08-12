//This is the child class 
public class Dropout extends Student{
    //Instance variable: start
    private int numOfRemainingModules,numOfMonthsAttended,remainingAmount;
    private String dateOfDropout;
    private boolean hasPaid;
    //Instance variable: end

    //Parameterized constructor of the Regular class  
    public Dropout(String studentName, String dateOfBirth, int courseDuration, int tuitionFee, int enrollmentID, String dateOfEnrollment, String courseName, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout){
        super(studentName, dateOfBirth, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        remainingAmount = 0;
        hasPaid = false;
    }

    //Accessor method for the private instance variable(numOfRemainingModules)
    public int getNumOfRemainingModules(){
        return numOfRemainingModules;
    }

    //Accessor method for the private instance variable(numOfMonthsAttended)
    public int getNumOfMonthsAttended(){
        return numOfMonthsAttended;
    }

    //Accessor method for the private instance variable(dateOfDropout)
    public String getDateOfDropout(){
        return dateOfDropout;
    }

    //Accessor method for the private instance variable(remainingAmount)
    public int getRemainingAmount(){
        return remainingAmount;
    }

    //Accessor method for the private instance variable(hasPaid)
    public boolean getHasPaid(){
        return hasPaid;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    //This is a non-static method that calculates whether the student has remaining amount to be paid or not
    public void billsPayable(){
        remainingAmount = (getCourseDuration() - numOfMonthsAttended)*getTuitionFee();
        if(remainingAmount>0){
            System.out.println("All bill not cleared");
            hasPaid = false;
        }else{
            System.out.println("All bills cleared!!!");
            hasPaid = true;
        }
    }

    //This is a non-static method that checks whether a student has paid the fees or not
    public void removeStudent(){
        if(hasPaid){
            setDateOfBirth("");
            setCourseName("");
            setStudentName("");
            setDateOfEnrollment("");
            setCourseDuration(0);
            setTuitionFee(0);
            dateOfDropout = "";
            setEnrollmentID(0);
            numOfRemainingModules = 0;
            numOfMonthsAttended = 0;
            remainingAmount = 0;
            System.out.println("All bills cleared!!!");
        }else{
            System.out.println("All bill not cleared");
        }
    }

    //This non-static method that displays all the details of the student
    public void display(){
        super.display();
        System.out.println("Number of remaining modules: "+numOfRemainingModules);
        System.out.println("Number of months attended: "+numOfMonthsAttended+" month/s");
        System.out.println("Date of dropout: "+ dateOfDropout);
        System.out.println("Remaining fee: Rs"+remainingAmount);

    }   
}
