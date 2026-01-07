{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/StringUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 201,
      "comment": "\n * Tests {@link StringUtils}\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_FIXTURE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_FIXTURE_16BE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " This is valid input for UTF-16BE"
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_FIXTURE_16LE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " This is valid for UTF-16LE"
    },
    {
      "type": "field",
      "varNames": [
        "STRING_FIXTURE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testConstructor()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * We could make the constructor private but there does not seem to be a point to jumping through extra code hoops\n     * to restrict instantiation right now.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesIso8859_1()",
      "begin_line": 52,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 48)",
        "(line 55,col 9)-(line 55,col 43)",
        "(line 56,col 9)-(line 56,col 69)",
        "(line 57,col 9)-(line 57,col 76)",
        "(line 58,col 9)-(line 58,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUnchecked(java.lang.String)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 69)",
        "(line 63,col 9)-(line 63,col 89)",
        "(line 64,col 9)-(line 64,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUsAscii()",
      "begin_line": 67,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 46)",
        "(line 70,col 9)-(line 70,col 43)",
        "(line 71,col 9)-(line 71,col 69)",
        "(line 72,col 9)-(line 72,col 74)",
        "(line 73,col 9)-(line 73,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16()",
      "begin_line": 76,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 44)",
        "(line 79,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 80,col 69)",
        "(line 81,col 9)-(line 81,col 72)",
        "(line 82,col 9)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16Be()",
      "begin_line": 85,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 46)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 69)",
        "(line 90,col 9)-(line 90,col 74)",
        "(line 91,col 9)-(line 91,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf16Le()",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 98,col 69)",
        "(line 99,col 9)-(line 99,col 74)",
        "(line 100,col 9)-(line 100,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUtf8()",
      "begin_line": 103,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 43)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 107,col 9)-(line 107,col 69)",
        "(line 108,col 9)-(line 108,col 71)",
        "(line 109,col 9)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUncheckedBadName()",
      "begin_line": 112,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testGetBytesUncheckedNullInput()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewString(java.lang.String)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 71)",
        "(line 129,col 9)-(line 129,col 80)",
        "(line 130,col 9)-(line 130,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringBadEnc()",
      "begin_line": 133,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringNullInput()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringIso8859_1()",
      "begin_line": 148,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 48)",
        "(line 151,col 9)-(line 151,col 35)",
        "(line 152,col 9)-(line 152,col 71)",
        "(line 153,col 9)-(line 153,col 76)",
        "(line 154,col 9)-(line 154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUsAscii()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 160,col 35)",
        "(line 161,col 9)-(line 161,col 71)",
        "(line 162,col 9)-(line 162,col 74)",
        "(line 163,col 9)-(line 163,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16()",
      "begin_line": 166,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 44)",
        "(line 169,col 9)-(line 169,col 35)",
        "(line 170,col 9)-(line 170,col 71)",
        "(line 171,col 9)-(line 171,col 72)",
        "(line 172,col 9)-(line 172,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16Be()",
      "begin_line": 175,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 76)",
        "(line 180,col 9)-(line 180,col 79)",
        "(line 181,col 9)-(line 181,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf16Le()",
      "begin_line": 184,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 46)",
        "(line 187,col 9)-(line 187,col 35)",
        "(line 188,col 9)-(line 188,col 76)",
        "(line 189,col 9)-(line 189,col 79)",
        "(line 190,col 9)-(line 190,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.StringUtilsTest.testNewStringUtf8()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 196,col 35)",
        "(line 197,col 9)-(line 197,col 71)",
        "(line 198,col 9)-(line 198,col 71)",
        "(line 199,col 9)-(line 199,col 46)"
      ]
    }
  ]
}