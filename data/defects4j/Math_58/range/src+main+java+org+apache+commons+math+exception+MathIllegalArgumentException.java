{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 31,
      "end_line": 54,
      "comment": "\n * Base class for all preconditions violation exceptions.\n * In most cases, this class should not be instantiated directly: it should\n * serve as a base class to create all the exceptions that share the semantics\n * of the standard {@link IllegalArgumentException}, but must also provide a\n * localized message.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)"
      ]
    }
  ]
}