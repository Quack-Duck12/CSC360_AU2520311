# Session 03

Covered the basics of how to draw a square by discussing about the required arguments that need to be passed into a ```drawSquare()``` function
1. **position/starting coordinate (Vector2)**: the x position & y position to start drawing, taken as the center of the square in this situation
2. **length (int/float)**: The side length the square needs to be
So, the function/api call becomes: `drawSquare(xPos, yPos, length)`

Then the abstracted steps that are performed by the function are:
1. Calculation of the corner position/coordinates:
	   TopLeft Corner: {Cx - length/2, Cy - length/2}
	   TopRightCorner: {Cx + length/2, Cy - length/2}
	   BottomLeft Corner: {Cx - length/2, Cy + length/2}
	   BottomRight Corner: {Cx + length/2, Cy + length/2}
2. Once all the corners are identified, its as simple as:
	   drawLine(TopLeft, TopRight)
	   drawLine(TopLeft, BottomLeft)
	   drawLine(BottomRight, TopRight)
	   drawLine(BottomRight, BottomLeft)
This resulting pseudo-code will result in the drawing of a square within the canvas screen.

Explained a basic outline for a Java programming project & how this repo should potentially look:
```
MyJavaProject/
├── .gitignore
├── README.md
├── src/
│   ├── main/
│   │    └── java/
│   │       └── Main.java
	└── test/
        └── java/
            └── MainTest.java
```

