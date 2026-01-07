{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/TestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 353,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.TestUtils.TestUtils()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Collection of static methods used in math unit tests.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double, double, double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, double, double, double)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "\n     * Verifies that expected and actual are within delta, or are both NaN or\n     * infinities of the same sign.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(double, double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Verifies that the two arguments are exactly the same, either\n     * both NaN or infinities of same sign, or identical floating point values.\n     ",
      "child_ranges": [
        "(line 72,col 6)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertSame(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * are exactly the same.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 57)",
        "(line 81,col 9)-(line 81,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex, double)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * Verifies that real and imaginary parts of the two complex arguments\n     * differ by at most delta.  Also ensures that NaN / infinite components match.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 66)",
        "(line 90,col 9)-(line 90,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(double[], double[], double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Verifies that two double arrays have equal entries, up to tolerance\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.serializeAndRecover(java.lang.Object)",
      "begin_line": 107,
      "end_line": 123,
      "comment": "\n     * Serializes an object to a bytes array and then recovers the object from the bytes array.\n     * Returns the deserialized object.\n     *\n     * @param o  object to serialize and recover\n     * @return  the recovered, deserialized object\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.checkSerializedEquality(java.lang.Object)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Verifies that serialization preserves equals and hashCode.\n     * Serializes the object, then recovers it and checks equals and hash code.\n     *\n     * @param object  the object to serialize and recover\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 53)",
        "(line 133,col 9)-(line 133,col 61)",
        "(line 134,col 9)-(line 134,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(double, double, double)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertRelativelyEquals(java.lang.String, double, double, double)",
      "begin_line": 161,
      "end_line": 175,
      "comment": "\n     * Verifies that the relative error in actual vs. expected is less than or\n     * equal to relativeError.  If expected is infinite or NaN, actual must be\n     * the same (NaN or infinity of the same sign).\n     *\n     * @param msg  message to return with failure\n     * @param expected expected value\n     * @param actual  observed value\n     * @param relativeError  maximum allowable relative error\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 185,
      "end_line": 202,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param msg  message to return with failure\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 18)",
        "(line 188,col 9)-(line 188,col 30)",
        "(line 189,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex, double)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of z.\n     *\n     * @param values complex array to search\n     * @param z  value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(java.lang.String, double[], double, double)",
      "begin_line": 224,
      "end_line": 240,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param msg  message to return with failure\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 18)",
        "(line 227,col 9)-(line 227,col 30)",
        "(line 228,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertContains(double[], double, double)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * Fails iff values does not contain a number within epsilon of x.\n     *\n     * @param values double array to search\n     * @param x value sought\n     * @param epsilon  tolerance\n     ",
      "child_ranges": [
        "(line 251,col 8)-(line 251,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(java.lang.String, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 255,
      "end_line": 281,
      "comment": " verifies that two matrices are close (1-norm) ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.TestUtils.assertEquals(org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e, org.apache.commons.math.linear.FieldMatrix\u003c? extends org.apache.commons.math.FieldElement\u003c?\u003e\u003e)",
      "begin_line": 284,
      "end_line": 309,
      "comment": " verifies that two matrices are equal ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
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
    }
  ]
}