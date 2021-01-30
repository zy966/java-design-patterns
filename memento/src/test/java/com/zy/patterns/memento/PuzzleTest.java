package com.zy.patterns.memento;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzleTest {

    @Test
    public void main() {
        PuzzlePiece piece1 = new PuzzlePiece(Position.create(1, 1), Position.create(1, 1));
        PuzzlePiece piece2 = new PuzzlePiece(Position.create(2, 1), Position.create(2, 1));
        PuzzlePiece piece3 = new PuzzlePiece(Position.create(1, 2), Position.create(1, 2));
        PuzzlePiece blank = new PuzzlePiece(Position.create(2, 2), Position.create(2, 2));
        List<PuzzlePiece> pieces = Arrays.asList(piece1, piece2, piece3);
        Puzzle puzzle = new Puzzle(blank, pieces);

        System.out.println(puzzle.toString());

        puzzle.moveLeft(piece1);
        puzzle.moveUp(piece2);
        puzzle.moveRight(piece1);
        puzzle.moveDown(piece3);
        puzzle.moveLeft(piece2);
        puzzle.moveUp(piece1);
        puzzle.moveRight(piece3);
        puzzle.moveDown(piece2);
        puzzle.moveLeft(piece1);
        puzzle.moveUp(piece3);
        puzzle.moveRight(piece2);
        puzzle.moveDown(piece1);

        puzzle.undo();
        puzzle.undo();
        puzzle.redo();
        puzzle.redo();

        puzzle.moveLeft(piece3);

    }

}
