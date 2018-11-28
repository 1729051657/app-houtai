package com.app.energyconsumptionmanagement.service;

import com.app.energyconsumptionmanagement.bean.BillGroup;
import com.app.energyconsumptionmanagement.bean.BillGroupPoint;
import com.app.energyconsumptionmanagement.bean.BillGroupVo;

import java.util.List;
import java.util.Map;

/***
 //   ┏┓　　　┏┓
 // ┏┛┻━━━┛┻┓
 // ┃　　　　　　　┃ 　
 // ┃　　　━　　　┃
 // ┃　┳┛　┗┳　┃
 // ┃　　　　　　　┃
 // ┃　　　┻　　　┃
 // ┃　　　　　　　┃
 // ┗━┓　　　┏━┛
 //     ┃　　　┃ 神兽保佑　　　　　　　　
 //     ┃　　　┃ 代码无BUG！
 //     ┃　　　┗━━━┓
 //     ┃　　　　　　　┣┓
 //     ┃　　　　　　　┏┛
 //     ┗┓┓┏━┳┓┏┛
 //       ┃┫┫　┃┫┫
 //       ┗┻┛　┗┻┛
 */
public interface BillGroupSrevice {
    List<BillGroupVo> getGroup(Map map);
}
