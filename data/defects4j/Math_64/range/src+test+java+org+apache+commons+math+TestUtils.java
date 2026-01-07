{
  "filepath": "/tmp/Math-64b/src/test/java/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 515,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 76,col 6)-(line 76,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
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
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 66)",
        "(line 94,col 9)-(line 94,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 111,
      "end_line": 127,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
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
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 165,
      "end_line": 179,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 189,
      "end_line": 206,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 18)",
        "(line 192,col 9)-(line 192,col 30)",
        "(line 193,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 228,
      "end_line": 244,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 18)",
        "(line 231,col 9)-(line 231,col 30)",
        "(line 232,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 255,col 8)-(line 255,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 259,
      "end_line": 283,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 77)",
        "(line 264,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 55)",
        "(line 276,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e, org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 286,
      "end_line": 309,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 69)",
        "(line 291,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double[], double[], double)",
      "begin_line": 312,
      "end_line": 341,
      "comment": " verifies that two arrays are close (sup norm) ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 49)",
        "(line 315,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 32)",
        "(line 324,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(T[], T[])",
      "begin_line": 344,
      "end_line": 351,
      "comment": " verifies that two arrays are equal ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.sumSquareDev(double[], double)",
      "begin_line": 360,
      "end_line": 367,
      "comment": "\n     * Computes the sum of squared deviations of \u003cvalues\u003e from \u003ctarget\u003e\n     * @param values array of deviates\n     * @param target value to compute deviations from\n     *\n     * @return sum of squared deviations\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 26)",
        "(line 362,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(java.lang.String[], double[], long[], double)",
      "begin_line": 378,
      "end_line": 406,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param valueLabels\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 62)",
        "(line 380,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(int[], double[], long[], double)",
      "begin_line": 417,
      "end_line": 423,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 52)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], double[], long[], double)",
      "begin_line": 434,
      "end_line": 440,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param values\n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 52)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertChiSquareAccept(double[], long[], double)",
      "begin_line": 450,
      "end_line": 456,
      "comment": "\n     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test\n     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%\n     * \n     * @param expected expected counts\n     * @param observed observed counts\n     * @param alpha significance level of the test\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 54)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.getDistributionQuartiles(org.apache.commons.math.distribution.ContinuousDistribution)",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns\n     * these values in an array.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 43)",
        "(line 464,col 9)-(line 464,col 72)",
        "(line 465,col 9)-(line 465,col 71)",
        "(line 466,col 9)-(line 466,col 72)",
        "(line 467,col 9)-(line 467,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.updateCounts(double, long[], double[])",
      "begin_line": 474,
      "end_line": 484,
      "comment": "\n     * Updates observed counts of values in quartiles.\n     * counts[0] \u003c-\u003e 1st quartile ... counts[3] \u003c-\u003e top quartile\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 483,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.eliminateZeroMassPoints(int[], double[])",
      "begin_line": 492,
      "end_line": 514,
      "comment": "\n     * Eliminates points with zero mass from densityPoints and densityValues parallel\n     * arrays.  Returns the number of positive mass points and collapses the arrays so\n     * that the first \u003creturned value\u003e elements of the input arrays represent the positive\n     * mass points.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 34)",
        "(line 494,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 33)"
      ]
    }
  ]
}