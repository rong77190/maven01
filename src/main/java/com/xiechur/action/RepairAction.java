package com.xiechur.action;

import com.xiechur.service.RepairServiceI;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

@Action(value = "repairAction")
public class RepairAction extends BaseAction {
    private RepairServiceI repairService;

    public RepairServiceI getRepairService() {
        return repairService;
    }

    @Autowired
    public void setRepairService(RepairServiceI repairService) {
        this.repairService = repairService;
    }

    public void init() {
        repairService.repair();
    }

}
