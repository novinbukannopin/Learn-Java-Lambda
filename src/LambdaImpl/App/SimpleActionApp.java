package LambdaImpl.App;

import LambdaImpl.SimpleAction;

/**
 * @author Novin on 04/07/2022
 * @project Learn-Java-Lambda
 */
public class LambdaApp {
    public static void main(String[] args) {
        SimpleAction person = new SimpleAction("Novin", "Ardian");
        SimpleAction person1 = () -> "Novin";
    }
}
