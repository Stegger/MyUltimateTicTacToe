/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myultimatetictactoe.gui.model;

import myultimatetictactoe.bll.move.IMove;

/**
 *
 * @author pgn
 */
public class UTTTModel
{

    public void makeMove(IMove move)
    {
        System.out.println("X: " + move.getX() + ", Y:" + move.getY());
    }

}
