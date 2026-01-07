{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/exception/MathIllegalNumberException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalNumberException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 29,
      "end_line": 73,
      "comment": "\n * Base class for exceptions raised by a wrong number.\n * This class is not intended to be instantiated directly: it should serve\n * as a base class to create all the exceptions that are raised because some\n * precondition is violated by a number argument.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Requested. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.MathIllegalNumberException(org.apache.commons.math.exception.Localizable, org.apache.commons.math.exception.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 45,
      "end_line": 51,
      "comment": "\n     * Construct an exception.\n     *\n     * @param specific Localizable pattern.\n     * @param general Localizable pattern.\n     * @param wrong wrong number\n     * @param arguments Arguments.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 51)",
        "(line 50,col 9)-(line 50,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.MathIllegalNumberException(org.apache.commons.math.exception.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * Construct an exception.\n     *\n     * @param general Localizable pattern.\n     * @param wrong wrong number\n     * @param arguments Arguments.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 41)",
        "(line 64,col 9)-(line 64,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalNumberException.getArgument()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * @return the requested value.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 24)"
      ]
    }
  ]
}