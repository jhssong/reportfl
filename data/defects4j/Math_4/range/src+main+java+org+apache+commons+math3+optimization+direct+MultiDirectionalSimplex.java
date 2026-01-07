{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/MultiDirectionalSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectionalSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 32,
      "end_line": 219,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
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
        "khi"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double, double)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[])",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[], double, double)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 21)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][], double, double)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 32)",
        "(line 151,col 9)-(line 151,col 25)",
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 156,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 54)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 164,col 9)-(line 165,col 89)",
        "(line 166,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.evaluateNewSimplex(org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.PointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 196,
      "end_line": 218,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 61)",
        "(line 203,col 9)-(line 203,col 33)",
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 212,col 9)",
        "(line 215,col 9)-(line 215,col 49)",
        "(line 217,col 9)-(line 217,col 27)"
      ]
    }
  ]
}