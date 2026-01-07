{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/complex/ComplexUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 70,
      "comment": "\n * Static implementations of common\n * {@link org.apache.commons.math.complex.Complex} utilities functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexUtils.ComplexUtils()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.polar2Complex(double, double)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Creates a complex number from the given polar representation.\n     * \u003cp\u003e\n     * The value returned is \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e,\n     * computed as \u003ccode\u003er\u0026middot;cos(theta) + r\u0026middot;sin(theta)i\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either \u003ccode\u003er\u003c/code\u003e or \u003ccode\u003etheta\u003c/code\u003e is NaN, or\n     * \u003ccode\u003etheta\u003c/code\u003e is infinite, {@link Complex#NaN} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003er\u003c/code\u003e is infinite and \u003ccode\u003etheta\u003c/code\u003e is finite,\n     * infinite or NaN values may be returned in parts of the result, following\n     * the rules for double arithmetic.\u003cpre\u003e\n     * Examples:\n     * \u003ccode\u003e\n     * polar2Complex(INFINITY, \u0026pi;/4) \u003d INFINITY + INFINITY i\n     * polar2Complex(INFINITY, 0) \u003d INFINITY + NaN i\n     * polar2Complex(INFINITY, -\u0026pi;/4) \u003d INFINITY - INFINITY i\n     * polar2Complex(INFINITY, 5\u0026pi;/4) \u003d -INFINITY - INFINITY i \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param r the modulus of the complex number to create\n     * @param theta  the argument of the complex number to create\n     * @return \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e\n     * @throws IllegalArgumentException  if r is negative\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 69)"
      ]
    }
  ]
}