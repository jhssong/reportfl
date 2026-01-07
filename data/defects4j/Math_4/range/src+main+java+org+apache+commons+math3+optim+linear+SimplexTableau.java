{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 656,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_VAR_COLUMN_LABEL"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Column label for negative vars. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Amount of error to accept when checking for optimality. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "field",
      "varNames": [
        "cutOff"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Cut-off value for entries in the tableau. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optim.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, boolean, double)",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Builds a tableau for a linear problem.\n     *\n     * @param f Linear objective function.\n     * @param constraints Linear constraints.\n     * @param goalType Optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}.\n     * @param restrictToNonNegative Whether to restrict the variables to non-negative values.\n     * @param epsilon Amount of error to accept when checking for optimality.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optim.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, boolean, double, int)",
      "begin_line": 133,
      "end_line": 140,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 111)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optim.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, boolean, double, int, double)",
      "begin_line": 152,
      "end_line": 173,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     * @param cutOff the cut-off value for tableau entries\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 160,col 72)",
        "(line 161,col 9)-(line 161,col 60)",
        "(line 162,col 9)-(line 162,col 46)",
        "(line 163,col 9)-(line 163,col 46)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 166,col 70)",
        "(line 167,col 9)-(line 168,col 80)",
        "(line 169,col 9)-(line 170,col 80)",
        "(line 171,col 9)-(line 171,col 68)",
        "(line 172,col 9)-(line 172,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 178,
      "end_line": 196,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 179,col 7)-(line 181,col 7)",
        "(line 182,col 7)-(line 182,col 28)",
        "(line 183,col 7)-(line 185,col 7)",
        "(line 186,col 7)-(line 188,col 7)",
        "(line 189,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 194,col 7)",
        "(line 195,col 7)-(line 195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 203,
      "end_line": 264,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 207,col 64)",
        "(line 208,col 9)-(line 208,col 69)",
        "(line 209,col 9)-(line 209,col 78)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 63)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 218,col 81)",
        "(line 219,col 9)-(line 219,col 80)",
        "(line 220,col 9)-(line 221,col 71)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 30)",
        "(line 231,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e)",
      "begin_line": 271,
      "end_line": 277,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 78)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.normalize(org.apache.commons.math3.optim.linear.LinearConstraint)",
      "begin_line": 284,
      "end_line": 292,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 291,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math3.optim.linear.Relationship)",
      "begin_line": 307,
      "end_line": 315,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 22)",
        "(line 309,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 23)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 335,
      "end_line": 346,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 352,
      "end_line": 394,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 60)",
        "(line 358,col 9)-(line 358,col 29)",
        "(line 361,col 9)-(line 366,col 9)",
        "(line 369,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 91)",
        "(line 377,col 9)-(line 384,col 9)",
        "(line 387,col 9)-(line 387,col 82)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 56)",
        "(line 393,col 9)-(line 393,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.isOptimal()",
      "begin_line": 408,
      "end_line": 416,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getSolution()",
      "begin_line": 422,
      "end_line": 453,
      "comment": "\n     * Get the current solution.\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 80)",
        "(line 424,col 9)-(line 424,col 100)",
        "(line 425,col 9)-(line 425,col 110)",
        "(line 427,col 9)-(line 427,col 56)",
        "(line 428,col 9)-(line 428,col 78)",
        "(line 429,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 464,
      "end_line": 468,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 480,
      "end_line": 490,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getWidth()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getHeight()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 524,
      "end_line": 527,
      "comment": "\n     * Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent\n     * the absolute value of the most negative variable.\n     *\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getData()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 599,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 604,col 7)",
        "(line 606,col 7)-(line 617,col 7)",
        "(line 618,col 7)-(line 618,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.hashCode()",
      "begin_line": 621,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 631,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 639,
      "end_line": 643,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 33)",
        "(line 642,col 9)-(line 642,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 651,
      "end_line": 655,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 32)",
        "(line 654,col 9)-(line 654,col 64)"
      ]
    }
  ]
}