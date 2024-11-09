package co2123.hw1;
import co2123.hw1.domain.Machine;
import co2123.hw1.domain.Arcade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;



@SpringBootApplication
public class Hw1Application {
    private static List<Integer> deleted_ids = new ArrayList<>();
    private static int current_arcade_id_counter = 0;
    public static List<Arcade> arcades = new ArrayList<>();

    public static void main(String[] args) {

        SpringApplication.run(Hw1Application.class, args);



        List<Machine> machines = new ArrayList<>();

        for(int x=1;x<=2;x++){
            if(x == 1){
                machines.get(x).set_genre("Action");
                machines.get(x).set_manufacturer("Apple");
                machines.get(x).set_type("VR");
                machines.get(x).set_score(9000);
            }else if(x == 2){
                machines.get(x).set_genre("Racing");
                machines.get(x).set_manufacturer("Atari");
                machines.get(x).set_type("Racer");
                machines.get(x).set_score(4321);
            }
        }

        Arcade first_arcade = new Arcade();
        first_arcade.set_name("Cool Arcade");
        set_unique_id(first_arcade);
        first_arcade.set_email("support@CoolArcade.com");
        for(Machine machine : machines){
            first_arcade.add_machine(machine);
        }

        arcades.add(first_arcade);
    }


    public void delete_arcade(Arcade arcade){
        deleted_ids.add(arcade.get_id());
        arcades.remove(arcade);

    }
    public static void set_unique_id(Arcade arcade){
        if(deleted_ids.isEmpty()){
            arcade.set_Id(current_arcade_id_counter);

        }else {
            //make id = to first in deleted ids and remove used id from list
            arcade.set_Id(deleted_ids.get(0));
            deleted_ids.remove(0);
        }
    }
}


