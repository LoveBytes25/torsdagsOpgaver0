int[][] board = new int[8][8]; // 6.a Double array with 8

void setup() {

  size(40*8, 40*8);
  for (int i = 0; i < board.length; i++) { // 6.b double for-loop
    for (int j = 0; j < board[i].length; j++) {
      board[i][j] = (i+j) % 2; // Alternates between 0 and 1 using %
    }
  }
}

void draw() {
  int sideLength = 40; // 6.c add sidelength to match checkerboard as well as a double for-loop

  for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
      if (board[i][j] == 0) {
        fill(0); // 6.d Fill the checkerboard with white or black
      } else {
        fill(255);
      }
      
      rect(j * sideLength, i * sideLength, sideLength, sideLength);
    }
  }
}
