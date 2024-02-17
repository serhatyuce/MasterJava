package polymorphsim;

public class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),"bad aliens do bad staff","space guys chase aliens","planet blows up");
    }

}
