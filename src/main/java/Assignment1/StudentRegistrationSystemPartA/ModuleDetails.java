package Assignment1.StudentRegistrationSystemPartA;

import java.util.ArrayList;
import java.util.List;

public class ModuleDetails {
    
    private String moduleName;         
    private String moduleID;
    private List<StudentDetails> students;

    public ModuleDetails(String mName, String mID)
    {                              
        this.moduleName= mName;         
        this.moduleID = mID;
        this.students = new ArrayList<StudentDetails>();
    }
    
    public void addStudent(StudentDetails student){
        students.add(student);
    }

    public void removeStudent(StudentDetails student){
        students.remove(student);
    }
    
    public List<StudentDetails> getListOfStudents () {
        return students;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String mName) {
        this.moduleName = mName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String mID) {
        this.moduleID = mID;
    }
    
    public String toString(){
        return "Module Name: " + getModuleName() + " | Module ID: " + getModuleID();
    }
}