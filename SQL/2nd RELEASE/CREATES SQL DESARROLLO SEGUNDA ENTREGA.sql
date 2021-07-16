CREATE TABLE Interview (
    id serial PRIMARY KEY,
    startDate date NOT NULL,
    duration integer not null,
    accessURL varchar (700) ,
    status integer NOT NULL CHECK (status = 0 or status = 1 or status = 2 or status = 3),
    employee_id integer not null,
    staff_member_id integer not null,
    job_application_id integer not null
);

CREATE TABLE Application (
    id serial PRIMARY KEY,
    status integer NOT NULL CHECK (status = 0 or status = 1 or status = 2),
    date_application date not null,
    employee_id integer not null,
    job_offer_id integer not null

);

CREATE TABLE Review (
    id serial PRIMARY KEY,
    totalScore integer ,
    employee_id integer not null,
    employer_id integer not null,
    application_id integer not null
);

CREATE TABLE Question (
    id serial PRIMARY KEY,
    name VARCHAR (500) NOT NULL ,
    score integer ,
    review_id integer not null
);


