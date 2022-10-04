package com.giovannicacioli.pratica04;

import java.util.ArrayList;

public class Laboratory {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Laboratory() {
    }

    public Laboratory(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<Professor>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student s) {
        this.students.add(s);
    }

    public void addMember(Professor p) {
        this.professors.add(p);
    }

    public ArrayList<String> getContactInfos() {
        ArrayList<String> contacts = new ArrayList<String>();
        for (int i = 0; i < students.size(); i++){
            contacts.add(students.get(i).getContactInfo());
        }
        for (int i = 0; i < professors.size(); i++){
            contacts.add(professors.get(i).getContactInfo());
        }
        return contacts;
    }

    public boolean userExists(String userId) {
        for(int i = 0; i < students.size(); i++){
            if(userId.equals(students.get(i).getUserId())){
                return true;
            }
        }
        for(int i = 0; i < professors.size(); i++) {
            if (userId.equals(professors.get(i).getUserId())) {
                return true;
            }
        }
        return false;
    }

    public int countMembers() {
        int i, c = 0;
        for(i = 0; i < students.size(); i++){};
        for(c = 0; c < professors.size(); c++) {}
        return i+c;
    }
}
