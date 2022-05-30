package service.menu;

import service.menu.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void processAbstract() {
        System.out.println("register");
    }
}
