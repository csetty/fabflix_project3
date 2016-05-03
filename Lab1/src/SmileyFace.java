// SmileyFace.java
// 
// Chaitra Setty
// 70397614
// 4/20/15 8:33PM
// ICS 45J : Lab Assignment 1
// 
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Revised and adapted for ICS45J Fall 2012 by Norman Jacobson, August 2012

// The class representing one smiley face
public class SmileyFace
{
	private Face smileyFace;
	private Eye leftEye;
	private Eye rightEye;
	private Smile smile;
	
	// A SmileyFace consists of four parts:
	// * A face (the circle that underlies the entire smiley face)
	// * A left eye
	// * A right eye
	// * A smile

	// When we construct a new SmileyFace from scratch, we create
	// a new face, new eyes, and a new smile, but don't give them
	// any characteristics; they are filled in later.
	public SmileyFace()
	{
		smileyFace = new Face();
		leftEye = new Eye();
		rightEye = new Eye();
		smile = new Smile();
			
	}
	
	// When we construct a new SmileyFace that is intended to be a
	// copy of an original SmileyFace, we construct each new part
	// from the same part of the old face
	public SmileyFace(SmileyFace original)
	{
		smileyFace = original.smileyFace;
		leftEye = original.leftEye;
		rightEye = original.rightEye;
		smile = original.smile;
	}
	
	// translate() moves the entire face, including all of its parts,
	// by the given horizontal (deltaX) and vertical (deltaY)
	// distances. Positive values move the figure right and down; 
	// negative ones up and left
	public void translate(int deltaX, int deltaY)
	{
		smileyFace.translate(deltaX, deltaY);
		leftEye.translate(deltaX, deltaY);
		rightEye.translate(deltaX, deltaY);
		smile.translate(deltaX, deltaY);
		
	}
	
	// Accessors that return each part of a SmileyFace:
	
	public Face getFace()
	{
		return smileyFace;
	}
	
	public Eye getLeftEye()
	{
		return leftEye;
	}
	
	public Eye getRightEye()
	{
		return rightEye;
	}
	
	public Smile getSmile()
	{
		return smile;
	}
	
	// Accessors that return the 'edges' of the
	// smiley - the leftmost, rightmost, topmost,  
	// and bottom-most points
	
	public int getLeftEdge()
	{
		return smileyFace.getCenterX() - (int) smileyFace.getXLength();
		
	}
	
	public int getRightEdge()
	{
		return smileyFace.getCenterX() + (int) smileyFace.getXLength();
	}
	
	public int getTopEdge()
	{
		return smileyFace.getCenterY() + (int) smileyFace.getYLength();
	}
	
	public int getBottomEdge()
	{
		return smileyFace.getCenterY() - (int) smileyFace.getYLength();
	}
	
}

