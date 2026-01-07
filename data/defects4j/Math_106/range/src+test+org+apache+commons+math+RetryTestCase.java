{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/RetryTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RetryTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 54,
      "comment": "\n * A TestCase that retries tests when assertions fail.\n * \u003cp\u003e\n * If one or more tests throw an AssertionFailedError, all tests are \n * repeated one time.  \n * \u003cp\u003e\n * Errors or exceptions other than AssertionFailedError do not lead to retries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.RetryTestCase.RetryTestCase()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.RetryTestCase.RetryTestCase(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.RetryTestCase.runTest()",
      "begin_line": 45,
      "end_line": 52,
      "comment": "\n     *  Override runTest() to catch AssertionFailedError and retry\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 51,col 9)"
      ]
    }
  ]
}