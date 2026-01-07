{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/MathConfigurationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathConfigurationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException",
        "java.io.Serializable"
      ],
      "begin_line": 25,
      "end_line": 86,
      "comment": "\n * Signals a configuration problem with any of the factory methods.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.String)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct an exception with the given message.\n     * @param message descriptive error message\n     * @deprecated as of 1.2, replaced by {@link #MathConfigurationException(String, Object[])}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.String, java.lang.Object[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructs an exception with specified formatted detail message.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Construct an exception with the given message and root cause.\n     * @param message descriptive error message\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @deprecated as of 1.2, replaced by {@link #MathConfigurationException(String, Object[], Throwable)}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.Throwable)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.MathConfigurationException.MathConfigurationException(java.lang.String, java.lang.Object[], java.lang.Throwable)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Constructs an exception with specified formatted detail message and root cause.\n     * Message formatting is delegated to {@link java.text.MessageFormat}.\n     * @param pattern format specifier\n     * @param arguments format arguments\n     * @param cause  the exception or error that caused this exception to be thrown\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 41)"
      ]
    }
  ]
}