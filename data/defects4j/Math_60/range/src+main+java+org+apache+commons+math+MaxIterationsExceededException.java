{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/MaxIterationsExceededException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaxIterationsExceededException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 35,
      "end_line": 87,
      "comment": "\n * Error thrown when a numerical computation exceeds its allowed\n * number of iterations.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated in 2.2 (to be removed in 3.0). Please use\n * {@link org.apache.commons.math.exception.MaxCountExceededException}\n * instead.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Constructs an exception with a default detail message.\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 71)",
        "(line 49,col 9)-(line 49,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, java.lang.String, java.lang.Object...)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @deprecated as of 2.2 replaced by {@link #MaxIterationsExceededException(int, Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.MaxIterationsExceededException(int, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param maxIterations the exceeded maximal number of iterations\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 34)",
        "(line 77,col 9)-(line 77,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.MaxIterationsExceededException.getMaxIterations()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Get the maximal number of iterations allowed.\n     * @return maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)"
      ]
    }
  ]
}