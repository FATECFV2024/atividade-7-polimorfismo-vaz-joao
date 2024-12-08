public class Espeon extends Eevee {
  public Espeon(){
    super("Psiquico", 26.5, 0.9, 65, "Amizade alta - Dia");
  }

  @Override
  public String ataque(){
    return "Confusão";
  }

  @Override
  public String defesa(){
    return "Troca de Força";
  }

  @Override
  public String especial(){
    return "Raio Psíquico";
  }
}