{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/analysis/interpolation/HermiteInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HermiteInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableVectorFunction"
      ],
      "begin_line": 54,
      "end_line": 245,
      "comment": " Polynomial interpolator using both sample values and sample derivatives.\n * \u003cp\u003e\n * The interpolation polynomials match all sample points, including both values\n * and provided derivatives. There is one polynomial for each component of\n * the values vector. All polynomials have the same degree. The degree of the\n * polynomials depends on the number of points and number of derivatives at each\n * point. For example the interpolation polynomials for n sample points without\n * any derivatives all have degree n-1. The interpolation polynomials for n\n * sample points with the two extreme points having value and first derivative\n * and the remaining points having value only all have degree n+1. The\n * interpolation polynomial for n sample points with value, first and second\n * derivative for all points all have degree 3n-1.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class has been imported from the Orekit space flight dynamics library\n * also distributed under the terms of the Apache License V2. Original copyright\n * is: Copyright 2002-2012 CS Systèmes d\u0027Information.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissae"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Sample abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "topDiagonal"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Top diagonal of the divided differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomDiagonal"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Bottom diagonal of the divided differences array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.HermiteInterpolator()",
      "begin_line": 67,
      "end_line": 71,
      "comment": " Create an empty interpolator.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 54)",
        "(line 69,col 9)-(line 69,col 56)",
        "(line 70,col 9)-(line 70,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.addSamplePoint(double, double[]...)",
      "begin_line": 92,
      "end_line": 129,
      "comment": " Add a sample point.\n     * \u003cp\u003e\n     * This method must be called once for each sample point. It is allowed to\n     * mix some calls with values only with calls with values and first\n     * derivatives.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The point abscissae for all calls \u003cem\u003emust\u003c/em\u003e be different.\n     * \u003c/p\u003e\n     * @param x abscissa of the sample point\n     * @param value value and derivatives of the sample point\n     * (if only one row is passed, it is the value, if two rows are\n     * passed the first one is the value and the second the derivative\n     * and so on)\n     * @exception ZeroException if the abscissa difference between added point\n     * and a previous point is zero (i.e. the two points are at same abscissa)\n     * @exception MathArithmeticException if the number of derivatives is larger\n     * than 20, which prevents computation of a factorial\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.getPolynomials()",
      "begin_line": 135,
      "end_line": 160,
      "comment": " Compute the interpolation polynomials.\n     * @return interpolation polynomials array\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)",
        "(line 142,col 9)-(line 142,col 54)",
        "(line 143,col 9)-(line 143,col 93)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 150,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.value(double)",
      "begin_line": 173,
      "end_line": 192,
      "comment": " Interpolate value at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link PolynomialFunction#value(double)\n     * value} methods of all polynomials returned by {@link #getPolynomials() getPolynomials},\n     * except it does not build the intermediate polynomials, so this method is faster and\n     * numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 29)",
        "(line 179,col 9)-(line 179,col 69)",
        "(line 180,col 9)-(line 180,col 30)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 205,
      "end_line": 225,
      "comment": " Interpolate value at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link\n     * PolynomialFunction#value(DerivativeStructure) value} methods of all polynomials\n     * returned by {@link #getPolynomials() getPolynomials}, except it does not build the\n     * intermediate polynomials, so this method is faster and numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 29)",
        "(line 211,col 9)-(line 211,col 95)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 63)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.checkInterpolation()",
      "begin_line": 231,
      "end_line": 235,
      "comment": " Check interpolation can be performed.\n     * @exception NoDataException if interpolation cannot be performed\n     * because sample is empty\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.polynomial(double...)",
      "begin_line": 241,
      "end_line": 243,
      "comment": " Create a polynomial from its coefficients.\n     * @param c polynomials coefficients\n     * @return polynomial\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 41)"
      ]
    }
  ]
}