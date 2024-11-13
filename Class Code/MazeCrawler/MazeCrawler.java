public class MazeCrawler extends Maze implements Runnable{
    private Thread solverThread = null;
    MazeCrawler(int rows, int columns) {
        super(rows, columns);
    }

    // Since we might push the solve button multiple times, be sure to only start
    // one solver thread using a modified singleton pattern
    public void startSolver(){
        if (solverThread == null){
            solverThread = new Thread(this);
            solverThread.start();
        }
    }

    // Solve the maze and report if there is a win or loss
    public void run(){
        solveMaze();
        if (isWin()){
            GUI.win();
        } else {
            GUI.lose();
        }
    }

    public void solveMaze() {
        // Try moving each direction and see if that leads to a solution
        MazeCell current = getTrailHead();
        if (!isWin()) tryNorth(current);
        if (!isWin()) tryWest(current);
        if (!isWin()) trySouth(current);
        if (!isWin()) tryEast(current);
    }

    public void tryWest(MazeCell current){

        int currentRow = current.getRow();
        int currentColumn = current.getColumn();

        // If we aren't at the western border, and the cell to the west
        // is empty, then move west and try to solve the resulting maze
        if (currentColumn > 0){
            MazeCell nextCell = getCell(currentRow, currentColumn-1);
            if (nextCell.getType() == MazeCell.Type.EMPTY) {
                moveWest();

                // If the move west didn't find the exit, try to solve the maze
                // from here with a co-recursive call to solveMaze()
                if (!isWin()){solveMaze();}

                // If the recursive call did not lead to a win, then undo the move
                // by restoring the cell Type of current and nextCell back to their
                // values before calling moveWest();
                if (!isWin()){
                    setCell(current);
                    setCell(nextCell);
                    invalidate();
                    repaint();
                }
            }
        }
    }

    public void tryEast(MazeCell current){
        int currentRow = current.getRow();
        int currentColumn = current.getColumn();
        if (currentColumn < getColumns()-1){
            MazeCell nextCell = getCell(currentRow, currentColumn+1);
            if (nextCell.getType() == MazeCell.Type.EMPTY) {
                moveEast();
                if (!isWin()){solveMaze();}
                if (!isWin()){
                    setCell(current);
                    setCell(nextCell);
                    invalidate();
                    repaint();

                }
            }
        }
    }

    public void tryNorth(MazeCell current){
        int currentRow = current.getRow();
        int currentColumn = current.getColumn();
        if (currentRow > 0){
            MazeCell nextCell = getCell(currentRow-1, currentColumn);
            if (nextCell.getType() == MazeCell.Type.EMPTY) {
                moveNorth();
                if (!isWin()){solveMaze();}
                if (!isWin()){
                    setCell(current);
                    setCell(nextCell);
                    invalidate();
                    repaint();

                }
            }
        }
    }

    public void trySouth(MazeCell current){
        int currentRow = current.getRow();
        int currentColumn = current.getColumn();
        if (currentRow < getRows()-1){
            MazeCell nextCell = getCell(currentRow+1, currentColumn);
            if (nextCell.getType() == MazeCell.Type.EMPTY) {
                moveSouth();
                if (!isWin()){solveMaze();}
                if (!isWin()){
                    invalidate();
                    repaint();
                    setCell(current);
                    setCell(nextCell);
                }
            }
        }
    }

    // Move the trailHead one cell west.  Note that this method DOES NOT
    // validate that the move is possible (i.e. that getColumn() - 1 > 0)
    // and will throw an out of bounds exception if it is not.  The validity
    // of the move is checked by tryWest() before calling moveWest()
    public void moveWest() {

        // Find the trail head and set its type to TRAIL
        MazeCell currentCell = getTrailHead();
        currentCell.setType(MazeCell.Type.TRAIL);
        setCell(currentCell);

        // Find the cell to the west of the previous trail head and
        // set its type to TRAIL_HEAD
        currentCell = getCell(currentCell.getRow(), currentCell.getColumn() - 1);
        currentCell.setType(MazeCell.Type.TRAIL_HEAD);
        setCell(currentCell);

        // Redraw the maze with a short pause
        invalidate();
        repaint();
        GUI.pause();
    }

    public void moveEast() {
        MazeCell currentCell = getTrailHead();
        currentCell.setType(MazeCell.Type.TRAIL);
        setCell(currentCell);
        currentCell = getCell(currentCell.getRow(), currentCell.getColumn() + 1);
        currentCell.setType(MazeCell.Type.TRAIL_HEAD);
        setCell(currentCell);
        invalidate();
        repaint();
        GUI.pause();
    }

    public void moveNorth() {
        MazeCell currentCell = getTrailHead();
        currentCell.setType(MazeCell.Type.TRAIL);
        setCell(currentCell);
        currentCell = getCell(currentCell.getRow() - 1, currentCell.getColumn());
        currentCell.setType(MazeCell.Type.TRAIL_HEAD);
        setCell(currentCell);
        invalidate();
        repaint();
        GUI.pause();
    }

    public void moveSouth() {
        MazeCell currentCell = getTrailHead();
        currentCell.setType(MazeCell.Type.TRAIL);
        setCell(currentCell);
        currentCell = getCell(currentCell.getRow() + 1, currentCell.getColumn());
        currentCell.setType(MazeCell.Type.TRAIL_HEAD);
        setCell(currentCell);
        invalidate();
        repaint();
        GUI.pause();
    }

    public boolean isNoMove() {
        return true;
    }

    public boolean isWin() {
        MazeCell currentCell = getTrailHead();
        int currentRow = currentCell.getRow();
        int currentCol = currentCell.getColumn();

        // If the exit is directly north, south, east, or west of the trail head, then we have won
        if ((currentRow > 0) && (getCell(currentRow-1, currentCol).getType()==MazeCell.Type.EXIT))
            return true;
        else if ((currentRow < getRows()-1) && (getCell(currentRow+1, currentCol).getType()==MazeCell.Type.EXIT))
            return true;
        else if ((currentCol > 0) && (getCell(currentRow, currentCol-1).getType()==MazeCell.Type.EXIT))
            return true;
        else if ((currentCol < getColumns()-1) && (getCell(currentRow, currentCol+1).getType()==MazeCell.Type.EXIT))
            return true;

        // Otherwise we have not won
        else
            return false;

    }

}
