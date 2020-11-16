package com.jiankang.improvejava151suggests.chapter2.v5;

/*
 *@create by jiankang
 *@date 2020/11/13 @time 19:33
 */

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/11/13   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class Son extends FatherImpl implements Mother {
    @Override
    public int kind() {
        return new MotherSpecial().kind();
    }

    @Override
    public int strong() {
        return super.strong() + 1;
    }

    private class MotherSpecial extends MotherImpl {
        @Override
        public int kind() {
            return super.kind() - 1;
        }
    }
}
