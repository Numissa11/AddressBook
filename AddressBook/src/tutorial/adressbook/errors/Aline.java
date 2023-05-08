package tutorial.adressbook.errors;

public class Aline {
 public boolean isStudying;
 public String firstName;

  public Aline(boolean isStudying, String firstName) {
      this.isStudying = isStudying;
      this.firstName = firstName;

  }
  public void checkAline() throws ExceptionAline {
      if(this.firstName != "Aline") {
          throw new ExceptionAline();
      }
  }
}
