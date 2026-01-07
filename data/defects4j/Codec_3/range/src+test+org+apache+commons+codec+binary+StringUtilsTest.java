{
  "filepath": "/tmp/Codec-3b/src/test/org/apache/commons/codec/binary/StringUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 179,
      "comment": "\n * Tests {@link StringUtils}\n * \n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_FIXTURE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testConstructor()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * We could make the constructor private but there does not seem to be a point to jumping through extra code hoops\n     * to restrict instantiation right now.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesIso8859_1()",
      "begin_line": 54,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 56,col 43)",
        "(line 57,col 9)-(line 57,col 63)",
        "(line 58,col 9)-(line 58,col 70)",
        "(line 59,col 9)-(line 59,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUsAscii()",
      "begin_line": 62,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 40)",
        "(line 64,col 9)-(line 64,col 43)",
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 68)",
        "(line 67,col 9)-(line 67,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16()",
      "begin_line": 70,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 73,col 63)",
        "(line 74,col 9)-(line 74,col 66)",
        "(line 75,col 9)-(line 75,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16Be()",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 40)",
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 81,col 63)",
        "(line 82,col 9)-(line 82,col 68)",
        "(line 83,col 9)-(line 83,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16Le()",
      "begin_line": 86,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 63)",
        "(line 90,col 9)-(line 90,col 68)",
        "(line 91,col 9)-(line 91,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf8()",
      "begin_line": 94,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 97,col 63)",
        "(line 98,col 9)-(line 98,col 65)",
        "(line 99,col 9)-(line 99,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetSupportedBytes(java.lang.String)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 63)",
        "(line 104,col 9)-(line 104,col 83)",
        "(line 105,col 9)-(line 105,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetSupportedBytesBadEnc()",
      "begin_line": 108,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewString(java.lang.String)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 65)",
        "(line 119,col 9)-(line 119,col 74)",
        "(line 120,col 9)-(line 120,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringBadEnc()",
      "begin_line": 123,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringIso8859_1()",
      "begin_line": 132,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 42)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 135,col 65)",
        "(line 136,col 9)-(line 136,col 70)",
        "(line 137,col 9)-(line 137,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUsAscii()",
      "begin_line": 140,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 142,col 35)",
        "(line 143,col 9)-(line 143,col 65)",
        "(line 144,col 9)-(line 144,col 68)",
        "(line 145,col 9)-(line 145,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 150,col 35)",
        "(line 151,col 9)-(line 151,col 65)",
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16Be()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 158,col 35)",
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 68)",
        "(line 161,col 9)-(line 161,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16Le()",
      "begin_line": 164,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 40)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 169,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf8()",
      "begin_line": 172,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 37)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 175,col 9)-(line 175,col 65)",
        "(line 176,col 9)-(line 176,col 65)",
        "(line 177,col 9)-(line 177,col 46)"
      ]
    }
  ]
}