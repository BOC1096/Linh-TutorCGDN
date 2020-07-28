-- CREATE DATABASE demo2;
-- USE demo2;

-- create table users (
--  id  int(3) NOT NULL AUTO_INCREMENT,
--  name varchar(120) NOT NULL,
--  email varchar(220) NOT NULL,
--  country varchar(120),
--  PRIMARY KEY (id)
-- );

-- insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
-- insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

delimiter //
create procedure sp_get_all_users()
begin
	select *
    from users
    order by name;
end
// delimiter ;

delimiter //
create procedure sp_edit_users(
		pId int(3)
        , pName varchar(120)
        , pEmail varchar(220)
        , pCountry varchar(120)
)
begin
	update users
    set name = pName, email = pEmail, country = pCountry
    where id = pId;
end
// delimiter ;

delimiter //
create procedure sp_delete_users(pId int(3))
begin
	delete from users
    where id = pId;
end
// delimiter ;
