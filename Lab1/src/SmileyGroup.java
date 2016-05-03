// SmileyGroup.java
//
// Chaitra Setty
// 70397614
// 4/20/15 8:41PM
// ICS 45J : Lab Assignment 1
// 
// Originally coded by Norman Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Minor modifications by Norman Jacobson for ICS 21 Fall 2009, September 2009
// Revised and adapted by Norman Jacobson for ICS45J Fall 2012, August 2012

// SmileyGroup is going to be specifying (to other methods) the 
// colors the various smiley face parts ought to be, so we need to 
// have the Color library available:

import java.awt.Color;

// The predefined Colors (they are final Color objects) are
//		BLACK, BLUE, CYAN, GRAY, DARK_GRAY, LIGHT_GRAY, GREEN, MAGENTA,
//		ORANGE, PINK, RED, WHITE, YELLOW

// A SmileyGroup represents a collection of up to three smiley faces,
// each with its own attributes.
public class SmileyGroup
{
	// Provide fields for the three smiley faces that make up the group
	
	// The constructor builds up to three smileys in the group.  You
	// can construct each face either from scratch or as a copy of an
	// existing one, setting the attributes of the various face parts,
	// translating and/or scaling face parts, or translating the
	// entire smiley face, by calling the appropriate methods.
	//
	// See the lab write-up for the kinds of smiley faces we're expecting
	// you to create and the methods we expect you to employ; withint those
	// requirements, the exact characteristics (shape, color, position) of 
	// each smiley is up to you.
	
	public SmileyGroup()
	{
		getSmiley1();
		getSmiley2();
		getSmiley3();
			
	}
	
	// Obtain the first smiley face of the group
	public SmileyFace getSmiley1()
	{
		SmileyFace smileyFace1 = new SmileyFace();
		smileyFace1.getFace().setAttributes(Color.ORANGE,100,100,100,100);
		smileyFace1.getLeftEye().setAttributes(Color.YELLOW,80,80,10,10);
		smileyFace1.getRightEye().setAttributes(Color.YELLOW,120,80,10,10);
		smileyFace1.getSmile().setAttributes(Color.CYAN,100,120,50,10);
		return smileyFace1;
			
	}
	
	// Obtain the second smiley face of the group
	public SmileyFace getSmiley2()
	{
		SmileyFace smileyFace2 = new SmileyFace(getSmiley1());
		
		getSmiley1().getRightEdge();
		getSmiley1().getLeftEdge();
		getSmiley1().getBottomEdge();
		getSmiley1().getTopEdge();
		/*
		System.out.println(getSmiley1().getRightEdge());
		System.out.println(getSmiley1().getLeftEdge());
		System.out.println(getSmiley1().getBottomEdge());
		System.out.println(getSmiley1().getTopEdge());
		
		Printed out edges to understand the dimensions of getSmiley1
		*/
		getSmiley1().getFace().getCenterY();
		getSmiley1().getFace().getCenterX();
		getSmiley1().getFace().getXLength();
		getSmiley1().getFace().getYLength();
		
		/*
		System.out.println(getSmiley1().getFace().getCenterY());
		System.out.println(getSmiley1().getFace().getCenterX());
		System.out.println(getSmiley1().getFace().getXLength());
		System.out.println(getSmiley1().getFace().getYLength()); 
		
		Printed out coordinates of getSmiley1
		*/
		
		// Creates a new smiley face using the information from the first smiley face 
		smileyFace2.getFace().scale(2);
		smileyFace2.getFace().setColor(Color.BLUE);
		smileyFace2.getRightEye().scale(3);
		smileyFace2.getRightEye().setCenter(130,80);
		smileyFace2.getRightEye().setColor(Color.CYAN);
		smileyFace2.getLeftEye().scale(3);
		smileyFace2.getLeftEye().setCenter(60,80);
		smileyFace2.getLeftEye().setColor(Color.CYAN);
		smileyFace2.getSmile().scale(1);
		smileyFace2.getSmile().setCenter(93,150);
		smileyFace2.getSmile().setColor(Color.YELLOW);
		
		smileyFace2.translate(120,120);
		return smileyFace2;
			
	}
	
	// Obtain the third smiley face of the group
	public SmileyFace getSmiley3()
	{
		SmileyFace smileyFace3 = new SmileyFace(getSmiley2());
		getSmiley2().getRightEdge();
		getSmiley2().getLeftEdge();
		getSmiley2().getBottomEdge();
		getSmiley2().getTopEdge();
		
		/*
		System.out.println(getSmiley2().getRightEdge());
		System.out.println(getSmiley2().getLeftEdge());
		System.out.println(getSmiley2().getBottomEdge());
		System.out.println(getSmiley2().getTopEdge());
		
		Printed out edges to understand the dimensions of getSmiley2
		*/
		
		getSmiley2().getFace().getCenterY();
		getSmiley2().getFace().getCenterX();
		getSmiley2().getFace().getXLength();
		getSmiley2().getFace().getYLength();
		
		/*
		System.out.println(getSmiley2().getFace().getCenterY());
		System.out.println(getSmiley2().getFace().getCenterX());
		System.out.println(getSmiley2().getFace().getXLength());
		System.out.println(getSmiley2().getFace().getYLength()); 
		
		Printed out coordinates of getSmiley2
		*/
		
		// Creates a new smiley face using the information from the second smiley face 
		smileyFace3.getFace().scale(1);
		smileyFace3.getFace().setColor(Color.magenta);
		smileyFace3.getFace().setCenter(220,200);
		smileyFace3.getRightEye().scale(1.2);
		smileyFace3.getRightEye().setCenter(260,175);
		smileyFace3.getRightEye().setColor(Color.white);
		smileyFace3.getLeftEye().scale(1.2);
		smileyFace3.getLeftEye().setCenter(180,175);
		smileyFace3.getLeftEye().setColor(Color.white);
		smileyFace3.getSmile().scale(1.8);
		smileyFace3.getSmile().setCenter(220,250);
		smileyFace3.getSmile().setColor(Color.GREEN);
		
		smileyFace3.translate(170,170);
		return smileyFace3;	
	}
	
}

