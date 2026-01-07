{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/SwitchException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathException"
      ],
      "begin_line": 28,
      "end_line": 50,
      "comment": "\n * This exception is made available to users to report\n * the error conditions that are triggered by {@link SwitchingFunction}\n * @version $Revision: 620312 $ $Date: 2008-02-10 20:28:59 +0100 (dim., 10 févr. 2008) $\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.ode.SwitchException.SwitchException(java.lang.String, java.lang.Object[])",
      "begin_line": 38,
      "end_line": 40,
      "comment": " Simple constructor.\n     * Build an exception by translating and formating a message\n     * @param specifier format specifier (to be translated)\n     * @param parts to insert in the format (no translation)\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.SwitchException.SwitchException(java.lang.Throwable)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Create an exception with a given root cause.\n     * @param cause  the exception or error that caused this exception to be thrown\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)"
      ]
    }
  ]
}