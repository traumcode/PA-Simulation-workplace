package com.company;

import java.util.ArrayList;
import java.util.List;

public class Workplace {
    List<Department> departmentList;

    public Workplace() {
        this.departmentList = new ArrayList<>();
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

}
