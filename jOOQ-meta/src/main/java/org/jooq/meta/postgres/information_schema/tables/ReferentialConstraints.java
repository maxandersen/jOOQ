/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


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
import org.jooq.meta.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferentialConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.referential_constraints</code>
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_CATALOG = createField(DSL.name("unique_constraint_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_SCHEMA = createField(DSL.name("unique_constraint_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public final TableField<Record, String> UNIQUE_CONSTRAINT_NAME = createField(DSL.name("unique_constraint_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.match_option</code>.
     */
    public final TableField<Record, String> MATCH_OPTION = createField(DSL.name("match_option"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.update_rule</code>.
     */
    public final TableField<Record, String> UPDATE_RULE = createField(DSL.name("update_rule"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public final TableField<Record, String> DELETE_RULE = createField(DSL.name("delete_rule"), SQLDataType.VARCHAR, this, "");

    private ReferentialConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ReferentialConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>information_schema.referential_constraints</code> table reference
     */
    public ReferentialConstraints(String alias) {
        this(DSL.name(alias), REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>information_schema.referential_constraints</code> table reference
     */
    public ReferentialConstraints(Name alias) {
        this(alias, REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a <code>information_schema.referential_constraints</code> table reference
     */
    public ReferentialConstraints() {
        this(DSL.name("referential_constraints"), null);
    }

    public <O extends Record> ReferentialConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, REFERENTIAL_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ReferentialConstraints as(String alias) {
        return new ReferentialConstraints(DSL.name(alias), this);
    }

    @Override
    public ReferentialConstraints as(Name alias) {
        return new ReferentialConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(String name) {
        return new ReferentialConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReferentialConstraints rename(Name name) {
        return new ReferentialConstraints(name, null);
    }
}
