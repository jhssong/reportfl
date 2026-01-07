{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/digest/DigestUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 374,
      "comment": "\n * Tests DigestUtils methods.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testFile"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.assumeJava8()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.getTestData()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.getTestFile()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.setUp()",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 41)",
        "(line 66,col 9)-(line 66,col 80)",
        "(line 67,col 9)-(line 67,col 62)",
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.tearDown()",
      "begin_line": 72,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testInternalNoSuchAlgorithmException()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Hex()",
      "begin_line": 84,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 81)",
        "(line 89,col 9)-(line 89,col 82)",
        "(line 91,col 9)-(line 91,col 84)",
        "(line 93,col 9)-(line 93,col 95)",
        "(line 95,col 9)-(line 95,col 107)",
        "(line 97,col 9)-(line 99,col 108)",
        "(line 101,col 9)-(line 103,col 121)",
        "(line 105,col 9)-(line 106,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2HexLength()",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     * An MD2 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 80)",
        "(line 115,col 9)-(line 115,col 63)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 118,col 9)-(line 118,col 31)",
        "(line 119,col 9)-(line 119,col 56)",
        "(line 120,col 9)-(line 120,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Length()",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\n     * An MD2 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 80)",
        "(line 129,col 9)-(line 129,col 60)",
        "(line 130,col 9)-(line 130,col 38)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5Hex()",
      "begin_line": 137,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 81)",
        "(line 142,col 9)-(line 142,col 82)",
        "(line 144,col 9)-(line 144,col 84)",
        "(line 146,col 9)-(line 146,col 95)",
        "(line 148,col 9)-(line 148,col 107)",
        "(line 150,col 9)-(line 152,col 108)",
        "(line 154,col 9)-(line 156,col 121)",
        "(line 158,col 9)-(line 159,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5HexLengthForBytes()",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * An MD5 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 80)",
        "(line 168,col 9)-(line 168,col 63)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 56)",
        "(line 173,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5LengthForBytes()",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * An MD5 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 80)",
        "(line 182,col 9)-(line 182,col 60)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 185,col 9)-(line 185,col 31)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1Hex()",
      "begin_line": 190,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 93)",
        "(line 195,col 9)-(line 195,col 107)",
        "(line 197,col 9)-(line 199,col 98)",
        "(line 200,col 9)-(line 201,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithByteArray()",
      "begin_line": 204,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 77)",
        "(line 207,col 9)-(line 207,col 114)",
        "(line 209,col 9)-(line 209,col 66)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 82)",
        "(line 214,col 9)-(line 214,col 52)",
        "(line 215,col 9)-(line 215,col 63)",
        "(line 216,col 9)-(line 216,col 63)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 219,col 9)-(line 219,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithByteBuffer()",
      "begin_line": 222,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 77)",
        "(line 225,col 9)-(line 225,col 114)",
        "(line 227,col 9)-(line 227,col 66)",
        "(line 228,col 9)-(line 228,col 44)",
        "(line 229,col 9)-(line 229,col 44)",
        "(line 230,col 9)-(line 230,col 82)",
        "(line 232,col 9)-(line 232,col 52)",
        "(line 233,col 9)-(line 233,col 80)",
        "(line 234,col 9)-(line 234,col 80)",
        "(line 235,col 9)-(line 235,col 80)",
        "(line 237,col 9)-(line 237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithString()",
      "begin_line": 240,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 77)",
        "(line 243,col 9)-(line 243,col 114)",
        "(line 245,col 9)-(line 245,col 66)",
        "(line 246,col 9)-(line 246,col 59)",
        "(line 247,col 9)-(line 247,col 59)",
        "(line 248,col 9)-(line 248,col 82)",
        "(line 250,col 9)-(line 250,col 52)",
        "(line 251,col 9)-(line 251,col 52)",
        "(line 252,col 9)-(line 252,col 52)",
        "(line 253,col 9)-(line 253,col 80)",
        "(line 255,col 9)-(line 255,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha224()",
      "begin_line": 258,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 22)",
        "(line 261,col 9)-(line 262,col 84)",
        "(line 263,col 9)-(line 264,col 125)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha256()",
      "begin_line": 269,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 273,col 43)",
        "(line 274,col 5)-(line 275,col 57)",
        "(line 276,col 5)-(line 277,col 96)",
        "(line 279,col 5)-(line 280,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha384()",
      "begin_line": 283,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 288,col 43)",
        "(line 289,col 5)-(line 291,col 57)",
        "(line 292,col 5)-(line 295,col 84)",
        "(line 296,col 5)-(line 297,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha512()",
      "begin_line": 300,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 305,col 43)",
        "(line 306,col 5)-(line 308,col 57)",
        "(line 309,col 5)-(line 312,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha512HexInputStream()",
      "begin_line": 315,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaHex()",
      "begin_line": 321,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 92)",
        "(line 327,col 9)-(line 327,col 106)",
        "(line 329,col 9)-(line 331,col 97)",
        "(line 332,col 9)-(line 333,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithByteArray()",
      "begin_line": 336,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 77)",
        "(line 340,col 9)-(line 340,col 114)",
        "(line 342,col 9)-(line 342,col 65)",
        "(line 343,col 9)-(line 343,col 44)",
        "(line 344,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 345,col 82)",
        "(line 347,col 9)-(line 347,col 51)",
        "(line 348,col 9)-(line 348,col 63)",
        "(line 349,col 9)-(line 349,col 63)",
        "(line 350,col 9)-(line 350,col 80)",
        "(line 352,col 9)-(line 352,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithString()",
      "begin_line": 355,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 114)",
        "(line 361,col 9)-(line 361,col 65)",
        "(line 362,col 9)-(line 362,col 59)",
        "(line 363,col 9)-(line 363,col 59)",
        "(line 364,col 9)-(line 364,col 82)",
        "(line 366,col 9)-(line 366,col 51)",
        "(line 367,col 9)-(line 367,col 52)",
        "(line 368,col 9)-(line 368,col 52)",
        "(line 369,col 9)-(line 369,col 80)",
        "(line 371,col 9)-(line 371,col 51)"
      ]
    }
  ]
}