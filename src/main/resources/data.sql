DROP TABLE IF EXISTS userreg;
  
CREATE TABLE userreg (
  id Long AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  phonenumber Long,
  pannumber Long
);

insert into userreg values(1,'user','name','user@gmail.com',348654,46646);
insert into userreg values(2,'user','name1','user1@gmail.com',358654,456646);
insert into userreg values(3,'user','name2','user2@gmail.com',344654,46546);
insert into userreg values(4,'user','name3','user3@gmail.com',348654,466546);
insert into userreg values(5,'user','name4','user4@gmail.com',345654,465646);
insert into userreg values(6,'user','name5','user5@gmail.com',3486541,466462);
insert into userreg values(7,'user','name6','user6@gmail.com',3486542,466464);
insert into userreg values(8,'user','name7','user7@gmail.com',348654,466467);
insert into userreg values(9,'user','name8','user8@gmail.com',348654,466246);

//create table account(id Long primary key,uid long,accountid Long,createddate Date
//foreignkey(uid) references userreg(uid);



	


