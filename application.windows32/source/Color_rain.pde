
Drop[] drops = new Drop[500];

void setup() {
  size(1920, 1080);
  for (int i = 0; i < drops.length; i++) {
    drops[i] = new Drop();
  }
}

void draw() {
  background(0, 0, 0);
  for (int i = 0; i < drops.length; i++) {
    drops[i].fall();
    drops[i].show();
    drops[i].show2();
    drops[i].show3();
    //drops[i].show4();
  }
}