package com.jiankang.designismethod2.statuspattern.v1;

/*
 *@create by jiankang
 *@date 2019/12/9 time 20:59
 */

public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                this.openWithLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithLogic();
                this.setState(OPENING_STATE);
                break;
        }


    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.state = CLOSE_STATE;
                break;
            case CLOSE_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }

    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                this.runWithLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithLogic();
                this.setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                this.stopWithLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    //纯粹的操作，不考虑实际的逻辑
    private void closeWithoutLogic() {
        System.out.println("电梯门关闭。。。");
    }

    private void openWithLogic() {
        System.out.println("电梯门开启。。。");
    }

    private void stopWithLogic() {
        System.out.println("电梯门停止。。。");
    }

    private void runWithLogic() {
        System.out.println("电梯门运行起来。。。");
    }
}
