{
  "filepath": "/tmp/Math-67b/src/test/java/org/apache/commons/math/linear/QRDecompositionImplTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecompositionImplTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 24,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x3NonSingular"
      ],
      "begin_line": 25,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x3Singular"
      ],
      "begin_line": 30,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData3x4"
      ],
      "begin_line": 35,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testData4x3"
      ],
      "begin_line": 40,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryTolerance"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normTolerance"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.QRDecompositionImplTest(java.lang.String)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testDimensions()",
      "begin_line": 55,
      "end_line": 68,
      "comment": " test dimensions ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 77)",
        "(line 58,col 9)-(line 58,col 66)",
        "(line 60,col 9)-(line 60,col 66)",
        "(line 62,col 9)-(line 62,col 48)",
        "(line 63,col 9)-(line 63,col 56)",
        "(line 64,col 9)-(line 64,col 56)",
        "(line 65,col 9)-(line 65,col 50)",
        "(line 66,col 9)-(line 66,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkDimension(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 72,col 45)",
        "(line 73,col 9)-(line 73,col 56)",
        "(line 74,col 9)-(line 74,col 59)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 76,col 9)-(line 76,col 59)",
        "(line 77,col 9)-(line 77,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testAEqualQR()",
      "begin_line": 81,
      "end_line": 97,
      "comment": " test A \u003d QR ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 76)",
        "(line 84,col 9)-(line 84,col 73)",
        "(line 86,col 9)-(line 86,col 65)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 91,col 56)",
        "(line 92,col 9)-(line 92,col 56)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 95,col 9)-(line 95,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkAEqualQR(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 56)",
        "(line 101,col 9)-(line 101,col 74)",
        "(line 102,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testQOrthogonal()",
      "begin_line": 106,
      "end_line": 122,
      "comment": " test the orthogonality of Q ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 79)",
        "(line 109,col 9)-(line 109,col 76)",
        "(line 111,col 9)-(line 111,col 68)",
        "(line 113,col 9)-(line 113,col 68)",
        "(line 115,col 9)-(line 115,col 48)",
        "(line 116,col 9)-(line 116,col 56)",
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 118,col 52)",
        "(line 120,col 9)-(line 120,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkQOrthogonal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 56)",
        "(line 126,col 9)-(line 126,col 83)",
        "(line 127,col 9)-(line 127,col 77)",
        "(line 128,col 9)-(line 128,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testRUpperTriangular()",
      "begin_line": 132,
      "end_line": 154,
      "comment": " test that R is upper triangular ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 81)",
        "(line 134,col 9)-(line 134,col 69)",
        "(line 136,col 9)-(line 136,col 67)",
        "(line 137,col 9)-(line 137,col 69)",
        "(line 139,col 9)-(line 139,col 59)",
        "(line 140,col 9)-(line 140,col 69)",
        "(line 142,col 9)-(line 142,col 59)",
        "(line 143,col 9)-(line 143,col 69)",
        "(line 145,col 9)-(line 145,col 48)",
        "(line 146,col 9)-(line 146,col 56)",
        "(line 147,col 9)-(line 147,col 56)",
        "(line 148,col 9)-(line 148,col 43)",
        "(line 149,col 9)-(line 149,col 69)",
        "(line 151,col 9)-(line 151,col 43)",
        "(line 152,col 9)-(line 152,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkUpperTriangular(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 156,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 164,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-c317c838-2386-4a5a-8c2c-6ec71ef4158c.visit(int, int, double)",
      "begin_line": 158,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 160,col 17)-(line 162,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testHTrapezoidal()",
      "begin_line": 168,
      "end_line": 190,
      "comment": " test that H is trapezoidal ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 81)",
        "(line 170,col 9)-(line 170,col 65)",
        "(line 172,col 9)-(line 172,col 67)",
        "(line 173,col 9)-(line 173,col 65)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 178,col 9)-(line 178,col 59)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 56)",
        "(line 183,col 9)-(line 183,col 56)",
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 185,col 65)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.checkTrapezoidal(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 192,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 200,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-820cba25-00bc-4ca8-b61e-3832a80400cc.visit(int, int, double)",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 196,col 17)-(line 198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.testMatricesValues()",
      "begin_line": 203,
      "end_line": 237,
      "comment": " test matrices values ",
      "child_ranges": [
        "(line 204,col 9)-(line 205,col 90)",
        "(line 206,col 9)-(line 210,col 11)",
        "(line 211,col 9)-(line 215,col 11)",
        "(line 216,col 9)-(line 220,col 11)",
        "(line 223,col 9)-(line 223,col 33)",
        "(line 224,col 9)-(line 224,col 61)",
        "(line 225,col 9)-(line 225,col 35)",
        "(line 226,col 9)-(line 226,col 74)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 61)",
        "(line 229,col 9)-(line 229,col 33)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 35)",
        "(line 235,col 9)-(line 235,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.createTestMatrix(java.util.Random, int, int)",
      "begin_line": 239,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 67)",
        "(line 241,col 9)-(line 247,col 11)",
        "(line 248,col 9)-(line 248,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecompositionImplTest.Anonymous-8a6e007b-8a1f-4ec9-b403-8233f345a1dd.visit(int, int, double)",
      "begin_line": 242,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 17)-(line 245,col 50)"
      ]
    }
  ]
}