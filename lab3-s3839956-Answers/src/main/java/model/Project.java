package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Project inside the company.
 *
 * @author Sebastian Rodriguez, 2020. email: sebastian.rodriguez@rmit.edu.au
 */
public class Project {
    /**
     * Name the this project
     */
    private String name;

    /**
     * Project start
     */
    private Date startDate;

    /**
     * Project maximum end date
     */
    private Date dueDate;

    /**
     * Estimated duration of the project in DAYS (WEEKENDS INCLUDED)
     */
    private int estimatedDuration;

    /**
     * Team allocated to this project
     */
    private List<Employee> team = new ArrayList<Employee>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public List<Employee> getTeam() {
        return team;
    }


    /**
     * Adds a new member to the team
     * @param employee the employee to add as member
     * @return true if the Employee was successfully added to the team, false otherwise
     */

    public boolean addTeamMember(Employee employee){
        return false;
    }



    public boolean removeTeamMember(Employee employee){
        boolean successfullyRemoved = false;
        
        if(!team.contains(employee))
        {
        	String error = employee.getName() + "can't be removed from" + this.getName():
        	throw new IllegalTeamMemberException(error);
        
        }
        else
        {
        	if (team.size() == team.size() -1)
        	{
        		team.remove(employee);
        		employee.setNumberOfProjects(employee.getNumberOfProjects() - 1);
        		successfullyRemoved = true;
        	}
        		
        }
    }




    /**
     * Verifies the Project has valid dates.
     * @return true if dates are valid, false otherwise.
     */
    public boolean isValidDates(){
       return false;
    }

    /**
     * Verifies that an employee can be added as team member
     * @return true if the Employee can be added to the team, false otherwise.
     */
    public boolean canAddTeamMember(Employee employee){
        return false;
    }
}
