///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:          Grendleton
// Course:         CoMPSCI200, Spring 2021
//
// Author:          Gabrielle Hull
// Email:           gehull@gmail.com
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description 
// Vincent - Shared the class Canvas with me and showed me how to use it
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

package pkg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Grendleton {
	
	public static Scanner scnr = new Scanner(System.in);
	public static void main(String[] args) {
		int width = 1500;
		int height = 1000;
		
		System.out.println("Welcome to Grendleton!");
		System.out.println("What is your name adventurer?");
		
		String adveName = scnr.nextLine();
		System.out.println("Welcome to Grendleton " + adveName + "!");
		
		String TITLE_BAR_TEXT = "Grendelton";
		Canvas canvas = new Canvas(TITLE_BAR_TEXT, width, height);
		screenWipe (canvas, width, height);
		List<String> colorNames = Arrays.asList(new String[] {"red", "orange", "gold", "lime", "green", "sage", "cyan", "sky", "blue", "purple", "magenta", "pink", "leather", "metalic"});
		BufferedImage[] images = new BufferedImage[14];
	
		try {
		    images[0] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Red/Red Side.png"));
		    images[1] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Orange/Orange S.png"));
		    images[2] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Gold/Gold S.png"));
		    images[3] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Lime/Lime S.png"));
		    images[4] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Green/Green S.png"));
		    images[5] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Sage/Sage S.png"));
		    images[6] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Cyan/Cyan S.png"));
		    images[7] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Sky/Sky S.png"));
		    images[8] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Blue/Blue S.png"));
		    images[9] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Purple/Purple S.png"));
		    images[10] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Magenta/Magenta S.png"));
		    images[11] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Pink/Pink S.png"));
		    images[12] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Leather/Leather S.png"));
		    images[13] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Metalic/Metalic S.png"));
		    
		} catch (IOException e) {
			System.out.println("Sorry, that image isn't accessable");
			e.printStackTrace();
			System.exit(1);
		}
		
		displayCharacterColorOptions(width, height, canvas, colorNames, images);
		
		pickAdveColor(colorNames,adveName);
		
		
		
		
		System.exit(0);
	}
	
	//TODO I want to display the color name and variable above the character image. Write on the canvas?
	private static void displayCharacterColorOptions(int width, int height, Canvas canvas, List<String> colors, BufferedImage[] images) {
		int cols = 7; // Images per row
		int rows = (images.length + cols - 1) / cols;

		int imageWidth = 160;
		int imageHeight = 400;

		int paddingX = 25;
		int paddingY = 40;

		int colWidth  = imageWidth  + paddingX;
		int rowHeight = imageHeight + paddingY;

		int allWidth  = colWidth  * cols - paddingX;
		int sceneHeight = rowHeight * rows - paddingY;

		int centeringOffsetX = (width  - allWidth)  / 2;
		int centeringOffsetY = (height - sceneHeight) / 2;

		canvas.setForegroundColor(Color.BLACK);
		for(int i = 0; i < images.length; i++) {
			String color = colors.get(i);
		    BufferedImage image = images[i];
		    
		    int row = i / cols;
		    int col = i % cols;
		    
		    int x = col * colWidth  + centeringOffsetX;
		    int y = row * rowHeight + centeringOffsetY;
		    int stringX = x + imageWidth / 2;
		    int stringY = y;
		    
		    canvas.drawImage(image, x, y);
		    canvas.drawString(color, stringX, stringY);
		}
	}
	
	private static void screenWipe(Canvas canvas, int width, int height ) {
		canvas.setForegroundColor(Color.BLACK); 
		canvas.fillRectangle(0, 0, width, height); 
		Color turquoise = new Color(0,200,100);
		canvas.setForegroundColor(turquoise); //This changes the background's color
		canvas.fillRectangle(25, 25, width - 50, height - 50); //This changes the background color's size
	}
	
	private static void pickAdveColor(List<String> colorNames, String adveName ) {
		System.out.println("What color is your armor adventurer " + adveName + "?");
		String adveColor = scnr.nextLine().toLowerCase();
			
		if(colorNames.contains(adveColor)) {
			System.out.println("You want to be " + adveColor + "?");
		} else {
			    // Code to run if the expression was |false|
			//TODO: have the image appear
			//TODO: create/finish the else statement if they type wrong punish them/make them retype
			
				
		}
	
			
	}
		//canvas.drawImage
		
		
		
		//////////////
		
		//TODO I want to make a scanner that prompts that player to pick a color.
	    
//		images[0] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Red/Red Side.png"));
//	    images[1] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Orange/Orange S.png"));
//	    images[2] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Gold/Gold S.png"));
//	    images[3] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Lime/Lime S.png"));
//	    images[4] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Green/Green S.png"));
//	    images[5] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Sage/Sage S.png"));
//	    images[6] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Cyan/Cyan S.png"));
//	    images[7] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Sky/Sky S.png"));
//	    images[8] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Blue/Blue S.png"));
//	    images[9] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Purple/Purple S.png"));
//	    images[10] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Magenta/Magenta S.png"));
//	    images[11] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Pink/Pink S.png"));
//	    images[12] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Leather/Leather S.png"));
//	    images[13] = ImageIO.read(new File("./Character Art/New Detailed/Color Groups/Metalic/Metalic S.png"));
//		
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("What color is your armor?");
//		String adveColor = scnr.nextLine();
//	
//			if (adveColor = "0" != null);{
//			 canvas.drawImage(images, 25, 25);}
//			
//			 	else(adveColor = "1");{
//			 		canvas.drawImage(images, 25, 25);}
//			 	}
//				else(adveColor = "2");{
//					canvas.drawImage(images, 25, 25);}	
//				}
//				else(adveColor = "3");{
//					canvas.drawImage(images, 25, 25);}
//				}
//				else(adveColor = 4);{
//						
//				}
//				else(adveColor = 5);{
//						
//				}
//				else(adveColor = 6);{
//						
//				}
//				else(adveColor = 7);{
//						
//				}
//				else(adveColor = 8);{
//						
//				}
//				else(adveColor = 9);{
//						
//				}
//				else(adveColor = 10);{
//					
//				}
//				else(adveColor = 11);{
//						
//				}
//				else(adveColor = 12);{
//						
//				}
//				else(adveColor = 13);{
//						
//				}
//				else(adveColor = 14);{
//						
//				}
				
				
		
		
		//////////////////////
		
				
			//TODO Display all three sides of that character.
			//TODO Are you sure?
			//TODO Implement a background
			//TODO Start the story
						//System.out.println("You are an Orc stranded in the middle of the woods.");
			//TODO Explain how the game works, controls, how to pick options
						//System.out.println("");
			//TODO Explain how the life force works
						//System.out.println("This sprite is your life force.");
			//TODO Explain how to win
						//System.out.println("If ");
			//TODO Define destination
				
				//adveColor.close();
				//adveName.close();
				
}			

