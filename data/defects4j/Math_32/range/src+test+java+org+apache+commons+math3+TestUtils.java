{
  "filepath": "/tmp/Math-32b/src/test/java/org/apache/commons/math3/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 494,
      "comment": "\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.TestUtils.TestUtils()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(double, double, double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertSame(double, double)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 76,col 6)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertSame(org.apache.commons.math3.complex.Complex, org.apache.commons.math3.complex.Complex)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 57)",
        "(line 85,col 9)-(line 85,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(org.apache.commons.math3.complex.Complex, org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 73)",
        "(line 94,col 9)-(line 94,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 111,
      "end_line": 127,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     *\n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 53)",
        "(line 137,col 9)-(line 137,col 61)",
        "(line 138,col 9)-(line 138,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 165,
      "end_line": 179,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(java.lang.String, org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 189,
      "end_line": 198,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex, double)",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertContains(double[], double, double)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 239,col 8)-(line 239,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 243,
      "end_line": 266,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 77)",
        "(line 247,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 55)",
        "(line 259,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(org.apache.commons.math3.linear.FieldMatrix\u003c? extends org.apache.commons.math3.FieldElement\u003c?\u003e\u003e, org.apache.commons.math3.linear.FieldMatrix\u003c? extends org.apache.commons.math3.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 269,
      "end_line": 292,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 69)",
        "(line 274,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 295,
      "end_line": 321,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 51)",
        "(line 297,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 32)",
        "(line 306,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertEquals(T[], T[])",
      "begin_line": 324,
      "end_line": 331,
      "comment": " verifies that two arrays are equal ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.sumSquareDev(double[], double)",
      "begin_line": 340,
      "end_line": 347,
      "comment": "\n     * Computes the sum of squared deviations of \u003cvalues\u003e from \u003ctarget\u003e\n     * @param values array of deviates\n     * @param target value to compute deviations from\n     *\n     * @return sum of squared deviations\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 26)",
        "(line 342,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(java.lang.String[], double[], long[], double)",
      "begin_line": 358,
      "end_line": 385,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param valueLabels\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 58)",
        "(line 362,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(int[], double[], long[], double)",
      "begin_line": 396,
      "end_line": 402,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 52)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(double[], double[], long[], double)",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 52)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.assertChiSquareAccept(double[], long[], double)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 54)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.getDistributionQuartiles(org.apache.commons.math3.distribution.RealDistribution)",
      "begin_line": 441,
      "end_line": 447,
      "comment": "\n     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns\n     * these values in an array.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 43)",
        "(line 443,col 9)-(line 443,col 72)",
        "(line 444,col 9)-(line 444,col 71)",
        "(line 445,col 9)-(line 445,col 72)",
        "(line 446,col 9)-(line 446,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.updateCounts(double, long[], double[])",
      "begin_line": 453,
      "end_line": 463,
      "comment": "\n     * Updates observed counts of values in quartiles.\n     * counts[0] \u003c-\u003e 1st quartile ... counts[3] \u003c-\u003e top quartile\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.TestUtils.eliminateZeroMassPoints(int[], double[])",
      "begin_line": 471,
      "end_line": 493,
      "comment": "\n     * Eliminates points with zero mass from densityPoints and densityValues parallel\n     * arrays.  Returns the number of positive mass points and collapses the arrays so\n     * that the first \u003creturned value\u003e elements of the input arrays represent the positive\n     * mass points.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 34)",
        "(line 473,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 33)"
      ]
    }
  ]
}