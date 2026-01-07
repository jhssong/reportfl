{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/exception/MathIllegalNumberException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalNumberException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 30,
      "end_line": 70,
      "comment": "\n * Base class for exceptions raised by a wrong number.\n * This class is not intended to be instantiated directly: it should serve\n * as a base class to create all the exceptions that are raised because some\n * precondition is violated by a number argument.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Requested. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.MathIllegalNumberException(org.apache.commons.math.util.Localizable, org.apache.commons.math.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 42,
      "end_line": 48,
      "comment": "\n     * Construct an exception.\n     *\n     * @param specific Localizable pattern.\n     * @param general Localizable pattern.\n     * @param arguments Arguments. The first element must be the requested\n     * value that raised the exception.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 51)",
        "(line 47,col 9)-(line 47,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.MathIllegalNumberException(org.apache.commons.math.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "\n     * Construct an exception.\n     *\n     * @param general Localizable pattern.\n     * @param arguments Arguments. The first element must be the requested\n     * value that raised the exception.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 41)",
        "(line 61,col 9)-(line 61,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.getArgument()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @return the requested value.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)"
      ]
    }
  ]
}