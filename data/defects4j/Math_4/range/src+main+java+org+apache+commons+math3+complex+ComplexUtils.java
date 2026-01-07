{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/complex/ComplexUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 87,
      "comment": "\n * Static implementations of common\n * {@link org.apache.commons.math3.complex.Complex} utilities functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.ComplexUtils.ComplexUtils()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexUtils.polar2Complex(double, double)",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Creates a complex number from the given polar representation.\n     * \u003cp\u003e\n     * The value returned is \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e,\n     * computed as \u003ccode\u003er\u0026middot;cos(theta) + r\u0026middot;sin(theta)i\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either \u003ccode\u003er\u003c/code\u003e or \u003ccode\u003etheta\u003c/code\u003e is NaN, or\n     * \u003ccode\u003etheta\u003c/code\u003e is infinite, {@link Complex#NaN} is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003er\u003c/code\u003e is infinite and \u003ccode\u003etheta\u003c/code\u003e is finite,\n     * infinite or NaN values may be returned in parts of the result, following\n     * the rules for double arithmetic.\u003cpre\u003e\n     * Examples:\n     * \u003ccode\u003e\n     * polar2Complex(INFINITY, \u0026pi;/4) \u003d INFINITY + INFINITY i\n     * polar2Complex(INFINITY, 0) \u003d INFINITY + NaN i\n     * polar2Complex(INFINITY, -\u0026pi;/4) \u003d INFINITY - INFINITY i\n     * polar2Complex(INFINITY, 5\u0026pi;/4) \u003d -INFINITY - INFINITY i \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     *\n     * @param r the modulus of the complex number to create\n     * @param theta  the argument of the complex number to create\n     * @return \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e\n     * @throws MathIllegalArgumentException if {@code r} is negative.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.ComplexUtils.convertToComplex(double[])",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Convert an array of primitive doubles to an array of {@code Complex} objects.\n     *\n     * @param real Array of numbers to be converted to their {@code Complex}\n     * equivalent.\n     * @return an array of {@code Complex} objects.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 17)"
      ]
    }
  ]
}