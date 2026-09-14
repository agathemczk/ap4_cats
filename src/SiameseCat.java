public class SiameseCat extends Cat {

    public SiameseCat() {
        super();
    }

    public SiameseCat(String name, char state) {
        super(name, state);
    }

    public SiameseCat(String name) {
        super(name);
    }

    public SiameseCat(char state) {
        super(state);
    }

    @Override
    protected void dieExtendedBefore() {
        return;
    }

    @Override
    public void display() {
        System.out.println(this.getName() + "\n" +
                "  /\\_/\\\n" +
                " ( " + Cat.getEyesFromState(this.getState()) + " )\n" +
                "  (\"\"\"\"\") ~\n" +
                "   ww  ww" +
                "\n"
        );
    }
}
