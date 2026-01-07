{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/IntegratorException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegratorException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 27,
      "end_line": 49,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered during integration\n * @version $Id: IntegratorException.java 1705 2006-09-17 19:57:39Z luc $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.String, java.lang.String[])",
      "begin_line": 35,
      "end_line": 37,
      "comment": " Simple constructor.\n   * Build an exception by translating and formating a message\n   * @param specifier format specifier (to be translated)\n   * @param parts to insert in the format (no translation)\n   ",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.IntegratorException.IntegratorException(java.lang.Throwable)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n   * Create an exception with a given root cause.\n   * @param cause  the exception or error that caused this exception to be thrown\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    }
  ]
}