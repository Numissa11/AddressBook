package tutorial.adressbook.errors;

public class Main {
    public static void main(String[] args) {
        try {
            Aline aline = new Aline(true, "Alina");
            aline.checkAline();
        }
        catch (ExceptionAline e) {
            e.printStackTrace();
        }

    }
}
