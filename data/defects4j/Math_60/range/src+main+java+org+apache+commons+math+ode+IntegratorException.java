{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/ode/IntegratorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegratorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 64,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered during integration\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.String, java.lang.Object...)",
      "begin_line": 41,
      "end_line": 44,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @deprecated as of 2.2 replaced by {@link #IntegratorException(Localizable, Object...)}\n     ",
      "child_ranges": [
        "(line 43,col 7)-(line 43,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 52,
      "end_line": 54,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 53,col 7)-(line 53,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.Throwable)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n   * Create an exception with a given root cause.\n   * @param cause  the exception or error that caused this exception to be thrown\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 17)"
      ]
    }
  ]
}