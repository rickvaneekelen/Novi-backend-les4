


//pokemon(pokemon name, attack skill, defend skill,health, stamina )
    //abilities
        //attack (attack name)
            //attacks (has a list of attacks with description)
        //defend
            //defensiveAtack()
            //defense
        //eat()
        //drink()
    //body status
        //hp (health points)
        //stamina energie status
        //type (water,vuur,grass,electric) list met types
        //skill level
            //attack skill
            //defend skill
//


class Program{
    public static void main(String[] args){
        //test parent met functie die door specifieke pokemon wordt overschreven
        Pokemon pokemon = new Pokemon("piet",80,180);
        pokemon.special();

        //test het maken van een specifieke pokemon
        FirePokemon pikashu = new FirePokemon("jan",80,180);
        pikashu.special();

        //test het maken van de andere pokemons
        WaterPokemon watie = new WaterPokemon("watie",80,180);
        watie.special();

        ElectricPokemon electo = new ElectricPokemon("Elect", 80, 180);
        electo.special();

        GrassPokemon Gras = new GrassPokemon("Gras", 80, 180);
        Gras.special();

        //test een get en set uit parent
        //test een get
        System.out.println("get gras health " + Gras.getHealth());

        //test een set
        Gras.setHealth(90);
        System.out.println("get gras health after set to 90 = " + Gras.getHealth());

        //voer verschillende functies uit
        System.out.println("gras f1 = " );
        Gras.aanval1();

        System.out.println("gras f2 = " );
        Gras.aanval2();
        //testing done
    }
}

