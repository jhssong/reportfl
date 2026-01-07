{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/MaxIterationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 29,
      "end_line": 67,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of iterations.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 76)",
        "(line 44,col 9)-(line 44,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 34)",
        "(line 57,col 9)-(line 57,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.getMaxIterations()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Get the maximal number of iterations allowed.\n     * @return maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 29)"
      ]
    }
  ]
}