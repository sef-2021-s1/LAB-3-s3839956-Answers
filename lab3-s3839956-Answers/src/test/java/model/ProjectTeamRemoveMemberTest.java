package model;


import model.Project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
/**
 *  Implement and test {@link Project#removeTeamMember(Employee)} (Employee)} } that respects the following:
 *
 *  <ul>
 *
 *      <li>{@link Employee#getNumberOfProjects()} must return the correct number after the operation </li>
 *      <li>Throws an {@link IllegalTeamMemberException} if an Employee is not part of the team. MUST identify the Employee name and project name in the message</li>
 *      <li></li>
 *  </ul>
 *
 * NOTE: The {@link Project#canAddTeamMember(Employee)} verifies that the constraints to add a new member. You DO NOT HAVE to implement this method.
 *
 * Each test criteria must be in an independent test method and named as specified in the README.
 *
 * Initialize the test object with setUp method.
 */
public class ProjectTeamRemoveMemberTest {
	
	@Test
	void getNumberOfProjects() {
		assertEquals(0, Employee.getNumberOfProjects(""),
				"Invalid null character");
		
	}

	@Test
	void IllegalTeamException() {
		assertThrows(
				IllegalTeamMemberException.class,
				() -> removeTeamMember("") ,
				"Team member is not part of this project");
	}
}