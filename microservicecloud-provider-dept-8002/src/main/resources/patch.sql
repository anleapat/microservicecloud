drop database if exists clouddb02;
create database clouddb02 character set utf8;
use clouddb02;

drop table if exists clouddb02.dept;
CREATE TABLE `clouddb02`.`dept`  (
  `dept_no` int(0) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) NULL,
  `db_source` varchar(60) NULL,
  PRIMARY KEY (`dept_no`)
);

insert into dept(dname, db_source) values('开发部', database());
insert into dept(dname, db_source) values('人事部', database());
insert into dept(dname, db_source) values('账务部', database());
insert into dept(dname, db_source) values('市场部', database());
insert into dept(dname, db_source) values('运维部', database());