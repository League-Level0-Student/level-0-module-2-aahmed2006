 // create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x1 = 200;
    int y1 = 200;
    int x2 = 20;
    int y2 = 20;
    
    void setup() {
      //set the size of your sketch
    size(400, 400);
    }
    
    void draw() {
      //set the background color of your sketch
      background(#FAFAFA);
      //draw an ellipse. Make sure it fits in the window.
      fill(00000);
      ellipse(x1, y1, x2, y2);
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance = getDistance(x1, y1, mouseX, mouseY);
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //print the distance variable
    System.out.println(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance>x2 && distance>y2) {
        
      
        //8b.  set the x and y of the ellipse to a random location on the window
      x1 = (int)random(0, 400);
      y1 = (int)random(0, 400);
      }
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
