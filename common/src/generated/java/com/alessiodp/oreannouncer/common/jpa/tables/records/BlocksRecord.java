/*
 * This file is generated by jOOQ.
 */
package com.alessiodp.oreannouncer.common.jpa.tables.records;


import com.alessiodp.oreannouncer.common.jpa.tables.Blocks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BlocksRecord extends UpdatableRecordImpl<BlocksRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = -2090676049;

    /**
     * Setter for <code>BLOCKS.PLAYER</code>.
     */
    public void setPlayer(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>BLOCKS.PLAYER</code>.
     */
    public String getPlayer() {
        return (String) get(0);
    }

    /**
     * Setter for <code>BLOCKS.MATERIAL_NAME</code>.
     */
    public void setMaterialName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>BLOCKS.MATERIAL_NAME</code>.
     */
    public String getMaterialName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>BLOCKS.DESTROYED</code>.
     */
    public void setDestroyed(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>BLOCKS.DESTROYED</code>.
     */
    public Integer getDestroyed() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Blocks.BLOCKS.PLAYER;
    }

    @Override
    public Field<String> field2() {
        return Blocks.BLOCKS.MATERIAL_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Blocks.BLOCKS.DESTROYED;
    }

    @Override
    public String component1() {
        return getPlayer();
    }

    @Override
    public String component2() {
        return getMaterialName();
    }

    @Override
    public Integer component3() {
        return getDestroyed();
    }

    @Override
    public String value1() {
        return getPlayer();
    }

    @Override
    public String value2() {
        return getMaterialName();
    }

    @Override
    public Integer value3() {
        return getDestroyed();
    }

    @Override
    public BlocksRecord value1(String value) {
        setPlayer(value);
        return this;
    }

    @Override
    public BlocksRecord value2(String value) {
        setMaterialName(value);
        return this;
    }

    @Override
    public BlocksRecord value3(Integer value) {
        setDestroyed(value);
        return this;
    }

    @Override
    public BlocksRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlocksRecord
     */
    public BlocksRecord() {
        super(Blocks.BLOCKS);
    }

    /**
     * Create a detached, initialised BlocksRecord
     */
    public BlocksRecord(String player, String materialName, Integer destroyed) {
        super(Blocks.BLOCKS);

        set(0, player);
        set(1, materialName);
        set(2, destroyed);
    }
}
