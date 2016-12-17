package ui.component.view;

import com.sun.prism.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

import static java.awt.Font.BOLD;

/**
 * Created by Kévin on 2016-12-17.
 */
public class PanelPlane extends JPanel {
    int border = 10;
    int span2 = 18;
    int span3 = 5;
    int sizeSeat = 40;
    int spanCentral2 = 50;
    int spanCentral3 = 25;
    int exitHeightRow = 75;

    public void paintComponent(Graphics g){

        g.setColor(Color.BLACK);
        g.drawRoundRect(10, 10, 300, 540, 10, 10);

        createSeatsPremium(g);
        createExitRow(g);
        createSeatsEconomic(g);
    }

    private void createSeatsPremium(Graphics g){
        for(int i = 0;i<3;i++){
            for(int j=0;j<4;j++){
                int step = span2+sizeSeat;
                int moveX = (j*step)+border+span2;
                int moveY = (i*step)+border+span2;
                if(j>1){
                    createComponentSeat(g,Color.RED,"A-"+i+j,moveX+spanCentral2
                            ,moveY,sizeSeat,sizeSeat);
                }
                else{
                    createComponentSeat(g,Color.RED,"A-"+i+j,moveX
                            ,moveY,sizeSeat,sizeSeat);
                }
            }
        }
    }

    private void createSeatsEconomic(Graphics g){
        for(int i = 3;i<9;i++){
            for(int j=0;j<6;j++){
                int step = span3+sizeSeat;
                int moveX = (j*step)+border+span3;
                int moveY = (i*step)+span2+sizeSeat+exitHeightRow;
                if(j>2){
                    createComponentSeat(g,Color.RED,"A-"+i+j,moveX+spanCentral3
                            ,moveY,sizeSeat,sizeSeat);
                }
                else{
                    createComponentSeat(g,Color.RED,"A-"+i+j,moveX
                            ,moveY,sizeSeat,sizeSeat);
                }
            }
        }
    }

    private void createComponentSeat(Graphics g,Color color,String name,int x,int y,int width,int height){
        int spaceString = width/2;
        g.setColor(color);
        g.fillRect(x,y,width,height);
        g.setColor(Color.BLACK);
        g.drawString(name,x+5,y+spaceString);
    }

    private void createExitRow(Graphics g){
        int exitY = 3*(span2+sizeSeat)+border+10;
        createComponentExit(g,Color.ORANGE,border+1,exitY,15,65);
        g.setColor(Color.BLACK);
        g.drawString(" <<< EXIT >>>",120,exitY+40);
        createComponentExit(g,Color.ORANGE,300-5,exitY,15,65);
    }

    private void createComponentExit(Graphics g,Color color,int x,int y,int width,int height){
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
}
