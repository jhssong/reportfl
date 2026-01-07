{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/moment/SemiVariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UPSIDE_VARIANCE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The UPSIDE Direction is used to specify that the observations above the\n     * cutoff point will be used to calculate SemiVariance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOWNSIDE_VARIANCE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The DOWNSIDE Direction is used to specify that the observations below\n     * the cutoff point will be used to calculate SemiVariance\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "varianceDirection"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Determines whether to calculate downside or upside SemiVariance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance()",
      "begin_line": 85,
      "end_line": 86,
      "comment": "\n     * Constructs a SemiVariance with default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     *\n     * @param biasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eDirection\u003c/code\u003e property\n     * and default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e property\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the specified \u003ccode\u003eDirection\u003c/code\u003e property.\n     *\n     * @param corrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 39)",
        "(line 126,col 9)-(line 126,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Copy constructor, creates a new {@code SemiVariance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SemiVariance} instance to copy\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy(org.apache.commons.math.stat.descriptive.moment.SemiVariance, org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SemiVariance to copy\n     * @param dest SemiVariance to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 50)",
        "(line 162,col 9)-(line 162,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[])",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * This method calculates {@link SemiVariance} for the entire array against the mean, using\n     * instance properties varianceDirection and biasCorrection.\n     *\n     * @param values the input array\n     * @return the SemiVariance\n     * @throws IllegalArgumentException if values is null\n     *\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 10)",
        "(line 180,col 9)-(line 180,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], int, int)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the mean, using\n      * instance properties varianceDirection and biasCorrection.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 64)",
        "(line 201,col 9)-(line 201,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n       * This method calculates {@link SemiVariance} for the entire array against the mean, using\n       * the current value of the biasCorrection instance property.\n       *\n       * @param values the input array\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       *\n       ",
      "child_ranges": [
        "(line 216,col 11)-(line 216,col 51)",
        "(line 217,col 11)-(line 217,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff, using\n       * instance properties variancDirection and biasCorrection.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 233,col 11)-(line 233,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff in the\n       * given direction, using the current value of the biasCorrection instance property.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 250,col 11)-(line 250,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction, boolean, int, int)",
      "begin_line": 271,
      "end_line": 299,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff\n      * in the given direction with the provided bias correction.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param cutoff the reference point\n      * @param direction the {@link Direction} of the semivariance\n      * @param corrected the BiasCorrection flag\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 36)",
        "(line 275,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.isBiasCorrected()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns true iff biasCorrected property is set to true.\n     *\n     * @return the value of biasCorrected.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setBiasCorrected(boolean)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\n     * Sets the biasCorrected property.\n     *\n     * @param biasCorrected new biasCorrected property value\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.getVarianceDirection()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Returns the varianceDirection property.\n     *\n     * @return the varianceDirection\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setVarianceDirection(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * Sets the variance direction\n     *\n     * @param varianceDirection the direction of the semivariance\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\n         *   boolean value  UPSIDE \u003c-\u003e true\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.Direction(boolean)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n         * Create a Direction with the given value.\n         *\n         * @param b boolean value representing the Direction. True corresponds to UPSIDE.\n         ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.getDirection()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n         * Returns the value of this Direction. True corresponds to UPSIDE.\n         *\n         * @return true if direction is UPSIDE; false otherwise\n         ",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 29)"
      ]
    }
  ]
}