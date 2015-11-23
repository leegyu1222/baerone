create table FARE(
     address_gu       varchar2(12) not null,
     latitude            number(3) not null,
     longitude         number(3) not null
);

alter table fare
add constraint pk_fare_address_gu primary key(address_gu);