{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/transform/TransformUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 65,
      "comment": "\n * Useful functions for the implementation of various transforms.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.transform.TransformUtils.TransformUtils()",
      "begin_line": 29,
      "end_line": 31,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.TransformUtils.scaleArray(double[], double)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.transform.TransformUtils.scaleArray(org.apache.commons.math.complex.Complex[], double)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 17)"
      ]
    }
  ]
}