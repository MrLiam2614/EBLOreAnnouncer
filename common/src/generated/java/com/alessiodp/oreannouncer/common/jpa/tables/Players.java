/*
 * This file is generated by jOOQ.
 */
package com.alessiodp.oreannouncer.common.jpa.tables;


import com.alessiodp.oreannouncer.common.jpa.DefaultSchema;
import com.alessiodp.oreannouncer.common.jpa.Keys;
import com.alessiodp.oreannouncer.common.jpa.tables.records.PlayersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Players extends TableImpl<PlayersRecord> {

    private static final long serialVersionUID = 40014347;

    /**
     * The reference instance of <code>PLAYERS</code>
     */
    public static final Players PLAYERS = new Players();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayersRecord> getRecordType() {
        return PlayersRecord.class;
    }

    /**
     * The column <code>PLAYERS.UUID</code>.
     */
    public final TableField<PlayersRecord, String> UUID = createField(DSL.name("UUID"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PLAYERS.ALERTS</code>.
     */
    public final TableField<PlayersRecord, Boolean> ALERTS = createField(DSL.name("ALERTS"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>PLAYERS</code> table reference
     */
    public Players() {
        this(DSL.name("PLAYERS"), null);
    }

    /**
     * Create an aliased <code>PLAYERS</code> table reference
     */
    public Players(String alias) {
        this(DSL.name(alias), PLAYERS);
    }

    /**
     * Create an aliased <code>PLAYERS</code> table reference
     */
    public Players(Name alias) {
        this(alias, PLAYERS);
    }

    private Players(Name alias, Table<PlayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Players(Name alias, Table<PlayersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Players(Table<O> child, ForeignKey<O, PlayersRecord> key) {
        super(child, key, PLAYERS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<PlayersRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_D;
    }

    @Override
    public List<UniqueKey<PlayersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlayersRecord>>asList(Keys.CONSTRAINT_D);
    }

    @Override
    public Players as(String alias) {
        return new Players(DSL.name(alias), this);
    }

    @Override
    public Players as(Name alias) {
        return new Players(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(String name) {
        return new Players(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(Name name) {
        return new Players(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
