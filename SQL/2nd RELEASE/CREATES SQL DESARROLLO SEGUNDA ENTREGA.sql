CREATE TABLE Interview (
    id serial PRIMARY KEY,
    startDate date NOT NULL,
    duration integer not null,
    accessURL varchar(200) not null,
    status VARCHAR (30) NOT NULL CHECK (status = 'Created' or status = 'Scheduled' or status = 'Approved' or status = 'Rejected'),
    employee_id integer not null,
    staff_member_id integer not null,
    job_application_id integer not null
);

CREATE TABLE Job_Application (
    id serial PRIMARY KEY,
    status VARCHAR (30) NOT NULL CHECK (status = 'Pending Review' or status = 'Accepted' or status = 'Rejected'),
    date_application date not null,
    employee_id integer not null,
    job_offer_id integer not null

);

CREATE TABLE Review (
    id serial PRIMARY KEY,
    totalScore integer NOT NULL,
    employee_id integer not null,
    employer_id integer not null,
    application_id integer not null
);

CREATE TABLE Question (
    id serial PRIMARY KEY,
    name VARCHAR (30) NOT NULL ,
    score integer not null,
    review_id integer not null
);


