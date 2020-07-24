
public class Character {
	  public String name;
	    public int strength;
	    public int health;
	    
	    
	    public int takeDamage( int damage ){
	        int damageTaken = damage;
	        this.health -= damageTaken;
	        return damageTaken;
	    }
	    public int attack(Character target){
	        int damage = this.strength;
	        int damageDealt = target.takeDamage(damage);
	        return damageDealt;
	    }
	    public boolean isAlive() {
	    	return this.health > 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
