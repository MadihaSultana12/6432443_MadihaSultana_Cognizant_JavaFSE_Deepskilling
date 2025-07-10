-- Step 1: Use or create schema
CREATE DATABASE IF NOT EXISTS ormlearn;
USE ormlearn;

-- Step 2: Create country table
CREATE TABLE country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

-- Step 3: Insert sample records
INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');

-- Step 4: Verify inserted data
SELECT * FROM country;
