/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class3;

/**
 *
 * @author lkhan
 */
public class Profile {
    
    private String fName;
    private String lName;
    private String userName;
    private String classRank;
    private int numberOfCourses;
    private String semester;
    private String major;
    private int creditsThisSemester;
    
    //default constructor
    public Profile(/*No arguments needed here*/){
        //nothing really is going on here either. 
        //if you wanted you could have placed some sort of logic here.
    }
    public Profile(String fName,String lName,String userName,
            String classRank,int numberOfCourses,String semester,String major,int creditsThisSemester){
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.classRank = classRank;
        this.numberOfCourses = numberOfCourses;
        this.semester = semester;
        this.major = major;
        this.creditsThisSemester = creditsThisSemester;
    }

    public Profile(String fName, String lName, String userName, String semester, String major) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.semester = semester;
        this.major = major;
    }

   //setters or formally known as mutators
    public void setfName(String fName){
        
        if(fName.length()<=15){
            this.fName = fName;
        }
        else{
            this.fName="";
        }
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCreditsThisSemester(int creditsThisSemester) {
        this.creditsThisSemester = creditsThisSemester;
    }
    
//getters or accessors
   
    public String getfName(){
        return this.fName;
    }
    
    public String getlName() {
        return lName;
    }

    public String getUserName() {
        return userName;
    }

    public String getClassRank() {
        return classRank;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public String getSemester() {
        return semester;
    }

    public String getMajor() {
        return major;
    }

    public int getCreditsThisSemester() {
        return creditsThisSemester;
    }
    
    
    
    
    
}
