public class Leafeon extends Eevee {
  public Leafeon(){
    super("Grama", 25.5, 1.0, 65, "Pedra de Grama");
  }

  @Override
  public String ataque(){
    return "Folha Navalha"; // Razor Leaf
  }

  @Override
  public String defesa(){
    return "Projétil de Semente"; // Bullet Seed
  }

  @Override
  public String especial(){
    return "Raio Solar";
  }
}
