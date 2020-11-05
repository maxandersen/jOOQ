/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.pg_catalog.Keys;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgIndex extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_index</code>
     */
    public static final PgIndex PG_INDEX = new PgIndex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public final TableField<Record, Long> INDEXRELID = createField(DSL.name("indexrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indrelid</code>.
     */
    public final TableField<Record, Long> INDRELID = createField(DSL.name("indrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnatts</code>.
     */
    public final TableField<Record, Short> INDNATTS = createField(DSL.name("indnatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indnkeyatts</code>.
     */
    public final TableField<Record, Short> INDNKEYATTS = createField(DSL.name("indnkeyatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisunique</code>.
     */
    public final TableField<Record, Boolean> INDISUNIQUE = createField(DSL.name("indisunique"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public final TableField<Record, Boolean> INDISPRIMARY = createField(DSL.name("indisprimary"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public final TableField<Record, Boolean> INDISEXCLUSION = createField(DSL.name("indisexclusion"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public final TableField<Record, Boolean> INDIMMEDIATE = createField(DSL.name("indimmediate"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public final TableField<Record, Boolean> INDISCLUSTERED = createField(DSL.name("indisclustered"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public final TableField<Record, Boolean> INDISVALID = createField(DSL.name("indisvalid"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public final TableField<Record, Boolean> INDCHECKXMIN = createField(DSL.name("indcheckxmin"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisready</code>.
     */
    public final TableField<Record, Boolean> INDISREADY = createField(DSL.name("indisready"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indislive</code>.
     */
    public final TableField<Record, Boolean> INDISLIVE = createField(DSL.name("indislive"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public final TableField<Record, Boolean> INDISREPLIDENT = createField(DSL.name("indisreplident"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indkey</code>.
     */
    public final TableField<Record, Object[]> INDKEY = createField(DSL.name("indkey"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int2vector\"").getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indcollation</code>.
     */
    public final TableField<Record, Long[]> INDCOLLATION = createField(DSL.name("indcollation"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indclass</code>.
     */
    public final TableField<Record, Long[]> INDCLASS = createField(DSL.name("indclass"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_index.indoption</code>.
     */
    public final TableField<Record, Object[]> INDOPTION = createField(DSL.name("indoption"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"int2vector\"").getArrayDataType(), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<Record, Object> INDEXPRS = createField(DSL.name("indexprs"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<Record, Object> INDPRED = createField(DSL.name("indpred"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgIndex(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgIndex(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex(String alias) {
        this(DSL.name(alias), PG_INDEX);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex(Name alias) {
        this(alias, PG_INDEX);
    }

    /**
     * Create a <code>pg_catalog.pg_index</code> table reference
     */
    public PgIndex() {
        this(DSL.name("pg_index"), null);
    }

    public <O extends Record> PgIndex(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_INDEX);
    }

    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.PG_INDEX__INDEX_CLASS, Keys.PG_INDEX__TABLE_CLASS);
    }

    public PgClass indexClass() {
        return new PgClass(this, Keys.PG_INDEX__INDEX_CLASS);
    }

    public PgClass tableClass() {
        return new PgClass(this, Keys.PG_INDEX__TABLE_CLASS);
    }

    @Override
    public PgIndex as(String alias) {
        return new PgIndex(DSL.name(alias), this);
    }

    @Override
    public PgIndex as(Name alias) {
        return new PgIndex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndex rename(String name) {
        return new PgIndex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgIndex rename(Name name) {
        return new PgIndex(name, null);
    }
}
