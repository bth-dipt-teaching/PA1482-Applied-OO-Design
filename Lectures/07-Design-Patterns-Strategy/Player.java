import java.util.ArrayList;
public class Player {
  private ArrayList<Behaviour> myBehaviours = new ArrayList<>();
  private int myHealth = 1000;

  public Player() {};

  public void addBehaviour(String theBehaviour) {
    switch(theBehaviour) {
    case "WizardFight": myBehaviours.add(new WizardFightBehaviour()); break;
    case "SwordsmanFight": myBehaviours.add(new SwordsmanFightBehaviour()); break;
    case "Flight": myBehaviours.add(new BravelyRunAwayBehaviour()); break;
    default: /*throw new Exception("Unknown Behaviour"); */ break;
    }
  }

  public void fight() {
    Behaviour bestBehaviour = myBehaviours.get(0);
    int bestHealth = myHealth + bestBehaviour.predictSelfHealth();
    int bestDamage = bestBehaviour.predictEffect();;

    for (Behaviour b : myBehaviours) {
      int bHealth = myHealth + b.predictSelfHealth();
      int bDamage = b.predictEffect();
			
			System.out.println(bestHealth + " " + bestDamage + bestBehaviour.getDescription());
			System.out.println(bHealth + " " + bDamage + b.getDescription());

      if (bDamage > bestDamage &&
          bHealth >= bestHealth-100) {
        bestBehaviour = b;
      }
    }

    myHealth += bestBehaviour.executeBehaviour();
    System.out.println("You " + bestBehaviour.getDescription());
    System.out.println("Your health is now " + myHealth);
  }
}
