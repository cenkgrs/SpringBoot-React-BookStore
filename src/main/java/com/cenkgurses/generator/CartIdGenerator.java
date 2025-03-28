package com.cenkgurses.generator;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CartIdGenerator implements IdentifierGenerator {
    
    public static final String generatorName = "cardIdGenerator";
    
        @Override
        public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {

            return UUID.randomUUID().toString().replace("-", "");
    }
}
