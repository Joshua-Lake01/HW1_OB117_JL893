package co2123.hw1.domain;

public class Machine {
    private String manufacturer;
    private String type;
    private String genre;
    private int score;

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public String getType(){
        return this.type;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getScore(){
        return this.score;
    }
}
