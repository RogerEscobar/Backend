-- Seleccionar tabla
USE library;

-- Insertar los datos para los autores
INSERT INTO authors (name, last_name) VALUES ('Miguel', 'de Servantes');
INSERT INTO authors (name, last_name) VALUES ('Cesar', 'Augusto');
INSERT INTO authors (name, last_name) VALUES ('Dante', 'Alighieri');

-- Insertar los datos para libros

INSERT INTO books (title, author_id, price) VALUES ('Don Quijote de la mancha','1','45.23');
INSERT INTO books (title, author_id, price) VALUES ('Meditaciones','2','21.12');
INSERT INTO books (title, author_id, price) VALUES ('Divina comedia','3','35.13');