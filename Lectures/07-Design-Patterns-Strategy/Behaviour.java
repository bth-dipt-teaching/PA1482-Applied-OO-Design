        public interface Behaviour {
          public boolean isActive();
          public int predictEffect();
          public int predictSelfHealth();
          public int executeBehaviour();
          public int respondToBehaviour(Behaviour theOtherBehaviour);
          public String getDescription();
        }
