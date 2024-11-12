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
    public static int estimated_id;
   // public static Arcade first_arcade = new Arcade();
    public static void main(String[] args) {

        Arcade first_arcade = new Arcade();
        first_arcade.setName("Cool Arcade");
        set_unique_id(first_arcade);
        first_arcade.setEmail("support@CoolArcade.com");


        Arcade second_arcade = new Arcade();
        second_arcade.setName("Not as Cool Arcade");
        for(int x=1;x<=2;x++){
            if(x == 1){
                Machine CoolMachine = new Machine();
                CoolMachine.setGenre("Action");
                CoolMachine.setManufacturer("Apple");
                CoolMachine.setType("VR");
                CoolMachine.setScore(1999);
                first_arcade.addMachine(CoolMachine);
            }else if(x == 2){
                Machine NotAsCoolMachine = new Machine();
                NotAsCoolMachine.setGenre("Racing");
                NotAsCoolMachine.setManufacturer("Atari");
                NotAsCoolMachine.setType("Racer");
                NotAsCoolMachine.setScore(4321);
                first_arcade.addMachine(NotAsCoolMachine);
            }
        }
        arcades.add(first_arcade);
      //  arcades.add(second_arcade);
        //System.out.println(first_arcade.get_name());
        SpringApplication.run(Hw1Application.class, args);
        if(deleted_ids.isEmpty()){
           estimated_id = current_arcade_id_counter;
        }
    }


    public void delete_arcade(Arcade arcade){
        deleted_ids.add(arcade.getId());
        estimated_id = deleted_ids.get(0);
        arcades.remove(arcade);
    }

    public static void set_unique_id(Arcade arcade){
        if(deleted_ids.isEmpty()){
            arcade.setId(current_arcade_id_counter);
            current_arcade_id_counter++;
            estimated_id = current_arcade_id_counter;
        }else {
            //make id = to first in deleted ids and remove used id from list
            arcade.setId(deleted_ids.get(0));
            deleted_ids.remove(0);
            if(deleted_ids.isEmpty()){
                estimated_id = current_arcade_id_counter;
            }else{
                estimated_id = deleted_ids.get(0);
            }
        }
    }
}


