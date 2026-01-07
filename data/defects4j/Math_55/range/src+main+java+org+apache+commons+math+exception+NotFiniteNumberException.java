{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/exception/NotFiniteNumberException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NotFiniteNumberException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathIllegalNumberException"
      ],
      "begin_line": 28,
      "end_line": 55,
      "comment": "\n * Exception to be thrown when a number is not finite.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NotFiniteNumberException.NotFiniteNumberException(java.lang.Number, java.lang.Object...)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Construct the exception.\n     *\n     * @param wrong Value that is infinite or NaN.\n     * @param args Optional arguments.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.NotFiniteNumberException.NotFiniteNumberException(org.apache.commons.math.exception.util.Localizable, java.lang.Number, java.lang.Object...)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Construct the exception with a specific context.\n     *\n     * @param specific Specific contexte pattern.\n     * @param wrong Value that is infinite or NaN.\n     * @param args Optional arguments.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 37)"
      ]
    }
  ]
}