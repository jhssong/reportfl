{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/complex/RootsOfUnity.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RootsOfUnity",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 219,
      "comment": "\n * A helper class for the computation and caching of the {@code n}-th roots of\n * unity.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version id. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaCount"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Number of roots of unity. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaReal"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Real part of the roots. "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryCounterClockwise"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Imaginary part of the {@code n}-th roots of unity, for positive values\n     * of {@code n}. In this array, the roots are stored in counter-clockwise\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "omegaImaginaryClockwise"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Imaginary part of the {@code n}-th roots of unity, for negative values\n     * of {@code n}. In this array, the roots are stored in clockwise order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isCounterClockWise"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * {@code true} if {@link #computeRoots(int)} was called with a positive\n     * value of its argument {@code n}. In this case, counter-clockwise ordering\n     * of the roots of unity should be used.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.RootsOfUnity()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n     * Build an engine for computing the {@code n}-th roots of unity.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 46)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.isCounterClockWise()",
      "begin_line": 88,
      "end_line": 96,
      "comment": "\n     * Returns {@code true} if {@link #computeRoots(int)} was called with a\n     * positive value of its argument {@code n}. If {@code true}, then\n     * counter-clockwise ordering of the roots of unity should be used.\n     *\n     * @return {@code true} if the roots of unity are stored in\n     * counter-clockwise order\n     * @throws MathIllegalStateException if no roots of unity have been computed\n     * yet\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.computeRoots(int)",
      "begin_line": 117,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003e\n     * Computes the {@code n}-th roots of unity. The roots are stored in\n     * {@code omega[]}, such that {@code omega[k] \u003d w ^ k}, where\n     * {@code k \u003d 0, ..., n - 1}, {@code w \u003d exp(2 * pi * i / n)} and\n     * {@code i \u003d sqrt(-1)}.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that {@code n} can be positive of negative\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code abs(n)} is always the number of roots of unity.\u003c/li\u003e\n     * \u003cli\u003eIf {@code n \u003e 0}, then the roots are stored in counter-clockwise order.\u003c/li\u003e\n     * \u003cli\u003eIf {@code n \u003c 0}, then the roots are stored in clockwise order.\u003c/p\u003e\n     * \u003c/ul\u003e\n     *\n     * @param n the (signed) number of roots of unity to be computed\n     * @throws ZeroException if {@code n \u003d 0}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 127,col 9)-(line 127,col 41)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 50)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 137,col 37)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 142,col 9)-(line 142,col 41)",
        "(line 143,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.getReal(int)",
      "begin_line": 162,
      "end_line": 178,
      "comment": "\n     * Get the real part of the {@code k}-th {@code n}-th root of unity.\n     *\n     * @param k index of the {@code n}-th root of unity\n     * @return real part of the {@code k}-th {@code n}-th root of unity\n     * @throws MathIllegalStateException if no roots of unity have been\n     * computed yet\n     * @throws MathIllegalArgumentException if {@code k} is out of range\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.getImaginary(int)",
      "begin_line": 189,
      "end_line": 206,
      "comment": "\n     * Get the imaginary part of the {@code k}-th {@code n}-th root of unity.\n     *\n     * @param k index of the {@code n}-th root of unity\n     * @return imaginary part of the {@code k}-th {@code n}-th root of unity\n     * @throws MathIllegalStateException if no roots of unity have been\n     * computed yet\n     * @throws OutOfRangeException if {@code k} is out of range\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 205,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.complex.RootsOfUnity.getNumberOfRoots()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Returns the number of roots of unity currently stored. If\n     * {@link #computeRoots(int)} was called with {@code n}, then this method\n     * returns {@code abs(n)}. If no roots of unity have been computed yet, this\n     * method returns 0.\n     *\n     * @return the number of roots of unity currently stored\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 26)"
      ]
    }
  ]
}