import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Color_rain extends PApplet {


Drop[] drops = new Drop[500];

public void setup() {
  
  for (int i = 0; i < drops.length; i++) {
    drops[i] = new Drop();
  }
}

public void draw() {
  background(0, 0, 0);
  for (int i = 0; i < drops.length; i++) {
    drops[i].fall();
    drops[i].show();
    drops[i].show2();
    drops[i].show3();
    //drops[i].show4();
  }
}
class Drop {
  float x;
  float x2;
  float x3;
  float y;
  float z;
  float len;
  float yspeed;
  float thick;
  float lifespan;

  Drop() {
    x  = random(width);
    x2 = random(width);
    x3 = random(width);
    y  = random(-500, -50);
    z  = random(0, 20);
    len = map(z, 0, 20, 10, 25);
  }

  public void fall() {
    y = y + yspeed;
    float grav = map(z, 0, 20, 0, 10);
    yspeed = 1 + grav;

    if (y > height) {
      y = random(-200, -100);
      yspeed = map(z, 0, 20, 4, 0.2f);
    }
    if (y == height) {
    } 
  }

  public void show() {
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(0, 255, 153);
    line(x, y, x, y+len);
  }
  
  public void show2() {   
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(0, 102, 255);
    line(x2, y, x2, y+len); 
  }
  
  public void show3(){
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(255, 102, 153);
    line(x3, y, x3, y+len); 
  }

}
  public void settings() {  size(1920, 1080); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Color_rain" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
