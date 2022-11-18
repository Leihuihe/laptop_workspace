/*
 *  
 * Coin.java -> H9-3
 * 
 *   Modify this as described in the handout...
 *   
 */

//********************************************************************
//  Coin.java       Java Foundation
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin implements Lockable
{
    private final int HEADS = 0;  // tails is 1

    private int face;  // current side showing

    private int key;
    private boolean state;
    //-----------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //-----------------------------------------------------------------
    public Coin()
    {
    	this.state = false;
    	this.key = 0;
        flip();
        
    }

    //-----------------------------------------------------------------
    //  Flips this coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip()
    {
    	if(this.state == false)
    		face = (int) (Math.random() * 2);
    	else
    		StdOut.println("Locked: can't invoke method");
    }

    //-----------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //-----------------------------------------------------------------
    public boolean isHeads()
    {
    	if(this.state == false)
    		return (face == HEADS);
    	else   		
    		StdOut.println("Locked: can't invoke method");
    		return false;
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
    	if(this.state == false)
        	return (face == HEADS) ? "Heads" : "Tails";
        else
        	return "Locked: can't invoke method";
    		
    }

	@Override
	public void setKey(int key) {
		this.key = key;
		
	}

	@Override
	public void lock(int key) {
		if(this.key == key)
			this.state = true;
		else 
			StdOut.println("Wrong key");
		
		
	}

	@Override
	public void unlock(int key) {
		if(this.key == key)
			this.state = false;
		else 
			StdOut.println("Wrong key");
		
		
	}

	@Override
	public boolean locked() {
		return this.state;
	}
}
