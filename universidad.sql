create database universidad;
use universidad;
create table Profesor(
IdProfesor int not null primary key,
Titulo varchar(255) not null,
Departamento varchar(255) not null,
nombre varchar(255) not null,
Apellido varchar(255) not null,
Direccion varchar(255) not null
);
create table Alumno(
IdAlumno int not null primary key,
AnnioIngreso varchar(255) not null,
Carrera varchar(255) not null,
nombre varchar(255) not null,
Apellido varchar(255) not null,
Direccion varchar(255) not null
);