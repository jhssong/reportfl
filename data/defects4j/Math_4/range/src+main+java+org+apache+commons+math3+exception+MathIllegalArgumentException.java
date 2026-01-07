{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 32,
      "end_line": 65,
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
      "signature": "org.apache.commons.math3.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n     * @param pattern Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 45)",
        "(line 46,col 9)-(line 46,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalArgumentException.getContext()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalArgumentException.getMessage()",
      "begin_line": 55,
      "end_line": 58,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalArgumentException.getLocalizedMessage()",
      "begin_line": 61,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 45)"
      ]
    }
  ]
}