-- Seleccionar base de datos
USE library;

-- Crear al tabla autores
CREATE TABLE authors (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
last_name VARCHAR(50)
);

-- Añadir una columan 'age' a la tabla autores
ALTER TABLE authors ADD COLUMN age INT;

-- Crear tabla libros
CREATE TABLE books (
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(50),
author_id INT,
price DECIMAL(5, 2),
FOREIGN KEY (author_id) REFERENCES authors(id)
);
