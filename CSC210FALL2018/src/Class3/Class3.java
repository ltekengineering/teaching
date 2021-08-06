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
public class Class3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profile student1 = new Profile("Lawrence", "Khan", "lakhan", "NA", 1, "8th", "CSC", 4);
        
        Profile student2 = new Profile("Gabriel", "Chimbo", "gChimbo", "3RD", "CSC");
                student2.setClassRank("UpperFreshman");
                student2.setNumberOfCourses(5);
                student2.setCreditsThisSemester(18);
                
        Profile student3 = new Profile();
        student3.setfName("Mamadou");
        student3.setlName("Diallo");
        student3.setClassRank("Upper Freshman");
        student3.setMajor("CIS");
        student3.setNumberOfCourses(4);
        student3.setCreditsThisSemester(13);
        student3.setUserName("boussouriouy");
         
        System.out.println(student1.getUserName()+"'s first name = "+student1.getfName());
        System.out.println(student1.getUserName()+"'s last name = "+student1.getlName());
        System.out.println(student1.getUserName()+" is taking "+student1.getNumberOfCourses()+ " course");
        System.out.println(student1.getfName()+ "is taking "+student1.getCreditsThisSemester()+" credits");
        System.out.println(student1.getfName()+ "'s class ranking is "+student1.getClassRank());
        System.out.println(student1.getfName()+ "'s major is "+student1.getMajor());
        student1.setClassRank("Adjust Professor");
        
        System.out.println(student1.getUserName()+"'s first name = "+student1.getfName());
        System.out.println(student1.getUserName()+"'s last name = "+student1.getlName());
        System.out.println(student1.getUserName()+" is taking "+student1.getNumberOfCourses()+ " course");
        System.out.println(student1.getfName()+ "is taking "+student1.getCreditsThisSemester()+" credits");
        System.out.println(student1.getfName()+ "'s class ranking is "+student1.getClassRank());
        System.out.println(student1.getfName()+ "'s major is "+student1.getMajor());
        
    }
    
}
