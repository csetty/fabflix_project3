// SmileyFacePart.java
//
// Chaitra Setty
// 70397614
// 4/20/2015 8:30PM
// ICS 45J : Lab Assignment 1
// 
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Face part copy constructor added by Norman Jacobson for ICS 21 
// computerUpperLeft() removed; that's now handled by the graphics routines,
// by Norman Jacobson for ICS21 WInter 2011, December 2011
// Updated for ICS45J by Norman Jacobson, August 2012

// Color objects are needed to represent the color of the face part
import java.awt.Color;

// A SmileyFacePart represents one part of a smiley face (i.e.,
// the face, an eye, or the smile); it has a color, position and size
abstract class SmileyFacePart
{
	// A part consists of its color, x and y coordinates of its center,
	// and its length in the x and y coordinates
	
	private int delX;
	private int delY;
	private Color color;
	private double lengthX;
	private double lengthY;
	
	// When we construct an "empty" SmileyFacePart, we set its color to
	// gray, while leaving as 0 all the values of its other attributes
	public SmileyFacePart()
	{
		color = Color.GRAY;
		delX = 0;
		delY = 0;
		lengthX = 0;
		lengthY = 0;
		
	}
	
	// A copy of a face part is a copy of each of its components
	public SmileyFacePart(SmileyFacePart orig)
	{
		delX = orig.delX;
		delY = orig.delY;
		color = orig.color;
		lengthX = orig.lengthX;
		lengthY = orig.lengthY;
		
	}
	
	// setAttributes() uses the appropriate helper methods to set the
	// various attributes of a SmileyFacePart.
	public void setAttributes(
		Color newColor, int newCenterX, int newCenterY,
		double newXLength, double newYLength)
	{
		color = newColor;
		delX = newCenterX;
		delY = newCenterY;
		lengthX = newXLength;
		lengthY = newYLength;
		
	}
	
	// translate() moves a SmileyFacePart the given distance horizontally
	// (deltaX) and vertically (deltaY). Positive values move right and down;
	// negative values move left and up
	public void translate(int deltaX, int deltaY)
	{
		delX = delX + deltaX;
		delY = delY + deltaY;
	}
	
	// scale() changes the size of a SmileyFacePart by the given factor.
	// For example, if the part is 20 x 20 and the scaleFactor is 3.5,
	// the part's new size should be 70 x70.
	public void scale(double scaleFactor)
	{
		lengthX = lengthX * scaleFactor;
		lengthY = lengthY * scaleFactor;
	}
	
	// setColor() sets the color of a SmileyFacePart to be the color
	// specified by c.
	public void setColor(Color c)
	{
		color = c;
	
	}
	
	// setCenter() sets the center x- and y-coordinates of a SmileyFacePart
	public void setCenter(int x, int y)
	{
		delX = x;
		delY = y;
		
	}
	
	// setXLength() sets the horizontal length of a SmileyFacePart
	public void setXLength(double xLen)
	{
		lengthX = xLen;
		
	}
	
	// setYLength() sets the vertical length of a SmileyFacePart
	public void setYLength(double yLen)
	{
		lengthY = yLen;
		
	}
	
	// Accessor methods to return each of the attributes
	// of a SmileyFacePart.
	
	public Color getColor()
	{
		return color;
	}
	
	public int getCenterX()
	{
		return delX;
	
	}
	
	public int getCenterY()
	{
		return delY;
	}
	
	public double getXLength()
	{
		return lengthX;
	}
	
	public double getYLength()
	{
		return lengthY;
	}
	
}

// Each part of the face is just a SmileyFacePart --
// but we have each face part as a separate class to
// help keep them straight, and in case in future
// we want specific parts to have characteristics
// particular to them.

// Each class as a constructor that builds a
// "default part"; that is, it calls the
// SmileyFacePart no-parameter constructor.
// Each class also has a copy constructor that 
// makes a copy of its kind of object; again, 
// since every part here is a face part, we 
// just invoke SmileyFacePart's copy constructor.

class Face extends SmileyFacePart
{
	public Face()
	{
		super();
	}
	
	public Face(Face orig)
	{
		super(orig);
	}
}

class Eye extends SmileyFacePart
{
	public Eye()
	{
		super();
	}
	
	public Eye(Eye orig)
	{
		super(orig);
	}
}

class Smile extends SmileyFacePart
{
	public Smile()
	{
		super();
	}
	
	public Smile(Smile orig)
	{
		super(orig);
	}
}

