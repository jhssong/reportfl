{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/optimization/direct/NelderMeadSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NelderMeadSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 32,
      "end_line": 284,
      "comment": "\n * This class implements the Nelder-Mead simplex algorithm.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RHO"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default value for {@link #rho}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SIGMA"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default value for {@link #sigma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "rho"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Reflection coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Shrinkage coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 72,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double, double)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)",
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 23)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(int, double, double, double, double)",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int)}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[], double, double, double, double)",
      "begin_line": 138,
      "end_line": 147,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws IllegalArgumentException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 21)",
        "(line 143,col 9)-(line 143,col 23)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 145,col 27)",
        "(line 146,col 9)-(line 146,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][])",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Build a Nelder-Mead simplex with default coefficients.\n     * The default coefficients are 1.0 for rho, 2.0 for khi and 0.5\n     * for both gamma and sigma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.NelderMeadSimplex(double[][], double, double, double, double)",
      "begin_line": 175,
      "end_line": 184,
      "comment": "\n     * Build a Nelder-Mead simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param rho Reflection coefficient.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @param sigma Shrinkage coefficient.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 32)",
        "(line 180,col 9)-(line 180,col 23)",
        "(line 181,col 9)-(line 181,col 23)",
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.NelderMeadSimplex.iterate(org.apache.commons.math.analysis.MultivariateRealFunction, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 187,
      "end_line": 283,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)",
        "(line 195,col 9)-(line 195,col 52)",
        "(line 196,col 9)-(line 196,col 62)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 52)",
        "(line 202,col 9)-(line 202,col 48)",
        "(line 203,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 39)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 42)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 220,col 78)",
        "(line 222,col 9)-(line 282,col 9)"
      ]
    }
  ]
}