package com.zy.patterns.memento;

public class Memento {

    private PuzzlePiece piece;

    private Position position;

    private Memento() {
    }

    public static Memento create(PuzzlePiece piece) {
        Memento memento = new Memento();
        memento.piece = piece;
        memento.position = piece.getCurrent();
        return memento;
    }

    public void restore() {
        piece.setCurrent(position);
    }

    public PuzzlePiece getPiece() {
        return piece;
    }

}
