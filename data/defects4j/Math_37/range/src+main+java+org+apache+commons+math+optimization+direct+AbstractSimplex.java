{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/optimization/direct/AbstractSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSimplex",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 345,
      "comment": "\n * This class implements the simplex concept.\n * It is intended to be used in conjunction with {@link SimplexOptimizer}.\n * \u003cbr/\u003e\n * The initial configuration of the simplex is set by the constructors\n * {@link #AbstractSimplex(double[])} or {@link #AbstractSimplex(double[][])}.\n * The other {@link #AbstractSimplex(int) constructor} will set all steps\n * to 1, thus building a default configuration from a unit hypercube.\n * \u003cbr/\u003e\n * Users \u003cem\u003emust\u003c/em\u003e call the {@link #build(double[]) build} method in order\n * to create the data structure that will be acted on by the other methods of\n * this class.\n *\n * @see SimplexOptimizer\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Simplex dimension (must be equal to {@code simplex.length - 1}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.AbstractSimplex(int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Build a unit hypercube simplex.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.AbstractSimplex(int, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Build a hypercube simplex with the given side length.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the hypercube.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.AbstractSimplex(double[])",
      "begin_line": 96,
      "end_line": 117,
      "comment": "\n     * The start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\n     * As an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\n     *\n     * @param steps Steps along the canonical axes representing box edges. They\n     * may be negative but not zero.\n     * @throws NullArgumentException if {@code steps} is {@code null}.\n     * @throws ZeroException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 107,col 9)-(line 107,col 62)",
        "(line 108,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.AbstractSimplex(double[][])",
      "begin_line": 131,
      "end_line": 174,
      "comment": "\n     * The real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\n     *\n     * @param referenceSimplex Reference simplex.\n     * @throws NotStrictlyPositiveException if the reference simplex does not\n     * contain at least one point.\n     * @throws DimensionMismatchException if there is a dimension mismatch\n     * in the reference simplex.\n     * @throws IllegalArgumentException if one of its vertices is duplicated.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 48)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 50)",
        "(line 144,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.getDimension()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Get simplex dimension.\n     *\n     * @return the dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.getSize()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Get simplex size.\n     * After calling the {@link #build(double[]) build} method, this method will\n     * will be equivalent to {@code getDimension() + 1}.\n     *\n     * @return the size of the simplex.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.iterate(org.apache.commons.math.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 205,
      "end_line": 206,
      "comment": "\n     * Compute the next simplex of the algorithm.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to worst.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.build(double[])",
      "begin_line": 215,
      "end_line": 233,
      "comment": "\n     * Build an initial simplex.\n     *\n     * @param startPoint First point of the simplex.\n     * @throws DimensionMismatchException if the start point does not match\n     * simplex dimension.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 222,col 68)",
        "(line 225,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.evaluate(org.apache.commons.math.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "\n     * Evaluate all the non-evaluated points of the simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param comparator Comparator to use to sort simplex vertices from best to worst.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.replaceWorstPoint(org.apache.commons.math.optimization.RealPointValuePair, java.util.Comparator\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 265,
      "end_line": 275,
      "comment": "\n     * Replace the worst point of the simplex by a new point.\n     *\n     * @param pointValuePair Point to insert.\n     * @param comparator Comparator to use for sorting the simplex vertices\n     * from best to worst.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.getPoints()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\n     * Get the points of the simplex.\n     *\n     * @return all the simplex points.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 81)",
        "(line 284,col 9)-(line 284,col 62)",
        "(line 285,col 9)-(line 285,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.getPoint(int)",
      "begin_line": 294,
      "end_line": 300,
      "comment": "\n     * Get the simplex point stored at the requested {@code index}.\n     *\n     * @param index Location.\n     * @return the point at location {@code index}.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.setPoint(int, org.apache.commons.math.optimization.RealPointValuePair)",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\n     * Store a new point at location {@code index}.\n     * Note that no deep-copy of {@code point} is performed.\n     *\n     * @param index Location.\n     * @param point New value.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.setPoints(org.apache.commons.math.optimization.RealPointValuePair[])",
      "begin_line": 323,
      "end_line": 328,
      "comment": "\n     * Replace all points.\n     * Note that no deep-copy of {@code points} is performed.\n     *\n     * @param points New Points.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.AbstractSimplex.createHypercubeSteps(int, double)",
      "begin_line": 337,
      "end_line": 344,
      "comment": "\n     * Create steps for a unit hypercube.\n     *\n     * @param n Dimension of the hypercube.\n     * @param sideLength Length of the sides of the hypercube.\n     * @return the steps.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 45)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 21)"
      ]
    }
  ]
}