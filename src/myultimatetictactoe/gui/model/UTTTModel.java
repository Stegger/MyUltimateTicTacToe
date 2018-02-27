/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myultimatetictactoe.gui.model;

import myultimatetictactoe.bll.game.GameManager;
import myultimatetictactoe.bll.game.MyGameState;
import myultimatetictactoe.bll.move.IMove;

/**
 *
 * @author pgn
 */
public class UTTTModel
{

    private GameManager gameManager;

    public UTTTModel()
    {
        gameManager = new GameManager(new MyGameState());
    }

    public void makeMove(IMove move)
    {
        gameManager.UpdateGame(move);
    }

}
