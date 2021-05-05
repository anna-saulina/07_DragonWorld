public class Dragon {
    private String name;
    private int tooth;

    public Dragon(String name, int tooth) {
        this.name = name;
        this.tooth = tooth;
    }

    public String getName() {
        return name;
    }

    public int getTooth() {
        return tooth;
    }

    public void fire(Dragon dragon) {
        String myName = getName();
        int myTooth = getTooth();
        String alienName = dragon.getName();
        System.out.println("\nDragon " + myName + " hit the dragon " + alienName + " by " + getTooth() + " tooth!!!");
    }
}
