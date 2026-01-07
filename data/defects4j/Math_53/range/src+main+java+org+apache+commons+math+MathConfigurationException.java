{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/MathConfigurationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathConfigurationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 94,
      "comment": "\n * Signals a configuration problem with any of the factory methods.\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.String, java.lang.Object...)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.Throwable)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.Throwable, java.lang.String, java.lang.Object...)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)"
      ]
    }
  ]
}