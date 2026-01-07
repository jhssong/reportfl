{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 198,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 34,
      "end_line": 41,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 40,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 85,
      "end_line": 93,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUnchecked()",
      "begin_line": 98,
      "end_line": 106,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 60)",
        "(line 100,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 45)",
        "(line 113,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 121,
      "end_line": 129,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 47)",
        "(line 123,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUnchecked()",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 60)",
        "(line 136,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 164,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer()",
      "begin_line": 171,
      "end_line": 181,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 69)",
        "(line 174,col 9)-(line 174,col 42)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 177,col 48)",
        "(line 178,col 9)-(line 178,col 48)",
        "(line 179,col 9)-(line 179,col 47)",
        "(line 180,col 9)-(line 180,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null()",
      "begin_line": 186,
      "end_line": 196,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 29)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 189,col 42)",
        "(line 190,col 9)-(line 190,col 38)",
        "(line 191,col 9)-(line 191,col 60)",
        "(line 192,col 9)-(line 192,col 48)",
        "(line 193,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 195,col 48)"
      ]
    }
  ]
}