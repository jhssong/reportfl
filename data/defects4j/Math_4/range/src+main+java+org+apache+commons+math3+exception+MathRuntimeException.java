{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 66,
      "comment": "\n * As of release 4.0, all exceptions thrown by the Commons Math code (except\n * {@link NullArgumentException}) inherit from this class.\n * In most cases, this class should not be instantiated directly: it should\n * serve as a base class for implementing exception classes that describe a\n * specific \"problem\".\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Context. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathRuntimeException.MathRuntimeException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 45)",
        "(line 47,col 9)-(line 47,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathRuntimeException.getContext()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathRuntimeException.getMessage()",
      "begin_line": 56,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 62,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 45)"
      ]
    }
  ]
}