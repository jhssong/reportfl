{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/ode/events/EventException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 29,
      "end_line": 52,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered by {@link EventHandler}\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventException.EventException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventException.EventException(java.lang.Throwable)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 21)"
      ]
    }
  ]
}