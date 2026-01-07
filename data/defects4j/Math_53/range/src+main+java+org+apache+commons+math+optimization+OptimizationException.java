{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/optimization/OptimizationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 31,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(java.lang.Throwable)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)"
      ]
    }
  ]
}