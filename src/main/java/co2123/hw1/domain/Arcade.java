package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Arcade {
    private int id;
    private String name;
    private String email;
    private List<Machine> machines = new ArrayList<>();

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Machine> getMachines() {
        return this.machines;
    }
    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
    public void addMachine(Machine machine) {
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
