package slavadef.gmail.com;

import com.google.gson.Gson;

public class MyName {
    public static void main(String[] args) {
        Person person = new Person("Viacheslav", "Fedosenko");
        System.out.println(new Gson().toJson(person));
    }
}