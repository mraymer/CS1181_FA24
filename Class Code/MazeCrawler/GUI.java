/*
 * This class was used in Dr. Doom's CS 241 course
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI implements ActionListener {

   private JButton solveButton = new JButton("Solve");
   private MazeCrawler maze;


   public static void pause() {
      try {
         Thread.sleep(1);        // wait 1/40 s
      } catch (Exception e) {
         e.printStackTrace();
      }
   } // end method pause


   public void go() {
      JFrame frame = new JFrame();
      frame.setTitle("CS 1181 Maze Crawl");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      maze = new MazeCrawler(20, 30);

      int xSize = Math.max(MazeCell.size * (maze.getColumns() + 1), 400);
      frame.setSize(xSize, MazeCell.size * (maze.getRows() + 1) + 65);
      frame.setLocation(300, 50);
      frame.getContentPane().add(BorderLayout.CENTER, maze);
      JPanel buttonPanel = new JPanel();

      buttonPanel.add(solveButton);
      solveButton.addActionListener(this);

      
      frame.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
      frame.setVisible(true);
   } // end method main

   public static void win() {
      JOptionPane.showMessageDialog(null, "Path Found!");
      System.exit(0);
   } // end method 

   public static void lose() {
      JOptionPane.showMessageDialog(null, "Nowhere to go from here!");
      System.exit(1);
   } // end method lose

   public void actionPerformed(ActionEvent event) {

      if (event.getSource() == solveButton) {

         // We can't call solveMaze() here unless it starts a new thread or we'll stall the EDT!!
         // maze.solveMaze();
         maze.startSolver();
      } 
   } // end actionPerformed   
} // end class GUI