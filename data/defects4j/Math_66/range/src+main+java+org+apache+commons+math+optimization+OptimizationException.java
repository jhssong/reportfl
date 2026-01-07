{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/OptimizationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ConvergenceException"
      ],
      "begin_line": 32,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(java.lang.String, java.lang.Object...)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @deprecated as of 2.2 replaced by {@link #OptimizationException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.OptimizationException.OptimizationException(java.lang.Throwable)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    }
  ]
}