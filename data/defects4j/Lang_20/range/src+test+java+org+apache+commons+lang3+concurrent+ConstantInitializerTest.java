{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/ConstantInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstantInitializerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 133,
      "comment": "\n * Test class for {@code ConstantInitializer}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "VALUE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Constant for the object managed by the initializer. "
    },
    {
      "type": "field",
      "varNames": [
        "init"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The initializer to be tested. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.setUp()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.checkEquals(java.lang.Object, boolean)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     * Helper method for testing equals() and hashCode().\n     *\n     * @param obj the object to compare with the test instance\n     * @param expected the expected result\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 75)",
        "(line 52,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGetObject()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Tests whether the correct object is returned.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGet()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Tests whether get() returns the correct object.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsTrue()",
      "begin_line": 80,
      "end_line": 89,
      "comment": "\n     * Tests equals() if the expected result is true.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 33)",
        "(line 86,col 9)-(line 86,col 54)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsFalse()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\n     * Tests equals() if the expected result is false.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 22)",
        "(line 98,col 9)-(line 98,col 34)",
        "(line 99,col 9)-(line 99,col 60)",
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsWithOtherObjects()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * Tests equals() with objects of other classes.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToString()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n     * Tests the string representation.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToStringNull()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * Tests the string representation if the managed object is null.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 68)",
        "(line 131,col 9)-(line 131,col 77)"
      ]
    }
  ]
}