```ruby

package com.hello_world;

public class Student {
    private int Id;
    
    
    private String Name;

    public Student (int Id, String Name) {
    
        this.Id = Id;
        this.Name = Name;
    }

    public int getId () {
        return Id;
    }

    public void setId (int Id) {
        this.Id = Id;
    }

    public String getName () {
        return Name;
    }

    public void setName (String Name) {
        this.Name = Name;
    }

    @Override
    public String toString () {
        return "Student{"  "+ "Id=" + Id + ", Name=" + Name }';
    }
}



```
