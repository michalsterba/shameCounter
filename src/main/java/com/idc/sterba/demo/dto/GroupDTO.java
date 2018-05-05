package com.idc.sterba.demo.dto;

import com.idc.sterba.demo.entity.Employee;
import com.idc.sterba.demo.entity.PlayerGroup;

public class GroupDTO {
    private Employee employee;
    private PlayerGroup playerGroup;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PlayerGroup getPlayerGroup() {
        return playerGroup;
    }

    public void setPlayerGroup(PlayerGroup playerGroup) {
        this.playerGroup = playerGroup;
    }
}
