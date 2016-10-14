DROP TABLE BooksAuthors;
DROP TABLE Books;
DROP TABLE Authors;
DROP TABLE Publishers;
select count(*) from pg_tables where tableowner='tomek';