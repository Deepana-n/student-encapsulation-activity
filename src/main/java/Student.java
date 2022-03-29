import java.util.Arrays;

import static java.util.Arrays.asList;

public class Student {
    private final String name;
    private String grade;
    private final String group;
    private String secretNickName;
    private static final String[] VALID_GROUPS = new String[]{"1","2","3","4","5"};
    private static final String[] VALID_GRADES = new String[]{"F","E","D","C","B","A"};

    public Student(String name, String grade, String group){
        this.name = name;
        if(checkGrade(grade)){
            this.grade = grade;
        }else{
            throw new IllegalArgumentException("Grade is not valid. Should be either A, B, C, D, E, F");
        }
        if(checkGroup(group)){
            this.group = group;
        }else{
            throw new IllegalArgumentException("Group is not valid. Should be either 1, 2, 3, 4, 5");
        }
        setSecretNickName();
    }

    private boolean checkGrade(String grade){
        return asList(VALID_GRADES).contains(grade);
    }

    private boolean checkGroup(String group){
        return Arrays.asList(VALID_GROUPS).contains(group);
    }

    private void setSecretNickName(){
        this.secretNickName = "MySecretNickName";
    }
    public void getName(){
        System.out.println("Student's name is " + name);
    }

    public String getGrade(){
        return grade;
    }

    public void upgrade(){
        String currentGrade = getGrade();
        int newGradeIndex = Arrays.asList(VALID_GRADES).indexOf(currentGrade) + 1;
        if(newGradeIndex<VALID_GRADES.length){
            grade = VALID_GRADES[newGradeIndex];
        }
    }

    public void downgrade(){
        String currentGrade = getGrade();
        int newGradeIndex = Arrays.asList(VALID_GRADES).indexOf(currentGrade) - 1;
        if(newGradeIndex>=0){
            grade = VALID_GRADES[newGradeIndex];
        }
    }

}
