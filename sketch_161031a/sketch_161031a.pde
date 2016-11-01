PImage bg;
PImage pj;
float x=20, y=200;

void setup(){ 
  size(640,360);
  bg = loadImage("back.jpg");
  pj = loadImage("jack.png");
}
void draw(){
  background(bg);
 image(pj, x, y); 
x++;
if(x < 250){
y--;
}
else {
  y++;
}

}
