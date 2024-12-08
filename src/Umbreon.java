public class Umbreon extends Eevee{
  public Umbreon(){
    super("Noturno", 27.0, 1.0, 95, "Amizade alta - Noite");
  }

  @Override
  public String ataque(){
    return "Rosnado";
  }

  @Override
  public String defesa(){
    return "Jogo Sujo";
  }

  @Override
  public String especial(){
    return "Pulso Sombrio";
  }
}
