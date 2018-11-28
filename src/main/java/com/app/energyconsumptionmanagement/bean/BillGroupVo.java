package com.app.energyconsumptionmanagement.bean;

import java.util.List;

public class BillGroupVo extends BillGroup {
    private List<BillGroupPoint> billGroupPointList;
    public List<BillGroupPoint> getBillGroupPointList() {
        return billGroupPointList;
    }

    public void setBillGroupPointList(List<BillGroupPoint> billGroupPointList) {
        this.billGroupPointList = billGroupPointList;
    }
}
