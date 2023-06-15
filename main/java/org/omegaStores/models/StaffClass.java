package org.omegaStores.models;

import org.omegaStores.enums.Roles;

abstract class StaffClass {

    private String staffName;
    private Integer id;
    private Roles staffRole;

    public StaffClass(String staffName, Integer id, Roles staffRole) {
        this.staffName = staffName;
        this.id = id;
        this.staffRole = staffRole;
    }

    public StaffClass() {
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Roles getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(Roles staffRole) {
        this.staffRole = staffRole;
    }

    @Override
    public String toString() {
        return "StaffClass{" +
                "staffName='" + staffName + '\'' +
                ", id=" + id +
                ", staffRole=" + staffRole +
                '}';
    }
}
