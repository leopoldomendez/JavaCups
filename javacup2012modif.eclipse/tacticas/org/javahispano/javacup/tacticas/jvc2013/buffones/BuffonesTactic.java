/**
 * $Id$
 * @author rboza
 * @date   Sep 2, 2013 3:30:35 PM
 *
 * Copyright (C) 2013 Scytl Secure Electronic Voting SA
 *
 * All rights reserved.
 *
 */
package org.javahispano.javacup.tacticas.jvc2013.buffones;

import java.util.List;

import org.javahispano.javacup.model.Tactic;
import org.javahispano.javacup.model.TacticDetail;
import org.javahispano.javacup.model.command.Command;
import org.javahispano.javacup.model.engine.GameSituations;
import org.javahispano.javacup.model.util.Position;

/**
 *
 */
public class BuffonesTactic implements Tactic {

    /**
     * @see org.javahispano.javacup.model.Tactic#getDetail()
     */
    @Override
    public TacticDetail getDetail() {
        return new BuffonesTacticDetail();
    }

    /**
     * @see org.javahispano.javacup.model.Tactic#execute(org.javahispano.javacup.model.engine.GameSituations)
     */
    @Override
    public List<Command> execute(final GameSituations sp) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.javahispano.javacup.model.Tactic#getStartPositions(org.javahispano.javacup.model.engine.GameSituations)
     */
    @Override
    public Position[] getStartPositions(final GameSituations sp) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.javahispano.javacup.model.Tactic#getNoStartPositions(org.javahispano.javacup.model.engine.GameSituations)
     */
    @Override
    public Position[] getNoStartPositions(final GameSituations sp) {
        // TODO Auto-generated method stub
        return null;
    }

}
