package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Person;

public class PersonDao extends BaseDaoImpl {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Person insert(Person person) {
        SqlCrudEngine sqlInsertPerson = getCrudEngine("INSERT_PERSON");
        int count = sqlInsertPerson.insert(getSqlSession(), person);
        logger.info("insert person: " + count + ": " + person);
        return (count > 0) ? person : null;
    }

    public Person get(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON");
        Map<String, Class<?>> moreResultClasses = null;
        if (person.toInit(Person.Association.library)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
        }
        Person result = sqlEngine.get(getSqlSession(), Person.class, person, null, moreResultClasses);
        logger.info("get person: " + result);
        return result;
    }

    public Person update(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERSON");
        int count = sqlEngine.update(getSqlSession(), person);
        logger.info("update person: " + count);
        return (count > 0) ? person : null;
    }

    public boolean delete(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERSON");
        int count = sqlEngine.delete(getSqlSession(), person);
        logger.info("delete: " + count);
        return (count > 0);
    }

    public List<Person> list(Person person, SqlControl sqlControl) {
        SqlQueryEngine sqlEngine = getQueryEngine("SELECT_PERSON");
        SqlStandardControl sqlControl2 = new SqlStandardControl(sqlControl);
        if (person != null && person.toInit(Person.Association.library)) {
            Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
            sqlControl2.setMoreResultClasses(moreResultClasses);
        }
        List<Person> result = sqlEngine.query(getSqlSession(), Person.class, person, sqlControl2);
        logger.info("list person size: " + result.size());
        return result;
    }

    public List<Person> list(Person person) {
        return list(person, null);
    }

    public List<Person> listAll() {
        return list(null);
    }
}
