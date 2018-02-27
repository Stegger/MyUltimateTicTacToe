/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myultimatetictactoe.bll.game;

import myultimatetictactoe.bll.field.IField;
import myultimatetictactoe.bll.field.MyField;

/**
 *
 * @author pgn
 */
public class MyGameState implements IGameState
{

    private IField field;

    public MyGameState()
    {
        this.field = new MyField();
    }

    @Override
    public IField getField()
    {
        return field;
    }

    @Override
    public int getMoveNumber()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMoveNumber(int moveNumber)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRoundNumber()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRoundNumber(int roundNumber)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
