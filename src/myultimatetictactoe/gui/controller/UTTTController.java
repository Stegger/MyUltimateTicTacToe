/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myultimatetictactoe.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import myultimatetictactoe.bll.move.IMove;
import myultimatetictactoe.gui.model.UTTTModel;

/**
 *
 * @author pgn
 */
public class UTTTController implements Initializable
{

    private GridPane[][] microBoards;
    private Button[] buttons;

    private UTTTModel model;

    @FXML
    private GridPane macroGrid;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        model = new UTTTModel();
        microBoards = new GridPane[3][3];
        buttons = new Button[81];

        for (int cell = 0; cell < 81; cell++)
        {
            int x = cell % 9;
            int y = cell / 9;

            if (microBoards[x / 3][y / 3] == null)
            {
                microBoards[x / 3][y / 3] = new GridPane();
                macroGrid.add(microBoards[x / 3][y / 3], x / 3, y / 3);
            }
            GridPane microBoard = microBoards[x / 3][y / 3];
            Button btn = new Button();
            microBoard.add(btn, x % 3, y % 3);

            buttons[cell] = btn;
            btn.setUserData(new IMove()
            {
                @Override
                public int getX()
                {
                    return x;
                }

                @Override
                public int getY()
                {
                    return y;
                }
            });

            btn.setOnAction((ActionEvent event)
                    -> 
                    {
                        IMove move = (IMove) ((Button) event.getSource()).getUserData();
                        model.makeMove(move);
            });

        }
    }

}
