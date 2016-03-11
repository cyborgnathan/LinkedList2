/**
 * Created by Nathan on 2/21/2016.
 */
public class LinkedNode {
    //Declarations
    private int courseNum;// course number must be positive
    private String courseName;
    public LinkedNode next; // ask about this in class

    //Constructor
    public LinkedNode(int courseNum, String courseName){
        //initialize all variables
        setCourseNum(courseNum);
        setCourseName(courseName);

    }//end LinkedNode

    //Getters/Setters

    public String getCourseName(){
        return courseName;
    }//end getCourseName

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }//end setCourseName


    public int getCourseNum(){
        return courseNum;
    }//end getCourseNum

    public void setCourseNum(int courseNum){
        this.courseNum=courseNum;
    }//end setCourseNum

    public void conDisplay(){
        System.out.println(courseName +":"+ courseNum);

    }//end conDisplay

    public String makeString(){

        String S= courseName+":"+courseNum;
        return S;

    }//end makeStrring


}//end class LinkedNode

