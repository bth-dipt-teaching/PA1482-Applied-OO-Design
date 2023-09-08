public class Start {
  public static void main(String [] args) {
    Player p = new Player();
    p.addBehaviour("Flight");
    p.addBehaviour("WizardFight");
    p.fight();
  }
}
