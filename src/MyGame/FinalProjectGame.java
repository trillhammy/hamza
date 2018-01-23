/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MyGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author muhah5588
 */
public class FinalProjectGame extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    //Title of the window
    String title = "To the Top";

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;

    // YOUR GAME VARIABLES WOULD GO HERE-
    Rectangle queen = new Rectangle (WIDTH /2 - 10, 50, 20 , 50);
    Rectangle player = new Rectangle (50, 469, 20, 50);
    Rectangle player2 = new Rectangle (750,469,20,50);
    int playerDX = 0;
    int playerDY = 0;
    
    int player2DX = 0;
    int player2DY = 0;
    
    
    int gravity = 1;
    int gravity2 = 1;
    
    boolean playerRight = false;
    boolean playerLeft = false;
    
    boolean player2Right = false;
    boolean player2Left = false;
    
    boolean jump = false;
    boolean jump2 = false;
   
    boolean onGround = true;
    boolean onGround2 = true;
    
    
    //blocks in the level
    Rectangle[] blocks = new Rectangle[13];
    
    
    
    
    Font ObjectiveFont = new Font("arial", Font.BOLD, 35);
    
    int player1Score = 0;
    int player2Score = 0;
    
    
    
    Font winnerDeclareFont = new Font ("arial", Font.BOLD, 50);
    
    
    
    
    // GAME VARIABLES END HERE   

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FinalProjectGame(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // clear the screen
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        
        // set colour to black
        g.setColor(Color.BLACK);
        // draw black play surface
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //set the colour to pink for the writing
        g.setColor(Color.PINK);
        //writing out the objective of the game
        g.setFont(ObjectiveFont);
        g.drawString("First one to the Queen wins!", 180, HEIGHT/2);
        //if player1 wins then replace the font in the middle to player1wins
        if (player1Score == 1 ){
            g.setColor(Color.BLACK);
            g.setFont(ObjectiveFont);
            g.drawString("First one to the Queen wins!", 180, HEIGHT/2);
        }
        //if player2 wins then replace the font in the middle to player1wins
        if (player2Score == 1 ){
            g.setColor(Color.BLACK);
            g.setFont(ObjectiveFont);
            g.drawString("First one to the Queen wins!", 180, HEIGHT/2);
        }
        
        //if player 1 wins then show the font when the game ends
        if(player1Score ==1){
            g.setColor(Color.RED);
            g.setFont(winnerDeclareFont);
            g.drawString("Player 1 Wins!", 250, HEIGHT/2);
            
        }
        // if player 2 wins then show the font when the game ends
        if(player2Score == 1){
            g.setColor(Color.GREEN);
            g.setFont(winnerDeclareFont);
            g.drawString("Player 2 Wins!", 250, HEIGHT/2);
        }
        //set the color to yellow for the blocks and go through every block
        g.setColor(Color.WHITE);
        for(int i = 0; i < blocks.length; i++){
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
            
        }
        //draw players
        //player 1 is red
        g.setColor(Color.red);
        g.fillRect(player.x, player.y, player.width, player.height);
        //player 2 is blue
        g.setColor(Color.GREEN);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);
        // draw the pink queen 
        g.setColor(Color.pink);
        g.fillRect(queen.x, queen.y, queen.width, queen.height);
        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
        
       // Any of your pre setup before the loop starts should go here
       //ground block
       blocks[0] = new Rectangle(0, 575, 800, 100);
       
       //objective platform
       //queen block
       blocks[1] = new Rectangle(WIDTH /2 - 100, 100, 200, 25);
       
       //main middle block
       //first block to jump on
       blocks[2] = new Rectangle(75, 475, 650, 25);
       
       //leftside blocker
       blocks[3] = new Rectangle(0, 0, 25, 600);
       
       //rightside blocker
       blocks[4] = new Rectangle(775, 0, 25, 600);
       
       
       //middle blocks to jump on to get to the top
       //the left side blocks
       //first block
       blocks[5] = new Rectangle(150, 400, 100, 25);
       
       //middle blocks
       blocks[6] = new Rectangle(50, 300, 100, 25);
       blocks[7] = new Rectangle(50, 200, 100, 25);
       
       //top block
       blocks[8] = new Rectangle(85, 125, 75, 25);
       
       //first block
       blocks[9] = new Rectangle(550, 400, 100, 25);
       
       //two middle blocks
       blocks[10] = new Rectangle(650, 300, 100, 25);
       blocks[11] = new Rectangle(650, 200, 100, 25);
       
       //the top block
       blocks[12] = new Rectangle(639, 125, 75, 25);
       
       //powerup block
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            
            //make player1 move right and left when key is pressed, determines the speed
            if(playerRight){
                playerDX = 5;
            }else if (playerLeft){
                playerDX = -5;
            }else{
                playerDX = 0;
            }
            
            //code the jump command
            if (onGround && jump){
                // do something about jumping
                //big negative to start moving
                playerDY = -15;
                //not on ground anymore
                onGround = false;
                
            }
            //gravity
            playerDY = playerDY + gravity;
            if(playerDY > 20){
                playerDY = 20;
            }
            
            //update the player
            player.x = player.x + playerDX;
            player.y = player.y + playerDY;
            
            //assuming not standing on anything
            onGround = false;
            //check for collisions
            //go through every block
            for (int i = 0; i < blocks.length; i++) {
                if (player.intersects(blocks[i])){
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y );
                    int cWidth = Math.min(blocks[i].x  + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x );
                    //if player 1 wins the game (intersects the queen)
                    if(player.intersects(queen)){
                        player1Score++;
                    }
                    
                    //determine the smaller
                    if(cWidth < cHeight){
                        //fix the width
                        //player on left side
                        if (player.x < blocks[i].x){
                            player.x = player.x - cWidth;
                        }else{
                            player.x = player.x + cWidth;
                        }
                        
                        // stop the player moving sideways
                        playerDX = 0;
                    }else{
                        //above the block
                        if (player.y < blocks[i].y){
                            player.y = player.y - cHeight;
                            
                            //moving down?
                            if(playerDY >= 0){
                                //stop the down motion
                                playerDY = 0;
                                
                                //standing on it
                                onGround = true;
                            }
                        }else{
                            player.y = player.y + cHeight;
                        }
                    }
                }
            }
            
            //make player2 go right and left, coding what speed is used
            if(player2Right){
                player2DX = 5;
            }else if (player2Left){
                player2DX = -5;
            }else{
                player2DX = 0;
            }
            
            //jump
            if (onGround2 && jump2){
                // do something about jumping
                //big negative to start moving
                player2DY = -15;
                //not on ground anymore
                onGround2 = false;
                
            }
            //gravity
            player2DY = player2DY + gravity2;
            if(player2DY > 20){
                player2DY = 20;
            }
            
            //update the player
            player2.x = player2.x + player2DX;
            player2.y = player2.y + player2DY;
            
            //assuming not standing on anything
            onGround2 = false;
            
            
            //check for collisions
            //go through every block
            for (int i = 0; i < blocks.length; i++) {
                if (player2.intersects(blocks[i])){
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player2.y + player2.height) - Math.max(blocks[i].y, player2.y );
                    int cWidth = Math.min(blocks[i].x  + blocks[i].width, player2.x + player2.width) - Math.max(blocks[i].x, player2.x );
                    
                    //player 2 intersects queen add the point to player2s score
                    if(player2.intersects(queen)){
                        player2Score++;
                    }
                    
                    //determine the smaller
                    if(cWidth < cHeight){
                        //fix the width
                        //player on left side
                        if (player2.x < blocks[i].x){
                            player2.x = player2.x - cWidth;
                        }else{
                            player2.x = player2.x + cWidth;
                        }
                        
                        // stop the player moving sideways
                        player2DX = 0;
                    }else{
                        //above the block
                        if (player2.y < blocks[i].y){
                            player2.y = player2.y - cHeight;
                            
                            //moving down?
                            if(player2DY >= 0){
                                //stop the down motion
                                player2DY = 0;
                                
                                //standing on it
                                onGround2 = true;
                            }
                        }else{
                            player2.y = player2.y + cHeight;
                        }
                    }
                }
            }
            
            
            //if player1 gets to the queen first finish the game
            if(player1Score == 1){
                    done = true; 
            }
            //if player 2 gets to the queen first finish the game
            if(player2Score == 1){
                    done = true;
            }
            
            
                
            
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
            
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
             //determine the key
            int key = e.getKeyCode();
            //figure out which key
            
            //if key D is pressed then start moving player1 right
            if (key == KeyEvent.VK_D){
                playerRight = true;
            //if key A is pressed then start moving player1 left    
            }else if (key == KeyEvent.VK_A){
                playerLeft = true;
            //if key w is pressed then start jumping player 1    
            }else if (key == KeyEvent.VK_W){
                jump = true;
            }
            //if right arrow key is pressed then start moving player2 right
            if (key == KeyEvent.VK_RIGHT){
                player2Right = true;
            //if left arrow key is pressed then start moving player2 left    
            }else if (key == KeyEvent.VK_LEFT){
                player2Left = true;
            //if up arrow key is pressed then start jumping player2    
            }else if (key == KeyEvent.VK_UP){
                jump2 = true;
            }
            
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            int key = e.getKeyCode();
            //figure out which key
            //if key D is released then stop moving player1 right
            if (key == KeyEvent.VK_D){
                playerRight = false;
            //if key A is released then stop moving player1 left    
            }else if (key == KeyEvent.VK_A){
                playerLeft = false;
            //if key W is released then stop jumping player1    
            }else if (key == KeyEvent.VK_W){
                jump = false;
            }
            //if right arrow key is released then stop moving player2 right
            if (key == KeyEvent.VK_RIGHT){
                player2Right = false;
            //if left arrow key is released then stop moving player2 left    
            }else if (key == KeyEvent.VK_LEFT){
                player2Left = false;
            //if up arrow key is released then stop jumping player2    
            }else if (key == KeyEvent.VK_UP){
                jump2 = false;
            }
            
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FinalProjectGame game = new FinalProjectGame();
                
        // starts the game loop
        game.run();
    }
}


