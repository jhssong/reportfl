{
  "filepath": "/tmp/Codec-15b/src/test/java/org/apache/commons/codec/digest/DigestUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 391,
      "comment": "\n * Tests DigestUtils methods.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.setUp()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " (non-Javadoc)\n     * @see junit.framework.TestCase#setUp()\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testConstructable()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testInternalNoSuchAlgorithmException()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Hex()",
      "begin_line": 64,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 81)",
        "(line 69,col 9)-(line 69,col 82)",
        "(line 71,col 9)-(line 71,col 84)",
        "(line 73,col 9)-(line 73,col 95)",
        "(line 75,col 9)-(line 75,col 107)",
        "(line 77,col 9)-(line 79,col 108)",
        "(line 81,col 9)-(line 83,col 121)",
        "(line 85,col 9)-(line 86,col 72)",
        "(line 88,col 9)-(line 89,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2HexLength()",
      "begin_line": 95,
      "end_line": 104,
      "comment": "\n     * An MD2 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 80)",
        "(line 98,col 9)-(line 98,col 63)",
        "(line 99,col 9)-(line 99,col 40)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 56)",
        "(line 103,col 9)-(line 103,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Length()",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * An MD2 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 80)",
        "(line 112,col 9)-(line 112,col 60)",
        "(line 113,col 9)-(line 113,col 38)",
        "(line 115,col 9)-(line 115,col 31)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5Hex()",
      "begin_line": 120,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 81)",
        "(line 125,col 9)-(line 125,col 82)",
        "(line 127,col 9)-(line 127,col 84)",
        "(line 129,col 9)-(line 129,col 95)",
        "(line 131,col 9)-(line 131,col 107)",
        "(line 133,col 9)-(line 135,col 108)",
        "(line 137,col 9)-(line 139,col 121)",
        "(line 141,col 9)-(line 142,col 72)",
        "(line 144,col 9)-(line 145,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5HexLengthForBytes()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * An MD5 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 80)",
        "(line 154,col 9)-(line 154,col 63)",
        "(line 155,col 9)-(line 155,col 40)",
        "(line 157,col 9)-(line 157,col 31)",
        "(line 158,col 9)-(line 158,col 56)",
        "(line 159,col 9)-(line 159,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5HexLengthForByteBuffer()",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * An MD5 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 80)",
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 171,col 9)-(line 171,col 31)",
        "(line 172,col 9)-(line 172,col 61)",
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
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5LengthForByteBuffer()",
      "begin_line": 193,
      "end_line": 202,
      "comment": "\n     * An MD5 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 80)",
        "(line 196,col 9)-(line 196,col 65)",
        "(line 197,col 9)-(line 197,col 38)",
        "(line 199,col 9)-(line 199,col 31)",
        "(line 200,col 9)-(line 200,col 58)",
        "(line 201,col 9)-(line 201,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1Hex()",
      "begin_line": 204,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 93)",
        "(line 209,col 9)-(line 209,col 107)",
        "(line 211,col 9)-(line 213,col 98)",
        "(line 214,col 9)-(line 215,col 73)",
        "(line 216,col 9)-(line 217,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithByteArray()",
      "begin_line": 220,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 77)",
        "(line 223,col 9)-(line 223,col 114)",
        "(line 225,col 9)-(line 225,col 66)",
        "(line 226,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 228,col 82)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 63)",
        "(line 232,col 9)-(line 232,col 63)",
        "(line 233,col 9)-(line 233,col 80)",
        "(line 235,col 9)-(line 235,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithByteBuffer()",
      "begin_line": 238,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 77)",
        "(line 241,col 9)-(line 241,col 114)",
        "(line 243,col 9)-(line 243,col 66)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 246,col 82)",
        "(line 248,col 9)-(line 248,col 52)",
        "(line 249,col 9)-(line 249,col 80)",
        "(line 250,col 9)-(line 250,col 80)",
        "(line 251,col 9)-(line 251,col 80)",
        "(line 253,col 9)-(line 253,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithString()",
      "begin_line": 256,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 77)",
        "(line 259,col 9)-(line 259,col 114)",
        "(line 261,col 9)-(line 261,col 66)",
        "(line 262,col 9)-(line 262,col 59)",
        "(line 263,col 9)-(line 263,col 59)",
        "(line 264,col 9)-(line 264,col 82)",
        "(line 266,col 9)-(line 266,col 52)",
        "(line 267,col 9)-(line 267,col 52)",
        "(line 268,col 9)-(line 268,col 52)",
        "(line 269,col 9)-(line 269,col 80)",
        "(line 271,col 9)-(line 271,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha224()",
      "begin_line": 274,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 82)",
        "(line 277,col 9)-(line 277,col 108)",
        "(line 278,col 9)-(line 279,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha256()",
      "begin_line": 284,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 288,col 43)",
        "(line 289,col 5)-(line 290,col 57)",
        "(line 291,col 5)-(line 292,col 96)",
        "(line 294,col 5)-(line 295,col 71)",
        "(line 296,col 5)-(line 297,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha384()",
      "begin_line": 300,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 305,col 43)",
        "(line 306,col 5)-(line 308,col 57)",
        "(line 309,col 5)-(line 312,col 84)",
        "(line 313,col 5)-(line 314,col 71)",
        "(line 315,col 5)-(line 316,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha512()",
      "begin_line": 319,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 324,col 43)",
        "(line 325,col 5)-(line 327,col 57)",
        "(line 328,col 5)-(line 331,col 84)",
        "(line 332,col 5)-(line 333,col 71)",
        "(line 334,col 5)-(line 335,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaHex()",
      "begin_line": 338,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 92)",
        "(line 344,col 9)-(line 344,col 106)",
        "(line 346,col 9)-(line 348,col 97)",
        "(line 349,col 9)-(line 350,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithByteArray()",
      "begin_line": 353,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 77)",
        "(line 357,col 9)-(line 357,col 114)",
        "(line 359,col 9)-(line 359,col 65)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 361,col 44)",
        "(line 362,col 9)-(line 362,col 82)",
        "(line 364,col 9)-(line 364,col 51)",
        "(line 365,col 9)-(line 365,col 63)",
        "(line 366,col 9)-(line 366,col 63)",
        "(line 367,col 9)-(line 367,col 80)",
        "(line 369,col 9)-(line 369,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithString()",
      "begin_line": 372,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 77)",
        "(line 376,col 9)-(line 376,col 114)",
        "(line 378,col 9)-(line 378,col 65)",
        "(line 379,col 9)-(line 379,col 59)",
        "(line 380,col 9)-(line 380,col 59)",
        "(line 381,col 9)-(line 381,col 82)",
        "(line 383,col 9)-(line 383,col 51)",
        "(line 384,col 9)-(line 384,col 52)",
        "(line 385,col 9)-(line 385,col 52)",
        "(line 386,col 9)-(line 386,col 80)",
        "(line 388,col 9)-(line 388,col 51)"
      ]
    }
  ]
}