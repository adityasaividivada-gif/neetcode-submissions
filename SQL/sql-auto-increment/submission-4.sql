create sequence gov_id start with 1000 increment by 3;


CREATE TABLE gov_employee (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    gov_id integer default nextval('gov_id'),
    name text
);








-- Do not modify below this line --
INSERT INTO gov_employee (name) 
  VALUES
      ('John Doe'),
      ('Jane Doe'),
      ('Jim Beam');

SELECT * FROM gov_employee;
