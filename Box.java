class Box {
 double width;
 double height;
 double depth;
 Box(){
  System.out.println("constructing box");
  width=10;
  height=10;
  depth=10;
 }
 double volume(){
    return width*height*depth;
}
}
// This class declares an object of type Box.
