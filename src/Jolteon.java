public class Jolteon extends Eevee {
  public Jolteon(){
    super("Elétrico", 24.5, 0.8, 65, "Pedra do Trovão");
  }

  @Override
  public String ataque(){
    return "Presa Trovejante";
  }

  @Override
  public String defesa(){
    return "Discarga";
  }

  @Override
  public String especial(){
    return "Choque do Trovão";
  }
}