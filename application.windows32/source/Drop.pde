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

  void fall() {
    y = y + yspeed;
    float grav = map(z, 0, 20, 0, 10);
    yspeed = 1 + grav;

    if (y > height) {
      y = random(-200, -100);
      yspeed = map(z, 0, 20, 4, 0.2);
    }
    if (y == height) {
    } 
  }

  void show() {
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(0, 255, 153);
    line(x, y, x, y+len);
  }
  
  void show2() {   
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(0, 102, 255);
    line(x2, y, x2, y+len); 
  }
  
  void show3(){
    thick = map(z, 0, 20, 1, 3);
    strokeWeight(thick);
    stroke(255, 102, 153);
    line(x3, y, x3, y+len); 
  }

}