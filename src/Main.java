public class Main {
    public static void main(String[] args) {
        Warrior warrior=new Warrior();
        Medic medic=new Medic();
        Magic magic=new Magic();
        Hero[]hero ={medic,warrior,magic};
        for (int i = 0; i <hero.length ; i++) {
            hero[i].applySuperAbility();
            

        }

    }
}