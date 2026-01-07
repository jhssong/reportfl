{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 634,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_VAR_COLUMN_LABEL"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Column label for negative vars. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "CUTOFF_THRESHOLD"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The cut-off threshold to zero-out entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Amount of error to accept when checking for optimality. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean, double)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean, double, int)",
      "begin_line": 133,
      "end_line": 151,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 40)",
        "(line 139,col 9)-(line 139,col 72)",
        "(line 140,col 9)-(line 140,col 60)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 146,col 80)",
        "(line 147,col 9)-(line 148,col 80)",
        "(line 149,col 9)-(line 149,col 68)",
        "(line 150,col 9)-(line 150,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 156,
      "end_line": 174,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 157,col 7)-(line 159,col 7)",
        "(line 160,col 7)-(line 160,col 28)",
        "(line 161,col 7)-(line 163,col 7)",
        "(line 164,col 7)-(line 166,col 7)",
        "(line 167,col 7)-(line 169,col 7)",
        "(line 170,col 7)-(line 172,col 7)",
        "(line 173,col 7)-(line 173,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 181,
      "end_line": 242,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 185,col 64)",
        "(line 186,col 9)-(line 186,col 69)",
        "(line 187,col 9)-(line 187,col 78)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 63)",
        "(line 194,col 9)-(line 194,col 59)",
        "(line 195,col 9)-(line 196,col 81)",
        "(line 197,col 9)-(line 197,col 80)",
        "(line 198,col 9)-(line 199,col 71)",
        "(line 201,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 207,col 25)",
        "(line 208,col 9)-(line 208,col 30)",
        "(line 209,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e)",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 78)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalize(org.apache.commons.math3.optimization.linear.LinearConstraint)",
      "begin_line": 262,
      "end_line": 270,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 269,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math3.optimization.linear.Relationship)",
      "begin_line": 285,
      "end_line": 293,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 22)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 300,
      "end_line": 306,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 23)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 313,
      "end_line": 324,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 27)",
        "(line 315,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 330,
      "end_line": 372,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 29)",
        "(line 339,col 9)-(line 344,col 9)",
        "(line 347,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 91)",
        "(line 355,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 82)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 56)",
        "(line 371,col 9)-(line 371,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal()",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 400,
      "end_line": 431,
      "comment": "\n     * Get the current solution.\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 78)",
        "(line 402,col 7)-(line 402,col 98)",
        "(line 403,col 7)-(line 403,col 108)",
        "(line 405,col 7)-(line 405,col 54)",
        "(line 406,col 7)-(line 406,col 76)",
        "(line 407,col 7)-(line 429,col 7)",
        "(line 430,col 7)-(line 430,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 442,
      "end_line": 446,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 458,
      "end_line": 468,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 502,
      "end_line": 505,
      "comment": "\n     * Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent\n     * the absolute value of the most negative variable.\n     *\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getData()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 577,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 580,col 7)-(line 582,col 7)",
        "(line 584,col 7)-(line 595,col 7)",
        "(line 596,col 7)-(line 596,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 599,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 609,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 617,
      "end_line": 621,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 33)",
        "(line 620,col 9)-(line 620,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 629,
      "end_line": 633,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 32)",
        "(line 632,col 9)-(line 632,col 64)"
      ]
    }
  ]
}