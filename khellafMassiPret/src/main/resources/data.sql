DROP TABLE IF EXISTS Pret;

CREATE TABLE Pret (
                         id INT AUTO_INCREMENT  PRIMARY KEY ,
                         ISBN VARCHAR2(250) NOT NULL,
                         lecteur INT NOT NULL,
                         date_pret VARCHAR(250) DEFAULT NULL,
                         date_retour VARCHAR(250) DEFAULT NULL);

INSERT INTO Pret VALUES ( 1,'1236564789',123,'14/25/2020','78/12/2019');
INSERT INTO Pret VALUES ( 2,'987456321',456,'21/50/2020','12/12/2021');