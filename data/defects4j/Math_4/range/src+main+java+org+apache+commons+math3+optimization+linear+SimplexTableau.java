{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 635,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "NEGATIVE_VAR_COLUMN_LABEL"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Column label for negative vars. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "CUTOFF_THRESHOLD"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The cut-off threshold to zero-out entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Amount of error to accept when checking for optimality. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean, double)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean, double, int)",
      "begin_line": 134,
      "end_line": 152,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)",
        "(line 140,col 9)-(line 140,col 72)",
        "(line 141,col 9)-(line 141,col 60)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 145,col 70)",
        "(line 146,col 9)-(line 147,col 80)",
        "(line 148,col 9)-(line 149,col 80)",
        "(line 150,col 9)-(line 150,col 68)",
        "(line 151,col 9)-(line 151,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 157,
      "end_line": 175,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 158,col 7)-(line 160,col 7)",
        "(line 161,col 7)-(line 161,col 28)",
        "(line 162,col 7)-(line 164,col 7)",
        "(line 165,col 7)-(line 167,col 7)",
        "(line 168,col 7)-(line 170,col 7)",
        "(line 171,col 7)-(line 173,col 7)",
        "(line 174,col 7)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 182,
      "end_line": 243,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 186,col 64)",
        "(line 187,col 9)-(line 187,col 69)",
        "(line 188,col 9)-(line 188,col 78)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 63)",
        "(line 195,col 9)-(line 195,col 59)",
        "(line 196,col 9)-(line 197,col 81)",
        "(line 198,col 9)-(line 198,col 80)",
        "(line 199,col 9)-(line 200,col 71)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 25)",
        "(line 209,col 9)-(line 209,col 30)",
        "(line 210,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e)",
      "begin_line": 250,
      "end_line": 256,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 78)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalize(org.apache.commons.math3.optimization.linear.LinearConstraint)",
      "begin_line": 263,
      "end_line": 271,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 270,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math3.optimization.linear.Relationship)",
      "begin_line": 286,
      "end_line": 294,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 22)",
        "(line 288,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 301,
      "end_line": 307,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 23)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 314,
      "end_line": 325,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 27)",
        "(line 316,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 331,
      "end_line": 373,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 60)",
        "(line 337,col 9)-(line 337,col 29)",
        "(line 340,col 9)-(line 345,col 9)",
        "(line 348,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 91)",
        "(line 356,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 366,col 82)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 56)",
        "(line 372,col 9)-(line 372,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal()",
      "begin_line": 387,
      "end_line": 395,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 401,
      "end_line": 432,
      "comment": "\n     * Get the current solution.\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 402,col 7)-(line 402,col 78)",
        "(line 403,col 7)-(line 403,col 98)",
        "(line 404,col 7)-(line 404,col 108)",
        "(line 406,col 7)-(line 406,col 54)",
        "(line 407,col 7)-(line 407,col 76)",
        "(line 408,col 7)-(line 430,col 7)",
        "(line 431,col 7)-(line 431,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 443,
      "end_line": 447,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 459,
      "end_line": 469,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n     * Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 503,
      "end_line": 506,
      "comment": "\n     * Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent\n     * the absolute value of the most negative variable.\n     *\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getData()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 578,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 581,col 7)-(line 583,col 7)",
        "(line 585,col 7)-(line 596,col 7)",
        "(line 597,col 7)-(line 597,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 600,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 610,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 618,
      "end_line": 622,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 33)",
        "(line 621,col 9)-(line 621,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 630,
      "end_line": 634,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 32)",
        "(line 633,col 9)-(line 633,col 64)"
      ]
    }
  ]
}