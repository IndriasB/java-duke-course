// write your code here
var image = new SimpleImage("palm-and-beach.png");
print(image.getPixel(20,20));
for (var pixel of image.values()) {
    swapRedGreen(pixel);
}print(image);
 function swapRedGreen(x) {
     var pixel = x.getRed();
     
     
     x.setRed(x.getGreen());
     x.setGreen(pixel)
     return x;
 }
print(image.getPixel(20,20));