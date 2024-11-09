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



        Arcade first_arcade = new Arcade();
        first_arcade.set_name("Cool Arcade");
        set_unique_id(first_arcade);
        first_arcade.set_email("support@CoolArcade.com");

        for(int x=1;x<=2;x++){
            if(x == 1){
                Machine CoolMachine = new Machine();
                CoolMachine.set_genre("Action");
                CoolMachine.set_manufacturer("Apple");
                CoolMachine.set_type("VR");
                CoolMachine.set_score(9000);
                first_arcade.add_machine(CoolMachine);
            }else if(x == 2){
                Machine NotAsCoolMachine = new Machine();
                NotAsCoolMachine.set_genre("Racing");
                NotAsCoolMachine.set_manufacturer("Atari");
                NotAsCoolMachine.set_type("Racer");
                NotAsCoolMachine.set_score(4321);
                first_arcade.add_machine(NotAsCoolMachine);
            }
        }
        arcades.add(first_arcade);

        SpringApplication.run(Hw1Application.class, args);
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


