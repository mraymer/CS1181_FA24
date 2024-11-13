import javax.swing.*;
import java.awt.*;

/**
 * Maze:  This class represents a rectangular 2D maze suitable for 
 * display using the Java SWING Library.
 * @author Dr Doom 
 */
public class Maze extends JPanel {

   private MazeCell[][] maze;
   private int rows;      // vertical dimention of the maze, in cells
   private int columns;   // horizontal dimention of the maze, in cells


   /**
    * This constructor creates a random 2D maze of the given size.  
    * @param rows The vertical dimension of the maze, in cells
    * @param columns The horizontal dimension of the maze, in cells
    * Note:  Walls, Start, and Exit for the maze are randomly determined.
    * There is no guarantee that a path exists between the Start and
    * Exit.
    */
   public Maze(int rows, int columns) {
      this.rows = rows;
      this.columns = columns;
      maze = new MazeCell[rows][columns];
      buildEmptyMaze();
      fillMaze(0, 0, rows - 1, columns - 1);
      getRandomEmptyCell().setType(MazeCell.Type.TRAIL_HEAD);
      getRandomEmptyCell().setType(MazeCell.Type.EXIT);
   } // end constructor

   /**
    * Graphically displays the maze as required for a JPanel
    * This routine is called implicitly by this.refresh() or
    * (for immediate redraw) this.paint(this.getGraphics())
    */
   public void paintComponent(Graphics g) {
      g.setColor(Color.black);
      g.fillRect(0, 0, getWidth(), getHeight());
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            MazeCell cell = maze[row][column];
            g.setColor(cell.getColor());
            g.fillRect(cell.getX(), cell.getY(), MazeCell.size, MazeCell.size);
         } // end for each column
      } // end for each row     
   } // method paintComponent

      /**
    * @return The vertical dimension of the rectangular maze, in cells
    */
   public int getRows() {
      return rows;
   }

   /**
    * @return  The horizontal dimension of the rectangular maze, in cells
    */
   public int getColumns() {
      return columns;
   }
      
    /**
    * @return Returns a copy of a MazeCell from the indicated row,
    * column coordinates of the maze.  The returned value is a copy
    * only, to protect the privacy of the data. 
    */
   public MazeCell getCell(int row, int column) {
      return new MazeCell(maze[row][column]);
   } // end method getCell
   
   /**
    * setCell:  This method updates the type information for a MazeCell.  It
    * does not allow the user to directly access the actual MazeCell objects
    * to protect the maze from tinkering (such as replacing a mazeCell with a
    * mazeCell that has the incorrect x,y,row,column information, etc.
    * @param copyCell A mazeCell that contains the information to be updated
    * in the actual maze's mazeCells.  Most likely, this mazeCell will be a
    * copy of an actual MazeCell object produced via a call to getCell() or
    * getTrailHead().
    */
   public void setCell(MazeCell copyCell) {
      MazeCell realCell = maze[copyCell.getRow()][copyCell.getColumn()];
      realCell.setType(copyCell.getType());
   } // end method setCell
   
   /**
    * @return A copy of the current position of the path through the maze.
    */
   public MazeCell getTrailHead() {
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            MazeCell cell = maze[row][column];
            if (cell.getType() == MazeCell.Type.TRAIL_HEAD) {
               return new MazeCell(cell);
            }
         } // end for each column
      } // end for each row 
      return null;
   }  // end method getTrailHead  

   /**  
    * Populates a 2D array with empty MazeCells
   */
   private void buildEmptyMaze() {
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            MazeCell cell = new MazeCell(row, column);
            maze[row][column] = cell;
         } // end for each column
      } // end for each row
   } // end method buildEmptyMaze

   /**
    * fillMaze:  Fills a grid of empty MazeCells (maze) with randomly
    * placed walls to form a maze.  Parameters indicate the coordinates
    * of the sub grid (to fill) within a potentially larger 2D array
    * of MazeCells. 
    */
   private void fillMaze(int minRow, int minCol, int maxRow, int maxCol) {
      // Base case:  If grid of empty cells is smaller than 3x3 then we 
      // do not have space to add further walls
      if  ( ((maxRow - minRow) < 2) || ((maxCol - minCol) < 2)){ 
         return;
      }
      // Recursive case:  Add a vertical and horizontal wall at random
      // interior positions
      int wallRow = minRow + 1 + (int) (Math.random() * (maxRow - minRow - 1));
      int wallCol = minCol + 1 + (int) (Math.random() * (maxCol - minCol - 1));

      // Randomly place one vertical and one horizontal wall in maze
      for (int row = minRow; row <= maxRow; row++) {
         maze[row][wallCol].setType(MazeCell.Type.WALL);
      }
      for (int col = minCol; col <= maxCol; col++) {
         maze[wallRow][col].setType(MazeCell.Type.WALL);
      }

      // Put a random hole in each of the four walls 
      int northPosition = minRow + (int) (Math.random() * (wallRow - minRow));
      int southPosition = wallRow + 1 + (int) (Math.random() * (maxRow - wallRow - 1));
      int westPosition = minCol + (int) (Math.random() * (wallCol - minCol));
      int eastPosition = wallCol + 1 + (int) (Math.random() * (maxCol - wallCol - 1));
      maze[northPosition][wallCol].setType(MazeCell.Type.EMPTY);
      maze[southPosition][wallCol].setType(MazeCell.Type.EMPTY);
      maze[wallRow][eastPosition].setType(MazeCell.Type.EMPTY);
      maze[wallRow][westPosition].setType(MazeCell.Type.EMPTY);

      // Recursive step:  The two walls divide the current grid of empty cells 
      // into four (smaller) grids of empty cells.  Recursively fill each
      // of these four areas!
      fillMaze(minRow, minCol, wallRow - 1, wallCol - 1);  // NW cell
      fillMaze(minRow, wallCol + 1, wallRow - 1, maxCol); // NE cell
      fillMaze(wallRow + 1, minCol, maxRow, wallCol - 1);  // SW cell
      fillMaze(wallRow + 1, wallCol + 1, maxRow, maxCol);  // SE cell
   } // end method fillMaze

   /**
    * @return  Returns a random traversable cell in the existing maze.
    */
   private MazeCell getRandomEmptyCell() {
      MazeCell cell = null;
      do {
         int row = (int) (Math.random() * rows);
         int col = (int) (Math.random() * columns);
         cell = maze[row][col];
      } while (cell.getType() != MazeCell.Type.EMPTY);
      return cell;
   } // end method getRandomEmptyCell
  
} // end class Maze