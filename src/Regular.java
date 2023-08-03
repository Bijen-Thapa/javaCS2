//This is the child class(Regular)
public class Regular extends Student{
    //Instance variable: start
    private int numOfModules,numOfCreditHours, daysPresent;
    private boolean isGrantedScholarship;
    //Instance variable: end

    //Parametrized constructor of the child class(Regular)
    public Regular(String studentName,String dateOfBirth,int courseDuration,int tuitionFee,int enrollmentID,String dateOfEnrollment,String courseName, int numOfModules, int numOfCreditHours, int daysPresent){
        super(studentName, dateOfBirth, courseDuration, tuitionFee);
        setEnrollmentID(enrollmentID);
        setCourseName(courseName); ;
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        isGrantedScholarship = false;
    }

    //Accessor method for the private instance variable(numOfModules)
    public int getNumOfModules(){
        return numOfModules;
    }

    //Accessor method for the private instance variable(numOfCreditHours)
    public int getNumOfCreditHours(){
        return numOfCreditHours;
    }

    //Accessor method for the private instance variable(daysPresent)
    public int getDaysPresent(){ return daysPresent; }

    //Accessor method for the private instance variable(isGrantedScholarship)
    public boolean getIsGrantedScholarship(){
        return isGrantedScholarship;
    }

    //This method return a value after doing a certain calculation
    public String presentPercentage(int daysPresent){
        double courseDurationInDays = getCourseDuration() * 30;
        isGrantedScholarship = false;
        if(daysPresent<=courseDurationInDays){
            double presentInPercentage = (daysPresent/courseDurationInDays)*100;
            if(presentInPercentage<=100 && presentInPercentage>=80){
                isGrantedScholarship = true;
                return "A";
            }else if(presentInPercentage<80 && presentInPercentage>=60){
                return "B";
            }else if(presentInPercentage<60 && presentInPercentage>=40){
                return "C";
            }else if(presentInPercentage<40 && presentInPercentage>=20){
                return "D";
            }else if(presentInPercentage<20 && presentInPercentage>=0){
                return "E";
            }else{
                System.out.println("Given data is invalid (Hint: Data is in negative)");
                return "";      
            }
        }else {
            System.out.println("Inserted data is invalid (Hint: Present days invalid)");
            return "";
        } 
    }

    //A public void method that shows the student has graduated and whether that student has been granted scholarship or not
    public void grantCertificate(String courseName, String enrollmentID, String dateOfEnrollment){
        System.out.println("The student having the enrollmentID: "+enrollmentID+", enrolled on "+dateOfEnrollment+" has graduated in the course of "+courseName);
        if(isGrantedScholarship){
            System.out.println("The scholarship has been granted");
        }
    }

    //A void method that displays the details of the student
    public void display(){
        super.display();
        System.out.println("Number of modules: "+numOfModules);
        System.out.println("Credit hours: "+numOfCreditHours+" hour/s");
        System.out.println("Days present: "+daysPresent+" day/s");
    }
}