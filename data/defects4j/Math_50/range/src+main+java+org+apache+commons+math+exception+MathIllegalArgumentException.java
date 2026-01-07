{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 32,
      "end_line": 64,
      "comment": "\n * Base class for all preconditions violation exceptions.\n * In most cases, this class should not be instantiated directly: it should\n * serve as a base class to create all the exceptions that have the semantics\n * of the standard {@link IllegalArgumentException}.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Context. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getContext()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage()",
      "begin_line": 54,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getLocalizedMessage()",
      "begin_line": 60,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)"
      ]
    }
  ]
}