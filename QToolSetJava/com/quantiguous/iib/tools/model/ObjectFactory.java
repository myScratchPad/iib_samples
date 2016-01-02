//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.01 at 06:15:36 PM IST 
//


package com.quantiguous.iib.tools.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quantiguous.iib.tools.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JdbcProviders_QNAME = new QName("http://www.quantiguous.com/tools", "JdbcProviders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quantiguous.iib.tools.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JdbcProvidersType }
     * 
     */
    public JdbcProvidersType createJdbcProvidersType() {
        return new JdbcProvidersType();
    }

    /**
     * Create an instance of {@link DatabaseSchemasType }
     * 
     */
    public DatabaseSchemasType createDatabaseSchemasType() {
        return new DatabaseSchemasType();
    }

    /**
     * Create an instance of {@link DatabaseMetaDataType }
     * 
     */
    public DatabaseMetaDataType createDatabaseMetaDataType() {
        return new DatabaseMetaDataType();
    }

    /**
     * Create an instance of {@link TestResultsType }
     * 
     */
    public TestResultsType createTestResultsType() {
        return new TestResultsType();
    }

    /**
     * Create an instance of {@link TestResultType }
     * 
     */
    public TestResultType createTestResultType() {
        return new TestResultType();
    }

    /**
     * Create an instance of {@link DatabaseCatalogsType }
     * 
     */
    public DatabaseCatalogsType createDatabaseCatalogsType() {
        return new DatabaseCatalogsType();
    }

    /**
     * Create an instance of {@link JdbcProviderType }
     * 
     */
    public JdbcProviderType createJdbcProviderType() {
        return new JdbcProviderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JdbcProvidersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/tools", name = "JdbcProviders")
    public JAXBElement<JdbcProvidersType> createJdbcProviders(JdbcProvidersType value) {
        return new JAXBElement<JdbcProvidersType>(_JdbcProviders_QNAME, JdbcProvidersType.class, null, value);
    }

}
