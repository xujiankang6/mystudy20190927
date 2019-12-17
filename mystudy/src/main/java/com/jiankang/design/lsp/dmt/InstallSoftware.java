package com.jiankang.design.lsp.dmt;

/*
 *@create by jiankang
 *@date 2019/11/1 time 20:32
 */

public class InstallSoftware {

    void installWizard(Wizard wizard) {
        wizard.installWizard();
    }

    public static void main(String[] args) {
        InstallSoftware installSoftware=new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}
