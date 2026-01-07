{
  "filepath": "/tmp/Lang-40b/src/test/org/apache/commons/lang/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 164,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 32,
      "end_line": 39,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 38,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 44,
      "end_line": 51,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 50,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 56,
      "end_line": 63,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 77,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testExtractCauseUnchecked()",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 60)",
        "(line 98,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 112,col 58)",
        "(line 113,col 9)-(line 113,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 47)",
        "(line 121,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testHandleCauseUnchecked()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 60)",
        "(line 134,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 145,
      "end_line": 153,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 45)",
        "(line 147,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 162,col 74)"
      ]
    }
  ]
}