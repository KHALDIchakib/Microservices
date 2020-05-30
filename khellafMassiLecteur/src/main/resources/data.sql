DROP TABLE IF EXISTS lecteur;

CREATE TABLE lecteur (
                              id INT AUTO_INCREMENT  PRIMARY KEY ,
                              genre VARCHAR2(250) NOT NULL,
                              prenom VARCHAR(250) NOT NULL,
                              nom VARCHAR(250) DEFAULT NULL,
                              date_naissence VARCHAR(250) DEFAULT NULL,
                              adresse VARCHAR(250) DEFAULT NULL);


INSERT INTO lecteur VALUES ( 1,'M','KHELLAF','Djebbar','DFGHJKNVB','GHGHGHG');
INSERT INTO lecteur VALUES ( 2,'M','djebbar','khellaf','DFGHJKNVB','GHGHGHG');