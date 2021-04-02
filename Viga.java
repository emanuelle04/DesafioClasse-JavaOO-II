public class Viga{
  private double altura;
  private double base;
  private double comprimento;

  public Viga (double alt, double bs, double comp){
    altura =  alt;
    base = bs;
    comprimento =  comp;
  }

  public double getAltura(){
    return altura;
  }

   public double getBase(){
    return base;
  }

   public double getComprimento(){
    return comprimento;
  }

  public double calcularVolume(){
     double volume = altura*base*comprimento;
    return volume;
  }

}