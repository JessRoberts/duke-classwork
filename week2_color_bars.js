// write your code here
var img = new SimpleImage("hilton.jpg")

for (var pixel of img.values()) {
    if (pixel.getX() < img.getWidth()/3){
        pixel.setRed(255);
    }
    else {
        if (pixel.getX() > img.getWidth()/3*2){
            pixel.setBlue(255);
        }
        else {
        pixel.setGreen(255);
    }
}
}
print(img);
