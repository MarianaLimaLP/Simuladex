CREATE DATABASE IF NOT EXISTS Simuladex;
USE Simuladex;

CREATE TABLE Professor(
	prontuario_prof		VARCHAR(7)	NOT NULL,
    nome				VARCHAR(75) NOT NULL,
    titulacao			VARCHAR(75) NOT NULL,
    atua				BOOLEAN		NOT NULL,
	coord				BOOLEAN		NOT NULL,
	cpf					VARCHAR(14)	NOT NULL,
    email				VARCHAR(75) NOT NULL,
    senha				VARCHAR(20) NOT NULL,
    
    PRIMARY KEY (prontuario_prof)
);

CREATE TABLE Curso(
	idCurso				INT	AUTO_INCREMENT	NOT NULL,
    nome				VARCHAR(75)			NOT NULL,
	prontuario_coord	VARCHAR(7),
    
    PRIMARY KEY (idCurso),
    FOREIGN KEY (prontuario_coord)	REFERENCES Professor (prontuario_prof)
);

CREATE TABLE Turma(
	idTurma INT	AUTO_INCREMENT	NOT NULL,
    serie	INT 				NOT NULL,
	idCurso	INT,
    
    PRIMARY KEY (idTurma),
    
    FOREIGN KEY (idCurso) REFERENCES Curso (idCurso)
);

CREATE TABLE Aluno(
	prontuario_aluno	INT			NOT NULL,
    nome				VARCHAR(75)	NOT NULL,
    email				VARCHAR(75),
    idTurma				INT,
    senha				VARCHAR(20) NOT NULL,
    
    PRIMARY KEY (prontuario_aluno),
    
    FOREIGN KEY (idTurma) REFERENCES Turma (idTurma)
);

CREATE TABLE Disciplina(
	idDisciplina	INT	AUTO_INCREMENT	NOT NULL,
    nome_disc		VARCHAR(75) 		NOT NULL,
    areaDeEnsino	VARCHAR(100)		NOT NULL,
    prontuario_prof	VARCHAR(7)			NOT NULL,
    idTurma			INT					NOT NULL,
    
    PRIMARY KEY (idDisciplina),
    
    FOREIGN KEY (prontuario_prof)	REFERENCES Professor (prontuario_prof),
    FOREIGN KEY (idTurma)			REFERENCES Turma (idTurma)
);

CREATE TABLE Prova(
	idProva					INT AUTO_INCREMENT	NOT NULL,
    qtdquestaodisciplina	INT	 				NOT NULL,
    datadosimulado			DATE 				NOT NULL,
    idTurma			INT					NOT NULL,
    
    PRIMARY KEY (idProva),
    FOREIGN KEY (idTurma)			REFERENCES Turma (idTurma)
);

CREATE TABLE Questao(
	idQuestao		INT AUTO_INCREMENT	NOT NULL,
    descricao		VARCHAR(5000)		NOT NULL,
    altA			VARCHAR(1000)		NOT NULL,
    altB			VARCHAR(1000)		NOT NULL,
    altC			VARCHAR(1000)		NOT NULL,
    altD			VARCHAR(1000)		NOT NULL,
    altE			VARCHAR(1000)		NOT NULL,
	respostaCorreta	VARCHAR(1)			NOT NULL,
    explicacao		VARCHAR(5000)		NOT NULL,
    idDisciplina	INT					NOT NULL,
    
    PRIMARY KEY (idQuestao),
    
    FOREIGN KEY (idDisciplina) REFERENCES Disciplina (idDisciplina)
);

CREATE TABLE QuestaoProva(
    idProva		INT NOT NULL,
	idQuestao	INT	NOT NULL,
    
    PRIMARY KEY (idQuestao, idProva),
    
    FOREIGN KEY (idProva) 	REFERENCES Prova (idProva),
    FOREIGN KEY (idQuestao)	REFERENCES Questao (idQuestao)
);

CREATE TABLE ProvaAluno(
	prontuario_aluno	INT			NOT NULL,
    idProva				INT			NOT NULL,
    horafinal			VARCHAR(5)		NULL,
    horainicial			VARCHAR(5)		NULL,
    
    PRIMARY KEY (prontuario_aluno, idProva),
    
    FOREIGN KEY (prontuario_aluno)	REFERENCES Aluno (prontuario_aluno),
    FOREIGN KEY (idProva) 	REFERENCES Prova (idProva)
);

CREATE TABLE RespostaQuestao(
	prontuario_aluno	INT			NOT NULL,
    idProva				INT			NOT NULL,
    idQuestao			INT			NOT NULL,
    respostadada		VARCHAR(1)		NULL,
    
    
    PRIMARY KEY (prontuario_aluno, idProva, idQuestao),
    
    FOREIGN KEY (prontuario_aluno)	REFERENCES Aluno (prontuario_aluno),
    FOREIGN KEY (idProva) 			REFERENCES Prova (idProva),
    FOREIGN KEY (idQuestao)			REFERENCES Questao (idQuestao)
);