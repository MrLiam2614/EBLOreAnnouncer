/*
 * This file is generated by jOOQ.
 */
package com.alessiodp.oreannouncer.common.jpa;


import com.alessiodp.oreannouncer.common.jpa.tables.Blocks;
import com.alessiodp.oreannouncer.common.jpa.tables.BlocksFound;
import com.alessiodp.oreannouncer.common.jpa.tables.Players;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>BLOCKS</code>.
     */
    public static final Blocks BLOCKS = Blocks.BLOCKS;

    /**
     * The table <code>BLOCKS_FOUND</code>.
     */
    public static final BlocksFound BLOCKS_FOUND = BlocksFound.BLOCKS_FOUND;

    /**
     * The table <code>PLAYERS</code>.
     */
    public static final Players PLAYERS = Players.PLAYERS;
}
