// write your code here
var dukeImage = new SimpleImage("astrachan.jpg");
//print(dukeImage);
var x = dukeImage.getHeight();
var y = dukeImage.getWidth();
print(y);
print(x);
 for (var pixel  of dukeImage.values()) {
     if ( pixel.getX() <= y/3  ){
    // pixel.setRed(51);
    // pixel.setGreen(51);
     pixel.setRed(255);
         
     }
     
     else if ( pixel.getX() >= ( y*2)/3) {
     pixel.setBlue(255);
 }
 else {pixel.setGreen(255);
     
 }
 }
  print(dukeImage);


  }