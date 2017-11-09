INSERT INTO TEAM(ID,NAME) values (1001,'Alemanha');
INSERT INTO PROCESSO(CODIGOPROCESSO,STATUS, LASTUPDATEDDATE, CREATEDDATE ) values (1001,'Em andamento', sysdate(),sysdate() );



INSERT INTO SQUAD(ID,NUM,POS) values (1,11,'ATA');
INSERT INTO SQUAD(ID,NUM,POS) values (2,10,'MEIO');


INSERT INTO PLAYER(ID,NAME,SQUAD_ID) values (1,'Romario',1);
INSERT INTO PLAYER(ID,NAME,SQUAD_ID) values (2,'Neymar',2);

INSERT INTO TEAM(ID,NAME) values (1,'Brasil');
INSERT INTO TEAM(ID,NAME) values (2,'Alemanha');

INSERT INTO ROUND(ID,TITLE) values (1,'Primeira Rodada');


