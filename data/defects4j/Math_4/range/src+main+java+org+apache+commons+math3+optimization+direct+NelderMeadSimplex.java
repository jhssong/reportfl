{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/NelderMeadSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMeadSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 32,
      "end_line": 284,
      "comment": "\n * This class implements the Nelder-Mead simplex algorithm.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RHO"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default value for {@link #rho}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SIGMA"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default value for {@link #sigma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 73,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double, double)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 29)",
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[])",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[], double, double, double, double)",
      "begin_line": 139,
      "end_line": 148,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws IllegalArgumentException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 145,col 23)",
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][])",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][], double, double, double, double)",
      "begin_line": 176,
      "end_line": 185,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 32)",
        "(line 181,col 9)-(line 181,col 23)",
        "(line 182,col 9)-(line 182,col 23)",
        "(line 183,col 9)-(line 183,col 27)",
        "(line 184,col 9)-(line 184,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.NelderMeadSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 188,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)",
        "(line 195,col 9)-(line 195,col 48)",
        "(line 196,col 9)-(line 196,col 58)",
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 198,col 52)",
        "(line 202,col 9)-(line 202,col 48)",
        "(line 203,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 39)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 42)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 220,col 74)",
        "(line 222,col 9)-(line 282,col 9)"
      ]
    }
  ]
}