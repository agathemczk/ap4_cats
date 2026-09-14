public class PlasticCat extends Cat {

    public PlasticCat() {
        super();
    }

    public PlasticCat(String name, char state) {
        super(name, state);
    }

    public PlasticCat(String name) {
        super(name);
    }

    public PlasticCat(char state) {
        super(state);
    }

    @Override
    public void dieExtendedBefore() {
        System.out.println("pouet!\n");
        this.setNumberOfLivesRemaining(this.getNumberOfLivesRemaining() + 1);
    }

    @Override
    public void display() {
        System.out.println(this.getName() + "\n" +
                "  /\\_/\\\n" +
                " ( o o )\n" +
                "  (¤ ¤ ¤) ~\n" +
                "   ww  ww" +
                "\n"
        );
    }
}
