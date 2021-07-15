package com.jetbrains.patternmatching.forinstanceof;

class Project {
    Lang lang;
    Emp projManager;

    public Emp getProjManager() {
        return projManager;
    }
    public void setProjManager(Emp projManager) {
        this.projManager = projManager;
    }
    public Lang getLang() {
        return lang;
    }
    public void setLang(Lang lang) {
        this.lang = lang;
    }
}

enum Lang {JAVA, PASCAL}

class Emp { }

class Location { }

class CEO extends Emp {
    Location loc;
    boolean availableAt(Location location) {
        return loc.equals(location);
    }
}

/*
    private String str = "Initial Value";

    void outputValueInUppercase(Object obj) {
        if (!(obj instanceof String str)) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }*/
