{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 491,
      "comment": "\n * A tableau for use in the Simplex method.\n * \n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean, double)",
      "begin_line": 95,
      "end_line": 110,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 40)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 101,col 9)-(line 101,col 60)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 90)",
        "(line 104,col 9)-(line 105,col 80)",
        "(line 106,col 9)-(line 107,col 80)",
        "(line 108,col 9)-(line 108,col 88)",
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 117,
      "end_line": 178,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 72)",
        "(line 121,col 9)-(line 122,col 64)",
        "(line 123,col 9)-(line 123,col 69)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 131,col 51)",
        "(line 132,col 9)-(line 133,col 81)",
        "(line 134,col 13)-(line 134,col 99)",
        "(line 135,col 13)-(line 136,col 74)",
        "(line 138,col 17)-(line 141,col 17)",
        "(line 144,col 17)-(line 144,col 33)",
        "(line 145,col 17)-(line 145,col 38)",
        "(line 146,col 17)-(line 175,col 17)",
        "(line 177,col 17)-(line 177,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " Get the number of variables.\n     * @return number of variables\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints()",
      "begin_line": 191,
      "end_line": 197,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 78)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalize(org.apache.commons.math.optimization.linear.LinearConstraint)",
      "begin_line": 204,
      "end_line": 212,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 211,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)",
      "begin_line": 227,
      "end_line": 235,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 22)",
        "(line 229,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.initialize()",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\n     * Puts the tableau in proper form by zeroing out the artificial variables\n     * in the objective function via elementary row operations.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(org.apache.commons.math.linear.RealVector)",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 23)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 266,
      "end_line": 278,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.discardArtificialVariables()",
      "begin_line": 283,
      "end_line": 298,
      "comment": "\n     * Removes the phase 1 objective function and artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 60)",
        "(line 288,col 9)-(line 288,col 37)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 50)",
        "(line 297,col 9)-(line 297,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(double[], double[], int)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     * @param destPos the destination position\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 318,
      "end_line": 326,
      "comment": "\n     * Get the current solution.\n     * \u003cp\u003e\n     * {@link #solve} should be called first for this to be the optimal solution.\n     * \u003c/p\u003e\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 78)",
        "(line 320,col 9)-(line 320,col 90)",
        "(line 321,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getDecisionVariableValue(int)",
      "begin_line": 336,
      "end_line": 350,
      "comment": "\n     * Get the value of the given decision variable.  This is not the actual\n     * value as it is guaranteed to be \u003e\u003d 0 and thus must be corrected before\n     * being returned to the user.\n     * \n     * @param decisionVariable The index of the decision variable\n     * @return The value of the given decision variable.\n     ",
      "child_ranges": [
        "(line 337,col 7)-(line 337,col 62)",
        "(line 338,col 7)-(line 338,col 42)",
        "(line 339,col 7)-(line 341,col 7)",
        "(line 344,col 7)-(line 348,col 7)",
        "(line 349,col 7)-(line 349,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 361,
      "end_line": 365,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 377,
      "end_line": 383,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 406,
      "end_line": 408,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 415,
      "end_line": 418,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getData()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 33)"
      ]
    }
  ]
}