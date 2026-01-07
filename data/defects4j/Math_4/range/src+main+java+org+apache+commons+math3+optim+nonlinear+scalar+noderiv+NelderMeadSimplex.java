{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/NelderMeadSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMeadSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex"
      ],
      "begin_line": 30,
      "end_line": 281,
      "comment": "\n * This class implements the Nelder-Mead simplex algorithm.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RHO"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Default value for {@link #rho}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SIGMA"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default value for {@link #sigma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(int, double)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 70,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double, double)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 27)",
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(double[])",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(double[], double, double, double, double)",
      "begin_line": 136,
      "end_line": 145,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws IllegalArgumentException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 21)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 23)",
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 144,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(double[][])",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.NelderMeadSimplex(double[][], double, double, double, double)",
      "begin_line": 173,
      "end_line": 182,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 32)",
        "(line 178,col 9)-(line 178,col 23)",
        "(line 179,col 9)-(line 179,col 23)",
        "(line 180,col 9)-(line 180,col 27)",
        "(line 181,col 9)-(line 181,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 185,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 37)",
        "(line 192,col 9)-(line 192,col 48)",
        "(line 193,col 9)-(line 193,col 58)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 199,col 9)-(line 199,col 48)",
        "(line 200,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 42)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 217,col 74)",
        "(line 219,col 9)-(line 279,col 9)"
      ]
    }
  ]
}