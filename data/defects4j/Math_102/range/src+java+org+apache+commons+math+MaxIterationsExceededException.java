{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/MaxIterationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 22,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int)",
      "begin_line": 35,
      "end_line": 39,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 37,col 59)",
        "(line 38,col 9)-(line 38,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, java.lang.String, java.lang.Object[])",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 51,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.getMaxIterations()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Get the maximal number of iterations allowed.\n     * @return maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 29)"
      ]
    }
  ]
}