/*
 * This file is generated by jOOQ.
 */
package com.alessiodp.oreannouncer.common.jpa.tables;


import com.alessiodp.oreannouncer.common.jpa.DefaultSchema;
import com.alessiodp.oreannouncer.common.jpa.Keys;
import com.alessiodp.oreannouncer.common.jpa.tables.records.BlocksRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Blocks extends TableImpl<BlocksRecord> {

    private static final long serialVersionUID = 709839621;

    /**
     * The reference instance of <code>BLOCKS</code>
     */
    public static final Blocks BLOCKS = new Blocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlocksRecord> getRecordType() {
        return BlocksRecord.class;
    }

    /**
     * The column <code>BLOCKS.PLAYER</code>.
     */
    public final TableField<BlocksRecord, String> PLAYER = createField(DSL.name("PLAYER"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>BLOCKS.MATERIAL_NAME</code>.
     */
    public final TableField<BlocksRecord, String> MATERIAL_NAME = createField(DSL.name("MATERIAL_NAME"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>BLOCKS.DESTROYED</code>.
     */
    public final TableField<BlocksRecord, Integer> DESTROYED = createField(DSL.name("DESTROYED"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>BLOCKS</code> table reference
     */
    public Blocks() {
        this(DSL.name("BLOCKS"), null);
    }

    /**
     * Create an aliased <code>BLOCKS</code> table reference
     */
    public Blocks(String alias) {
        this(DSL.name(alias), BLOCKS);
    }

    /**
     * Create an aliased <code>BLOCKS</code> table reference
     */
    public Blocks(Name alias) {
        this(alias, BLOCKS);
    }

    private Blocks(Name alias, Table<BlocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blocks(Name alias, Table<BlocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Blocks(Table<O> child, ForeignKey<O, BlocksRecord> key) {
        super(child, key, BLOCKS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<BlocksRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    @Override
    public List<UniqueKey<BlocksRecord>> getKeys() {
        return Arrays.<UniqueKey<BlocksRecord>>asList(Keys.CONSTRAINT_7);
    }

    @Override
    public Blocks as(String alias) {
        return new Blocks(DSL.name(alias), this);
    }

    @Override
    public Blocks as(Name alias) {
        return new Blocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blocks rename(String name) {
        return new Blocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Blocks rename(Name name) {
        return new Blocks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}