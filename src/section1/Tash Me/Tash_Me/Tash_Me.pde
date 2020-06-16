PImage mustache;
PImage friend;

void setup() {
friend = loadImage("enderman-block.jpg");
size(800,600)
friend.resize(width,height);
mustache = loadImage("index.png");
}

void draw() {
background(friend);
if(mouseButton==RIGHT)
  image(mustache, 340,300);
}
