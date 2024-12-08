public class Sylveon extends Eevee {
  public Sylveon(){
    super("Fada", 23.5, 1.0, 65, "Amizade máxima e golpe tipo fada");
  }

  @Override
  public String ataque(){
    return "Clarão Deslumbrante";
  }

  @Override
  public String defesa(){
    return "Encanto";
  }

  @Override
  public String especial(){
    return "Beijo Drenante";
  }
}
