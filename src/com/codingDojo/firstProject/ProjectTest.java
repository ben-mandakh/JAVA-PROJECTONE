
package com.codingDojo.firstProject;

public class ProjectTest{
    public static void main(String[] args){
        Project p = new Project();
        String greeting = p.greet();
        String greetingWithName = p.greet("Ben");
//        if(greeting.equals("Hello World!") || greetingWithName.equals("Hello Ben")){
//            System.out.println("Test successful");
//        }else{
//            System.out.println("Test Fail!");
//        }
    }
}