Pimage mustache;
Pimage friend;

void setup() {
friend = loadImage("enderman-block.jpg");
size(800,600)
friend.resize(width,height);
mustache = loadImage("index.png");
}

void draw() {
background(friend);
image(mustache, 350,350);
}
