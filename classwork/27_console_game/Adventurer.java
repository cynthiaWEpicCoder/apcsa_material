// Collaborators:

import java.util.*;

public abstract class Farmer{
  private String name;
  private int coins;
  private ArrayList<int> inv = ArrayList<int>();

  public Farmer(String name, int hp){
      this.name = name;
      this.coins = 0;
  }

  public abstract int getType();

  public int getCoins(){
    return coins;
  }

  public void changeCoins(int c)
  
}
