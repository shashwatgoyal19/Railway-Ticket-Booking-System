
create database railway ;
use railway ;


CREATE TABLE user (
    user_id varchar(20) PRIMARY KEY,
    user_name VARCHAR(255),
    user_email VARCHAR(255) UNIQUE,
    user_password VARCHAR(255),
    date_of_birth DATE,
    phone_number VARCHAR(20),
    permanent_address VARCHAR(255),
    wallet_balance DECIMAL(10, 2),
    gender VARCHAR(10)
);

CREATE TABLE admin (
    admin_id varchar(20) PRIMARY KEY,
    name VARCHAR(255),
    admin_email VARCHAR(255) UNIQUE,
    admin_password VARCHAR(255),
    zone_code VARCHAR(10)
);

drop table station;
CREATE TABLE station (
    station_id varchar(7) PRIMARY KEY,
    station_name VARCHAR(255),
    zone_code VARCHAR(10)
);


CREATE TABLE train (
    train_id varchar(10) PRIMARY KEY,
    train_name VARCHAR(255),
    operation_days VARCHAR(50)
);

CREATE TABLE seat (
    seat_id varchar(10) PRIMARY KEY,
    status VARCHAR(20),
    coach VARCHAR(20),
    berth VARCHAR(20),
    seat_number INT,
    train_id varchar(10),
    class varchar(10),
    FOREIGN KEY (train_id) REFERENCES train (train_id)
);


CREATE TABLE train_schedule (
    train_schedule_id varchar(10) PRIMARY KEY,
    train_id varchar(10),
    station_id varchar(5),
    arrival_time TIME,
    departure_time TIME,
    FOREIGN KEY (train_id) REFERENCES train (train_id),
	FOREIGN KEY (station_id) REFERENCES station (station_id)
);


CREATE TABLE journey (
    journey_id varchar(10) PRIMARY KEY,
    source_train_schedule_id varchar(10),
    destination_train_schedule_id varchar(10),
    FOREIGN KEY (source_train_schedule_id) REFERENCES train_schedule (train_schedule_id),
    FOREIGN KEY (destination_train_schedule_id) REFERENCES train_schedule (train_schedule_id)
);

CREATE TABLE ticket (
    ticket_id varchar(10) PRIMARY KEY,
    price DECIMAL(10, 2),
    date_of_travel DATE,
    time_of_transaction TIME,
    date_of_transaction DATE,
    user_id varchar(20),
    seat_id varchar(10),
    journey_id varchar(10),
    FOREIGN KEY (user_id) REFERENCES user (user_id),
    FOREIGN KEY (seat_id) REFERENCES seat (seat_id),
    FOREIGN KEY (journey_id) REFERENCES journey (journey_id)
);


CREATE TABLE feedback (
    feedback_id varchar(10) PRIMARY KEY,
    rating INT,
    comment TEXT,
    ticket_id varchar(10),
    FOREIGN KEY (ticket_id) REFERENCES ticket (ticket_id)
);

CREATE TABLE refund (
    refund_id INT PRIMARY KEY,
    date_of_refund DATE,
    time_of_refund TIME,
    status VARCHAR(20),
    date_of_report DATE,
    time_of_report TIME,
    ticket_id varchar(10),
    FOREIGN KEY (ticket_id) REFERENCES ticket (ticket_id)
);