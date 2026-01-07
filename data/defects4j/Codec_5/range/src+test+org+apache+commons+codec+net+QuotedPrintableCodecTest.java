{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/net/QuotedPrintableCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuotedPrintableCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 251,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 38,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.QuotedPrintableCodecTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.constructString(int[])",
      "begin_line": 47,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 49)",
        "(line 49,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUTF8RoundTrip()",
      "begin_line": 57,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 63)",
        "(line 60,col 9)-(line 60,col 68)",
        "(line 62,col 9)-(line 62,col 66)",
        "(line 64,col 9)-(line 67,col 10)",
        "(line 68,col 9)-(line 68,col 95)",
        "(line 70,col 9)-(line 70,col 109)",
        "(line 71,col 9)-(line 71,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testBasicEncodeDecode()",
      "begin_line": 74,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 66)",
        "(line 76,col 9)-(line 76,col 45)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 79,col 50)",
        "(line 80,col 9)-(line 81,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSafeCharEncodeDecode()",
      "begin_line": 84,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 66)",
        "(line 86,col 9)-(line 86,col 60)",
        "(line 87,col 9)-(line 87,col 47)",
        "(line 88,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 91,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 66)",
        "(line 97,col 9)-(line 97,col 31)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 100,col 34)",
        "(line 101,col 9)-(line 102,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeDecodeNull()",
      "begin_line": 105,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 66)",
        "(line 107,col 9)-(line 108,col 42)",
        "(line 109,col 9)-(line 110,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeInvalid()",
      "begin_line": 114,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 66)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeNull()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 66)",
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 141,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeUrlWithNullBitSet()",
      "begin_line": 144,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 66)",
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 148,col 66)",
        "(line 149,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 152,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeWithNullArray()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 28)",
        "(line 158,col 9)-(line 158,col 76)",
        "(line 159,col 9)-(line 159,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeStringWithNull()",
      "begin_line": 162,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 66)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 165,col 9)-(line 165,col 58)",
        "(line 166,col 9)-(line 166,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeStringWithNull()",
      "begin_line": 169,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 66)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 173,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeObjects()",
      "begin_line": 176,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 66)",
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 180,col 9)-(line 181,col 34)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 69)",
        "(line 185,col 9)-(line 185,col 40)",
        "(line 186,col 9)-(line 187,col 34)",
        "(line 189,col 9)-(line 189,col 54)",
        "(line 190,col 9)-(line 190,col 81)",
        "(line 192,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testInvalidEncoding()",
      "begin_line": 201,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 76)",
        "(line 203,col 12)-(line 203,col 41)",
        "(line 204,col 13)-(line 209,col 13)",
        "(line 210,col 13)-(line 215,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeObjects()",
      "begin_line": 218,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 66)",
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 65)",
        "(line 222,col 9)-(line 223,col 32)",
        "(line 225,col 9)-(line 225,col 49)",
        "(line 226,col 9)-(line 226,col 69)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 229,col 32)",
        "(line 231,col 9)-(line 231,col 54)",
        "(line 232,col 9)-(line 232,col 81)",
        "(line 234,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDefaultEncoding()",
      "begin_line": 243,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 38)",
        "(line 245,col 9)-(line 245,col 78)",
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 48)",
        "(line 249,col 9)-(line 249,col 41)"
      ]
    }
  ]
}