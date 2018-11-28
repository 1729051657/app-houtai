package com.app.energyconsumptionmanagement.controller;

import com.app.common.user.vo.User;
import com.app.energyconsumptionmanagement.bean.BillGroupVo;
import com.app.energyconsumptionmanagement.service.BillGroupSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnergyConsumptionSituation {

    @Autowired
    BillGroupSrevice billGroupSrevice;
    @RequestMapping("/getGroup")
    @ResponseBody
    List<BillGroupVo> getGroup(HttpServletRequest request){
        User user =(User)request.getSession().getAttribute("userinfo");
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("build_id",user.getBuild_id());
        map.put("type",0);//账单
        return billGroupSrevice.getGroup(map);
    }
}
