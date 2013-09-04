/**
 * $Id$
 * @author rboza
 * @date   Sep 2, 2013 3:31:37 PM
 *
 * Copyright (C) 2013 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.javahispano.javacup.tacticas.jvc2013.buffones;

import java.awt.Color;

import org.javahispano.javacup.model.PlayerDetail;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.render.EstiloUniforme;

/**
 *
 */
public class BuffonesTacticDetail implements TacticDetail {

    private static final String TACTIC_NAME = "Buffones";

    private static final String COUNTRY = "España";

    private static final String COACH = "Ramon Boza";

    private static final Color BROWN = new Color(118, 75, 46);

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getTacticName()
     */
    @Override
    public String getTacticName() {
        return TACTIC_NAME;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getCountry()
     */
    @Override
    public String getCountry() {
        return COUNTRY;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getCoach()
     */
    @Override
    public String getCoach() {
        return COACH;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShirtColor()
     */
    @Override
    public Color getShirtColor() {
        return new Color(153, 144, 224);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShortsColor()
     */
    @Override
    public Color getShortsColor() {
        return new Color(217, 213, 246);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShirtLineColor()
     */
    @Override
    public Color getShirtLineColor() {
        return new Color(188, 188, 188);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getSocksColor()
     */
    @Override
    public Color getSocksColor() {
        return new Color(188, 188, 188);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getGoalKeeper()
     */
    @Override
    public Color getGoalKeeper() {
        return Color.YELLOW;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getStyle()
     */
    @Override
    public EstiloUniforme getStyle() {
        return EstiloUniforme.LINEAS_VERTICALES;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShirtColor2()
     */
    @Override
    public Color getShirtColor2() {
        return new Color(222, 216, 148);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShortsColor2()
     */
    @Override
    public Color getShortsColor2() {
        return new Color(193, 251, 198);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getShirtLineColor2()
     */
    @Override
    public Color getShirtLineColor2() {
        return new Color(255, 255, 255);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getSocksColor2()
     */
    @Override
    public Color getSocksColor2() {
        return new Color(255, 255, 255);
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getGoalKeeper2()
     */
    @Override
    public Color getGoalKeeper2() {
        return Color.PINK;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getStyle2()
     */
    @Override
    public EstiloUniforme getStyle2() {
        return EstiloUniforme.LINEAS_VERTICALES;
    }

    /**
     * @see org.javahispano.javacup.model.TacticDetail#getPlayers()
     */
    @Override
    public PlayerDetail[] getPlayers() {
        return new BuffonesPlayer[] {
                // GOAL KEEPER
                new BuffonesPlayer("Casillas", Color.WHITE, Color.BLACK,
                    1, true, 1, 1, 1),
                // LEFT DEFENDER
                new BuffonesPlayer("Roberto Carlos", BROWN, BROWN, 2,
                    false, 1, 0, 0),
                // CENTRAL DEFENDER
                new BuffonesPlayer("Pepe", BROWN, BROWN, 3, false, 1, 0, 0),
                // CENTRAL DEFENDER
                new BuffonesPlayer("David Luiz", Color.white,
                    Color.YELLOW, 4, false, 1, 0, 0),
                // RIGHT DEFENDER
                new BuffonesPlayer("Sergio Ramos", Color.white,
                    Color.black, 5, false, 1, 0, 0),
                // DEFENSIVE MID CENTRAL
                new BuffonesPlayer("Xavi Alonso", Color.white,
                    Color.yellow, 6, false, 1, 0, 0),
                // LEFT WING LATERAL
                new BuffonesPlayer("Neymar Jr.", BROWN, Color.black, 7,
                    false, 1, 1, 1),
                // RIGHT WING LATERAL
                new BuffonesPlayer("Jesus Navas", Color.white,
                    Color.black, 8, false, 1, 0, 0),
                // ATTACK MID CENTRAL
                new BuffonesPlayer("Cristiano Ronaldo", BROWN,
                    Color.black, 9, false, 1, 1, 1),
                // LEFT STRIKER
                new BuffonesPlayer("Messi", Color.white, Color.black, 10,
                    false, 1, 1, 1),
                // RIGHT STRIKER
                new BuffonesPlayer("Benzema", Color.white, Color.black,
                    11, false, 1, 1, 1)

        };
    }

    private class BuffonesPlayer implements PlayerDetail {

        private final String _playerName;

        private final Color _skinColor;

        private final Color _hairColor;

        private final int _number;

        private final boolean _isGoalKeeper;

        private final double _speed;

        private final double _power;

        private final double _precision;

        public BuffonesPlayer(final String playerName, final Color skin,
                final Color hair, final int number,
                final boolean isGoalKeeper, final double speed,
                final double power, final double precision) {
            _playerName = playerName;
            _skinColor = skin;
            _hairColor = hair;
            _number = number;
            _isGoalKeeper = isGoalKeeper;
            _speed = speed;
            _power = power;
            _precision = precision;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getPlayerName()
         */
        @Override
        public String getPlayerName() {
            return _playerName;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getSkinColor()
         */
        @Override
        public Color getSkinColor() {
            return _skinColor;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getHairColor()
         */
        @Override
        public Color getHairColor() {
            return _hairColor;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getNumber()
         */
        @Override
        public int getNumber() {
            return _number;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#isGoalKeeper()
         */
        @Override
        public boolean isGoalKeeper() {
            return _isGoalKeeper;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getSpeed()
         */
        @Override
        public double getSpeed() {
            return _speed;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getPower()
         */
        @Override
        public double getPower() {
            return _power;
        }

        /**
         * @see org.javahispano.javacup.model.PlayerDetail#getPrecision()
         */
        @Override
        public double getPrecision() {
            return _precision;
        }

    }
}
