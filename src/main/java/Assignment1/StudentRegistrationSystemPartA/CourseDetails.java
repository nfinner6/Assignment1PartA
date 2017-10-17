package Assignment1.StudentRegistrationSystemPartA;

import org.joda.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDetails {

    private String courseName;
    private List<ModuleDetails> modules;
    LocalDate startDate;
    LocalDate endDate;

    public CourseDetails(String courseName, List<ModuleDetails> modules, LocalDate sDate, LocalDate eDate) {
        this.courseName = courseName;
        this.modules = new ArrayList<ModuleDetails>();
        this.startDate = sDate;
        this.endDate = eDate;
    }

    public void addModule(ModuleDetails module) { 
    	modules.add(module); 
    }

    public void removeModule(ModuleDetails module) {
        modules.remove(module);
    }

    public List<ModuleDetails> getListOfModules () {
        return modules;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate sDate) {
        this.startDate = sDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate eDate) {
        this.endDate = eDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String toString(){
        return "Course Name: " + getCourseName() + " | Start Date: " + getStartDate();
    }

}