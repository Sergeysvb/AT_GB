package dz7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> contacts = new HashMap<>();

    public void add(String name, String phone) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        List<String> values = contacts.get(name);
        values.add(phone);
    }

    public void get(String name) {
        List<String> values = contacts.get(name);
        System.out.println(name + " : " + values);
    }
}

