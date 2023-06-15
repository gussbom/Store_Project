package org.omegaStores.services;

import org.omegaStores.models.Employee;
import org.omegaStores.models.Manager;

public interface RecruitmentService {
    String hireNewEmployee(Manager manager, Employee employee);
}
