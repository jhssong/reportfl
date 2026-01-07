{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/HermiteInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HermiteInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableVectorFunction"
      ],
      "begin_line": 49,
      "end_line": 240,
      "comment": " Polynomial interpolator using both sample values and sample derivatives.\n * \u003cp\u003e\n * The interpolation polynomials match all sample points, including both values\n * and provided derivatives. There is one polynomial for each component of\n * the values vector. All polynomials have the same degree. The degree of the\n * polynomials depends on the number of points and number of derivatives at each\n * point. For example the interpolation polynomials for n sample points without\n * any derivatives all have degree n-1. The interpolation polynomials for n\n * sample points with the two extreme points having value and first derivative\n * and the remaining points having value only all have degree n+1. The\n * interpolation polynomial for n sample points with value, first and second\n * derivative for all points all have degree 3n-1.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissae"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Sample abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "topDiagonal"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Top diagonal of the divided differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomDiagonal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Bottom diagonal of the divided differences array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.HermiteInterpolator()",
      "begin_line": 62,
      "end_line": 66,
      "comment": " Create an empty interpolator.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 54)",
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.addSamplePoint(double, double[]...)",
      "begin_line": 87,
      "end_line": 124,
      "comment": " Add a sample point.\n     * \u003cp\u003e\n     * This method must be called once for each sample point. It is allowed to\n     * mix some calls with values only with calls with values and first\n     * derivatives.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The point abscissae for all calls \u003cem\u003emust\u003c/em\u003e be different.\n     * \u003c/p\u003e\n     * @param x abscissa of the sample point\n     * @param value value and derivatives of the sample point\n     * (if only one row is passed, it is the value, if two rows are\n     * passed the first one is the value and the second the derivative\n     * and so on)\n     * @exception ZeroException if the abscissa difference between added point\n     * and a previous point is zero (i.e. the two points are at same abscissa)\n     * @exception MathArithmeticException if the number of derivatives is larger\n     * than 20, which prevents computation of a factorial\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.getPolynomials()",
      "begin_line": 130,
      "end_line": 155,
      "comment": " Compute the interpolation polynomials.\n     * @return interpolation polynomials array\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 29)",
        "(line 137,col 9)-(line 137,col 54)",
        "(line 138,col 9)-(line 138,col 93)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 49)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.value(double)",
      "begin_line": 168,
      "end_line": 187,
      "comment": " Interpolate value at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link PolynomialFunction#value(double)\n     * value} methods of all polynomials returned by {@link #getPolynomials() getPolynomials},\n     * except it does not build the intermediate polynomials, so this method is faster and\n     * numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)",
        "(line 174,col 9)-(line 174,col 69)",
        "(line 175,col 9)-(line 175,col 30)",
        "(line 176,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 200,
      "end_line": 220,
      "comment": " Interpolate value at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link\n     * PolynomialFunction#value(DerivativeStructure) value} methods of all polynomials\n     * returned by {@link #getPolynomials() getPolynomials}, except it does not build the\n     * intermediate polynomials, so this method is faster and numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 29)",
        "(line 206,col 9)-(line 206,col 95)",
        "(line 207,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 208,col 63)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.checkInterpolation()",
      "begin_line": 226,
      "end_line": 230,
      "comment": " Check interpolation can be performed.\n     * @exception NoDataException if interpolation cannot be performed\n     * because sample is empty\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.polynomial(double...)",
      "begin_line": 236,
      "end_line": 238,
      "comment": " Create a polynomial from its coefficients.\n     * @param c polynomials coefficients\n     * @return polynomial\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 41)"
      ]
    }
  ]
}