package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuShowTeachersServiceInter;

public class MenuShowTeacherService implements MenuShowTeachersServiceInter{
    @Override
    public void processAbstract() {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
        }
    }
}
