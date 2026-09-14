public class AlleyCat extends Cat {

    public AlleyCat() {
        super();
    }

    public AlleyCat(String name, char state) {
        super(name, state);
    }

    public AlleyCat(String name) {
        super(name);
    }

    public AlleyCat(char state) {
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
                "  (\'\'\'\'\') ~\n" +
                "   ww  ww" +
                "\n"
        );
    }

}
