# SQLite KV Store Scaffold

This repo now has placeholder files only. Fill TODO blocks as you implement.

## Suggested Layout

```text
app/
  src/
    main/
      java/org/example/
        App.java
        kvstore/
          api/
            CommandRouter.java
          config/
            AppConfig.java
          db/
            SchemaInitializer.java
            SqliteConnectionFactory.java
          model/
            KvEntry.java
          repository/
            KvRepository.java
            SqliteKvRepository.java
          service/
            KvService.java
      resources/
        db/migration/
          V1__create_kv_table.sql
    test/
      java/org/example/
        AppTest.java
        kvstore/repository/
          SqliteKvRepositoryTest.java
```

## Build Order (Recommended)

1. Complete `V1__create_kv_table.sql`.
2. Implement `AppConfig` + `SqliteConnectionFactory`.
3. Implement `SchemaInitializer`.
4. Implement `SqliteKvRepository`.
5. Add validation/rules in `KvService`.
6. Implement command parsing in `CommandRouter`.
7. Replace placeholder tests with real integration tests.
