{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/net/QuotedPrintableCodecTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QuotedPrintableCodecTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 355,
      "comment": "\n * Quoted-printable codec test cases\n * \n * @author \u003ca href\u003d\"mailto:oleg@ural.ru\"\u003eOleg Kalnichevski\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SWISS_GERMAN_STUFF_UNICODE"
      ],
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RUSSIAN_STUFF_UNICODE"
      ],
      "begin_line": 41,
      "end_line": 44,
      "comment": ""
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
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 66)",
        "(line 77,col 9)-(line 77,col 45)",
        "(line 78,col 9)-(line 78,col 47)",
        "(line 79,col 9)-(line 80,col 50)",
        "(line 81,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSafeCharEncodeDecode()",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 60)",
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 91,col 28)",
        "(line 92,col 9)-(line 93,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUnsafeEncodeDecode()",
      "begin_line": 97,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 66)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 47)",
        "(line 102,col 9)-(line 103,col 34)",
        "(line 104,col 9)-(line 105,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeDecodeNull()",
      "begin_line": 108,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 66)",
        "(line 111,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 114,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeInvalid()",
      "begin_line": 118,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeNull()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 66)",
        "(line 144,col 9)-(line 144,col 28)",
        "(line 145,col 9)-(line 145,col 47)",
        "(line 146,col 9)-(line 147,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeUrlWithNullBitSet()",
      "begin_line": 150,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 159,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeWithNullArray()",
      "begin_line": 163,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 28)",
        "(line 166,col 9)-(line 166,col 76)",
        "(line 167,col 9)-(line 167,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeStringWithNull()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 66)",
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeStringWithNull()",
      "begin_line": 178,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 66)",
        "(line 181,col 9)-(line 181,col 27)",
        "(line 182,col 9)-(line 182,col 58)",
        "(line 183,col 9)-(line 183,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testEncodeObjects()",
      "begin_line": 186,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 66)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 192,col 34)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 69)",
        "(line 196,col 9)-(line 196,col 40)",
        "(line 197,col 9)-(line 198,col 34)",
        "(line 200,col 9)-(line 200,col 54)",
        "(line 201,col 9)-(line 201,col 81)",
        "(line 203,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testInvalidEncoding()",
      "begin_line": 212,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 76)",
        "(line 215,col 12)-(line 215,col 41)",
        "(line 216,col 13)-(line 221,col 13)",
        "(line 222,col 13)-(line 227,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDecodeObjects()",
      "begin_line": 230,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 66)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 65)",
        "(line 235,col 9)-(line 236,col 32)",
        "(line 238,col 9)-(line 238,col 49)",
        "(line 239,col 9)-(line 239,col 69)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 242,col 32)",
        "(line 244,col 9)-(line 244,col 54)",
        "(line 245,col 9)-(line 245,col 81)",
        "(line 247,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testDefaultEncoding()",
      "begin_line": 256,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 38)",
        "(line 259,col 9)-(line 259,col 78)",
        "(line 260,col 9)-(line 260,col 30)",
        "(line 261,col 9)-(line 261,col 62)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 263,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSoftLineBreakDecode()",
      "begin_line": 266,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 269,col 62)",
        "(line 270,col 9)-(line 271,col 62)",
        "(line 273,col 9)-(line 273,col 66)",
        "(line 274,col 9)-(line 274,col 55)",
        "(line 276,col 9)-(line 276,col 50)",
        "(line 277,col 9)-(line 277,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSoftLineBreakEncode()",
      "begin_line": 280,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 285,col 50)",
        "(line 287,col 9)-(line 287,col 66)",
        "(line 288,col 9)-(line 288,col 55)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 291,col 9)-(line 291,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testSkipNotEncodedCRLF()",
      "begin_line": 294,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 98)",
        "(line 297,col 9)-(line 297,col 87)",
        "(line 299,col 9)-(line 299,col 66)",
        "(line 300,col 9)-(line 300,col 55)",
        "(line 302,col 9)-(line 302,col 50)",
        "(line 303,col 9)-(line 303,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testTrailingSpecial()",
      "begin_line": 306,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 72)",
        "(line 310,col 9)-(line 310,col 109)",
        "(line 311,col 9)-(line 311,col 120)",
        "(line 312,col 9)-(line 312,col 54)",
        "(line 314,col 9)-(line 314,col 103)",
        "(line 315,col 9)-(line 315,col 113)",
        "(line 316,col 9)-(line 316,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testUltimateSoftBreak()",
      "begin_line": 319,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 72)",
        "(line 323,col 9)-(line 323,col 99)",
        "(line 324,col 9)-(line 324,col 109)",
        "(line 326,col 9)-(line 326,col 54)",
        "(line 328,col 9)-(line 328,col 91)",
        "(line 329,col 9)-(line 329,col 102)",
        "(line 331,col 9)-(line 331,col 54)",
        "(line 334,col 9)-(line 334,col 90)",
        "(line 335,col 9)-(line 335,col 103)",
        "(line 337,col 9)-(line 337,col 54)",
        "(line 340,col 9)-(line 340,col 90)",
        "(line 341,col 9)-(line 341,col 103)",
        "(line 343,col 9)-(line 343,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.net.QuotedPrintableCodecTest.testFinalBytes()",
      "begin_line": 346,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 90)",
        "(line 350,col 9)-(line 350,col 96)",
        "(line 352,col 9)-(line 352,col 73)"
      ]
    }
  ]
}