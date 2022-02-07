package assignment1;

public abstract class Quadrilateral {
	
	int base;
	int height;
   public int getBase() {
		return base;
	}

public int getHeight() {
		return height;
	}
public void setBase(int base) {
		this.base = base;
	}


public void setHeight(int height) {
		this.height = height;
	}

public Quadrilateral(int base, int height) {
	super();
	this.base = base;
	this.height = height;
}

abstract void area();




}

