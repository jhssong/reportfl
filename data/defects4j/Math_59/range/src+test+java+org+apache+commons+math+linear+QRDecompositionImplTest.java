{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/linear/QRDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 26,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x3NonSingular"
      ],
      "begin_line": 27,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x3Singular"
      ],
      "begin_line": 32,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x4"
      ],
      "begin_line": 37,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData4x3"
      ],
      "begin_line": 42,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.QRDecompositionImplTest(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testDimensions()",
      "begin_line": 58,
      "end_line": 71,
      "comment": " test dimensions \n     * @throws MathUserException ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 77)",
        "(line 61,col 9)-(line 61,col 66)",
        "(line 63,col 9)-(line 63,col 66)",
        "(line 65,col 9)-(line 65,col 48)",
        "(line 66,col 9)-(line 66,col 56)",
        "(line 67,col 9)-(line 67,col 56)",
        "(line 68,col 9)-(line 68,col 50)",
        "(line 69,col 9)-(line 69,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkDimension(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 73,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 76,col 56)",
        "(line 77,col 9)-(line 77,col 59)",
        "(line 78,col 9)-(line 78,col 62)",
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testAEqualQR()",
      "begin_line": 85,
      "end_line": 101,
      "comment": " test A \u003d QR \n     * @throws MathUserException ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 76)",
        "(line 88,col 9)-(line 88,col 73)",
        "(line 90,col 9)-(line 90,col 65)",
        "(line 92,col 9)-(line 92,col 65)",
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 56)",
        "(line 97,col 9)-(line 97,col 49)",
        "(line 99,col 9)-(line 99,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkAEqualQR(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 105,col 74)",
        "(line 106,col 9)-(line 106,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testQOrthogonal()",
      "begin_line": 111,
      "end_line": 127,
      "comment": " test the orthogonality of Q \n     * @throws MathUserException ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 79)",
        "(line 114,col 9)-(line 114,col 76)",
        "(line 116,col 9)-(line 116,col 68)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 120,col 9)-(line 120,col 48)",
        "(line 121,col 9)-(line 121,col 56)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 52)",
        "(line 125,col 9)-(line 125,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkQOrthogonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 83)",
        "(line 132,col 9)-(line 132,col 77)",
        "(line 133,col 9)-(line 133,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testRUpperTriangular()",
      "begin_line": 137,
      "end_line": 159,
      "comment": " test that R is upper triangular ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 81)",
        "(line 139,col 9)-(line 139,col 69)",
        "(line 141,col 9)-(line 141,col 67)",
        "(line 142,col 9)-(line 142,col 69)",
        "(line 144,col 9)-(line 144,col 59)",
        "(line 145,col 9)-(line 145,col 69)",
        "(line 147,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 148,col 69)",
        "(line 150,col 9)-(line 150,col 48)",
        "(line 151,col 9)-(line 151,col 56)",
        "(line 152,col 9)-(line 152,col 56)",
        "(line 153,col 9)-(line 153,col 43)",
        "(line 154,col 9)-(line 154,col 69)",
        "(line 156,col 9)-(line 156,col 43)",
        "(line 157,col 9)-(line 157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkUpperTriangular(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 161,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 169,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-f9e004c9-3219-447b-b0b8-c85bbbde9483.visit(int, int, double)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 165,col 17)-(line 167,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testHTrapezoidal()",
      "begin_line": 174,
      "end_line": 196,
      "comment": " test that H is trapezoidal \n     * @throws MathUserException ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 81)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 178,col 9)-(line 178,col 67)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 181,col 9)-(line 181,col 59)",
        "(line 182,col 9)-(line 182,col 65)",
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 65)",
        "(line 187,col 9)-(line 187,col 48)",
        "(line 188,col 9)-(line 188,col 56)",
        "(line 189,col 9)-(line 189,col 56)",
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 65)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 194,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkTrapezoidal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 198,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 206,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-72610260-fd1e-4fe9-a639-340533917090.visit(int, int, double)",
      "begin_line": 200,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 202,col 17)-(line 204,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testMatricesValues()",
      "begin_line": 209,
      "end_line": 243,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 210,col 9)-(line 211,col 90)",
        "(line 212,col 9)-(line 216,col 11)",
        "(line 217,col 9)-(line 221,col 11)",
        "(line 222,col 9)-(line 226,col 11)",
        "(line 229,col 9)-(line 229,col 33)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 74)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 235,col 33)",
        "(line 236,col 9)-(line 236,col 61)",
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.createTestMatrix(java.util.Random, int, int)",
      "begin_line": 245,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 67)",
        "(line 247,col 9)-(line 252,col 11)",
        "(line 253,col 9)-(line 253,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-3733be73-49f4-42bb-a251-8e63c9d6ddce.visit(int, int, double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 17)-(line 250,col 50)"
      ]
    }
  ]
}