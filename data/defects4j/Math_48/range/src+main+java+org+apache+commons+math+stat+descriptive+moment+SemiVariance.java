{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/stat/descriptive/moment/SemiVariance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SemiVariance",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 383,
      "comment": ""
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
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance()",
      "begin_line": 87,
      "end_line": 88,
      "comment": "\n     * Constructs a SemiVariance with default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003ebiasCorrected\u003c/code\u003e\n     * property and default (Downside) \u003ccode\u003evarianceDirection\u003c/code\u003e property.\n     *\n     * @param biasCorrected  setting for bias correction - true means\n     * bias will be corrected and is equivalent to using the argumentless\n     * constructor\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Constructs a SemiVariance with the specified \u003ccode\u003eDirection\u003c/code\u003e property\n     * and default (true) \u003ccode\u003ebiasCorrected\u003c/code\u003e property\n     *\n     * @param direction  setting for the direction of the SemiVariance\n     * to calculate\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(boolean, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
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
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.SemiVariance(org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Copy constructor, creates a new {@code SemiVariance} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SemiVariance} instance to copy\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 27)",
        "(line 150,col 9)-(line 150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.copy(org.apache.commons.math.stat.descriptive.moment.SemiVariance, org.apache.commons.math.stat.descriptive.moment.SemiVariance)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SemiVariance to copy\n     * @param dest SemiVariance to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 39)",
        "(line 165,col 9)-(line 165,col 37)",
        "(line 166,col 9)-(line 166,col 42)",
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 168,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[])",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * This method calculates {@link SemiVariance} for the entire array against the mean, using\n     * instance properties varianceDirection and biasCorrection.\n     *\n     * @param values the input array\n     * @return the SemiVariance\n     * @throws IllegalArgumentException if values is null\n     *\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 10)",
        "(line 186,col 9)-(line 186,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], int, int)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the mean, using\n      * instance properties varianceDirection and biasCorrection.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 64)",
        "(line 207,col 9)-(line 207,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n       * This method calculates {@link SemiVariance} for the entire array against the mean, using\n       * the current value of the biasCorrection instance property.\n       *\n       * @param values the input array\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       *\n       ",
      "child_ranges": [
        "(line 222,col 11)-(line 222,col 51)",
        "(line 223,col 11)-(line 223,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff, using\n       * instance properties variancDirection and biasCorrection.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 239,col 11)-(line 239,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n       * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff in the\n       * given direction, using the current value of the biasCorrection instance property.\u003c/p\u003e\n       *\n       * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n       * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n       *\n       * @param values the input array\n       * @param cutoff the reference point\n       * @param direction the {@link Direction} of the semivariance\n       * @return the SemiVariance\n       * @throws IllegalArgumentException if values is null\n       ",
      "child_ranges": [
        "(line 256,col 11)-(line 256,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.evaluate(double[], double, org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction, boolean, int, int)",
      "begin_line": 277,
      "end_line": 305,
      "comment": "\n      * \u003cp\u003eReturns the {@link SemiVariance} of the designated values against the cutoff\n      * in the given direction with the provided bias correction.\u003c/p\u003e\n      *\n      * \u003cp\u003eReturns \u003ccode\u003eNaN\u003c/code\u003e if the array is empty and throws\n      * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n      *\n      * @param values the input array\n      * @param cutoff the reference point\n      * @param direction the {@link Direction} of the semivariance\n      * @param corrected the BiasCorrection flag\n      * @param start index of the first array element to include\n      * @param length the number of elements to include\n      * @return the SemiVariance\n      * @throws IllegalArgumentException if the parameters are not valid\n      *\n      ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 36)",
        "(line 281,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.isBiasCorrected()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Returns true iff biasCorrected property is set to true.\n     *\n     * @return the value of biasCorrected.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setBiasCorrected(boolean)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Sets the biasCorrected property.\n     *\n     * @param biasCorrected new biasCorrected property value\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.getVarianceDirection()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Returns the varianceDirection property.\n     *\n     * @return the varianceDirection\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.setVarianceDirection(org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Sets the variance direction\n     *\n     * @param varianceDirection the direction of the semivariance\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "direction"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": "\n         *   boolean value  UPSIDE \u003c-\u003e true\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.Direction(boolean)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n         * Create a Direction with the given value.\n         *\n         * @param b boolean value representing the Direction. True corresponds to UPSIDE.\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.moment.SemiVariance.Direction.getDirection()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n         * Returns the value of this Direction. True corresponds to UPSIDE.\n         *\n         * @return true if direction is UPSIDE; false otherwise\n         ",
      "child_ranges": [
        "(line 380,col 13)-(line 380,col 29)"
      ]
    }
  ]
}