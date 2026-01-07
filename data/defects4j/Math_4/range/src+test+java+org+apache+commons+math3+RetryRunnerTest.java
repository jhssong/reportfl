{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/RetryRunnerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RetryRunnerTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 55,
      "comment": "\n * Test for the \"Retry\" functionality (retrying Junit test methods).\n "
    },
    {
      "type": "field",
      "varNames": [
        "rng"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RetryRunnerTest.testRetryFailAlways()",
      "begin_line": 37,
      "end_line": 41,
      "comment": "\n     * Shows that an always failing test will fail even if it is retried.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RetryRunnerTest.testRetryFailSometimes()",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Shows that a test that sometimes fail might succeed if it is retried.\n     * In this case the high number of retries makes it quite unlikely that\n     * the exception will be thrown by all of the calls.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)"
      ]
    }
  ]
}