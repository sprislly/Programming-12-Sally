module Download {
    requires derby;
    requires java.sql;

    opens com.sally.database;
}