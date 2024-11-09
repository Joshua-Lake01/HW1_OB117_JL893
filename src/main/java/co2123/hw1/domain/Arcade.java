package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Arcade {
    private int id;
    private String name;
    private String email;
    private List<Machine> machines = new ArrayList<>();

    public int get_id() {
        return this.id;
    }
    public void set_Id(int id) {
        this.id = id;
    }
    public String get_name() {
        return this.name;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public String get_email() {
        return this.email;
    }
    public void set_email(String email) {
        this.email = email;
    }
    public List<Machine> get_machines() {
        return this.machines;
    }
    public void set_machines(List<Machine> machines) {
        this.machines = machines;
    }
    public void add_machine(Machine machine) {
        this.machines.add(machine);
    }
    @Override
    public String toString() {
        return "Arcade{name='" + name + "', email='" + email + "', machines=" + machines.size() + "}";
    }

    public String getArcadeSummary() {
        return "Arcade: " + name + " (" + email + ") has " + machines.size() + " machine(s).";
    }

}
