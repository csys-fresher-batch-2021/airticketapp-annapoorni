create table usertable (username varchar(50) primary key,age int not null, phoneNumber bigint, email varchar(50),pass varchar(40),gender varchar(50),address varchar(20));
insert into usertable values('poorni' , 21, 8220551086,'poorni@gmail.com','Poorni@1234','female','saibaba colony');
select * from usertable;
create table flightlist(flightId varchar(20) primary key,flightname varchar(50) not null,airlines varchar(50) not null,departureDate date not null,departuretime time not null, departingfrom varchar(50) not null, departingto varchar(50) not null);
create table flightBooking(bookingId serial primary key,username varchar(50)not null,flightId varchar(40)not null,numberOfPassengers int not null,bookingDate date not null, coach varchar(50)not null,price int not null,status int default 0);


create table usertable (username varchar(50) primary key,age int not null, phoneNumber bigint, email varchar(50),pass varchar(40),gender varchar(50),address varchar(20));
insert into usertable values('poorni', 21, 8220551086,'poorni@gmail.com','Poorni@1234','female','saibaba colony');
select * from usertable;
delete  from usertable where username='Nethaji';
create table flightList(flightId varchar(20) primary key,airlines varchar(50) not null,departureTime time not null, departingFrom varchar(50) not null, departingTo varchar(50) not null, firstClass int not null,economyClass int not null,businessClass int not null);
drop table flightlist;
insert into flightlist values('00air01','Airasia India','22:00','Coimbatore','Mumbai',3000,4500,6000);
delete  from flightlist where flightId='00air01';

select * from flightList where departingfrom = 'Cochin' AND departingto = 'Banglore';
create table flightBooking(bookingId serial primary key,username varchar(50)not null,flightId varchar(40)not null,numberOfPassengers int not null,bookingDate date not null, coach varchar(50)not null,price int not null,status int default 0);
drop table flightBooking;
select * from flightBooking;

create table coachType(coachName varchar(50) primary key, seats int not null);
insert into coachType values ('First Class',50);
select * from coachtype ;
truncate table coachType	
update coachType set seats = 200 where coachname='First Class'
select sum(numberOfpassengers)as bookedtickets from flightBooking where status!=1 and bookingdate= '2021-06-18' and coach='firstClass' and flightid='air01';
update flightBooking set coach='First Class' where bookingid=1;
update flightBooking set status=1 where bookingId='5';
