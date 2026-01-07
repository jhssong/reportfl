{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/transform/TransformUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 164,
      "comment": "\n * Useful functions for the implementation of various transforms.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "POWERS_OF_TWO"
      ],
      "begin_line": 38,
      "end_line": 45,
      "comment": "\n     * Table of the powers of 2 to facilitate binary search lookup.\n     *\n     * @see #exactLog2(int)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.transform.TransformUtils.TransformUtils()",
      "begin_line": 48,
      "end_line": 50,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.TransformUtils.scaleArray(double[], double)",
      "begin_line": 60,
      "end_line": 66,
      "comment": "\n     * Multiply every component in the given real array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the real array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.TransformUtils.scaleArray(org.apache.commons.math3.complex.Complex[], double)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "\n     * Multiply every component in the given complex array by the\n     * given real number. The change is made in place.\n     *\n     * @param f the complex array to be scaled\n     * @param d the real scaling coefficient\n     * @return a reference to the scaled array\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.TransformUtils.createRealImaginaryArray(org.apache.commons.math3.complex.Complex[])",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * Builds a new two dimensional array of {@code double} filled with the real\n     * and imaginary parts of the specified {@link Complex} numbers. In the\n     * returned array {@code dataRI}, the data is laid out as follows\n     * \u003cul\u003e\n     * \u003cli\u003e{@code dataRI[0][i] \u003d dataC[i].getReal()},\u003c/li\u003e\n     * \u003cli\u003e{@code dataRI[1][i] \u003d dataC[i].getImaginary()}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param dataC the array of {@link Complex} data to be transformed\n     * @return a two dimensional array filled with the real and imaginary parts\n     *   of the specified complex input\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 62)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.TransformUtils.createComplexArray(double[][])",
      "begin_line": 124,
      "end_line": 142,
      "comment": "\n     * Builds a new array of {@link Complex} from the specified two dimensional\n     * array of real and imaginary parts. In the returned array {@code dataC},\n     * the data is laid out as follows\n     * \u003cul\u003e\n     * \u003cli\u003e{@code dataC[i].getReal() \u003d dataRI[0][i]},\u003c/li\u003e\n     * \u003cli\u003e{@code dataC[i].getImaginary() \u003d dataRI[1][i]}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param dataRI the array of real and imaginary parts to be transformed\n     * @return an array of {@link Complex} with specified real and imaginary parts.\n     * @throws DimensionMismatchException if the number of rows of the specified\n     *   array is not two, or the array is not rectangular\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.transform.TransformUtils.exactLog2(int)",
      "begin_line": 153,
      "end_line": 163,
      "comment": "\n     * Returns the base-2 logarithm of the specified {@code int}. Throws an\n     * exception if {@code n} is not a power of two.\n     *\n     * @param n the {@code int} whose base-2 logarithm is to be evaluated\n     * @return the base-2 logarithm of {@code n}\n     * @throws MathIllegalArgumentException if {@code n} is not a power of two\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 21)"
      ]
    }
  ]
}