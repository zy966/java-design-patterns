package com.zy.patterns.memento;

import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class Puzzle {

    private boolean isWin = false;
    private PuzzlePiece blank;
    private List<PuzzlePiece> pieces;
    private Deque<Memento> undoQueue = new LinkedBlockingDeque<>(5);
    private Deque<Memento> redoQueue = new LinkedBlockingDeque<>(5);

    public Puzzle(PuzzlePiece blank, List<PuzzlePiece> pieces) {
        this.blank = blank;
        this.pieces = pieces;
    }

    public boolean positionCheck(Position position) {
        return position.equals(blank.getCurrent());
    }

    public void moveLeft(PuzzlePiece piece) {
        if (!positionCheck(piece.leftPosition())) {
            System.out.println("Unable to move!");
            return;
        }
        PuzzlePiece.exchangePosition(piece, blank);
        addUndoMemento(piece);
        passCheck();
    }

    public void moveRight(PuzzlePiece piece) {
        if (!positionCheck(piece.rightPosition())) {
            System.out.println("Unable to move!");
            return;
        }
        PuzzlePiece.exchangePosition(piece, blank);
        addUndoMemento(piece);
        passCheck();
    }

    public void moveUp(PuzzlePiece piece) {
        if (!positionCheck(piece.upPosition())) {
            System.out.println("Unable to move!");
            return;
        }
        PuzzlePiece.exchangePosition(piece, blank);
        addUndoMemento(piece);
        passCheck();
    }

    public void moveDown(PuzzlePiece piece) {
        if (!positionCheck(piece.downPosition())) {
            System.out.println("Unable to move!");
            return;
        }
        PuzzlePiece.exchangePosition(piece, blank);
        addUndoMemento(piece);
        passCheck();
    }

    private void passCheck() {
        if (isCorrect()) {
            isWin = true;
            System.out.println("++++ win ++++");
        }
    }

    private boolean isCorrect() {
        for (PuzzlePiece piece : pieces) {
            if (!piece.isCorrect()) {
                return false;
            }
        }
        return true;
    }

    private void addUndoMemento(PuzzlePiece piece) {
        if (undoQueue.size() >= 5) {
            undoQueue.pollLast();
        }
        undoQueue.addFirst(Memento.create(piece));
    }

    private void addRedoMemento(PuzzlePiece piece) {
        if (redoQueue.size() >= 5) {
            redoQueue.pollLast();
        }
        redoQueue.addFirst(Memento.create(piece));
    }

    public void undo() {
        Memento memento = undoQueue.pollFirst();
        if (memento == null) {
            return;
        }
        addRedoMemento(memento.getPiece());
        memento.restore();
    }

    public void redo() {
        Memento memento = redoQueue.pollFirst();
        if (memento == null) {
            return;
        }
        addUndoMemento(memento.getPiece());
        memento.restore();
    }

    public boolean isWin() {
        return isWin;
    }

    @Override
    public String toString() {
        return pieces.toString();
    }

}
