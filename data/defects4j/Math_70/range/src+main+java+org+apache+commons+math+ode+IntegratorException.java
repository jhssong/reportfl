{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/IntegratorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegratorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 28,
      "end_line": 51,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered during integration\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.String, java.lang.Object...)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   ",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.Throwable)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n   * Create an exception with a given root cause.\n   * @param cause  the exception or error that caused this exception to be thrown\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 17)"
      ]
    }
  ]
}