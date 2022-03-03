package javaseAll.testFileAndIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {

    private static final long serialVersionUID = 2763875142806747272L;
    String name;
    //    transient，static  都不可读取
    transient int age;

    public Student() {
    }

    public void setCountry(String country) {
        this.country = country;
    }

    static String country=null;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +"country="+country+
                "，name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(country);
        out.writeUTF(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

         country= in.readUTF();
         name=in.readUTF();
          age= in.readInt();

    }
}
