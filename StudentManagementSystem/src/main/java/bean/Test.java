/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author Shireli
 */
public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Method[] methods = t.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            Annotation[] anns = m.getAnnotations();
            System.out.println(methods[i].getName());
            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                System.out.println("ann=" + ann.annotationType());
            }
            System.out.println("-------------------");
        }
    }
}
