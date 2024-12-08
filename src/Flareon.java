public class Flareon extends Eevee{
  public Flareon(){
    super("Fogo", 25.0, 0.9, 65, "Pedra de Fogo");
  }

  @Override
  public String ataque(){
    return "Brasa";
  }

  @Override
  public String defesa(){
    return "Rosnada";
  }

  @Override
  public String especial(){
    return "Rajada de Fogo";
  }
}
