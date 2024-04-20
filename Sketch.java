import processing.core.PApplet;
/**
* A program Sketch.java that draws three different objects at various 
* locations using three methods with parameters. 
* @author: B. Yu
*/
public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 231, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Draws a boat at various locations
    drawBoat(30, 120);
    drawBoat(30, 320);
    drawBoat(30, 520);
    drawBoat(225, 120);
    drawBoat(225, 520);
    drawBoat(420, 120);
    drawBoat(420, 320);
    drawBoat(420, 520);

    // Draws a stick figure at various locations, size and colour can be modified
    drawPerson(60, 30, 50, 0, 20, 4);
    drawPerson(60, 230, 60, 255, 21, 542);
    drawPerson(60, 430, 70, 255, 255, 11);
    drawPerson(255, 30, 30, 43, 16, 189);
    drawPerson(255, 430, 80, 2, 124, 255);
    drawPerson(450, 30, 70, 65, 43, 5);
    drawPerson(450, 230, 60, 205, 24, 244);
    drawPerson(450, 430, 50, 0, 102, 0);

    // Draws a sun in the middle of the screen
    drawSun();
  }

  /**
   * Draws a boat
   * 
   * @param boatX  The x-value of the shapes
   * @param boatY  The y-value of the shapes
   * @return
   * @author B. Yu
   */
  private void drawBoat(float boatX, float boatY) {
    // Sets the border colour to black
    stroke(0);

    // Create the base and mast, fill both with brown colour 
    fill(139, 69, 19);
    quad(boatX, boatY, boatX + 25, boatY + 50, boatX + 125, boatY + 50, boatX + 150, boatY);
    rect(boatX + 70, boatY, 10, -100);

    // Create the sail, fill with white colour
    fill(255, 255, 255);
    triangle(boatX + 80, boatY - 50, boatX + 115, boatY - 70, boatX + 80, boatY - 90);
  }

  /**
   * Draws a stick figure 
   * 
   * @param personX  The x-value of the shapes  
   * @param personY  The y-value of the shapes
   * @param personSize  The size of the head
   * @param personColourR  The colour of the stick figure (R)
   * @param personColourG  The colour of the stick figure (G)
   * @param personColourB  The colour of the stick figure (B)
   * @return
   * @author B. Yu
   */
  private void drawPerson(float personX, float personY, float personSize, float personColourR, float personColourG, float personColourB) {
    // Sets the colour of the stick figure
    fill(personColourR, personColourG, personColourB);
    stroke(personColourR, personColourG, personColourB);

    // Creates the body and head
    ellipse(personX, personY, personSize, personSize);
    rect(personX - 5, personY, 10, 75);

    // Creates the arms
    line(personX, personY + 40, personX - 50, personY - 5);
    line(personX, personY + 40, personX + 50, personY - 5);

    // Creates the legs
    line(personX, personY + 70, personX - 30, personY + 140);
    line(personX, personY + 70, personX + 30, personY + 140);
  }

  /**
   * Computes the given x-value so the circle will be drawn in the middle of the screen
   * 
   * @param circleX  The x-value of the circle
   * @return the x-value of the middle of the screen
   * @author B. Yu
   */
  private float drawCircleX(float circleX) {
    return width / circleX * (circleX / 2);
  }

  /**
   * Computes the given y-value so the circle will be drawn in the middle of the screen
   * 
   * @param circleY  The y-value of the circle
   * @return The y-value of the middle of the screen
   * @author B. Yu
   */
  private float drawCircleY(float circleY) {
    return height / circleY * (circleY / 2);
  }

  /**
   * Draws a sun in the middle of the screen
   * 
   * @param 
   * @return
   * @author B. Yu
   */
  private void drawSun() {
    // Draw the outer circle of the sun
    stroke(247, 152, 59);
    fill(247, 152, 59);
    ellipse(drawCircleX(43), drawCircleY(4), 110, 110);

    // Draw the inner circle of the sun
    stroke(255, 255, 65);
    fill(255, 255, 65);
    ellipse(drawCircleX(4), drawCircleY(4), 75, 75);
  }


  
  
}