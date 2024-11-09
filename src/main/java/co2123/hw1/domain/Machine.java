package co2123.hw1.domain;

public class Machine {
    private String manufacturer;
    private String type;
    private String genre;
    private int score;

    public void set_manufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void set_type(String type){
        this.type = type;
    }
    public void set_genre(String genre){
        this.genre = genre;
    }
    public void set_score(int score){
        this.score = score;
    }
    public String get_manufacturer(){
        return manufacturer;
    }
    public String get_type(){
        return type;
    }
    public String get_genre(){
        return genre;
    }
    public int get_score(){
        return score;
    }
}
