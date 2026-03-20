-- 000001_init_kv.sql
-- Purpose:
-- - Creates the base schema for the key-value store.
-- - Defines core table(s), indexes, and constraints.
-- - Serves as the first migration applied to a new database.

-- TODO: create table kv (
--   key TEXT PRIMARY KEY,
--   value BLOB NOT NULL,
--   created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
--   updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
-- );

-- TODO: create index for key prefix queries if needed.
