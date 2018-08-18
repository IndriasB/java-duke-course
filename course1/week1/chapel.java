// write your code here
var x = 3; 
var y = 2; 
 y = x;
print(x);
print(y);
var image = new SimpleImage("chapel.png");
print(image);
var p = new SimpleImage("universe.jpg")
print(p);

var currWidth = p.getWidth();
var currHeight = p.getHeight();
print(currWidth);
print(currHeight);
var currPixel = p.getPixel(0,0);
print(currPixel);
var currRed = p.getRed(0,0);
print(currRed);
var currGreen = p.getGreen(0,0);
print(currGreen);
var currBlue = p.getBlue(0,0);
print(currBlue);

function cube(x) {
    var ans = x*x*x;
    return ans;
}
var y = cube(3);
print(y);

function add(x) {
    var ans = x+x+x+x+x;
    return ans;
}
var h = add(100)
print(h);