{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/OptimizationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 30,
      "end_line": 53,
      "comment": ""
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
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(java.lang.String, java.lang.Object...)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(java.lang.Throwable)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    }
  ]
}