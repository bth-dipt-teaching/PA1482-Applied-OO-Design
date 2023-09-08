    public class BravelyRunAwayBehaviour implements Behaviour {
      public boolean isActive() { return true; }
      public int predictEffect() { return 0; }
      public int predictSelfHealth() { return 0; }
      public int executeBehaviour() { return 0; } 
      public int respondToBehaviour(Behaviour theOtherBehaviour) { return 0; }
      public String getDescription() { return "bravely run away..."; }
    }
