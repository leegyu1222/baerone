create table MEMBERS (
  userid                 varchar2(12) not null,
  userpw               varchar2(20) not null,
  name                 varchar2(16) not null,
  phone                varchar2(14) not null,
  emaiil                 varchar2(30) not null,
  post_no              number(5) not null,
  address_si           varchar2(10) not null,
  address_gu         varchar(10) not null,
  address_dong     varchar2(10) not null,
  address_misc      varchar2(50) not null,
  mileage             number(8) not null
  );

alter table members
add constraint pk_userid primary key(userid);