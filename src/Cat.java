public abstract class Cat {

    public final static int NUMBER_OF_LIVES = 9;
    private final static char DEFAULT_STATE = 's';
    private final static String DEFAULT_NAME = "Mégatron";

    private char state;
    private String name;
    private int numberOfLivesRemaining;

    public Cat(String name, char state) {
        this.name = name;
        this.state = state;
        this.numberOfLivesRemaining = Cat.NUMBER_OF_LIVES;
    }

    public Cat(String name) {
        this(name, Cat.DEFAULT_STATE);
    }

    public Cat(char state) {
        this(Cat.DEFAULT_NAME, state);
    }

    public Cat() {
        this(Cat.DEFAULT_NAME, Cat.DEFAULT_STATE);
    }

    protected static String getEyesFromState(char state) {
        return switch (state) {
            case 's' -> "_ _";
            case 'a' -> "0 0";
            case 'd' -> "x x";
            default -> throw new IllegalArgumentException("invalid state " + state);
        };
    }

    public final char getState() {
        return this.state;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final int getNumberOfLivesRemaining() {
        return this.numberOfLivesRemaining;
    }

    protected final void setNumberOfLivesRemaining(final int numberOfLivesRemaining) {
        this.numberOfLivesRemaining = numberOfLivesRemaining;
    }

    public final void die() {
        if (this.numberOfLivesRemaining == 0) return;
        this.numberOfLivesRemaining--;
        this.state = (this.numberOfLivesRemaining == 0) ? 'd' : this.state;
        this.dieExtendedBefore();
    }

    protected abstract void dieExtendedBefore();

    public final void sleep() {
        if (this.state == 'd') return;
        this.state = 's';
    }

    public final void wakeUp() {
        if (this.state == 'd') return;
        this.state = 'a';
    }

    public abstract void display();
}