{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/RetryRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RetryRunner",
      "is_interface": false,
      "parent_types": [
        "BlockJUnit4ClassRunner"
      ],
      "begin_line": 30,
      "end_line": 82,
      "comment": "\n * A test runner that retries tests when assertions fail.\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.RetryRunner.RetryRunner(java.lang.Class\u003c?\u003e)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Simple constructor.\n     *\n     * @param testClass Class to test.\n     * @throws InitializationError if default runner cannot be built.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "methodInvoker(FrameworkMethod, Object)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027FrameworkMethod\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 42,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 79)",
        "(line 46,col 9)-(line 80,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "evaluate()",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Corresponding declaration not available for unsolved symbol.\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 53,
      "end_line": 79,
      "comment": "\n             * Evaluate the statement.\n             * We attempt several runs for the test, at most MAX_ATTEMPTS.\n             * if one attempt succeeds, we succeed, if all attempts fail, we\n             * fail with the reason corresponding to the last attempt\n             ",
      "child_ranges": [
        "(line 55,col 17)-(line 55,col 47)",
        "(line 57,col 17)-(line 57,col 70)",
        "(line 58,col 17)-(line 78,col 17)"
      ]
    }
  ]
}