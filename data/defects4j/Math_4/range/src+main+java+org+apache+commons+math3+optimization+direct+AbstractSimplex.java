{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/AbstractSimplex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractSimplex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.OptimizationData"
      ],
      "begin_line": 52,
      "end_line": 348,
      "comment": "\n * This class implements the simplex concept.\n * It is intended to be used in conjunction with {@link SimplexOptimizer}.\n * \u003cbr/\u003e\n * The initial configuration of the simplex is set by the constructors\n * {@link #AbstractSimplex(double[])} or {@link #AbstractSimplex(double[][])}.\n * The other {@link #AbstractSimplex(int) constructor} will set all steps\n * to 1, thus building a default configuration from a unit hypercube.\n * \u003cbr/\u003e\n * Users \u003cem\u003emust\u003c/em\u003e call the {@link #build(double[]) build} method in order\n * to create the data structure that will be acted on by the other methods of\n * this class.\n *\n * @see SimplexOptimizer\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "simplex"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Simplex. "
    },
    {
      "type": "field",
      "varNames": [
        "startConfiguration"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Start simplex configuration. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Simplex dimension (must be equal to {@code simplex.length - 1}). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.AbstractSimplex(int)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Build a unit hypercube simplex.\n     *\n     * @param n Dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.AbstractSimplex(int, double)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Build a hypercube simplex with the given side length.\n     *\n     * @param n Dimension of the simplex.\n     * @param sideLength Length of the sides of the hypercube.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.AbstractSimplex(double[])",
      "begin_line": 99,
      "end_line": 120,
      "comment": "\n     * The start configuration for simplex is built from a box parallel to\n     * the canonical axes of the space. The simplex is the subset of vertices\n     * of a box parallel to the canonical axes. It is built as the path followed\n     * while traveling from one vertex of the box to the diagonally opposite\n     * vertex moving only along the box edges. The first vertex of the box will\n     * be located at the start point of the optimization.\n     * As an example, in dimension 3 a simplex has 4 vertices. Setting the\n     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the\n     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.\n     * The first vertex would be set to the start point at (1, 1, 1) and the\n     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).\n     *\n     * @param steps Steps along the canonical axes representing box edges. They\n     * may be negative but not zero.\n     * @throws NullArgumentException if {@code steps} is {@code null}.\n     * @throws ZeroException if one of the steps is zero.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 110,col 9)-(line 110,col 62)",
        "(line 111,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.AbstractSimplex(double[][])",
      "begin_line": 134,
      "end_line": 177,
      "comment": "\n     * The real initial simplex will be set up by moving the reference\n     * simplex such that its first point is located at the start point of the\n     * optimization.\n     *\n     * @param referenceSimplex Reference simplex.\n     * @throws NotStrictlyPositiveException if the reference simplex does not\n     * contain at least one point.\n     * @throws DimensionMismatchException if there is a dimension mismatch\n     * in the reference simplex.\n     * @throws IllegalArgumentException if one of its vertices is duplicated.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 143,col 9)-(line 143,col 62)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 147,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.getDimension()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Get simplex dimension.\n     *\n     * @return the dimension of the simplex.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.getSize()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Get simplex size.\n     * After calling the {@link #build(double[]) build} method, this method will\n     * will be equivalent to {@code getDimension() + 1}.\n     *\n     * @return the size of the simplex.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.iterate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 208,
      "end_line": 209,
      "comment": "\n     * Compute the next simplex of the algorithm.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param comparator Comparator to use to sort simplex vertices from best\n     * to worst.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.build(double[])",
      "begin_line": 218,
      "end_line": 236,
      "comment": "\n     * Build an initial simplex.\n     *\n     * @param startPoint First point of the simplex.\n     * @throws DimensionMismatchException if the start point does not match\n     * simplex dimension.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 225,col 64)",
        "(line 228,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.evaluate(org.apache.commons.math3.analysis.MultivariateFunction, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 246,
      "end_line": 259,
      "comment": "\n     * Evaluate all the non-evaluated points of the simplex.\n     *\n     * @param evaluationFunction Evaluation function.\n     * @param comparator Comparator to use to sort simplex vertices from best to worst.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 255,col 9)",
        "(line 258,col 9)-(line 258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.replaceWorstPoint(org.apache.commons.math3.optimization.PointValuePair, java.util.Comparator\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "\n     * Replace the worst point of the simplex by a new point.\n     *\n     * @param pointValuePair Point to insert.\n     * @param comparator Comparator to use for sorting the simplex vertices\n     * from best to worst.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.getPoints()",
      "begin_line": 285,
      "end_line": 289,
      "comment": "\n     * Get the points of the simplex.\n     *\n     * @return all the simplex points.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 73)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.getPoint(int)",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\n     * Get the simplex point stored at the requested {@code index}.\n     *\n     * @param index Location.\n     * @return the point at location {@code index}.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.setPoint(int, org.apache.commons.math3.optimization.PointValuePair)",
      "begin_line": 312,
      "end_line": 318,
      "comment": "\n     * Store a new point at location {@code index}.\n     * Note that no deep-copy of {@code point} is performed.\n     *\n     * @param index Location.\n     * @param point New value.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.setPoints(org.apache.commons.math3.optimization.PointValuePair[])",
      "begin_line": 326,
      "end_line": 331,
      "comment": "\n     * Replace all points.\n     * Note that no deep-copy of {@code points} is performed.\n     *\n     * @param points New Points.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.AbstractSimplex.createHypercubeSteps(int, double)",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * Create steps for a unit hypercube.\n     *\n     * @param n Dimension of the hypercube.\n     * @param sideLength Length of the sides of the hypercube.\n     * @return the steps.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 45)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 21)"
      ]
    }
  ]
}