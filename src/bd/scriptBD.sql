create schema bd_clinica;
use bd_clinica;

CREATE TABLE persona(
id_persona int(11) NOT NULL,
nombre_persona varchar(45) DEFAULT NULL,
profesion_persona varchar(45) DEFAULT NULL,
telefono_persona varchar(45) DEFAULT NULL,
tipo_persona int(2) NOT NULL,
nacimiento_id int(11) NOT NULL,
PRIMARY KEY (id_persona)
);


CREATE TABLE nacimiento(
id_nacimiento int(11) NOT NULL AUTO_INCREMENT ,
ciudad_nacimiento varchar(45) DEFAULT NULL,
departamento_nacimiento varchar(45) DEFAULT NULL,
fecha_nacimiento date DEFAULT NULL,
pais_nacimiento varchar(45) DEFAULT NULL,
PRIMARY KEY (id_nacimiento)
);

ALTER TABLE persona
ADD INDEX fk_persona_nacimiento (nacimiento_id ASC);
;

ALTER TABLE persona
ADD CONSTRAINT fk_persona_nacimiento
FOREIGN KEY (nacimiento_id)
REFERENCES nacimiento (id_nacimiento)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE mascotas(
id_mascota bigint (20) not null,
color varchar (45),
nombre varchar (45),
raza varchar (45),
sexo varchar (45),
persona_id int (11),
PRIMARY KEY (id_mascota)
);

ALTER TABLE mascotas
ADD CONSTRAINT fk_persona_mascota
FOREIGN KEY (persona_id)
REFERENCES persona (id_persona)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE personas_productos(
persona_id int(11),
producto_id int(11)
);

ALTER TABLE personas_productos
ADD CONSTRAINT fk_persona_personas_productos
FOREIGN KEY (persona_id)
REFERENCES persona (id_persona)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

CREATE TABLE productos(
id_producto int(11)not null,
nombre_producto varchar(45),
precio_producto double,
PRIMARY KEY(id_producto)
);

ALTER TABLE personas_productos
ADD CONSTRAINT fk_productos_personas_productos
FOREIGN KEY (producto_id)
REFERENCES productos (id_producto)
ON DELETE NO ACTION
ON UPDATE NO ACTION;