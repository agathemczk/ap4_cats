public class PersianCat extends Cat {

    public PersianCat() {
        super();
    }

    public PersianCat(String name, char state) {
        super(name, state);
    }

    public PersianCat(String name) {
        super(name);
    }

    public PersianCat(char state) {
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
                "  (     ) ~\n" +
                "   ww  ww" +
                "\n"
        );
    }
}
