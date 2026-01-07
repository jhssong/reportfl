{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/FieldHermiteInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldHermiteInterpolator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 210,
      "comment": " Polynomial interpolator using both sample values and sample derivatives.\n * \u003cp\u003e\n * The interpolation polynomials match all sample points, including both values\n * and provided derivatives. There is one polynomial for each component of\n * the values vector. All polynomials have the same degree. The degree of the\n * polynomials depends on the number of points and number of derivatives at each\n * point. For example the interpolation polynomials for n sample points without\n * any derivatives all have degree n-1. The interpolation polynomials for n\n * sample points with the two extreme points having value and first derivative\n * and the remaining points having value only all have degree n+1. The\n * interpolation polynomial for n sample points with value, first and second\n * derivative for all points all have degree 3n-1.\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e Type of the field elements.\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissae"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Sample abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "topDiagonal"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Top diagonal of the divided differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomDiagonal"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Bottom diagonal of the divided differences array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.FieldHermiteInterpolator()",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Create an empty interpolator.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 49)",
        "(line 66,col 9)-(line 66,col 51)",
        "(line 67,col 9)-(line 67,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.addSamplePoint(T, T[]...)",
      "begin_line": 91,
      "end_line": 132,
      "comment": " Add a sample point.\n     * \u003cp\u003e\n     * This method must be called once for each sample point. It is allowed to\n     * mix some calls with values only with calls with values and first\n     * derivatives.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The point abscissae for all calls \u003cem\u003emust\u003c/em\u003e be different.\n     * \u003c/p\u003e\n     * @param x abscissa of the sample point\n     * @param value value and derivatives of the sample point\n     * (if only one row is passed, it is the value, if two rows are\n     * passed the first one is the value and the second the derivative\n     * and so on)\n     * @exception ZeroException if the abscissa difference between added point\n     * and a previous point is zero (i.e. the two points are at same abscissa)\n     * @exception MathArithmeticException if the number of derivatives is larger\n     * than 20, which prevents computation of a factorial\n     * @throws DimensionMismatchException if derivative structures are inconsistent\n     * @throws NullArgumentException if x is null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 34)",
        "(line 96,col 9)-(line 96,col 44)",
        "(line 97,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.value(T)",
      "begin_line": 140,
      "end_line": 161,
      "comment": " Interpolate value at a specified abscissa.\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     * @throws NullArgumentException if x is null\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 89)",
        "(line 149,col 9)-(line 149,col 45)",
        "(line 150,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.derivatives(T, int)",
      "begin_line": 171,
      "end_line": 208,
      "comment": " Interpolate value and first derivatives at a specified abscissa.\n     * @param x interpolation abscissa\n     * @param order maximum derivation order\n     * @return interpolated value and derivatives (value in row 0,\n     * 1\u003csup\u003est\u003c/sup\u003e derivative in row 1, ... n\u003csup\u003eth\u003c/sup\u003e derivative in row n)\n     * @exception NoDataException if sample is empty\n     * @throws NullArgumentException if x is null\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 181,col 9)-(line 181,col 70)",
        "(line 182,col 9)-(line 182,col 21)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 188,col 90)",
        "(line 189,col 9)-(line 189,col 78)",
        "(line 190,col 9)-(line 190,col 46)",
        "(line 191,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 27)"
      ]
    }
  ]
}