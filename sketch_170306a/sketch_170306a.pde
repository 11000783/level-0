void setup(){
size(800,800);

}
void draw(){
if(mouseX<210){
mouseX=190;
}
if(mouseY<110){
mouseY=90;}
if(mouseX<){
mouseX=190;
}
if(mouseY<700){
mouseY=100;}
background(000,102,119);
fill(1000,1000,1000);
ellipse(200,100,100,60); 
ellipse(500,100,100,60); 
fill(0,0,0);
ellipse(mouseX,mouseY,30,30); 
ellipse(mouseX+300,mouseY,30,30);
}