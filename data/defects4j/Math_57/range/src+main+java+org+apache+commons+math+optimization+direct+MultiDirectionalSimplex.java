{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/optimization/direct/MultiDirectionalSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectionalSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 32,
      "end_line": 221,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
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
        "khi"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double, double)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[], double, double)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 21)",
        "(line 119,col 9)-(line 119,col 25)",
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][])",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][], double, double)",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @throws org.apache.commons.math.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 32)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 151,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.iterate(org.apache.commons.math.analysis.MultivariateRealFunction, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 155,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 161,col 52)",
        "(line 164,col 9)-(line 165,col 89)",
        "(line 166,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.evaluateNewSimplex(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.RealPointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 197,
      "end_line": 220,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws MathUserException if function cannot be evaluated at some points\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 61)",
        "(line 205,col 9)-(line 205,col 33)",
        "(line 206,col 9)-(line 206,col 39)",
        "(line 207,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 49)",
        "(line 219,col 9)-(line 219,col 27)"
      ]
    }
  ]
}