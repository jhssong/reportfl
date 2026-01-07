{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/exception/MathIllegalNumberException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalNumberException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 30,
      "end_line": 61,
      "comment": "\n * Base class for exceptions raised by a wrong number.\n * This class is not intended to be instantiated directly: it should serve\n * as a base class to create all the exceptions that are raised because some\n * precondition is violated by a number argument.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ZERO"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Helper to avoid boxing warnings. @since 3.3 "
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
        "argument"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Requested. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathIllegalNumberException.MathIllegalNumberException(org.apache.commons.math3.exception.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Construct an exception.\n     *\n     * @param pattern Localizable pattern.\n     * @param wrong Wrong number.\n     * @param arguments Arguments.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 41)",
        "(line 52,col 9)-(line 52,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathIllegalNumberException.getArgument()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @return the requested value.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 24)"
      ]
    }
  ]
}