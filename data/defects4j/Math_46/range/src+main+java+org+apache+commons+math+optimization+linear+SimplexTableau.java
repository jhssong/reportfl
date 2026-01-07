{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 618,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_VAR_COLUMN_LABEL"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Column label for negative vars. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Amount of error to accept when checking for optimality. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean, double)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean, double, int)",
      "begin_line": 130,
      "end_line": 148,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 72)",
        "(line 137,col 9)-(line 137,col 60)",
        "(line 138,col 9)-(line 138,col 46)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 141,col 70)",
        "(line 142,col 9)-(line 143,col 80)",
        "(line 144,col 9)-(line 145,col 80)",
        "(line 146,col 9)-(line 146,col 68)",
        "(line 147,col 9)-(line 147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 153,
      "end_line": 171,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 154,col 7)-(line 156,col 7)",
        "(line 157,col 7)-(line 157,col 28)",
        "(line 158,col 7)-(line 160,col 7)",
        "(line 161,col 7)-(line 163,col 7)",
        "(line 164,col 7)-(line 166,col 7)",
        "(line 167,col 7)-(line 169,col 7)",
        "(line 170,col 7)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 178,
      "end_line": 239,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 182,col 64)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 184,col 78)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 63)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 192,col 9)-(line 193,col 81)",
        "(line 194,col 9)-(line 194,col 80)",
        "(line 195,col 9)-(line 196,col 71)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 204,col 9)-(line 204,col 25)",
        "(line 205,col 9)-(line 205,col 30)",
        "(line 206,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 78)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.normalize(org.apache.commons.math.optimization.linear.LinearConstraint)",
      "begin_line": 259,
      "end_line": 267,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 266,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship)",
      "begin_line": 282,
      "end_line": 290,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 22)",
        "(line 284,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math.linear.RealVector)",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 23)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 310,
      "end_line": 321,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 27)",
        "(line 312,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 327,
      "end_line": 367,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 63)",
        "(line 333,col 9)-(line 333,col 29)",
        "(line 336,col 9)-(line 341,col 9)",
        "(line 344,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 351,col 91)",
        "(line 352,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 56)",
        "(line 366,col 9)-(line 366,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.isOptimal()",
      "begin_line": 381,
      "end_line": 389,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 396,
      "end_line": 422,
      "comment": "\n     * Get the current solution.\n     *\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 397,col 7)-(line 397,col 78)",
        "(line 398,col 7)-(line 398,col 98)",
        "(line 399,col 7)-(line 399,col 108)",
        "(line 401,col 7)-(line 401,col 54)",
        "(line 402,col 7)-(line 402,col 76)",
        "(line 403,col 7)-(line 420,col 7)",
        "(line 421,col 7)-(line 421,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 433,
      "end_line": 437,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 449,
      "end_line": 453,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 452,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 476,
      "end_line": 478,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 485,
      "end_line": 488,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.getData()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 562,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 565,col 7)-(line 567,col 7)",
        "(line 569,col 7)-(line 580,col 7)",
        "(line 581,col 7)-(line 581,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 585,
      "end_line": 596,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 587,col 9)-(line 595,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 602,
      "end_line": 606,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 33)",
        "(line 605,col 9)-(line 605,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 613,
      "end_line": 617,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 32)",
        "(line 616,col 9)-(line 616,col 64)"
      ]
    }
  ]
}