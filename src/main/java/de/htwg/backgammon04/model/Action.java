package de.htwg.backgammon04.model;

/**
 * Wird benötigt um die einzelnen Vorgänge in den Moves zu speichern. Nicht
 * nötig für den Spielfluss. Allerdings von Gebrauch für Analysezwecke.
 * 
 */
public interface Action {

	public long getId();

	public void setId(long id);

	public Dice getDice();

	public void setDice(Dice dice);

	public Point getTargetPoint();

	public void setTargetPoint(Point targetPoint);

	public Point getSourcePoint();

	public void setSourcePoint(Point targetPoint);
}
