CREATE DATABASE query_assesment;

USE query_assesment;

CREATE TABLE parent (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    parent_id INT
);

INSERT INTO parent (id, name, parent_id) VALUES
(1, 'Zaki', 2),
(2, 'Ilham', NULL),
(3, 'Irwan', 2),
(4, 'Arka', 3);

-- Result
SELECT child.id, child.name, parent.name AS parent_name
FROM parent AS child
LEFT JOIN parent AS parent ON child.parent_id = parent.id;
