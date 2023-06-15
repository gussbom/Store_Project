package org.omegaStores.services.implementation;

import org.omegaStores.enums.Ethnicity;
import org.omegaStores.enums.Roles;
import org.omegaStores.models.Employee;
import org.omegaStores.models.Manager;
import org.omegaStores.services.*;

public class ManagerServiceImplementation implements RecruitmentService,ManagerService {


    public String hireNewEmployee(Manager manager, Employee employee) {
        if(manager.getStaffRole().equals(Roles.MANAGER)){
                return employee.getName() + " You are hired";
        }else
            return manager.getStaffName()+ " You're not a manager";
    }

    @Override
    public String checkIn(Manager manager) {
        if(manager.getStaffRole().equals(Roles.MANAGER)){
            return "Welcome "+ manager.getStaffName();
        }else
            return "You're not a cashier "+ manager.getStaffName();
    }
}
