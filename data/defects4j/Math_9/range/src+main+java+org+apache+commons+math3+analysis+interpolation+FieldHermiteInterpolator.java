{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/analysis/interpolation/FieldHermiteInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldHermiteInterpolator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 197,
      "comment": " Polynomial interpolator using both sample values and sample derivatives.\n * \u003cp\u003e\n * The interpolation polynomials match all sample points, including both values\n * and provided derivatives. There is one polynomial for each component of\n * the values vector. All polynomials have the same degree. The degree of the\n * polynomials depends on the number of points and number of derivatives at each\n * point. For example the interpolation polynomials for n sample points without\n * any derivatives all have degree n-1. The interpolation polynomials for n\n * sample points with the two extreme points having value and first derivative\n * and the remaining points having value only all have degree n+1. The\n * interpolation polynomial for n sample points with value, first and second\n * derivative for all points all have degree 3n-1.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "abscissae"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Sample abscissae. "
    },
    {
      "type": "field",
      "varNames": [
        "topDiagonal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Top diagonal of the divided differences array. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomDiagonal"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Bottom diagonal of the divided differences array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.FieldHermiteInterpolator()",
      "begin_line": 59,
      "end_line": 63,
      "comment": " Create an empty interpolator.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 49)",
        "(line 61,col 9)-(line 61,col 51)",
        "(line 62,col 9)-(line 62,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.addSamplePoint(T, T[]...)",
      "begin_line": 84,
      "end_line": 123,
      "comment": " Add a sample point.\n     * \u003cp\u003e\n     * This method must be called once for each sample point. It is allowed to\n     * mix some calls with values only with calls with values and first\n     * derivatives.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The point abscissae for all calls \u003cem\u003emust\u003c/em\u003e be different.\n     * \u003c/p\u003e\n     * @param x abscissa of the sample point\n     * @param value value and derivatives of the sample point\n     * (if only one row is passed, it is the value, if two rows are\n     * passed the first one is the value and the second the derivative\n     * and so on)\n     * @exception ZeroException if the abscissa difference between added point\n     * and a previous point is zero (i.e. the two points are at same abscissa)\n     * @exception MathArithmeticException if the number of derivatives is larger\n     * than 20, which prevents computation of a factorial\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.value(T)",
      "begin_line": 130,
      "end_line": 150,
      "comment": " Interpolate value at a specified abscissa.\n     * @param x interpolation abscissa\n     * @return interpolated value\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 89)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolator.derivatives(T, int)",
      "begin_line": 159,
      "end_line": 195,
      "comment": " Interpolate value and first derivatives at a specified abscissa.\n     * @param x interpolation abscissa\n     * @param order maximum derivation order\n     * @return interpolated value and derivatives (value in row 0,\n     * 1\u003csup\u003est\u003c/sup\u003e derivative in row 1, ... n\u003csup\u003eth\u003c/sup\u003e derivative in row n)\n     * @exception NoDataException if sample is empty\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 46)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 70)",
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 175,col 90)",
        "(line 176,col 9)-(line 176,col 78)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 27)"
      ]
    }
  ]
}