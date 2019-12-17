package com.jiankang.designismethod2.adapterpattern.v3;

/*
 *@create by jiankang
 *@date 2019/11/21 time 17:27
 * 对象适配器： 关联关系
 */

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
    //源目标对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    //数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;


    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    //家庭电话号码
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    //职位信息
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    //手机号码
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    //办公电话
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    // 员工的名称
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }
}
