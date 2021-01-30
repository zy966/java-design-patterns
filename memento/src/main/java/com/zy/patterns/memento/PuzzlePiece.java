package com.zy.patterns.memento;

import lombok.Data;

@Data
public class PuzzlePiece {

    private final Position correct;

    private Position current;

    public PuzzlePiece(Position correct, Position current) {
        this.correct = correct;
        this.current = current;
    }

    public static void exchangePosition(PuzzlePiece piece1, PuzzlePiece piece2) {
        Position pos1 = piece1.getCurrent();
        Position pos2 = piece2.getCurrent();
        System.out.println(pos1.toString() + " -> "+ pos1.toString());
        piece1.setCurrent(pos2);
        piece2.setCurrent(pos1);
    }

    public boolean isCorrect() {
        return correct.equals(current);
    }

    public void moveLeft() {
        current = Position.create(current.getX() - 1, current.getY());
    }

    public void moveRight() {
        current = Position.create(current.getX() + 1, current.getY());

    }

    public void moveUp() {
        current = Position.create(current.getX(), current.getY() + 1);
    }

    public void moveDown() {
        current = Position.create(current.getX(), current.getY() - 1);
    }

    public Position leftPosition() {
        return Position.create(current.getX() - 1, current.getY());
    }

    public Position rightPosition() {
        return Position.create(current.getX() + 1, current.getY());

    }

    public Position upPosition() {
        return Position.create(current.getX(), current.getY() + 1);
    }

    public Position downPosition() {
        return Position.create(current.getX(), current.getY() - 1);
    }

    @Override
    public String toString() {
        return "PuzzlePiece{" +
                "correct=" + correct.toString() +
                ", current=" + current.toString() +
                '}';
    }

}
