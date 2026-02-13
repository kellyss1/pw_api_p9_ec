-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into vehiculos (id, marca, modelo, chasis, fechaMatricula, fechaFabricacion)
values (1, 'Toyota', 'Corolla', 'JTDBR32E720123456', '2020-05-10', '2020-02-15');

insert into vehiculos (id, marca, modelo, chasis, fechaMatricula, fechaFabricacion)
values (2, 'Chevrolet', 'Onix', '9BGKS69R0CG123789', '2021-08-22', '2021-06-01');

insert into vehiculos (id, marca, modelo, chasis, fechaMatricula, fechaFabricacion)
values (3, 'Hyundai', 'Tucson', 'KM8JT3AC0BU123987', '2019-03-05', '2018-12-20');