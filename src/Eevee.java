public class Eevee {
  private String tipo;
  private int HP;
  private Double peso, altura;
  private String evolucao;

  public Eevee(String tipo, Double peso, Double altura, int HP, String evolucao) {
    this.tipo = tipo;
    this.peso = peso;
    this.altura = altura;
    this.HP = HP;
    this.evolucao = evolucao;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int hP) {
    HP = hP;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public String getEvolucao() {
    return evolucao;
  }

  public void setEvolucao(String evolucao) {
    this.evolucao = evolucao;
  }

  public String ataque() {
    return "Ataque rápido";
  }

  public String defesa() {
    return "Desvio";
  }

  public String especial() {
    return "Tri-Ataque";
  }

  public void Imprimir(){
    System.out.println("Tipo: " + tipo);
      System.out.println("Peso: " + peso + " kg");
      System.out.println("Altura: " + altura + " m");
      System.out.println("HP: " + HP);
      System.out.println("Fator de Evolução: " + evolucao);
      System.out.println("Ataque: " + ataque());
      System.out.println("Defesa: " + defesa());
      System.out.println("Especial: " + especial());
  }
}
