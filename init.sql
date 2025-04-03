DROP TABLE IF EXISTS person;

CREATE TABLE IF NOT EXISTS person (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT
);

INSERT INTO person (name, age) VALUES ('Alice From Wonderland', 30);
INSERT INTO person (name, age) VALUES ('Bob', 25);
INSERT INTO person (name, age) VALUES ('Charlie', 35);