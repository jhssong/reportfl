{
  "filepath": "/tmp/Codec-1b/src/test/org/apache/commons/codec/net/QuotedPrintableCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuotedPrintableCodecTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 250,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 33,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 37,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.QuotedPrintableCodecTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.constructString(int[])",
      "begin_line": 46,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 49)",
        "(line 48,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUTF8RoundTrip()",
      "begin_line": 56,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 63)",
        "(line 59,col 9)-(line 59,col 68)",
        "(line 61,col 9)-(line 61,col 66)",
        "(line 63,col 9)-(line 66,col 10)",
        "(line 67,col 9)-(line 67,col 84)",
        "(line 69,col 9)-(line 69,col 87)",
        "(line 70,col 9)-(line 70,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testBasicEncodeDecode()",
      "begin_line": 73,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 66)",
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 76,col 47)",
        "(line 77,col 9)-(line 78,col 50)",
        "(line 79,col 9)-(line 80,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSafeCharEncodeDecode()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 66)",
        "(line 85,col 9)-(line 85,col 60)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 88,col 28)",
        "(line 89,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 94,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 66)",
        "(line 96,col 9)-(line 96,col 31)",
        "(line 97,col 9)-(line 97,col 47)",
        "(line 98,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 101,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeDecodeNull()",
      "begin_line": 104,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 66)",
        "(line 106,col 9)-(line 107,col 42)",
        "(line 108,col 9)-(line 109,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeInvalid()",
      "begin_line": 113,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 66)",
        "(line 115,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeNull()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 66)",
        "(line 137,col 9)-(line 137,col 28)",
        "(line 138,col 9)-(line 138,col 47)",
        "(line 139,col 9)-(line 140,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeUrlWithNullBitSet()",
      "begin_line": 143,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 66)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 151,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeWithNullArray()",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 157,col 76)",
        "(line 158,col 9)-(line 158,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeStringWithNull()",
      "begin_line": 161,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 66)",
        "(line 163,col 9)-(line 163,col 27)",
        "(line 164,col 9)-(line 164,col 58)",
        "(line 165,col 9)-(line 165,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeStringWithNull()",
      "begin_line": 168,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 66)",
        "(line 170,col 9)-(line 170,col 27)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 172,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeObjects()",
      "begin_line": 175,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 66)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 180,col 34)",
        "(line 182,col 9)-(line 182,col 42)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 184,col 9)-(line 184,col 40)",
        "(line 185,col 9)-(line 186,col 34)",
        "(line 188,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 189,col 81)",
        "(line 191,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testInvalidEncoding()",
      "begin_line": 200,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 76)",
        "(line 202,col 12)-(line 202,col 41)",
        "(line 203,col 13)-(line 208,col 13)",
        "(line 209,col 13)-(line 214,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeObjects()",
      "begin_line": 217,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 66)",
        "(line 219,col 9)-(line 219,col 35)",
        "(line 220,col 9)-(line 220,col 65)",
        "(line 221,col 9)-(line 222,col 32)",
        "(line 224,col 9)-(line 224,col 42)",
        "(line 225,col 9)-(line 225,col 69)",
        "(line 226,col 9)-(line 226,col 40)",
        "(line 227,col 9)-(line 228,col 32)",
        "(line 230,col 9)-(line 230,col 54)",
        "(line 231,col 9)-(line 231,col 81)",
        "(line 233,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDefaultEncoding()",
      "begin_line": 242,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 38)",
        "(line 244,col 9)-(line 244,col 78)",
        "(line 245,col 9)-(line 245,col 30)",
        "(line 246,col 9)-(line 246,col 62)",
        "(line 247,col 9)-(line 247,col 48)",
        "(line 248,col 9)-(line 248,col 41)"
      ]
    }
  ]
}