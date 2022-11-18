/*
 *  
 * Lockable.java -> H9-3
 * 
 */


public interface Lockable
{
	// complete this
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean locked();
}

