{
  "filepath": "/tmp/Math-48b/src/test/java/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 495,
      "comment": "\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 77,col 6)-(line 77,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 57)",
        "(line 86,col 9)-(line 86,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 95,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 112,
      "end_line": 128,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     *\n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 53)",
        "(line 138,col 9)-(line 138,col 61)",
        "(line 139,col 9)-(line 139,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 166,
      "end_line": 180,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 190,
      "end_line": 199,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 221,
      "end_line": 229,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 240,col 8)-(line 240,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 244,
      "end_line": 267,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 77)",
        "(line 248,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 55)",
        "(line 260,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e, org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 270,
      "end_line": 293,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 69)",
        "(line 275,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 296,
      "end_line": 322,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 51)",
        "(line 298,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 32)",
        "(line 307,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(T[], T[])",
      "begin_line": 325,
      "end_line": 332,
      "comment": " verifies that two arrays are equal ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.sumSquareDev(double[], double)",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\n     * Computes the sum of squared deviations of \u003cvalues\u003e from \u003ctarget\u003e\n     * @param values array of deviates\n     * @param target value to compute deviations from\n     *\n     * @return sum of squared deviations\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 26)",
        "(line 343,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(java.lang.String[], double[], long[], double)",
      "begin_line": 359,
      "end_line": 386,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param valueLabels\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 62)",
        "(line 363,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(int[], double[], long[], double)",
      "begin_line": 397,
      "end_line": 403,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 52)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], double[], long[], double)",
      "begin_line": 414,
      "end_line": 420,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], long[], double)",
      "begin_line": 430,
      "end_line": 436,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 54)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.getDistributionQuartiles(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 442,
      "end_line": 448,
      "comment": "\n     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns\n     * these values in an array.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 43)",
        "(line 444,col 9)-(line 444,col 72)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 446,col 9)-(line 446,col 72)",
        "(line 447,col 9)-(line 447,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.updateCounts(double, long[], double[])",
      "begin_line": 454,
      "end_line": 464,
      "comment": "\n     * Updates observed counts of values in quartiles.\n     * counts[0] \u003c-\u003e 1st quartile ... counts[3] \u003c-\u003e top quartile\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.eliminateZeroMassPoints(int[], double[])",
      "begin_line": 472,
      "end_line": 494,
      "comment": "\n     * Eliminates points with zero mass from densityPoints and densityValues parallel\n     * arrays.  Returns the number of positive mass points and collapses the arrays so\n     * that the first \u003creturned value\u003e elements of the input arrays represent the positive\n     * mass points.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 34)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 33)"
      ]
    }
  ]
}