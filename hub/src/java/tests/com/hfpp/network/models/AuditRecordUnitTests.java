/*
 * Copyright (C) 2013 TopCoder Inc., All Rights Reserved.
 */
package com.hfpp.network.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;

import com.hfpp.network.BaseUnitTests;

/**
 * <p>
 * Unit tests for {@link AuditRecord} class.
 * </p>
 *
 * @author sparemax
 * @version 1.0
 */
public class AuditRecordUnitTests {
    /**
     * <p>
     * Represents the <code>AuditRecord</code> instance used in tests.
     * </p>
     */
    private AuditRecord instance;

    /**
     * <p>
     * Adapter for earlier versions of JUnit.
     * </p>
     *
     * @return a test suite.
     */
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AuditRecordUnitTests.class);
    }

    /**
     * <p>
     * Sets up the unit tests.
     * </p>
     *
     * @throws Exception
     *             to JUnit.
     */
    @Before
    public void setUp() throws Exception {
        instance = new AuditRecord();
    }

    /**
     * <p>
     * Accuracy test for the constructor <code>AuditRecord()</code>.<br>
     * Instance should be correctly created.
     * </p>
     */
    @Test
    public void testCtor() {
        instance = new AuditRecord();

        assertNull("'timestamp' should be correct.", BaseUnitTests.getField(instance, "timestamp"));
        assertNull("'userId' should be correct.", BaseUnitTests.getField(instance, "userId"));
        assertNull("'action' should be correct.", BaseUnitTests.getField(instance, "action"));
        assertFalse("'denied' should be correct.", (Boolean) BaseUnitTests.getField(instance, "denied"));
        assertNull("'message' should be correct.", BaseUnitTests.getField(instance, "message"));
    }


    /**
     * <p>
     * Accuracy test for the method <code>getTimestamp()</code>.<br>
     * The value should be properly retrieved.
     * </p>
     */
    @Test
    public void test_getTimestamp() {
        Date value = new Date();
        instance.setTimestamp(value);

        assertSame("'getTimestamp' should be correct.",
            value, instance.getTimestamp());
    }

    /**
     * <p>
     * Accuracy test for the method <code>setTimestamp(Date timestamp)</code>.<br>
     * The value should be properly set.
     * </p>
     */
    @Test
    public void test_setTimestamp() {
        Date value = new Date();
        instance.setTimestamp(value);

        assertSame("'setTimestamp' should be correct.",
            value, BaseUnitTests.getField(instance, "timestamp"));
    }

    /**
     * <p>
     * Accuracy test for the method <code>getUserId()</code>.<br>
     * The value should be properly retrieved.
     * </p>
     */
    @Test
    public void test_getUserId() {
        String value = "new_value";
        instance.setUserId(value);

        assertEquals("'getUserId' should be correct.",
            value, instance.getUserId());
    }

    /**
     * <p>
     * Accuracy test for the method <code>setUserId(String userId)</code>.<br>
     * The value should be properly set.
     * </p>
     */
    @Test
    public void test_setUserId() {
        String value = "new_value";
        instance.setUserId(value);

        assertEquals("'setUserId' should be correct.",
            value, BaseUnitTests.getField(instance, "userId"));
    }

    /**
     * <p>
     * Accuracy test for the method <code>getAction()</code>.<br>
     * The value should be properly retrieved.
     * </p>
     */
    @Test
    public void test_getAction() {
        String value = "new_value";
        instance.setAction(value);

        assertEquals("'getAction' should be correct.",
            value, instance.getAction());
    }

    /**
     * <p>
     * Accuracy test for the method <code>setAction(String action)</code>.<br>
     * The value should be properly set.
     * </p>
     */
    @Test
    public void test_setAction() {
        String value = "new_value";
        instance.setAction(value);

        assertEquals("'setAction' should be correct.",
            value, BaseUnitTests.getField(instance, "action"));
    }

    /**
     * <p>
     * Accuracy test for the method <code>isDenied()</code>.<br>
     * The value should be properly retrieved.
     * </p>
     */
    @Test
    public void test_isDenied() {
        boolean value = true;
        instance.setDenied(value);

        assertTrue("'isDenied' should be correct.", instance.isDenied());
    }

    /**
     * <p>
     * Accuracy test for the method <code>setDenied(boolean denied)</code>.<br>
     * The value should be properly set.
     * </p>
     */
    @Test
    public void test_setDenied() {
        boolean value = true;
        instance.setDenied(value);

        assertTrue("'setDenied' should be correct.",
            (Boolean) BaseUnitTests.getField(instance, "denied"));
    }

    /**
     * <p>
     * Accuracy test for the method <code>getMessage()</code>.<br>
     * The value should be properly retrieved.
     * </p>
     */
    @Test
    public void test_getMessage() {
        String value = "new_value";
        instance.setMessage(value);

        assertEquals("'getMessage' should be correct.",
            value, instance.getMessage());
    }

    /**
     * <p>
     * Accuracy test for the method <code>setMessage(String message)</code>.<br>
     * The value should be properly set.
     * </p>
     */
    @Test
    public void test_setMessage() {
        String value = "new_value";
        instance.setMessage(value);

        assertEquals("'setMessage' should be correct.",
            value, BaseUnitTests.getField(instance, "message"));
    }
}