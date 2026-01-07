{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/MultiDirectionalSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiDirectionalSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex"
      ],
      "begin_line": 30,
      "end_line": 216,
      "comment": "\n * This class implements the multi-directional direct search method.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_KHI"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Default value for {@link #khi}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAMMA"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default value for {@link #gamma}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "khi"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Expansion coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "gamma"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Contraction coefficient. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(int)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(int, double, double, double)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param n Dimension of the simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param sideLength Length of the sides of the default (hypercube)\n     * simplex. See {@link AbstractSimplex#AbstractSimplex(int,double)}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 29)",
        "(line 89,col 9)-(line 89,col 25)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(double[])",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(double[], double, double)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param steps Steps along the canonical axes representing box edges.\n     * They may be negative but not zero. See\n     * {@link AbstractSimplex#AbstractSimplex(double[])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)",
        "(line 117,col 9)-(line 117,col 25)",
        "(line 118,col 9)-(line 118,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][])",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Build a multi-directional simplex with default coefficients.\n     * The default values are 2.0 for khi and 0.5 for gamma.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.MultiDirectionalSimplex(double[][], double, double)",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * Build a multi-directional simplex with specified coefficients.\n     *\n     * @param referenceSimplex Reference simplex. See\n     * {@link AbstractSimplex#AbstractSimplex(double[][])}.\n     * @param khi Expansion coefficient.\n     * @param gamma Contraction coefficient.\n     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException\n     * if the reference simplex does not contain at least one point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if there is a dimension mismatch in the reference simplex.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 153,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 54)",
        "(line 158,col 9)-(line 158,col 48)",
        "(line 161,col 9)-(line 162,col 89)",
        "(line 163,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 177,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex.evaluateNewSimplex(org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optim.PointValuePair[], double, java.util.Comparator\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 193,
      "end_line": 215,
      "comment": "\n     * Compute and evaluate a new simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param original Original simplex (to be preserved).\n     * @param coeff Linear coefficient.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to poorest.\n     * @return the best point in the transformed simplex.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 61)",
        "(line 200,col 9)-(line 200,col 33)",
        "(line 201,col 9)-(line 201,col 39)",
        "(line 202,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 212,col 49)",
        "(line 214,col 9)-(line 214,col 27)"
      ]
    }
  ]
}