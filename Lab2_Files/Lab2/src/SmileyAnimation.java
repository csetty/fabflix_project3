// SmileyAnimation.java - Info about, and methods to control,
//  the animation of a bouncing smiley
// 
// ICS 45J : Lab Assignment 2
// 
// Completed by: [YOUR NAME]
// UCInetiD:     [YOUR UCInetID]
// ID:           [YOUR UCI ID Number]

import java.awt.Color;
import java.util.Random;

// Display that shows the animation
public class SmileyAnimation
{
	// recommend constants:
	//	TIME_TO_RUN = <time limit>  -  # of milliseconds to run animation
	//	REVERSE_DIRECTION = -1  -   multiplier used to reverse direction
	
	// recommend fields:
	//	three AnimatedSmileys, to hold the three moving smiley faces
	//	a reference to the random number generator
	//	a reference to the BouncingDisplay panel
	
	// Animate the group of bouncing smileys within the bounding display
	public SmileyAnimation(BouncingGroup bouncingGroup, BouncingDisplay bouncingDisplay)
	{
		// Suggested logic:
		
		// Pull the smileys out from the group and save as fields, so they 
		//   can be moved separately
		// Build the random number generator; used to change direction of 
		//   a smiley's movement
		// Store the provided display as a field, so know where to animate 
		// Draw the initial display
	}
	
	// Animate the smiley in its own thread,
	// so that it is separate from the rest
	// of the programs; operations: in particular,
	// when we repaint() to draw the next frame of
	// the animation, when this thread suspends,
	// the other implied program thread will
	// repaint the screen. (If a separate thread
	// is not used, repaint() is only acted upon
	// once the animation is complete!)
	
	// Complete the inner run() method
	public void animate()
	{
		class AnimationRunnable implements Runnable
		{
			public void run()
			{
				// Suggested logic:
				
				// Set the current time
				
				// Run the animation for TIME_TO_RUN seconds,
				// pausing given millisecs so the user can see
				// the frame before the net one is painted
				// All details to actually animate are in the
				// paint() method
				
				// For each frame, for as long as we are animating...
					//move the smileys one frame				
					// repaint the current frame	
					// pause
			}
		}
		Thread t = new Thread(new AnimationRunnable());
		t.start();
	}

	// pause(): pause the animation for the given number of milliseconds
	//	DO NOT CHANGE
	private void pause(int millisecs)
	{
		try
		{
			Thread.sleep(millisecs);
		}
		catch (InterruptedException e)
		{
		}
	}
	
	// The methods described below are private, and so only
	// suggested however, the functionality they provide will  
	// almost certainly be needed, regardless of whether you 
	// choose to implement them
	
	// moveCntSmiley: Continue to move smiley until it hits
	// a wall; when that happens, swap color of
	// smiley and wall, and change direction
	private void moveCntSmiley(AnimatedSmiley cntSmiley)
	
	// Swap the color of the wall just touched with the color 
	//  of the smiley's face component
	private void switchColor(AnimatedSmiley cntSmiley, WallName wallTouched, BouncingDisplay display)
	
	// Change the smiley's direction so it is away from
	// the wall just touched:
	// 
	// If hit top or bottom wall, y direction is reversed,
	// x direction can be to the left, to the right, or
	// no movement at all; it is randomly chosen
	// 
	// If hit left or right wall, x direction is reversed,
	// y direction can be up, down, or no movement; it is 
	// randomly chosen
	private void adjustDirection(AnimatedSmiley cntSmiley, WallName wallTouched)
	
	// whichWallWasHit: return a label (LEFT, RIGHT, TOP, BOTTOM) to tell us which wall 
	// was hit or NONE if none was hit
	private WallName whichWallWasHit(AnimatedSmiley cntSmiley)
	
	// Return true if hit left wall, false otherwise:
	// Wall was hit if x coordinate of leftmost point of smiley is
	// same or less than edge of the left wall and is (still)
	// heading into the wall
	private boolean hitLeftWall(AnimatedSmiley cntSmiley)
	
	// Return true if hit right wall, false otherwise:
	// Hit wall if x coordinate of rightmost point of smiley is
	// same or greater than edge of the right wall and is (still)
	// heading into the wall
	private boolean hitRightWall(AnimatedSmiley cntSmiley)
	
	// Return true if hit top wall, false otherwise:
	// Hit wall if y coordinate of top-most point of smiley is
	// same or less than edge of the top wall and is (still)
	// heading into the wall
	private boolean hitTopWall(AnimatedSmiley cntSmiley)
	
	// Return true if hit bottom wall, false otherwise:
	// Hit wall if y coordinate of bottom-most point of smiley is
	// same or greater than edge of the bottom wall and is (still)
	// heading into the wall
	private boolean hitBottomWall(AnimatedSmiley cntSmiley)
	
}

