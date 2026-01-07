{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/digest/DigestUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DigestUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 316,
      "comment": "\n * Tests DigestUtils methods.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testData"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.setUp()",
      "begin_line": 45,
      "end_line": 47,
      "comment": " (non-Javadoc)\n     * @see junit.framework.TestCase#setUp()\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testConstructable()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testInternalNoSuchAlgorithmException()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Hex()",
      "begin_line": 59,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 81)",
        "(line 64,col 9)-(line 64,col 82)",
        "(line 66,col 9)-(line 66,col 84)",
        "(line 68,col 9)-(line 68,col 95)",
        "(line 70,col 9)-(line 70,col 107)",
        "(line 72,col 9)-(line 74,col 108)",
        "(line 76,col 9)-(line 78,col 121)",
        "(line 80,col 9)-(line 81,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2HexLength()",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n     * An MD2 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 80)",
        "(line 90,col 9)-(line 90,col 63)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 93,col 9)-(line 93,col 31)",
        "(line 94,col 9)-(line 94,col 56)",
        "(line 95,col 9)-(line 95,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd2Length()",
      "begin_line": 101,
      "end_line": 110,
      "comment": "\n     * An MD2 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 80)",
        "(line 104,col 9)-(line 104,col 60)",
        "(line 105,col 9)-(line 105,col 38)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 108,col 9)-(line 108,col 53)",
        "(line 109,col 9)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5Hex()",
      "begin_line": 112,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 81)",
        "(line 117,col 9)-(line 117,col 82)",
        "(line 119,col 9)-(line 119,col 84)",
        "(line 121,col 9)-(line 121,col 95)",
        "(line 123,col 9)-(line 123,col 107)",
        "(line 125,col 9)-(line 127,col 108)",
        "(line 129,col 9)-(line 131,col 121)",
        "(line 133,col 9)-(line 134,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5HexLength()",
      "begin_line": 140,
      "end_line": 149,
      "comment": "\n     * An MD5 hash converted to hex should always be 32 characters.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 80)",
        "(line 143,col 9)-(line 143,col 63)",
        "(line 144,col 9)-(line 144,col 40)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 56)",
        "(line 148,col 9)-(line 148,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testMd5Length()",
      "begin_line": 154,
      "end_line": 163,
      "comment": "\n     * An MD5 hash should always be a 16 element byte[].\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 80)",
        "(line 157,col 9)-(line 157,col 60)",
        "(line 158,col 9)-(line 158,col 38)",
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 161,col 53)",
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1Hex()",
      "begin_line": 165,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 93)",
        "(line 170,col 9)-(line 170,col 107)",
        "(line 172,col 9)-(line 174,col 98)",
        "(line 175,col 9)-(line 176,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithByteArray()",
      "begin_line": 179,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 77)",
        "(line 182,col 9)-(line 182,col 114)",
        "(line 184,col 9)-(line 184,col 66)",
        "(line 185,col 9)-(line 185,col 44)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 82)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 190,col 9)-(line 190,col 63)",
        "(line 191,col 9)-(line 191,col 63)",
        "(line 192,col 9)-(line 192,col 80)",
        "(line 194,col 9)-(line 194,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha1UpdateWithString()",
      "begin_line": 197,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 77)",
        "(line 200,col 9)-(line 200,col 114)",
        "(line 202,col 9)-(line 202,col 66)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 59)",
        "(line 205,col 9)-(line 205,col 82)",
        "(line 207,col 9)-(line 207,col 52)",
        "(line 208,col 9)-(line 208,col 52)",
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 210,col 80)",
        "(line 212,col 9)-(line 212,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha256()",
      "begin_line": 215,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 219,col 43)",
        "(line 220,col 5)-(line 221,col 57)",
        "(line 222,col 5)-(line 223,col 96)",
        "(line 225,col 5)-(line 226,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha384()",
      "begin_line": 229,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 234,col 43)",
        "(line 235,col 5)-(line 237,col 57)",
        "(line 238,col 5)-(line 241,col 84)",
        "(line 242,col 5)-(line 243,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testSha512()",
      "begin_line": 246,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 251,col 43)",
        "(line 252,col 5)-(line 254,col 57)",
        "(line 255,col 5)-(line 258,col 84)",
        "(line 259,col 5)-(line 260,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaHex()",
      "begin_line": 263,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 92)",
        "(line 269,col 9)-(line 269,col 106)",
        "(line 271,col 9)-(line 273,col 97)",
        "(line 274,col 9)-(line 275,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithByteArray()",
      "begin_line": 278,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 77)",
        "(line 282,col 9)-(line 282,col 114)",
        "(line 284,col 9)-(line 284,col 65)",
        "(line 285,col 9)-(line 285,col 44)",
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 82)",
        "(line 289,col 9)-(line 289,col 51)",
        "(line 290,col 9)-(line 290,col 63)",
        "(line 291,col 9)-(line 291,col 63)",
        "(line 292,col 9)-(line 292,col 80)",
        "(line 294,col 9)-(line 294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.DigestUtilsTest.testShaUpdateWithString()",
      "begin_line": 297,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 77)",
        "(line 301,col 9)-(line 301,col 114)",
        "(line 303,col 9)-(line 303,col 65)",
        "(line 304,col 9)-(line 304,col 59)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 82)",
        "(line 308,col 9)-(line 308,col 51)",
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 310,col 52)",
        "(line 311,col 9)-(line 311,col 80)",
        "(line 313,col 9)-(line 313,col 51)"
      ]
    }
  ]
}