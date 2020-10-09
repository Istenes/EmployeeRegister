import employee.Employee;
import employee.Programmer;
import employee.ProjectManager;
import employee.ScrumMaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Programmer programmer = new Programmer();
        programmer.name = "Carl";
        programmer.age = 32;
        programmer.salary = 32000;
        programmer.programmingLanguges = new String[] {"Java", "C#", "Cobol"};

        ProjectManager projectManager = new ProjectManager();
        projectManager.name = "Alicia";
        projectManager.age = 30;
        projectManager.salary = 40000;
        projectManager.projectManagementTools = new String[] {"Jira", "Excel"};

        ScrumMaster scrumMaster = new ScrumMaster();
        scrumMaster.name = "Svante";
        scrumMaster.age = 50;
        scrumMaster.hasScrumMasterCertificate = true;
        scrumMaster.projectManagementTools = new String[] {"Jira", "Hansoft", "Trello"};

        employees.add(programmer);
        employees.add(projectManager);
        employees.add(scrumMaster);

        for (Employee employee: employees) {
            System.out.println("employee.Employee " + employee.name + " (" + employee.age + ") has the salary: " + employee.salary);
        }

    }
}
