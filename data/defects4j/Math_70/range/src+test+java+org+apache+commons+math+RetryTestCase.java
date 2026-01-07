{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/RetryTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RetryTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 56,
      "comment": "\n * A TestCase that retries tests when assertions fail.\n * \u003cp\u003e\n * If one or more tests throw an AssertionFailedError, all tests are\n * repeated one time.\n * \u003cp\u003e\n * Errors or exceptions other than AssertionFailedError do not lead to retries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.RetryTestCase.RetryTestCase()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.RetryTestCase.RetryTestCase(java.lang.String)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.RetryTestCase.runTest()",
      "begin_line": 46,
      "end_line": 54,
      "comment": "\n     *  Override runTest() to catch AssertionFailedError and retry\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 53,col 9)"
      ]
    }
  ]
}