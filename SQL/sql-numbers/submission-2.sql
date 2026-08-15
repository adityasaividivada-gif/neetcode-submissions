CREATE TABLE BANK_ACCOUNTS(
    ID BIGINT PRIMARY KEY,
    BALANCE NUMERIC(20,2),
    interest_rate NUMERIC(5,2),
    NUMBER_OF_OWNERS SMALLINT
);






-- Do not modify below this line --
INSERT INTO bank_accounts (id, balance, interest_rate, number_of_owners) VALUES
    (1, 123451234512345123.45, 123.45, 1);

SELECT 
    ba.*,
    (SELECT STRING_AGG(column_name || ' ' || data_type || CASE WHEN numeric_precision IS NOT NULL THEN '(' || numeric_precision || ',' || numeric_scale || ')' ELSE '' END, ', ')
     FROM information_schema.columns 
     WHERE table_name = 'bank_accounts') AS column_types
FROM 
    bank_accounts ba;
