public class Glaceon extends Eevee {
  public Glaceon(){
    super("Gelo", 29.9, 0.8, 65, "Pedra de Gelo");
  }

  @Override
  public String ataque(){
    return "Vento Congelante";
  }

  @Override
  public String defesa(){
    return "Caco de Gelo";
  }

  @Override
  public String especial(){
    return "Avalanche";
  }
}