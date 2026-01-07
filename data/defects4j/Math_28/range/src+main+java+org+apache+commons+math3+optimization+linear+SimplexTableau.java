{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexTableau.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexTableau",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 636,
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
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 85)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.SimplexTableau(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean, double, int)",
      "begin_line": 135,
      "end_line": 153,
      "comment": "\n     * Build a tableau for a linear problem.\n     * @param f linear objective function\n     * @param constraints linear constraints\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param restrictToNonNegative whether to restrict the variables to non-negative values\n     * @param epsilon amount of error to accept when checking for optimality\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 40)",
        "(line 141,col 9)-(line 141,col 72)",
        "(line 142,col 9)-(line 142,col 60)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 148,col 80)",
        "(line 149,col 9)-(line 150,col 80)",
        "(line 151,col 9)-(line 151,col 68)",
        "(line 152,col 9)-(line 152,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.initializeColumnLabels()",
      "begin_line": 158,
      "end_line": 176,
      "comment": "\n     * Initialize the labels for the columns.\n     ",
      "child_ranges": [
        "(line 159,col 7)-(line 161,col 7)",
        "(line 162,col 7)-(line 162,col 28)",
        "(line 163,col 7)-(line 165,col 7)",
        "(line 166,col 7)-(line 168,col 7)",
        "(line 169,col 7)-(line 171,col 7)",
        "(line 172,col 7)-(line 174,col 7)",
        "(line 175,col 7)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.createTableau(boolean)",
      "begin_line": 183,
      "end_line": 244,
      "comment": "\n     * Create the tableau by itself.\n     * @param maximize if true, goal is to maximize the objective function\n     * @return created tableau\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 187,col 64)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 189,col 78)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 63)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 198,col 81)",
        "(line 199,col 9)-(line 199,col 80)",
        "(line 200,col 9)-(line 201,col 71)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 209,col 25)",
        "(line 210,col 9)-(line 210,col 30)",
        "(line 211,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalizeConstraints(java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e)",
      "begin_line": 251,
      "end_line": 257,
      "comment": "\n     * Get new versions of the constraints which have positive right hand sides.\n     * @param originalConstraints original (not normalized) constraints\n     * @return new versions of the constraints\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 78)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.normalize(org.apache.commons.math3.optimization.linear.LinearConstraint)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\n     * Get a new equation equivalent to this one with a positive right hand side.\n     * @param constraint reference constraint\n     * @return new equation\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 271,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumObjectiveFunctions()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Get the number of objective functions in this tableau.\n     * @return 2 for Phase 1.  1 for Phase 2.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getConstraintTypeCounts(org.apache.commons.math3.optimization.linear.Relationship)",
      "begin_line": 287,
      "end_line": 295,
      "comment": "\n     * Get a count of constraints corresponding to a specified relationship.\n     * @param relationship relationship to count\n     * @return number of constraint with the specified relationship\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 22)",
        "(line 289,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 302,
      "end_line": 308,
      "comment": "\n     * Get the -1 times the sum of all coefficients in the given array.\n     * @param coefficients coefficients to sum\n     * @return the -1 times the sum of all coefficients in the given array.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 23)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getBasicRow(int)",
      "begin_line": 315,
      "end_line": 326,
      "comment": "\n     * Checks whether the given column is basic.\n     * @param col index of the column to check\n     * @return the row that the variable is basic in.  null if the column is not basic\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.dropPhase1Objective()",
      "begin_line": 332,
      "end_line": 374,
      "comment": "\n     * Removes the phase 1 objective function, positive cost non-artificial variables,\n     * and the non-basic artificial variables from this tableau.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 60)",
        "(line 338,col 9)-(line 338,col 29)",
        "(line 341,col 9)-(line 346,col 9)",
        "(line 349,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 91)",
        "(line 357,col 9)-(line 364,col 9)",
        "(line 367,col 9)-(line 367,col 82)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 56)",
        "(line 373,col 9)-(line 373,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.copyArray(double[], double[])",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * @param src the source array\n     * @param dest the destination array\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal()",
      "begin_line": 388,
      "end_line": 396,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getSolution()",
      "begin_line": 403,
      "end_line": 434,
      "comment": "\n     * Get the current solution.\n     *\n     * @return current solution\n     ",
      "child_ranges": [
        "(line 404,col 7)-(line 404,col 78)",
        "(line 405,col 7)-(line 405,col 98)",
        "(line 406,col 7)-(line 406,col 108)",
        "(line 408,col 7)-(line 408,col 54)",
        "(line 409,col 7)-(line 409,col 76)",
        "(line 410,col 7)-(line 432,col 7)",
        "(line 433,col 7)-(line 433,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.divideRow(int, double)",
      "begin_line": 445,
      "end_line": 449,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param dividendRow index of the row\n     * @param divisor value of the divisor\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.subtractRow(int, int, double)",
      "begin_line": 461,
      "end_line": 471,
      "comment": "\n     * Subtracts a multiple of one row from another.\n     * \u003cp\u003e\n     * After application of this operation, the following will hold:\n     *   minuendRow \u003d minuendRow - multiple * subtrahendRow\n     * \u003c/p\u003e\n     * @param minuendRow row index\n     * @param subtrahendRow row index\n     * @param multiple multiplication factor\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Get the width of the tableau.\n     * @return width of the tableau\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getHeight()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Get the height of the tableau.\n     * @return height of the tableau\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(int, int)",
      "begin_line": 494,
      "end_line": 496,
      "comment": " Get an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @return entry at (row, column)\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.setEntry(int, int, double)",
      "begin_line": 503,
      "end_line": 506,
      "comment": " Set an entry of the tableau.\n     * @param row row index\n     * @param column column index\n     * @param value for the entry\n     ",
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
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n     * Get the number of decision variables.\n     * \u003cp\u003e\n     * If variables are not restricted to positive values, this will include 1\n     * extra decision variable to represent the absolute value of the most\n     * negative variable.\n     * \u003c/p\u003e\n     * @return number of decision variables\n     * @see #getOriginalNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getOriginalNumDecisionVariables()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n     * Get the original number of decision variables.\n     * @return original number of decision variables\n     * @see #getNumDecisionVariables()\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumSlackVariables()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Get the number of slack variables.\n     * @return number of slack variables\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getNumArtificialVariables()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Get the number of artificial variables.\n     * @return number of artificial variables\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.getData()",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Get the tableau data.\n     * @return tableau data\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.equals(java.lang.Object)",
      "begin_line": 580,
      "end_line": 600,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 7)-(line 585,col 7)",
        "(line 587,col 7)-(line 598,col 7)",
        "(line 599,col 7)-(line 599,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.hashCode()",
      "begin_line": 603,
      "end_line": 614,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 613,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 620,
      "end_line": 624,
      "comment": " Serialize the instance.\n     * @param oos stream where object should be written\n     * @throws IOException if object cannot be written to stream\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 33)",
        "(line 623,col 9)-(line 623,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexTableau.readObject(java.io.ObjectInputStream)",
      "begin_line": 631,
      "end_line": 635,
      "comment": " Deserialize the instance.\n     * @param ois stream from which the object should be read\n     * @throws ClassNotFoundException if a class in the stream cannot be found\n     * @throws IOException if object cannot be read from the stream\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 32)",
        "(line 634,col 9)-(line 634,col 64)"
      ]
    }
  ]
}