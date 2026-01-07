{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/exception/NullArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalArgumentException"
      ],
      "begin_line": 33,
      "end_line": 50,
      "comment": "\n * All conditions checks that fail due to a {@code null} argument must throw\n * this exception.\n * This class is meant to signal a precondition violation (\"null is an illegal\n * argument\") and so does not extend the standard {@code NullPointerException}.\n * Proagation of {@code NullPointerException} from within Commons-Math is\n * construed to be a bug.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NullArgumentException.NullArgumentException()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NullArgumentException.NullArgumentException(org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 59)"
      ]
    }
  ]
}