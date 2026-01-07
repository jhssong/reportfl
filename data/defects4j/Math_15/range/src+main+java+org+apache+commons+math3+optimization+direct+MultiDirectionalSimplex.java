{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/optimization/direct/MultiDirectionalSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectionalSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.AbstractSimplex"
      ],
      "begin_line": 31,
      "end_line": 217,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double, double)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 90,col 9)-(line 90,col 25)",
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[])",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[], double, double)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 21)",
        "(line 118,col 9)-(line 118,col 25)",
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][])",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][], double, double)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 32)",
        "(line 149,col 9)-(line 149,col 25)",
        "(line 150,col 9)-(line 150,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 154,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 162,col 9)-(line 163,col 89)",
        "(line 164,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 178,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.MultiDirectionalSimplex.evaluateNewSimplex(org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.PointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 194,
      "end_line": 216,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 61)",
        "(line 201,col 9)-(line 201,col 33)",
        "(line 202,col 9)-(line 202,col 39)",
        "(line 203,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 215,col 9)-(line 215,col 27)"
      ]
    }
  ]
}