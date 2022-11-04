-- Banco de Dados: Faculdade

CREATE DATABASE faculdade;

USE faculdade;

CREATE TABLE departamento (
idDepartamento INTEGER PRIMARY KEY AUTO_INCREMENT,
diretor VARCHAR (30) NOT NULL,
centro VARCHAR(30) NOT NULL,
email VARCHAR(30) NOT NULL,
tel INTEGER NOT NULL,
endereco VARCHAR(30) NOT NULL,
numero INTEGER NOT NULL,
cidade VARCHAR(30) NOT NULL,
estado VARCHAR(30) NOT NULL
);

INSERT INTO departamento VALUES (NULL, "Renata Vasconcelos", "CIN","renatavasconcelos@gmail.com",999776655, "Av. Prof. Moraes Rego",1235,"Recife","PE");
SELECT * FROM departamento;

CREATE TABLE coordenacao (
idCoordenacao INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (80) NOT NULL,
coordenador VARCHAR (30) NOT NULL,
email VARCHAR (30) NOT NULL,
tel INTEGER NOT NULL,
idDepartamento INTEGER NOT NULL,
FOREIGN KEY(idDepartamento) REFERENCES departamento(idDepartamento)
);

INSERT INTO curso VALUES (NULL, "ADS", "Carlos Magalhães", "adsufpe@gmail.com", 555487654);
SELECT * FROM curso;

CREATE TABLE estudante (
idEstudante INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR (30) NOT NULL,
curso VARCHAR (80) NOT NULL,
email VARCHAR (30) NOT NULL,
tel INTEGER NOT NULL,
cpf VARCHAR (30) NOT NULL,
endereco VARCHAR (30) NOT NULL,
numero INTEGER NOT NULL,
cidade VARCHAR (30) NOT NULL,
estado VARCHAR (30) NOT NULL,
idCoodernacao INTEGER NOT NULL,
FOREIGN KEY(idCoordenacao) REFERENCES curso(idCoodernacao)
);

INSERT INTO estudante VALUES (NULL, "Pedro Henrique", "ADS", "pedrohenri@gmail.com", 555555555, "222.222.222-11", "rua Soledad","Recife", "PE");
INSERT INTO estutande VALUES (NULL, "Lucas Santos", "ADS", "lucassantos@gmail.com", 111222334, "777.444.353-13", "rua da Aurora", "Recife", "PE");
SELECT * FROM estudante;

DELETE FROM dependente 
WHERE idDependente = 2;


CREATE TABLE professor (
idProfessor INTEGER PRIMARY KEY AUTO_INCREMENT,
nome  VARCHAR (30) NOT NULL,
email VARCHAR (30) NOT NULL,
tel INTEGER NOT NULL,
disciplina VARCHAR (30) NOT NULL,
endereco VARCHAR (30) NOT NULL,
numero INTEGER NOT NULL,
cidade VARCHAR (30) NOT NULL,
estado VARCHAR (30) NOT NULL,
idDepartamento INTEGER NOT NULL,
FOREIGN KEY(idDepartamento) REFERENCES departamento(idDepartamento)
);

INSERT INTO professor VALUES (NULL, "Regina Kiss", "reginakiss@gmail.com", 333546785, "Algoritmo e Programção", "Av. Prof. Moraes Rego",1235,"Recife","PE");
INSERT INTO professor VALUES (NULL, "Valéria Cavalcante", "valeriacavalcante@gmail.com", 989765430, "Análise de Sistemas","Av. Prof. Moraes Rego",1235,"Recife","PE");
SELECT * FROM professor;

CREATE TABLE rel_prof_estud (
idRelacionamento INTEGER PRIMARY KEY AUTO_INCREMENT,
idEstudante INTEGER NOT NULL,
idProfessor INTEGER NOT NULL,
FOREIGN KEY(idEstudante) REFERENCES estudante(idEstudante),
FOREIGN KEY(idProfessor) REFERENCES professor(idProfessor)
);
SELECT * FROM rel_prof_estud;


SELECT nome, disciplina FROM professor;
SELECT coordenador, email FROM curso; 
SELECT * FROM departamento WHERE email = "@gmail.com";
SELECT idEstudante, nome, curso FROM estudante WHERE idEstudante = 1;

 








