{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/optimization/direct/NelderMeadSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMeadSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 31,
      "end_line": 282,
      "comment": "\n * This class implements the Nelder-Mead simplex algorithm.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RHO"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default value for {@link #rho}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SIGMA"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default value for {@link #sigma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double, double)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 27)",
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[])",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[], double, double, double, double)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws IllegalArgumentException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 23)",
        "(line 144,col 9)-(line 144,col 27)",
        "(line 145,col 9)-(line 145,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][])",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][], double, double, double, double)",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)",
        "(line 179,col 9)-(line 179,col 23)",
        "(line 180,col 9)-(line 180,col 23)",
        "(line 181,col 9)-(line 181,col 27)",
        "(line 182,col 9)-(line 182,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.iterate(org.apache.commons.math.analysis.MultivariateRealFunction, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 186,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 37)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 62)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 52)",
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 39)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 42)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 218,col 78)",
        "(line 220,col 9)-(line 280,col 9)"
      ]
    }
  ]
}