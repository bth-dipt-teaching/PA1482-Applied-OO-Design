    public class WizardFightBehaviour implements Behaviour {
      public boolean isActive() { return true; }
      public int predictEffect() { return 100; }
      public int predictSelfHealth() { return -50; }
      public int executeBehaviour() { return -50; } 
      public int respondToBehaviour(Behaviour theOtherBehaviour) { return 0; }
      public String getDescription() { return "valiantly wield your wand!"; }
    }
