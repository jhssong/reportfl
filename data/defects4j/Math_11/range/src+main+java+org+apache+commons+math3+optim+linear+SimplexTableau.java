{
  "filepath": "/tmp/Math-11b/src/main/java/org/apache/commons/math3/optim/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 637,
      "comment": "\n * A tableau for use in the Simplex method.\n *\n * \u003cp\u003e\n * Example:\n * \u003cpre\u003e\n *   W |  Z |  x1 |  x2 |  x- | s1 |  s2 |  a1 |  RHS\n * ---------------------------------------------------\n *  -1    0    0     0     0     0     0     1     0   \u0026lt;\u003d phase 1 objective\n *   0    1   -15   -10    0     0     0     0     0   \u0026lt;\u003d phase 2 objective\n *   0    0    1     0     0     1     0     0     2   \u0026lt;\u003d constraint 1\n *   0    0    0     1     0     0     1     0     3   \u0026lt;\u003d constraint 2\n *   0    0    1     1     0     0     0     1     4   \u0026lt;\u003d constraint 3\n * \u003c/pre\u003e\n * W: Phase 1 objective function\u003c/br\u003e\n * Z: Phase 2 objective function\u003c/br\u003e\n * x1 \u0026amp; x2: Decision variables\u003c/br\u003e\n * x-: Extra decision variable to allow for negative values\u003c/br\u003e\n * s1 \u0026amp; s2: Slack/Surplus variables\u003c/br\u003e\n * a1: Artificial variable\u003c/br\u003e\n * RHS: Right hand side\u003c/br\u003e\n * \u003c/p\u003e\n * @version $Id: SimplexTableau.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
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
        "DEFAULT_ULPS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "CUTOFF_THRESHOLD"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The cut-off threshold to zero-out entries. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "columnLabels"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The variables each column represents "
    },
    {
      "type": "field",
      "varNames": [
        "tableau"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Simple tableau. "
    },
    {
      "type": "field",
      "varNames": [
        "numDecisionVariables"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Number of decision variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numSlackVariables"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Number of slack variables. "
    },
    {
      "type": "field",
      "varNames": [
        "numArtificialVariables"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Number of artificial variables. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Amount of error to accept when checking for optimality. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optim.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, boolean, double)",
      "begin_line": 118,
      "end_line": 124,
      "comment": "\n     * Builds a tableau for a linear problem.\n     *\n     * @param f Linear objective function.\n     * @param constraints Linear constraints.\n     * @param goalType Optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}.\n     * @param restrictToNonNegative Whether to restrict the variables to non-negative values.\n     * @param epsilon Amount of error to accept when checking for optimality.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optim.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, boolean, double, int)",
      "begin_line": 135,
      "end_line": 154,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 142,col 72)",
        "(line 143,col 9)-(line 143,col 60)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 46)",
        "(line 146,col 9)-(line 147,col 70)",
        "(line 148,col 9)-(line 149,col 80)",
        "(line 150,col 9)-(line 151,col 80)",
        "(line 152,col 9)-(line 152,col 68)",
        "(line 153,col 9)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 159,
      "end_line": 177,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 160,col 7)-(line 162,col 7)",
        "(line 163,col 7)-(line 163,col 28)",
        "(line 164,col 7)-(line 166,col 7)",
        "(line 167,col 7)-(line 169,col 7)",
        "(line 170,col 7)-(line 172,col 7)",
        "(line 173,col 7)-(line 175,col 7)",
        "(line 176,col 7)-(line 176,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 184,
      "end_line": 245,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 188,col 64)",
        "(line 189,col 9)-(line 189,col 69)",
        "(line 190,col 9)-(line 190,col 78)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 63)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 199,col 81)",
        "(line 200,col 9)-(line 200,col 80)",
        "(line 201,col 9)-(line 202,col 71)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 210,col 9)-(line 210,col 25)",
        "(line 211,col 9)-(line 211,col 30)",
        "(line 212,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math3.optim.linear.LinearConstraint\u003e)",
      "begin_line": 252,
      "end_line": 258,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 78)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.normalize(org.apache.commons.math3.optim.linear.LinearConstraint)",
      "begin_line": 265,
      "end_line": 273,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 272,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math3.optim.linear.Relationship)",
      "begin_line": 288,
      "end_line": 296,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 22)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 303,
      "end_line": 309,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 23)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 316,
      "end_line": 327,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 27)",
        "(line 318,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 333,
      "end_line": 375,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 60)",
        "(line 339,col 9)-(line 339,col 29)",
        "(line 342,col 9)-(line 347,col 9)",
        "(line 350,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 91)",
        "(line 358,col 9)-(line 365,col 9)",
        "(line 368,col 9)-(line 368,col 82)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 56)",
        "(line 374,col 9)-(line 374,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.isOptimal()",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getSolution()",
      "begin_line": 403,
      "end_line": 434,
      "comment": "\n     * Get the current solution.\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 80)",
        "(line 405,col 9)-(line 405,col 100)",
        "(line 406,col 9)-(line 406,col 110)",
        "(line 408,col 9)-(line 408,col 56)",
        "(line 409,col 9)-(line 409,col 78)",
        "(line 410,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 445,
      "end_line": 449,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 461,
      "end_line": 471,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     * \u003cpre\u003eminuendRow \u003d minuendRow - multiple * subtrahendRow\u003c/pre\u003e\n     *\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getWidth()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getHeight()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\n     * Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getSlackVariableOffset()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * Get the offset of the first slack variable.\n     * @return offset of the first slack variable\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getArtificialVariableOffset()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Get the offset of the first artificial variable.\n     * @return offset of the first artificial variable\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getRhsOffset()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Get the offset of the right hand side.\n     * @return offset of the right hand side\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumDecisionVariables()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1 extra decision variable to represent\n     * the absolute value of the most negative variable.\n     *\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.getData()",
      "begin_line": 576,
      "end_line": 578,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 580,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 583,col 7)-(line 585,col 7)",
        "(line 587,col 7)-(line 598,col 7)",
        "(line 599,col 7)-(line 599,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.hashCode()",
      "begin_line": 602,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 612,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 620,
      "end_line": 624,
      "comment": "\n     * Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 33)",
        "(line 623,col 9)-(line 623,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 632,
      "end_line": 636,
      "comment": "\n     * Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 32)",
        "(line 635,col 9)-(line 635,col 64)"
      ]
    }
  ]
}