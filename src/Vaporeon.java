public class Vaporeon extends Eevee{
  public Vaporeon(){
    super("Água", 29.0, 1.0, 130, "Pedra da Água");
  }

  @Override
  public String ataque(){
    return "Revólver d'Água";
  }

  @Override
  public String defesa(){
    return "Aqua Cauda"; // Aqua Tail
  }

  @Override
  public String especial(){
    return "Jato d'Água";
  }
}
