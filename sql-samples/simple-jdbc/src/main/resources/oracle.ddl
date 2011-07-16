
###########################################
# Create
###########################################

## Create normal entities

CREATE TABLE PERSON (
  ID NUMBER(19) NOT NULL,
  NAME VARCHAR2(100) NOT NULL
);

CREATE TABLE CONTACT (
  ID NUMBER(19) NOT NULL,
  PERSON_ID NUMBER(19) NOT NULL,
  ADRESS VARCHAR2(100),
  PHONE_NUMBER VARCHAR2(100)
);

CREATE TABLE MEDIA (
  ID NUMBER(19) NOT NULL,
  TITLE VARCHAR2(100) NOT NULL
);

CREATE TABLE MOVIE (
  MEDIA_ID NUMBER(19) NOT NULL,
  URLIMDB VARCHAR2(100) NOT NULL,
  PLAYLENGTH NUMBER(10) NOT NULL
);

CREATE TABLE BOOK (
  MEDIA_ID NUMBER(19) NOT NULL,
  ISBN VARCHAR2(20) NOT NULL
);

CREATE TABLE PERSON_LIBRARY (
  ID NUMBER(19) NOT NULL,
  PERSON_ID NUMBER(19) NOT NULL,
  MEDIA_ID NUMBER(19) NOT NULL
);

CREATE TABLE LIBRARY (
  ID NUMBER(19) NOT NULL,
  NAME VARCHAR2(100) NOT NULL
);

CREATE TABLE SUBSCRIBER (
  ID NUMBER(19) NOT NULL,
  LIBRARY NUMBER(19) NOT NULL,
  CONTACT NUMBER(19),
  NAME VARCHAR2(100) NOT NULL
);

CREATE TABLE BILLING_DETAILS (
  ID NUMBER(19) NOT NULL,
  SUBSCRIBER NUMBER(19) NOT NULL,
  TYPE VARCHAR2(2) NOT NULL,
  CC_NUMBER NUMBER(19),
  BA_ACCOUNT VARCHAR2(100) NOT NULL
);

## Primary keys
    
ALTER TABLE PERSON ADD CONSTRAINT PK_PERSON
	PRIMARY KEY (ID)
;

ALTER TABLE CONTACT ADD CONSTRAINT PK_CONTACT
	PRIMARY KEY (ID)
;

ALTER TABLE MEDIA ADD CONSTRAINT PK_MEDIA
	PRIMARY KEY (ID)
;

ALTER TABLE MOVIE ADD CONSTRAINT PK_MOVIE
	PRIMARY KEY (MEDIA_ID)
;

ALTER TABLE BOOK ADD CONSTRAINT PK_BOOK
	PRIMARY KEY (MEDIA_ID)
;

ALTER TABLE PERSON_LIBRARY ADD CONSTRAINT PK_PERSON_LIBRARY
	PRIMARY KEY (ID)
;

ALTER TABLE LIBRARY ADD CONSTRAINT PK_LIBRARY
	PRIMARY KEY (ID)
;
    
ALTER TABLE SUBSCRIBER ADD CONSTRAINT PK_SUBSCRIBER
	PRIMARY KEY (ID)
;

ALTER TABLE BILLING_DETAILS ADD CONSTRAINT PK_BILLING_DETAILS
	PRIMARY KEY (ID)
;

## Foreign key constraints

ALTER TABLE CONTACT ADD CONSTRAINT FK_CONTACT_PERSON
	FOREIGN KEY (PERSON_ID) REFERENCES PERSON (ID) ON DELETE CASCADE
;

ALTER TABLE MOVIE ADD CONSTRAINT FK_MOVIE_MEDIA
	FOREIGN KEY (MEDIA_ID) REFERENCES MEDIA (ID) ON DELETE CASCADE
;

ALTER TABLE BOOK ADD CONSTRAINT FK_BOOK_MEDIA
	FOREIGN KEY (MEDIA_ID) REFERENCES MEDIA (ID) ON DELETE CASCADE
;

ALTER TABLE PERSON_LIBRARY ADD CONSTRAINT FK_PERSON_LIBRARY_1
	FOREIGN KEY (PERSON_ID) REFERENCES PERSON (ID) ON DELETE CASCADE
;

ALTER TABLE PERSON_LIBRARY ADD CONSTRAINT FK_PERSON_LIBRARY_2
	FOREIGN KEY (MEDIA_ID) REFERENCES MEDIA (ID) ON DELETE CASCADE
;

ALTER TABLE SUBSCRIBER ADD CONSTRAINT FK_SUBSCRIBER_LIBRARY
	FOREIGN KEY (LIBRARY) REFERENCES LIBRARY (ID) ON DELETE CASCADE
;

ALTER TABLE BILLING_DETAILS ADD CONSTRAINT FK_BILLING_DETAILS_SUBSCRIBER
	FOREIGN KEY (SUBSCRIBER) REFERENCES SUBSCRIBER (ID) ON DELETE CASCADE
;

CREATE SEQUENCE HIBERNATE_SEQUENCE INCREMENT BY 1 START WITH 100;

###########################################
# Procedures
###########################################

CREATE OR REPLACE PROCEDURE new_person (newid OUT NUMBER, name IN VARCHAR2)
IS
BEGIN
   SELECT HIBERNATE_SEQUENCE.nextval INTO newid FROM dual;
   INSERT INTO PERSON (ID, NAME) 
   VALUES (newid, name);
END;

CREATE OR REPLACE FUNCTION an_hour_before (t IN DATE)
RETURN DATE
AS 
BEGIN
   RETURN t - INTERVAL '1' HOUR;
END an_hour_before;
