CREATE TABLE Users(
    id serial PRIMARY KEY,
    document varchar(20) UNIQUE NOT NULL,
    username VARCHAR (20) UNIQUE NOT NULL,
    password VARCHAR (50) NOT NULL,
    email VARCHAR (100) UNIQUE NOT NULL,
    status VARCHAR(15) NOT NULL CHECK (status = 'Active' or status = 'Inactive')
);


CREATE TABLE Employer (
    id serial PRIMARY KEY,
    name VARCHAR (25) NOT NULL,
    user_id integer not null,
    constraint Fk_fk_user FOREIGN KEY (user_id) REFERENCES Users (id) ON DELETE CASCADE
);

CREATE TABLE Employee (
    id serial PRIMARY KEY,
    name VARCHAR (25) NOT NULL,
    gender varchar (2) NOT NULL CHECK (gender = 'M' or gender = 'F'),
    second_name varchar (25),
    lastname VARCHAR (25) NOT NULL,
    second_lastname varchar (25) NOT NULL,
    birth_date date NOT NULL,
    user_id integer not null,
    constraint Fk_fk_user FOREIGN KEY (user_id) REFERENCES Users (id) ON DELETE CASCADE
);

CREATE TABLE Staff_Member (
    id serial PRIMARY KEY,
    name VARCHAR (15) NOT NULL,
    gender varchar (2) NOT NULL CHECK (gender = 'M' or gender = 'F'),
    second_name varchar (25),
    lastname VARCHAR (25) NOT NULL,
    second_lastname varchar (25) NOT NULL,
    birth_date date NOT NULL,
    user_id integer not null,
    constraint Fk_fk_user FOREIGN KEY (user_id) REFERENCES Users (id) ON DELETE CASCADE
);

CREATE TABLE Job_Offer (
    id serial PRIMARY KEY,
    name VARCHAR (25) NOT NULL,
    description varchar(100) NOT NULL,
    available_vacans integer NOT NULL,
    date_begin date not null,
    date_end date not null,
    gender varchar(2) CHECK (gender = 'M' or gender = 'F'),
    salary float NOT NULL,
    min_age integer,
    max_age integer,
    employer_id integer not null,
    constraint Fk_fk_employer FOREIGN KEY (employer_id) REFERENCES employer (id) ON DELETE CASCADE
);

CREATE TABLE Job_Application (
    id serial PRIMARY KEY,
    status VARCHAR (10) NOT NULL,
    Date_Aplication date not null,
    employee_id integer not null,
    constraint Fk_fk_employee FOREIGN KEY (employee_id) REFERENCES employee (id),
    job_offer_id integer not null,
    constraint Fk_fk_job_offer FOREIGN KEY (job_offer_id) REFERENCES job_offer (id) ON DELETE CASCADE

);