{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/analysis/interpolation/HermiteInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HermiteInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableUnivariateVectorFunction"
      ],
      "begin_line": 52,
      "end_line": 255,
      "comment": " Polynomial interpolator using both sample values and sample derivatives.\n * \u003cp\u003e\n * The interpolation polynomials match all sample points, including both values\n * and provided derivatives. There is one polynomial for each component of\n * the values vector. All polynomial have the same degree. The degree of the\n * polynomials depends on the number of points and number of derivatives at each\n * point. For example the interpolation polynomials for n sample points without\n * any derivatives all have degree n-1. The interpolation polynomials for n\n * sample points with the two extreme points having value and first derivative\n * and the remaining points having value only all have degree n+1. The\n * interpolation polynomial for n sample points with value, first and second\n * derivative for all points all have degree 3n-1.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class has been imported from the Orekit space flight dynamics library\n * also distributed under the terms of the Apache License V2. Original copyright\n * is: Copyright 2002-2012 CS Systèmes d\u0027Information.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissae"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Sample abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "topDiagonal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Top diagonal of the divided differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomDiagonal"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Bottom diagonal of the divided differences array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.HermiteInterpolator()",
      "begin_line": 65,
      "end_line": 69,
      "comment": " Create an empty interpolator.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 54)",
        "(line 67,col 9)-(line 67,col 56)",
        "(line 68,col 9)-(line 68,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.addSamplePoint(double, double[]...)",
      "begin_line": 88,
      "end_line": 126,
      "comment": " Add a sample point.\n     * \u003cp\u003e\n     * This method must be called once for each sample point. It is allowed to\n     * mix some calls with values only with calls with values and first\n     * derivatives.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The point abscissae for all calls \u003cem\u003emust\u003c/em\u003e be different.\n     * \u003c/p\u003e\n     * @param x abscissa of the sample point\n     * @param value value and derivatives of the sample point\n     * (if only one row is passed, it is the value, if two rows are\n     * passed the first one is the value and the second the derivative\n     * and so on)\n     * @exception MathIllegalArgumentException if the abscissa is equals to a previously\n     * added sample point\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.getPolynomials()",
      "begin_line": 132,
      "end_line": 157,
      "comment": " Compute the interpolation polynomials.\n     * @return interpolation polynomials array\n     * @exception MathIllegalStateException if sample is empty\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 29)",
        "(line 139,col 9)-(line 139,col 54)",
        "(line 140,col 9)-(line 140,col 93)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 49)",
        "(line 147,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.value(double)",
      "begin_line": 170,
      "end_line": 189,
      "comment": " Interpolate value at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link PolynomialFunction#value(double)\n     * value} methods of all polynomials returned by {@link #getPolynomials() getPolynomials},\n     * except it does not build the intermediate polynomials, so this method is faster and\n     * numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception MathIllegalStateException if sample is empty\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 29)",
        "(line 176,col 9)-(line 176,col 69)",
        "(line 177,col 9)-(line 177,col 30)",
        "(line 178,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.derivative(double)",
      "begin_line": 202,
      "end_line": 223,
      "comment": " Interpolate first derivative at a specified abscissa.\n     * \u003cp\u003e\n     * Calling this method is equivalent to call the {@link PolynomialFunction#value(double)\n     * value} methods of the derivatives of all polynomials returned by {@link\n     * #getPolynomials() getPolynomials}, except it builds neither the intermediate\n     * polynomials nor their derivatives, so this method is faster and numerically more stable.\n     * \u003c/p\u003e\n     * @param x interpolation abscissa\n     * @return interpolated derivative\n     * @exception MathIllegalStateException if sample is empty\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 29)",
        "(line 208,col 9)-(line 208,col 74)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.derivative()",
      "begin_line": 226,
      "end_line": 235,
      "comment": " {@inheritDoc}} ",
      "child_ranges": [
        "(line 227,col 9)-(line 234,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.Anonymous-5e6793e4-d592-442f-a0fd-2e68e080ccad.value(double)",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc}} ",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.checkInterpolation()",
      "begin_line": 241,
      "end_line": 245,
      "comment": " Check interpolation can be performed.\n     * @exception MathIllegalStateException if interpolation cannot be performed\n     * because sample is empty\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.HermiteInterpolator.polynomial(double...)",
      "begin_line": 251,
      "end_line": 253,
      "comment": " Create a polynomial from its coefficients.\n     * @param c polynomials coefficients\n     * @return polynomial\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 41)"
      ]
    }
  ]
}