-- drop database vls;
CREATE database  vls;
USE vls;

CREATE TABLE Customer(
NIC varchar(10),
C_Name varchar(20),
Email varchar(20),
telephone varchar(10),

CONSTRAINT Customer_PK PRIMARY KEY(NIC),
CONSTRAINT Customer_CK1 CHECK(C_name IS NOT NULL),
CONSTRAINT Customer_CK2 CHECK(NIC LIKE'[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''v'),
CONSTRAINT Customer_CK3 CHECK(telephone LIKE'[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]''[0-9]')
);

INSERT INTO Customer VALUES('982745582v','Allen Walter','alws98@gmail.com','0777884159');
INSERT INTO Customer VALUES('101562866v','Christine Grayson','chs10@gmail.com','0117855940');
INSERT INTO Customer VALUES('207302164v','Lily Halston','lhs20@gmail.com','0714587750');
INSERT INTO Customer VALUES('963800115v','Matthew Yardely','mys96@gmail.com','0709004141');
INSERT INTO Customer VALUES('948920566v','Angella Cooper','acs94@gmail.com','0773285570');

CREATE TABLE Dvd(
DvdId varchar(10),
DvdName varchar(20),
DvdPrice float,

CONSTRAINT Dvd_PK PRIMARY KEY(DvdId),
CONSTRAINT Dvd_CK1 CHECK(d_name IS NOT NULL)
);

INSERT INTO Dvd VALUES('Hh024','RAAZ',120);
INSERT INTO Dvd VALUES('E9011','Peter Rabbit',150);
INSERT INTO Dvd VALUES('Et058','Red Sparrow',150);
INSERT INTO Dvd VALUES('Er022','Fifty Shades Freed',150);
INSERT INTO Dvd VALUES('Hh025','Pari',120);
INSERT INTO Dvd VALUES('Ef050','Avengers',150);
INSERT INTO Dvd VALUES('Ef049','Jurrasic world_FK',150);
INSERT INTO Dvd VALUES('Eh066','Halloween',150);
INSERT INTO Dvd VALUES('Hr013','Padmvat',120);

CREATE TABLE Rent(
RentCustomerId varchar(10),
RentId varchar(5),/*rent dvd id*/
RentDvdCode char(5),
RentDate date,
RentDeadLine date,

CONSTRAINT Rent_PK PRIMARY KEY(RentCustomerId,RentId),
CONSTRAINT Rent_FK1 FOREIGN KEY(RentCustomerId) REFERENCES Customer(NIC),
CONSTRAINT Rent_FK2 FOREIGN KEY(RentDvdCode) REFERENCES Dvd(DvdId)
);

INSERT INTO Rent VALUES('982745582v','r1','Hh024','2018.04.04','2018.04.12');
INSERT INTO Rent VALUES('982745582v','r2','E9011','2018.04.04','2018.04.12');
INSERT INTO Rent VALUES('101562866v','r1','Et058','2018.04.06','2018.04.10');
INSERT INTO Rent VALUES('207302164v','r1','Er022','2018.04.17','2018.05.01');
INSERT INTO Rent VALUES('207302164v','r2','Hh025','2018.04.17','2018.05.01');
INSERT INTO Rent VALUES('207302164v','r3','Ef050','2018.04.17','2018.05.01');
INSERT INTO Rent VALUES('963800115v','r1','Ef049','2018.04.24','2018.05.02');
INSERT INTO Rent VALUES('963800115v','r2','Eh066','2018.04.24','2018.05.02');
INSERT INTO Rent VALUES('948920566v','r1','Hr013','2018.04.17','2018.04.21');

CREATE TABLE Return_(
ReturnCustomerId varchar(10),
ReturnId varchar(5),/*return dvd id*/
ReturnDvdCode char(5),
ReturnDate date,

CONSTRAINT Return_PK PRIMARY KEY(ReturnCustomerId,ReturnId),
CONSTRAINT Return_FK1 FOREIGN KEY(ReturnCustomerId) REFERENCES Customer(NIC),
CONSTRAINT Return_FK2 FOREIGN KEY(ReturnDvdCode) REFERENCES Dvd(DvdId)
);

INSERT INTO Return_ VALUES('982745582v','t1','Hh024','2018.04.06');
INSERT INTO Return_ VALUES('982745582v','t2','E9011','2018.04.06');
INSERT INTO Return_ VALUES('101562866v','t1','Et058','2018.04.09');
INSERT INTO Return_ VALUES('207302164v','t1','Er022','2018.04.18');
INSERT INTO Return_ VALUES('207302164v','t2','Hh025','2018.04.27');
INSERT INTO Return_ VALUES('207302164v','t3','Ef050','2018.04.27');
INSERT INTO Return_ VALUES('963800115v','t1','Ef049','2018.04.27');
INSERT INTO Return_ VALUES('963800115v','t2','Eh066','2018.04.29');
INSERT INTO Return_ VALUES('948920566v','t1','Hr013','2018.04.19');

