{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/ode/IntegratorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegratorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 53,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered during integration\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.Throwable)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n   * Create an exception with a given root cause.\n   * @param cause  the exception or error that caused this exception to be thrown\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 17)"
      ]
    }
  ]
}