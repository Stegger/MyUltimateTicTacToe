/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myultimatetictactoe.bll.field;

import java.util.Arrays;
import java.util.List;
import myultimatetictactoe.bll.move.IMove;

/**
 *
 * @author pgn
 */
public class MyField implements IField
{

    private String[][] macroBoard;
    private String[][] microBoard;

    public MyField()
    {
        macroBoard = new String[3][3];
        microBoard = new String[9][9];
        clearBoard();
    }

    @Override
    public void clearBoard()
    {
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                macroBoard[x][y] = AVAILABLE_FIELD;
            }
        }
        for (int x = 0; x < 9; x++)
        {
            for (int y = 0; y < 9; y++)
            {
                microBoard[x][y] = EMPTY_FIELD;
            }
        }
    }

    @Override
    public List<IMove> getAvailableMoves()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] getBoard()
    {
        return microBoard;
    }

    @Override
    public void setBoard(String[][] board)
    {
        this.microBoard = board;
    }

    @Override
    public String[][] getMacroboard()
    {
        return macroBoard;
    }

    @Override
    public void setMacroboard(String[][] macroboard)
    {
        this.macroBoard = macroboard;
    }

    @Override
    public String getPlayerId(int column, int row)
    {
        return microBoard[column][row];
    }

    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean isInActiveMicroboard(int x, int y)
    {
        int macroX = x / 3;
        int macroY = y / 3;

        return macroBoard[macroX][macroY].equals(AVAILABLE_FIELD);
    }

    
    
    
}
