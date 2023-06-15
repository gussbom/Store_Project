package org.omegaStores.services.implementation;

import org.junit.Test;
import org.omegaStores.enums.Ethnicity;
import org.omegaStores.enums.Roles;
import org.omegaStores.models.Employee;
import org.omegaStores.models.Manager;

import static org.junit.Assert.*;

public class ManagerServiceImplementationTest {

    @Test
    public void testHireNewEmployee() {
        Manager manager = new Manager("Goliath",123, Roles.MANAGER);
        ManagerServiceImplementation manage = new ManagerServiceImplementation();

        String actual = manage.checkIn(manager);  ;
        String expected ="Welcome "+ manager.getStaffName();;
        String expected2 ="You're not a cashier "+ manager.getStaffName();;
        assertEquals(expected,actual);
    }

    @Test
    public void testCheckIn() {
        Manager manager = new Manager("Kila",980, Roles.MANAGER);
        Employee employee = new Employee("laala",12, Ethnicity.Hausa);
        ManagerServiceImplementation manage = new ManagerServiceImplementation();
        manage.hireNewEmployee(manager,employee);

        String actual = manage.hireNewEmployee(manager,employee);

        String expected = employee.getName() + " You are hired";
        String expected2 = manager.getStaffName()+ " You're not a manager";

        assertEquals(expected2,actual);
    }
}