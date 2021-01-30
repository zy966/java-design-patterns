package com.zy.patterns.memento;

import lombok.Data;

import java.util.Objects;

@Data
public class Position {

    private final int x;
    private final int y;

    public static Position create(int x, int y) {
        return new Position(x, y);
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
