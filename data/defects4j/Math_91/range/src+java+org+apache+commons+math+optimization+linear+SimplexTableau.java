{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 484,
      "comment": "\n * A tableau for use in the Simplex method.\n * \n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean)",
      "begin_line": 90,
      "end_line": 103,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 50)",
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 90)",
        "(line 97,col 9)-(line 98,col 80)",
        "(line 99,col 9)-(line 100,col 80)",
        "(line 101,col 9)-(line 101,col 88)",
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 110,
      "end_line": 171,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 72)",
        "(line 114,col 9)-(line 115,col 64)",
        "(line 116,col 9)-(line 116,col 69)",
        "(line 117,col 9)-(line 117,col 54)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 124,col 51)",
        "(line 125,col 9)-(line 126,col 81)",
        "(line 127,col 13)-(line 127,col 99)",
        "(line 128,col 13)-(line 129,col 74)",
        "(line 131,col 17)-(line 134,col 17)",
        "(line 137,col 17)-(line 137,col 33)",
        "(line 138,col 17)-(line 138,col 38)",
        "(line 139,col 17)-(line 168,col 17)",
        "(line 170,col 17)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables()",
      "begin_line": 176,
      "end_line": 178,
      "comment": " Get the number of variables.\n     * @return number of variables\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints()",
      "begin_line": 184,
      "end_line": 190,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 78)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalize(org.apache.commons.math.optimization.linear.LinearConstraint)",
      "begin_line": 197,
      "end_line": 205,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 204,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 22)",
        "(line 222,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.initialize()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\n     * Puts the tableau in proper form by zeroing out the artificial variables\n     * in the objective function via elementary row operations.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 23)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 259,
      "end_line": 271,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 27)",
        "(line 261,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables()",
      "begin_line": 276,
      "end_line": 291,
      "comment": "\n     * Removes the phase 1 objective function and artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 60)",
        "(line 281,col 9)-(line 281,col 37)",
        "(line 282,col 9)-(line 282,col 54)",
        "(line 283,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 50)",
        "(line 290,col 9)-(line 290,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(double[], double[], int)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     * @param destPos the destination position\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 311,
      "end_line": 319,
      "comment": "\n     * Get the current solution.\n     * \u003cp\u003e\n     * {@link #solve} should be called first for this to be the optimal solution.\n     * \u003c/p\u003e\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 78)",
        "(line 313,col 9)-(line 313,col 90)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getDecisionVariableValue(int)",
      "begin_line": 329,
      "end_line": 343,
      "comment": "\n     * Get the value of the given decision variable.  This is not the actual\n     * value as it is guaranteed to be \u003e\u003d 0 and thus must be corrected before\n     * being returned to the user.\n     * \n     * @param decisionVariable The index of the decision variable\n     * @return The value of the given decision variable.\n     ",
      "child_ranges": [
        "(line 330,col 7)-(line 330,col 62)",
        "(line 331,col 7)-(line 331,col 42)",
        "(line 332,col 7)-(line 334,col 7)",
        "(line 337,col 7)-(line 341,col 7)",
        "(line 342,col 7)-(line 342,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 370,
      "end_line": 376,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 399,
      "end_line": 401,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 408,
      "end_line": 411,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getData()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 33)"
      ]
    }
  ]
}