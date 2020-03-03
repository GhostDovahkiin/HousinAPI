CREATE TABLE usuario (
  codigo SERIAL PRIMARY KEY,
  tipo varchar(255) default NULL,
  nome varchar(255) default NULL,
  cpf varchar(100) default NULL,
  datanascimento varchar(255) default NULL
);

INSERT INTO usuario (tipo,nome,cpf,datanascimento) VALUES ('LOCADOR','Irene Vang','589-290-931-91','26/07/1987'),('LOCADOR','Fuller U. Myers','795-869-461-29','22/05/1991'),('LOCADOR','Alana Battle','397-700-180-71','01/05/1967'),('LOCADOR','Jin J. Johns','182-882-393-56','16/06/1975'),('LOCATARIO','Cairo N. Avery','742-960-290-60','06/02/1995'),('LOCADOR','Simone Mckinney','099-217-673-03','02/08/1973'),('LOCADOR','Summer Z. Reilly','154-520-489-86','14/01/1990'),('LOCATARIO','Ross Ellison','188-863-115-06','03/08/1968'),('LOCATARIO','Shaeleigh Clarke','791-271-996-31','09/01/1967'),('LOCADOR','Knox Wong','928-274-947-29','12/10/1982');
INSERT INTO usuario (tipo,nome,cpf,datanascimento) VALUES ('LOCATARIO','Aileen Day','175-301-689-72','12/01/1996'),('LOCADOR','Blossom Huff','036-889-454-59','22/05/1974'),('LOCADOR','Amethyst U. Burris','388-452-992-67','20/11/1967'),('LOCADOR','Uriel E. Ayala','752-176-043-75','29/12/1998'),('LOCADOR','Irene Alexander','182-119-129-25','19/01/1976'),('LOCATARIO','Macon U. Hebert','462-345-186-81','21/12/1971'),('LOCATARIO','Roanna I. Wilson','995-505-396-07','20/05/1974'),('LOCATARIO','Maisie K. Vinson','096-359-475-10','01/01/1989'),('LOCATARIO','Laura Short','795-645-483-35','23/03/1977'),('LOCADOR','Althea Pickett','461-574-338-15','27/10/1987');
INSERT INTO usuario (tipo,nome,cpf,datanascimento) VALUES ('LOCATARIO','Jolie V. Good','320-264-989-86','06/01/1975'),('LOCATARIO','Tanisha Herman','095-724-555-37','11/10/1993'),('LOCATARIO','Flavia C. Michael','254-872-591-29','12/11/1983'),('LOCADOR','Eugenia J. Schroeder','993-648-457-87','06/04/1983'),('LOCADOR','Hammett E. Noel','541-329-751-09','14/11/1993');