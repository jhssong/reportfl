{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/FractionConversionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FractionConversionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.ConvergenceException"
      ],
      "begin_line": 30,
      "end_line": 56,
      "comment": "\n * Error thrown when a double value cannot be converted to a fraction\n * in the allowed number of iterations.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.FractionConversionException.FractionConversionException(double, int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param value double value to convert\n     * @param maxIterations maximal number of iterations allowed\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.FractionConversionException.FractionConversionException(double, long, long)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param value double value to convert\n     * @param p current numerator\n     * @param q current denominator\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 74)"
      ]
    }
  ]
}