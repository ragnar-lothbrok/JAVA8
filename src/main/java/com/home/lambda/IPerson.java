package com.home.lambda;

public interface IPerson {

    public String getName();

    public int getAge();

    default String getPersonInfo() {
        return getName() + " (" + getAge() + ")";
    }
    
    static String getPersonInfos(Person p) {
        return p.getName() + " (" + p.getAge() + ")";
    }

}
