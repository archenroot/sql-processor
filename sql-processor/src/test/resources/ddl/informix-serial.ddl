-- Drop many to many relations

DROP TABLE MEDIA_PHYSICALMEDIA CASCADE;

DROP TABLE MEDIACHARACTER_PLAYEDBY CASCADE;

DROP TABLE EXISTSINMEDIA_MEDIACHARACTER CASCADE;


-- Drop normal entities
    
DROP TABLE PHYSICALMEDIA CASCADE;

DROP TABLE MOVIE CASCADE;

DROP TABLE MEDIACHARACTER CASCADE;

DROP TABLE LIBRARY CASCADE;

DROP TABLE ENGAGEMENT CASCADE;

DROP TABLE PERSON CASCADE;

DROP TABLE CONTACT CASCADE;

DROP TABLE BOOK CASCADE;

DROP TABLE MEDIA CASCADE;

DROP TABLE TYPES CASCADE;

DROP TABLE BILLING_DETAILS CASCADE;

DROP TABLE SUBSCRIBER CASCADE;


-- Drop pk sequence
    
DROP SEQUENCE SQLPROC_SEQUENCE;


-- Drom procedures a functions

DROP FUNCTION new_person;

DROP PROCEDURE new_person_ret;

DROP FUNCTION an_hour_before;


-- Create normal entities
    
CREATE TABLE MEDIA (
  ID BIGSERIAL PRIMARY KEY,
  TITLE VARCHAR(100) NOT NULL,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL
);


CREATE TABLE BOOK (
  ISBN VARCHAR(20) NOT NULL,
  MEDIA BIGINT NOT NULL
);


CREATE TABLE CONTACT (
  ID BIGSERIAL PRIMARY KEY,
  ADRESS VARCHAR(100),
  CITY VARCHAR(100),
  ZIP VARCHAR(100),
  STATE VARCHAR(100),
  UUID VARCHAR(36) NOT NULL,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  PERSONNAME_FIRST VARCHAR(100),
  PERSONNAME_LAST VARCHAR(100),
  PHONE_NUMBER VARCHAR(100)
);


CREATE TABLE PERSON (
  ID BIGSERIAL PRIMARY KEY,
  BIRTHDATE DATE NOT NULL,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  CONTACT BIGINT,
  SSN_NUMBER VARCHAR(20) NOT NULL,
  SSN_COUNTRY VARCHAR(100) NOT NULL,
  NAME_FIRST VARCHAR(100) NOT NULL,
  NAME_LAST VARCHAR(100) NOT NULL,
  SEX VARCHAR(100) NOT NULL,
  CLOTHES_SIZE INT
);


CREATE TABLE ENGAGEMENT (
  ID BIGSERIAL PRIMARY KEY,
  ROLE VARCHAR(100) NOT NULL,
  UUID VARCHAR(36) NOT NULL,
  PERSON BIGINT NOT NULL,
  MEDIA BIGINT NOT NULL
);


CREATE TABLE LIBRARY (
  ID BIGSERIAL PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL
);


CREATE TABLE MEDIACHARACTER (
  ID BIGSERIAL PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL,
  UUID VARCHAR(36) NOT NULL
);


CREATE TABLE MOVIE (
  URLIMDB VARCHAR(100) NOT NULL,
  PLAYLENGTH INT NOT NULL,
  CATEGORY VARCHAR(40),
  MEDIA BIGINT NOT NULL
);


CREATE TABLE PHYSICALMEDIA (
  ID BIGSERIAL PRIMARY KEY,
  STATUS VARCHAR(3) NOT NULL,
  LOCATION VARCHAR(100) NOT NULL,
  UUID VARCHAR(36) NOT NULL,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  LIBRARY BIGINT
);


-- Create many to many relations
    
CREATE TABLE EXISTSINMEDIA_MEDIACHARACTER (
  MEDIACHARACTER BIGINT NOT NULL,
  EXISTSINMEDIA BIGINT NOT NULL
);


CREATE TABLE MEDIACHARACTER_PLAYEDBY (
  PLAYEDBY BIGINT NOT NULL,
  MEDIACHARACTER BIGINT NOT NULL
);


CREATE TABLE MEDIA_PHYSICALMEDIA (
  PHYSICALMEDIA BIGINT NOT NULL,
  MEDIA BIGINT NOT NULL
);


-- Primary keys
    
ALTER TABLE EXISTSINMEDIA_MEDIACHARACTER ADD CONSTRAINT
  PRIMARY KEY (MEDIACHARACTER, EXISTSINMEDIA)
  CONSTRAINT PK_EXISTSINMEDIA_MEDIACHARACTER
;

ALTER TABLE MEDIACHARACTER_PLAYEDBY ADD CONSTRAINT
  PRIMARY KEY (PLAYEDBY, MEDIACHARACTER)
  CONSTRAINT PK_MEDIACHARACTER_PLAYEDBY
;

ALTER TABLE MEDIA_PHYSICALMEDIA ADD CONSTRAINT
  PRIMARY KEY (PHYSICALMEDIA, MEDIA)
  CONSTRAINT PK_MEDIA_PHYSICALMEDIA
;


-- Unique constraints

ALTER TABLE BOOK ADD CONSTRAINT UNIQUE (ISBN)
  CONSTRAINT UQ_BOOK
;

ALTER TABLE CONTACT ADD CONSTRAINT UNIQUE (UUID)
  CONSTRAINT UQ_CONTACT
;

ALTER TABLE PERSON ADD CONSTRAINT UNIQUE (SSN_NUMBER, SSN_COUNTRY)
  CONSTRAINT UQ_PERSON
;

ALTER TABLE ENGAGEMENT ADD CONSTRAINT UNIQUE (UUID)
  CONSTRAINT UQ_ENGAGEMENT
;

ALTER TABLE LIBRARY ADD CONSTRAINT UNIQUE (NAME)
  CONSTRAINT UQ_LIBRARY
;

ALTER TABLE MEDIACHARACTER ADD CONSTRAINT UNIQUE (UUID)
  CONSTRAINT UQ_MEDIACHARACTER
;

ALTER TABLE MOVIE ADD CONSTRAINT UNIQUE (URLIMDB)
  CONSTRAINT UQ_MOVIE
;

ALTER TABLE PHYSICALMEDIA ADD CONSTRAINT UNIQUE (UUID)
  CONSTRAINT UQ_PHYSICALMEDIA
;


-- Foreign key constraints

ALTER TABLE BOOK ADD CONSTRAINT
  FOREIGN KEY (MEDIA) REFERENCES MEDIA (ID) ON DELETE CASCADE
  CONSTRAINT FK_BOOK_MEDIA
;

ALTER TABLE MOVIE ADD CONSTRAINT
  FOREIGN KEY (MEDIA) REFERENCES MEDIA (ID) ON DELETE CASCADE
  CONSTRAINT FK_MOVIE_MEDIA
;
  
ALTER TABLE PERSON ADD CONSTRAINT
  FOREIGN KEY (CONTACT) REFERENCES CONTACT (ID) ON DELETE CASCADE
  CONSTRAINT FK_PERSON_CONTACT
;
  
ALTER TABLE ENGAGEMENT ADD CONSTRAINT
  FOREIGN KEY (PERSON) REFERENCES PERSON (ID) ON DELETE CASCADE
  CONSTRAINT FK_ENGAGEMENT_PERSON
;

ALTER TABLE ENGAGEMENT ADD CONSTRAINT
  FOREIGN KEY (MEDIA) REFERENCES MEDIA (ID) ON DELETE CASCADE
  CONSTRAINT FK_ENGAGEMENT_MEDIA
;

ALTER TABLE PHYSICALMEDIA ADD CONSTRAINT
  FOREIGN KEY (LIBRARY) REFERENCES LIBRARY (ID) ON DELETE CASCADE
  CONSTRAINT FK_PHYSICALMEDIA_LIBRARY
;

ALTER TABLE EXISTSINMEDIA_MEDIACHARACTER ADD CONSTRAINT
  FOREIGN KEY (MEDIACHARACTER) REFERENCES MEDIACHARACTER (ID)
  CONSTRAINT FK_EXISTSINMEDIA_MEDIACHARAC53
;

ALTER TABLE EXISTSINMEDIA_MEDIACHARACTER ADD CONSTRAINT
  FOREIGN KEY (EXISTSINMEDIA) REFERENCES MEDIA (ID)
  CONSTRAINT FK_EXISTSINMEDIA_MEDIACHARAC27
;
  
ALTER TABLE MEDIACHARACTER_PLAYEDBY ADD CONSTRAINT
  FOREIGN KEY (PLAYEDBY) REFERENCES PERSON (ID) ON DELETE CASCADE
  CONSTRAINT FK_MEDIACHARACTER_PLAYEDBY_P03
;

ALTER TABLE MEDIACHARACTER_PLAYEDBY ADD CONSTRAINT
  FOREIGN KEY (MEDIACHARACTER) REFERENCES MEDIACHARACTER (ID)
  CONSTRAINT FK_MEDIACHARACTER_PLAYEDBY_M76
;
  
ALTER TABLE MEDIA_PHYSICALMEDIA ADD CONSTRAINT
  FOREIGN KEY (PHYSICALMEDIA) REFERENCES PHYSICALMEDIA (ID)
  CONSTRAINT FK_MEDIA_PHYSICALMEDIA_PHYSI64
;

ALTER TABLE MEDIA_PHYSICALMEDIA ADD CONSTRAINT
  FOREIGN KEY (MEDIA) REFERENCES MEDIA (ID)
  CONSTRAINT FK_MEDIA_PHYSICALMEDIA_MEDIA
;


-- sequences

CREATE SEQUENCE SQLPROC_SEQUENCE INCREMENT BY 1 START WITH 100;


-- types

CREATE TABLE TYPES 
(
  ID BIGSERIAL PRIMARY KEY
, T_INT INTEGER 
, T_LONG BIGINT 
, T_BYTE BYTE 
, T_SHORT SMALLINT 
, T_FLOAT FLOAT 
, T_DOUBLE DOUBLE PRECISION
, T_CHAR CHAR(1) 
, T_STRING VARCHAR(255) 
, T_DATE DATE 
, T_TIME DATETIME HOUR TO FRACTION
, T_DATETIME DATETIME YEAR TO FRACTION
, T_TIMESTAMP DATETIME YEAR TO FRACTION
, T_BOOLEAN BOOLEAN 
, T_BIG_INTEGER DECIMAL 
, T_BIG_DECIMAL DECIMAL(13,1)
, A_BYTE BYTE 
, A_TEXT TEXT 
, A_CLOB CLOB 
, A_BLOB BLOB 
);


-- More inheritance

CREATE TABLE SUBSCRIBER (
  ID BIGSERIAL PRIMARY KEY,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  LIBRARY BIGINT NOT NULL,
  CONTACT BIGINT,
  NAME_FIRST VARCHAR(100) NOT NULL,
  NAME_LAST VARCHAR(100) NOT NULL
);

ALTER TABLE SUBSCRIBER ADD CONSTRAINT
  FOREIGN KEY (LIBRARY) REFERENCES LIBRARY (ID) ON DELETE CASCADE
  CONSTRAINT FK_SUBSCRIBER_LIBRARY
;

CREATE TABLE BILLING_DETAILS (
  ID BIGSERIAL PRIMARY KEY,
  LASTUPDATED DATETIME YEAR TO FRACTION,
  LASTUPDATEDBY VARCHAR(50),
  CREATEDDATE DATETIME YEAR TO FRACTION,
  CREATEDBY VARCHAR(50),
  VERSION BIGINT NOT NULL,
  SUBSCRIBER BIGINT NOT NULL,
  TYPE VARCHAR(2) NOT NULL,
  CC_NUMBER BIGINT,
  CC_EXP_MONTH SMALLINT,
  CC_EXP_YEAR SMALLINT,
  BA_ACCOUNT_NUMBER VARCHAR(100),
  BA_BANK_NAME VARCHAR(100),
  BA_SWIFT VARCHAR(20)
);

ALTER TABLE BILLING_DETAILS ADD CONSTRAINT
  FOREIGN KEY (SUBSCRIBER) REFERENCES SUBSCRIBER (ID) ON DELETE CASCADE
  CONSTRAINT FK_BILLING_DETAILS_SUBSCRIBER
;


-- Procedures

CREATE FUNCTION new_person(newid INTEGER, birthdate DATE, ssn_number VARCHAR(20), ssn_country VARCHAR(100), name_first VARCHAR(100), name_last VARCHAR(100), sex VARCHAR(100))
    RETURNING INTEGER AS newid, VARCHAR(100) AS sex;

  DEFINE sex1 VARCHAR(100);
  DEFINE newid1 INTEGER;

  IF (sex IS NULL) THEN
    LET sex1 = 'M';
  ELSE
    LET sex1 = sex;
  END IF;

  INSERT INTO PERSON (BIRTHDATE, LASTUPDATED, LASTUPDATEDBY, CREATEDDATE, CREATEDBY, VERSION, CONTACT, SSN_NUMBER, SSN_COUNTRY, NAME_FIRST, NAME_LAST, SEX, CLOTHES_SIZE) 
    VALUES (birthdate, CURRENT, 'test', NULL, NULL, 1, NULL, ssn_number, ssn_country, name_first, name_last, sex1, NULL);
  SELECT FIRST 1 dbinfo('bigserial') INTO newid1 FROM systables;

  RETURN newid1, sex1;
END FUNCTION;

CREATE PROCEDURE new_person_ret(birthdate DATE, ssn_number VARCHAR(20), ssn_country VARCHAR(100), name_first VARCHAR(100), name_last VARCHAR(100), sex VARCHAR(100))
  DEFINE temp_id INTEGER;
  DEFINE sex1 VARCHAR(100);
  DEFINE birthdate1 DATE;

  IF (sex IS NULL) THEN
    LET sex1 = 'M';
  ELSE
    LET sex1 = sex;
  END IF;

  INSERT INTO PERSON (BIRTHDATE, LASTUPDATED, LASTUPDATEDBY, CREATEDDATE, CREATEDBY, VERSION, CONTACT, SSN_NUMBER, SSN_COUNTRY, NAME_FIRST, NAME_LAST, SEX, CLOTHES_SIZE) 
    VALUES (birthdate, CURRENT, 'test', NULL, NULL, 1, NULL, ssn_number, ssn_country, name_first, name_last, sex1, NULL);
  SELECT FIRST 1 dbinfo('bigserial') INTO temp_id FROM systables;
  SELECT BIRTHDATE INTO birthdate1 FROM PERSON WHERE ID = temp_id;
END PROCEDURE;

CREATE FUNCTION an_hour_before(t DATETIME YEAR TO FRACTION) RETURNING DATETIME YEAR TO FRACTION;
  RETURN (t - INTERVAL (1) HOUR TO HOUR);
END FUNCTION;