    public class SwordsmanFightBehaviour implements Behaviour {
      public boolean isActive() { return true; }
      public int predictEffect() { return 200; }
      public int predictSelfHealth() { return -10; }
      public int executeBehaviour() { return -10; } 
      public int respondToBehaviour(Behaviour theOtherBehaviour) { return 10; }
      public String getDescription() { return "skillfully slash your sword!"; }
    }
