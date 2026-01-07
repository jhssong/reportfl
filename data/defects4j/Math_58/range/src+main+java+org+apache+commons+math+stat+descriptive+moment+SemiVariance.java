{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/stat/descriptive/moment/SemiVariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 379,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UPSIDE_VARIANCE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * The UPSIDE Direction is used to specify that the observations above the\n     * cutoff point will be used to calculate SemiVariance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOWNSIDE_VARIANCE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The DOWNSIDE Direction is used to specify that the observations below\n     * the cutoff point will be used to calculate SemiVariance\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "biasCorrected"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Determines whether or not bias correction is applied when computing the\n     * value of the statisic.  True means that bias is corrected.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "varianceDirection"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Determines whether to calculate downside or upside SemiVariance.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance()",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n     * Constructs a SemiVariance with default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     *\n     * @param biasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eDirection\u003c/code\u003e property\n     * and default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e property\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eisBiasCorrected\u003c/code\u003e\n     * property and the specified \u003ccode\u003eDirection\u003c/code\u003e property.\n     *\n     * @param corrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Copy constructor, creates a new {@code SemiVariance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SemiVariance} instance to copy\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy(org.apache.commons.math.stat.descriptive.moment.SemiVariance, org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SemiVariance to copy\n     * @param dest SemiVariance to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[])",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * This method calculates {@link SemiVariance} for the entire array against the mean, using\n     * instance properties varianceDirection and biasCorrection.\n     *\n     * @param values the input array\n     * @return the SemiVariance\n     * @throws IllegalArgumentException if values is null\n     *\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 10)",
        "(line 182,col 9)-(line 182,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], int, int)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the mean, using\n      * instance properties varianceDirection and biasCorrection.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 64)",
        "(line 203,col 9)-(line 203,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n       * This method calculates {@link SemiVariance} for the entire array against the mean, using\n       * the current value of the biasCorrection instance property.\n       *\n       * @param values the input array\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       *\n       ",
      "child_ranges": [
        "(line 218,col 11)-(line 218,col 51)",
        "(line 219,col 11)-(line 219,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff, using\n       * instance properties variancDirection and biasCorrection.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 235,col 11)-(line 235,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff in the\n       * given direction, using the current value of the biasCorrection instance property.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 252,col 11)-(line 252,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction, boolean, int, int)",
      "begin_line": 273,
      "end_line": 301,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff\n      * in the given direction with the provided bias correction.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param cutoff the reference point\n      * @param direction the {@link Direction} of the semivariance\n      * @param corrected the BiasCorrection flag\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 36)",
        "(line 277,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.isBiasCorrected()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns true iff biasCorrected property is set to true.\n     *\n     * @return the value of biasCorrected.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setBiasCorrected(boolean)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Sets the biasCorrected property.\n     *\n     * @param biasCorrected new biasCorrected property value\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.getVarianceDirection()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Returns the varianceDirection property.\n     *\n     * @return the varianceDirection\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setVarianceDirection(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Sets the variance direction\n     *\n     * @param varianceDirection the direction of the semivariance\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": "\n         *   boolean value  UPSIDE \u003c-\u003e true\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.Direction(boolean)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n         * Create a Direction with the given value.\n         *\n         * @param b boolean value representing the Direction. True corresponds to UPSIDE.\n         ",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.getDirection()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n         * Returns the value of this Direction. True corresponds to UPSIDE.\n         *\n         * @return true if direction is UPSIDE; false otherwise\n         ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 29)"
      ]
    }
  ]
}