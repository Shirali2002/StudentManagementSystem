package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.inter.MenuAddStudentServiceInter;
import util.FileUtility;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processAbstract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname: ");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("student added.");
    }

}
