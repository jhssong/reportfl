{
  "filepath": "/tmp/Lang-25b/src/test/java/org/apache/commons/lang3/concurrent/ConstantInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstantInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 134,
      "comment": "\n * Test class for {@code ConstantInitializer}.\n *\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Constant for the object managed by the initializer. "
    },
    {
      "type": "field",
      "varNames": [
        "init"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.setUp()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.checkEquals(java.lang.Object, boolean)",
      "begin_line": 51,
      "end_line": 60,
      "comment": "\n     * Helper method for testing equals() and hashCode().\n     *\n     * @param obj the object to compare with the test instance\n     * @param expected the expected result\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 75)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGetObject()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Tests whether the correct object is returned.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGet()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Tests whether get() returns the correct object.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsTrue()",
      "begin_line": 81,
      "end_line": 90,
      "comment": "\n     * Tests equals() if the expected result is true.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 32)",
        "(line 84,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 33)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 89,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsFalse()",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Tests equals() if the expected result is false.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsWithOtherObjects()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * Tests equals() with objects of other classes.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToString()",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\n     * Tests the string representation.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 123,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToStringNull()",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Tests the string representation if the managed object is null.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 68)",
        "(line 132,col 9)-(line 132,col 77)"
      ]
    }
  ]
}