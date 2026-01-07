{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/events/EventException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 28,
      "end_line": 50,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered by {@link EventHandler}\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serialization UID. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventException.EventException(java.lang.String, java.lang.Object...)",
      "begin_line": 38,
      "end_line": 40,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventException.EventException(java.lang.Throwable)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)"
      ]
    }
  ]
}