import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashSet;

public class Pokemon {
    public String name;
    private int health;
    private int lengte;
    //private Set<String> Pokemons= new HashSet<>();



    public Pokemon(String name, int health, int lengte) {
        this.name = name;
        this.health = health;
        this.lengte = lengte;
    }
    void aanval(){
        System.out.println("aanval");
    }
    void verdedig(){
        System.out.println("verdedig");
    }

    public void setHealth(int health){
        this.health = health;
    }
    public void setLengte(int lengte){
        this.lengte = lengte;
    }
    public int getHealth() {
        return health;
    }
    public int getLengte() {
        return lengte;
    }
    public void special(){//overide
        System.out.println(" Parent_special");
    }

}


class FirePokemon extends Pokemon{
    private String aanval = "vuur aanval";
    private int schade = 10;
    FirePokemon(String name, int health, int lengte){
        super(name,health,lengte);
    };
    public void aanval1(){
        System.out.println(" vuur_f1 " + aanval);
    }
    public void aanval2(){
        System.out.println(" vuur_f2 " + aanval);
    }

    public void setAanval(String aanval) {
        this.aanval = aanval;
    }

    public void setSchade(int schade) {
        this.schade = schade;
    }

    public String getAanval() {
        return aanval;
    }

    public int getSchade() {
        return schade;
    }
    @Override public void special(){//overide
        System.out.println(" vuur_special");
    }
}
class WaterPokemon extends Pokemon{
    private String aanval = "waterr aanval";
    private int schade = 10;
    WaterPokemon(String name, int health, int lengte){
        super(name,health,lengte);
    };
    public void aanval1(){
        System.out.println(" water_f1 " + aanval);
    }
    public void aanval2(){
        System.out.println(" water_f2 " + aanval);
    }

    public void setAanval(String aanval) {
        this.aanval = aanval;
    }

    public void setSchade(int schade) {
        this.schade = schade;
    }

    public String getAanval() {
        return aanval;
    }

    public int getSchade() {
        return schade;
    }
    @Override public void special(){//overide
        System.out.println(" water_special");
    }
}
class GrassPokemon extends Pokemon{
    private String aanval = "Grass aanval";
    private int schade = 10;
    GrassPokemon(String name, int health, int lengte){
        super(name,health,lengte);
    };
    public void aanval1(){
        System.out.println(this.name +" Grass_f1 " + aanval);
    }
    public void aanval2(){
        System.out.println(" Grass_f2 " + aanval);
    }

    public void setAanval(String aanval) {
        this.aanval = aanval;
    }

    public void setSchade(int schade) {
        this.schade = schade;
    }

    public String getAanval() {
        return aanval;
    }

    public int getSchade() {
        return schade;
    }
    @Override public void special(){//overide
        System.out.println(" Grass_special");
    }
}
class ElectricPokemon extends Pokemon{
    private String aanval = "Electric aanval";
    private int schade = 10;
    ElectricPokemon(String name, int health, int lengte){
        super(name,health,lengte);
    };
    public void aanval1(){
        System.out.println(" Electric_f1 " + aanval);
    }
    public void aanval2(){
        System.out.println(" Electric_f2 " + aanval);
    }

    public void setAanval(String aanval) {
        this.aanval = aanval;
    }

    public void setSchade(int schade) {
        this.schade = schade;
    }

    public String getAanval() {
        return aanval;
    }

    public int getSchade() {
        return schade;
    }
    @Override public void special(){//overide
        System.out.println(" Electric_special");
    }
}




