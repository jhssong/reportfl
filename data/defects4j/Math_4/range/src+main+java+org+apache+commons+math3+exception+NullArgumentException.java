{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/NullArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.exception.MathIllegalArgumentException"
      ],
      "begin_line": 33,
      "end_line": 52,
      "comment": "\n * All conditions checks that fail due to a {@code null} argument must throw\n * this exception.\n * This class is meant to signal a precondition violation (\"null is an illegal\n * argument\") and so does not extend the standard {@code NullPointerException}.\n * Propagation of {@code NullPointerException} from within Commons-Math is\n * construed to be a bug.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.exception.NullArgumentException.NullArgumentException()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.NullArgumentException.NullArgumentException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param arguments Values for replacing the placeholders in {@code pattern}.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 34)"
      ]
    }
  ]
}