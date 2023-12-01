package solid.dependency_inversion.enums;

public enum DatabaseType {
    MYSQL("MySQL"),
    POSTGRESQL("PostgreSQL"),
    ORACLE("Oracle"),
    SQL_SERVER("SQL Server"),
    MONGODB("MongoDB"),
    SQLITE("SQLite"),
    REDIS("Redis"),
    COUCHDB("CouchDB"),
    NEO4J("Neo4j"),
    H2("H2"),
    OTHER("Other");

    private final String displayName;

    DatabaseType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
