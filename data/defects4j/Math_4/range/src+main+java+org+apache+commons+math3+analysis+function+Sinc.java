{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/function/Sinc.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Sinc",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 39,
      "end_line": 206,
      "comment": "\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Sinc_function\"\u003eSinc\u003c/a\u003e function,\n * defined by\n * \u003cpre\u003e\u003ccode\u003e\n *   sinc(x) \u003d 1            if x \u003d 0,\n *             sin(x) / x   otherwise.\n * \u003c/code\u003e\u003c/pre\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHORTCUT"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Value below which the computations are done using Taylor series.\n     * \u003cp\u003e\n     * The Taylor series for sinc even order derivatives are:\n     * \u003cpre\u003e\n     * d^(2n)sinc/dx^(2n)     \u003d Sum_(k\u003e\u003d0) (-1)^(n+k) / ((2k)!(2n+2k+1)) x^(2k)\n     *                        \u003d (-1)^n     [ 1/(2n+1) - x^2/(4n+6) + x^4/(48n+120) - x^6/(1440n+5040) + O(x^8) ]\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The Taylor series for sinc odd order derivatives are:\n     * \u003cpre\u003e\n     * d^(2n+1)sinc/dx^(2n+1) \u003d Sum_(k\u003e\u003d0) (-1)^(n+k+1) / ((2k+1)!(2n+2k+3)) x^(2k+1)\n     *                        \u003d (-1)^(n+1) [ x/(2n+3) - x^3/(12n+30) + x^5/(240n+840) - x^7/(10080n+45360) + O(x^9) ]\n     * \u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * So the ratio of the fourth term with respect to the first term\n     * is always smaller than x^6/720, for all derivative orders.\n     * This implies that neglecting this term and using only the first three terms induces\n     * a relative error bounded by x^6/720. The SHORTCUT value is chosen such that this\n     * relative error is below double precision accuracy when |x| \u003c\u003d SHORTCUT.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "normalized"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For normalized sinc function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Sinc.Sinc()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * The sinc function, {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.function.Sinc.Sinc(boolean)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Instantiates the sinc function.\n     *\n     * @param normalized If {@code true}, the function is\n     * \u003ccode\u003e sin(\u0026pi;x) / \u0026pi;x\u003c/code\u003e, otherwise {@code sin(x) / x}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sinc.value(double)",
      "begin_line": 86,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 64)",
        "(line 88,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sinc.derivative()",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1, replaced by {@link #value(DerivativeStructure)}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.function.Sinc.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 109,
      "end_line": 204,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 78)",
        "(line 113,col 9)-(line 113,col 50)",
        "(line 115,col 9)-(line 115,col 50)",
        "(line 117,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 28)"
      ]
    }
  ]
}