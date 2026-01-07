{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/moment/SemiVariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 370,
      "comment": "\n * \u003cp\u003eComputes the semivariance of a set of values with respect to a given cutoff value.\n * We define the \u003ci\u003edownside semivariance\u003c/i\u003e of a set of values \u003ccode\u003ex\u003c/code\u003e\n * against the \u003ci\u003ecutoff value\u003c/i\u003e \u003ccode\u003ecutoff\u003c/code\u003e to be \u003cbr/\u003e\n * \u003ccode\u003e\u0026Sigma; (x[i] - target)\u003csup\u003e2\u003c/sup\u003e / df\u003c/code\u003e \u003cbr/\u003e\n * where the sum is taken over all \u003ccode\u003ei\u003c/code\u003e such that \u003ccode\u003ex[i] \u003c cutoff\u003c/code\u003e\n * and \u003ccode\u003edf\u003c/code\u003e is the length of \u003ccode\u003ex\u003c/code\u003e (non-bias-corrected) or\n * one less than this number (bias corrected).  The \u003ci\u003eupside semivariance\u003c/i\u003e\n * is defined similarly, with the sum taken over values of \u003ccode\u003ex\u003c/code\u003e that\n * exceed the cutoff value.\u003c/p\u003e\n *\n * \u003cp\u003eThe cutoff value defaults to the mean, bias correction defaults to \u003ccode\u003etrue\u003c/code\u003e\n * and the \"variance direction\" (upside or downside) defaults to downside.  The variance direction\n * and bias correction may be set using property setters or their values can provided as\n * parameters to {@link #evaluate(double[], double, Direction, boolean, int, int)}.\u003c/p\u003e\n *\n * \u003cp\u003eIf the input array is null, \u003ccode\u003eevaluate\u003c/code\u003e methods throw\n * \u003ccode\u003eIllegalArgumentException.\u003c/code\u003e  If the array has length 1, \u003ccode\u003e0\u003c/code\u003e\n * is returned, regardless of the value of the \u003ccode\u003ecutoff.\u003c/code\u003e\n *\n * \u003cp\u003e\u003cstrong\u003eNote that this class is not intended to be threadsafe.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and one or\n * more of these threads invoke property setters, external synchronization must\n * be provided to ensure correct results.\u003c/p\u003e\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "UPSIDE_VARIANCE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The UPSIDE Direction is used to specify that the observations above the\n     * cutoff point will be used to calculate SemiVariance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOWNSIDE_VARIANCE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The DOWNSIDE Direction is used to specify that the observations below\n     * the cutoff point will be used to calculate SemiVariance\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "varianceDirection"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Determines whether to calculate downside or upside SemiVariance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.SemiVariance()",
      "begin_line": 87,
      "end_line": 88,
      "comment": "\n     * Constructs a SemiVariance with default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.SemiVariance(boolean)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     *\n     * @param biasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eDirection\u003c/code\u003e property\n     * and default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e property\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.SemiVariance(boolean, org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the specified \u003ccode\u003eDirection\u003c/code\u003e property.\n     *\n     * @param corrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math3.stat.descriptive.moment.SemiVariance)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Copy constructor, creates a new {@code SemiVariance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SemiVariance} instance to copy\n     * @throws NullArgumentException  if original is null\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.copy()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 49)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.copy(org.apache.commons.math3.stat.descriptive.moment.SemiVariance, org.apache.commons.math3.stat.descriptive.moment.SemiVariance)",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SemiVariance to copy\n     * @param dest SemiVariance to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 39)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 168,col 9)-(line 168,col 42)",
        "(line 169,col 9)-(line 169,col 50)",
        "(line 170,col 9)-(line 170,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.evaluate(double[], int, int)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the mean, using\n      * instance properties varianceDirection and biasCorrection.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws MathIllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 64)",
        "(line 191,col 9)-(line 191,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.evaluate(double[], org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "\n       * This method calculates {@link SemiVariance} for the entire array against the mean, using\n       * the current value of the biasCorrection instance property.\n       *\n       * @param values the input array\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws MathIllegalArgumentException if values is null\n       *\n       ",
      "child_ranges": [
        "(line 207,col 11)-(line 207,col 51)",
        "(line 208,col 11)-(line 208,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.evaluate(double[], double)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff, using\n       * instance properties variancDirection and biasCorrection.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @return the SemiVariance\n       * @throws MathIllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 225,col 11)-(line 225,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff in the\n       * given direction, using the current value of the biasCorrection instance property.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws MathIllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 243,col 11)-(line 243,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction, boolean, int, int)",
      "begin_line": 264,
      "end_line": 292,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff\n      * in the given direction with the provided bias correction.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param cutoff the reference point\n      * @param direction the {@link Direction} of the semivariance\n      * @param corrected the BiasCorrection flag\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws MathIllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.isBiasCorrected()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Returns true iff biasCorrected property is set to true.\n     *\n     * @return the value of biasCorrected.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.setBiasCorrected(boolean)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Sets the biasCorrected property.\n     *\n     * @param biasCorrected new biasCorrected property value\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.getVarianceDirection()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Returns the varianceDirection property.\n     *\n     * @return the varianceDirection\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.setVarianceDirection(org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Sets the variance direction\n     *\n     * @param varianceDirection the direction of the semivariance\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n         *   boolean value  UPSIDE \u003c-\u003e true\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction.Direction(boolean)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n         * Create a Direction with the given value.\n         *\n         * @param b boolean value representing the Direction. True corresponds to UPSIDE.\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction.getDirection()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n         * Returns the value of this Direction. True corresponds to UPSIDE.\n         *\n         * @return true if direction is UPSIDE; false otherwise\n         ",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 29)"
      ]
    }
  ]
}