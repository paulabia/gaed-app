databaseChangeLog = {

    changeSet(author: "apq (generated)", id: "1483015659710-1") {
        createTable(tableName: "usuario") {
            column(autoIncrement: "true", name: "id", type: "INT") {
                constraints(primaryKey: "true")
            }

            column(name: "nome", type: "CHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }
}
