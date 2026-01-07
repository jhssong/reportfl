{
  "filepath": "/tmp/Codec-5b/src/test/org/apache/commons/codec/binary/Base64Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64Test",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 37,
      "end_line": 1171,
      "comment": "\n * Test cases for Base64 class.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "_random"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.binary.Base64Test.Base64Test(java.lang.String)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a new instance of this test case.\n     * \n     * @param name\n     *            Name of the test case\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.getRandom()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * @return Returns the _random.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64()",
      "begin_line": 61,
      "end_line": 82,
      "comment": "\n     * Test the Base64 implementation\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 30)",
        "(line 64,col 9)-(line 64,col 85)",
        "(line 65,col 9)-(line 65,col 65)",
        "(line 66,col 9)-(line 66,col 86)",
        "(line 68,col 9)-(line 68,col 62)",
        "(line 69,col 9)-(line 69,col 69)",
        "(line 70,col 9)-(line 70,col 65)",
        "(line 71,col 9)-(line 71,col 86)",
        "(line 73,col 9)-(line 73,col 34)",
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 75,col 65)",
        "(line 76,col 9)-(line 76,col 86)",
        "(line 79,col 9)-(line 79,col 63)",
        "(line 80,col 9)-(line 80,col 64)",
        "(line 81,col 9)-(line 81,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testChunkedEncodeMultipleOf76()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * Tests Base64.encodeBase64().\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 82)",
        "(line 91,col 9)-(line 91,col 96)",
        "(line 92,col 9)-(line 92,col 69)",
        "(line 93,col 9)-(line 93,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec68()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 63)",
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger1()",
      "begin_line": 104,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 106,col 101)",
        "(line 108,col 9)-(line 108,col 77)",
        "(line 109,col 9)-(line 109,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger2()",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 102)",
        "(line 116,col 9)-(line 116,col 77)",
        "(line 117,col 9)-(line 117,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger3()",
      "begin_line": 120,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 125)",
        "(line 122,col 9)-(line 124,col 82)",
        "(line 126,col 9)-(line 126,col 77)",
        "(line 127,col 9)-(line 127,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger4()",
      "begin_line": 130,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 134,col 20)",
        "(line 135,col 9)-(line 140,col 56)",
        "(line 142,col 9)-(line 142,col 77)",
        "(line 143,col 9)-(line 143,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerEdgeCases()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerNull()",
      "begin_line": 150,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructors()",
      "begin_line": 161,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 22)",
        "(line 163,col 9)-(line 163,col 30)",
        "(line 164,col 9)-(line 164,col 32)",
        "(line 165,col 9)-(line 165,col 46)",
        "(line 166,col 9)-(line 166,col 46)",
        "(line 167,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 49)",
        "(line 186,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean()",
      "begin_line": 195,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 64)",
        "(line 197,col 9)-(line 197,col 63)",
        "(line 198,col 9)-(line 198,col 73)",
        "(line 199,col 9)-(line 199,col 60)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean_UrlSafe()",
      "begin_line": 204,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 63)",
        "(line 207,col 9)-(line 207,col 63)",
        "(line 208,col 9)-(line 208,col 73)",
        "(line 209,col 9)-(line 209,col 60)",
        "(line 210,col 9)-(line 210,col 60)",
        "(line 211,col 9)-(line 211,col 58)",
        "(line 212,col 9)-(line 212,col 58)",
        "(line 213,col 9)-(line 213,col 59)",
        "(line 214,col 9)-(line 214,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex2()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Tests conditional true branch for \"marker0\" test.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex3()",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * Tests conditional branches for \"marker1\" test.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 86)",
        "(line 229,col 9)-(line 229,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnly()",
      "begin_line": 232,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 78)",
        "(line 234,col 9)-(line 234,col 84)",
        "(line 236,col 9)-(line 236,col 77)",
        "(line 237,col 9)-(line 237,col 76)",
        "(line 238,col 9)-(line 238,col 75)",
        "(line 239,col 9)-(line 239,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnlyChunked()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 80)",
        "(line 244,col 9)-(line 244,col 86)",
        "(line 246,col 9)-(line 246,col 79)",
        "(line 247,col 9)-(line 247,col 78)",
        "(line 248,col 9)-(line 248,col 77)",
        "(line 249,col 9)-(line 249,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithWhitespace()",
      "begin_line": 252,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 49)",
        "(line 256,col 9)-(line 256,col 74)",
        "(line 257,col 9)-(line 257,col 79)",
        "(line 259,col 9)-(line 259,col 36)",
        "(line 260,col 9)-(line 260,col 37)",
        "(line 261,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 262,col 38)",
        "(line 264,col 9)-(line 264,col 73)",
        "(line 265,col 9)-(line 265,col 66)",
        "(line 267,col 9)-(line 267,col 48)",
        "(line 269,col 9)-(line 269,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDiscardWhitespace()",
      "begin_line": 272,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 49)",
        "(line 276,col 9)-(line 276,col 74)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 279,col 9)-(line 279,col 36)",
        "(line 280,col 9)-(line 280,col 37)",
        "(line 281,col 9)-(line 281,col 38)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 284,col 9)-(line 284,col 73)",
        "(line 285,col 9)-(line 285,col 69)",
        "(line 286,col 9)-(line 286,col 66)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 292,col 9)-(line 292,col 82)",
        "(line 293,col 9)-(line 293,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEmptyBase64()",
      "begin_line": 299,
      "end_line": 309,
      "comment": "\n     * Test encode and decode of empty byte array.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 35)",
        "(line 301,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 302,col 62)",
        "(line 303,col 9)-(line 303,col 77)",
        "(line 305,col 9)-(line 305,col 28)",
        "(line 306,col 9)-(line 306,col 44)",
        "(line 307,col 9)-(line 307,col 62)",
        "(line 308,col 9)-(line 308,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeRandom()",
      "begin_line": 312,
      "end_line": 321,
      "comment": " encode/decode a large random array",
      "child_ranges": [
        "(line 313,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeSmall()",
      "begin_line": 324,
      "end_line": 333,
      "comment": " encode/decode random arrays from size 0 to size 11",
      "child_ranges": [
        "(line 325,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize()",
      "begin_line": 335,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 34)",
        "(line 337,col 9)-(line 337,col 33)",
        "(line 338,col 9)-(line 338,col 33)",
        "(line 339,col 9)-(line 339,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize(int)",
      "begin_line": 342,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIgnoringNonBase64InDecode()",
      "begin_line": 351,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 353,col 148)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsArrayByteBase64()",
      "begin_line": 356,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 74)",
        "(line 358,col 9)-(line 358,col 64)",
        "(line 359,col 9)-(line 359,col 63)",
        "(line 360,col 9)-(line 360,col 61)",
        "(line 361,col 9)-(line 361,col 78)",
        "(line 362,col 9)-(line 362,col 74)",
        "(line 363,col 9)-(line 363,col 62)",
        "(line 364,col 9)-(line 364,col 79)",
        "(line 365,col 9)-(line 365,col 72)",
        "(line 366,col 9)-(line 366,col 72)",
        "(line 367,col 9)-(line 367,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsUrlSafe()",
      "begin_line": 373,
      "end_line": 382,
      "comment": "\n     * Tests isUrlSafe.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 50)",
        "(line 375,col 9)-(line 375,col 48)",
        "(line 377,col 9)-(line 377,col 74)",
        "(line 378,col 9)-(line 378,col 71)",
        "(line 380,col 9)-(line 380,col 52)",
        "(line 381,col 9)-(line 381,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownDecodings()",
      "begin_line": 384,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 386,col 118)",
        "(line 387,col 9)-(line 388,col 126)",
        "(line 389,col 9)-(line 390,col 102)",
        "(line 391,col 9)-(line 392,col 126)",
        "(line 393,col 9)-(line 394,col 38)",
        "(line 395,col 9)-(line 395,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownEncodings()",
      "begin_line": 398,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 400,col 100)",
        "(line 401,col 9)-(line 406,col 62)",
        "(line 407,col 9)-(line 408,col 106)",
        "(line 409,col 9)-(line 410,col 88)",
        "(line 411,col 9)-(line 412,col 106)",
        "(line 413,col 9)-(line 414,col 38)",
        "(line 415,col 9)-(line 415,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testNonBase64Test()",
      "begin_line": 418,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 30)",
        "(line 422,col 9)-(line 423,col 44)",
        "(line 425,col 9)-(line 436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithInvalidParameter()",
      "begin_line": 439,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 34)",
        "(line 442,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithValidParameter()",
      "begin_line": 451,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 41)",
        "(line 454,col 9)-(line 454,col 67)",
        "(line 456,col 9)-(line 456,col 34)",
        "(line 457,col 9)-(line 457,col 40)",
        "(line 458,col 9)-(line 458,col 45)",
        "(line 459,col 9)-(line 459,col 44)",
        "(line 461,col 9)-(line 461,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithInvalidParameter()",
      "begin_line": 464,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 34)",
        "(line 466,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithValidParameter()",
      "begin_line": 474,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 41)",
        "(line 477,col 9)-(line 477,col 52)",
        "(line 479,col 9)-(line 479,col 34)",
        "(line 480,col 9)-(line 480,col 46)",
        "(line 481,col 9)-(line 481,col 63)",
        "(line 482,col 9)-(line 482,col 41)",
        "(line 484,col 9)-(line 484,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncode()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 34)",
        "(line 489,col 9)-(line 489,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testPairs()",
      "begin_line": 492,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 80)",
        "(line 494,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section2Dot1CrLfDefinition()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Tests RFC 2045 section 2.1 CRLF definition.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section6Dot8ChunkSizeDefinition()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Tests RFC 2045 section 6.8 chuck size definition.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc1421Section6Dot8ChunkSizeDefinition()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Tests RFC 1421 section 4.3.2.4 chuck size definition.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Decode()",
      "begin_line": 535,
      "end_line": 543,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 80)",
        "(line 537,col 9)-(line 537,col 85)",
        "(line 538,col 9)-(line 538,col 86)",
        "(line 539,col 9)-(line 539,col 87)",
        "(line 540,col 9)-(line 540,col 92)",
        "(line 541,col 9)-(line 541,col 93)",
        "(line 542,col 9)-(line 542,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeWithCrLf()",
      "begin_line": 559,
      "end_line": 568,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 75)",
        "(line 561,col 9)-(line 561,col 87)",
        "(line 562,col 9)-(line 562,col 92)",
        "(line 563,col 9)-(line 563,col 93)",
        "(line 564,col 9)-(line 564,col 94)",
        "(line 565,col 9)-(line 565,col 99)",
        "(line 566,col 9)-(line 566,col 100)",
        "(line 567,col 9)-(line 567,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Encode()",
      "begin_line": 584,
      "end_line": 592,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeEncode()",
      "begin_line": 608,
      "end_line": 616,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeEncode(java.lang.String)",
      "begin_line": 618,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 92)",
        "(line 620,col 9)-(line 620,col 95)",
        "(line 621,col 9)-(line 621,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10EncodeDecode()",
      "begin_line": 638,
      "end_line": 646,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 29)",
        "(line 640,col 9)-(line 640,col 30)",
        "(line 641,col 9)-(line 641,col 31)",
        "(line 642,col 9)-(line 642,col 32)",
        "(line 643,col 9)-(line 643,col 33)",
        "(line 644,col 9)-(line 644,col 34)",
        "(line 645,col 9)-(line 645,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecode(java.lang.String)",
      "begin_line": 648,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 92)",
        "(line 650,col 9)-(line 650,col 92)",
        "(line 651,col 9)-(line 651,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletons()",
      "begin_line": 654,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 84)",
        "(line 656,col 9)-(line 656,col 84)",
        "(line 657,col 9)-(line 657,col 84)",
        "(line 658,col 9)-(line 658,col 84)",
        "(line 659,col 9)-(line 659,col 84)",
        "(line 660,col 9)-(line 660,col 84)",
        "(line 661,col 9)-(line 661,col 84)",
        "(line 662,col 9)-(line 662,col 84)",
        "(line 663,col 9)-(line 663,col 84)",
        "(line 664,col 9)-(line 664,col 84)",
        "(line 665,col 9)-(line 665,col 85)",
        "(line 666,col 9)-(line 666,col 85)",
        "(line 667,col 9)-(line 667,col 85)",
        "(line 668,col 9)-(line 668,col 85)",
        "(line 669,col 9)-(line 669,col 85)",
        "(line 670,col 9)-(line 670,col 85)",
        "(line 671,col 9)-(line 671,col 85)",
        "(line 672,col 9)-(line 672,col 85)",
        "(line 673,col 9)-(line 673,col 85)",
        "(line 674,col 9)-(line 674,col 85)",
        "(line 675,col 9)-(line 675,col 85)",
        "(line 676,col 9)-(line 676,col 85)",
        "(line 677,col 9)-(line 677,col 85)",
        "(line 678,col 9)-(line 678,col 85)",
        "(line 679,col 9)-(line 679,col 85)",
        "(line 680,col 9)-(line 680,col 85)",
        "(line 681,col 9)-(line 681,col 85)",
        "(line 682,col 9)-(line 682,col 85)",
        "(line 683,col 9)-(line 683,col 85)",
        "(line 684,col 9)-(line 684,col 85)",
        "(line 685,col 9)-(line 685,col 85)",
        "(line 686,col 9)-(line 686,col 85)",
        "(line 687,col 9)-(line 687,col 85)",
        "(line 688,col 9)-(line 688,col 85)",
        "(line 689,col 9)-(line 689,col 85)",
        "(line 690,col 9)-(line 690,col 85)",
        "(line 691,col 9)-(line 691,col 85)",
        "(line 692,col 9)-(line 692,col 85)",
        "(line 693,col 9)-(line 693,col 85)",
        "(line 694,col 9)-(line 694,col 85)",
        "(line 695,col 9)-(line 695,col 85)",
        "(line 696,col 9)-(line 696,col 85)",
        "(line 697,col 9)-(line 697,col 85)",
        "(line 698,col 9)-(line 698,col 85)",
        "(line 699,col 9)-(line 699,col 85)",
        "(line 700,col 9)-(line 700,col 85)",
        "(line 701,col 9)-(line 701,col 85)",
        "(line 702,col 9)-(line 702,col 85)",
        "(line 703,col 9)-(line 703,col 85)",
        "(line 704,col 9)-(line 704,col 85)",
        "(line 705,col 9)-(line 705,col 85)",
        "(line 706,col 9)-(line 706,col 85)",
        "(line 707,col 9)-(line 707,col 85)",
        "(line 708,col 9)-(line 708,col 85)",
        "(line 709,col 9)-(line 709,col 85)",
        "(line 710,col 9)-(line 710,col 85)",
        "(line 711,col 9)-(line 711,col 85)",
        "(line 712,col 9)-(line 712,col 85)",
        "(line 713,col 9)-(line 713,col 85)",
        "(line 714,col 9)-(line 714,col 85)",
        "(line 715,col 9)-(line 715,col 85)",
        "(line 716,col 9)-(line 716,col 85)",
        "(line 717,col 9)-(line 717,col 85)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 85)",
        "(line 721,col 9)-(line 721,col 85)",
        "(line 722,col 9)-(line 722,col 85)",
        "(line 723,col 9)-(line 723,col 85)",
        "(line 724,col 9)-(line 724,col 85)",
        "(line 725,col 9)-(line 725,col 85)",
        "(line 726,col 9)-(line 726,col 85)",
        "(line 727,col 9)-(line 727,col 85)",
        "(line 728,col 9)-(line 728,col 85)",
        "(line 729,col 9)-(line 729,col 85)",
        "(line 730,col 9)-(line 730,col 85)",
        "(line 731,col 9)-(line 731,col 85)",
        "(line 732,col 9)-(line 732,col 85)",
        "(line 733,col 9)-(line 733,col 85)",
        "(line 734,col 9)-(line 734,col 85)",
        "(line 735,col 9)-(line 735,col 85)",
        "(line 736,col 9)-(line 736,col 85)",
        "(line 737,col 9)-(line 737,col 85)",
        "(line 738,col 9)-(line 738,col 85)",
        "(line 739,col 9)-(line 739,col 85)",
        "(line 740,col 9)-(line 740,col 85)",
        "(line 741,col 9)-(line 741,col 85)",
        "(line 742,col 9)-(line 742,col 85)",
        "(line 743,col 9)-(line 743,col 85)",
        "(line 744,col 9)-(line 744,col 85)",
        "(line 745,col 9)-(line 745,col 85)",
        "(line 746,col 9)-(line 746,col 85)",
        "(line 747,col 9)-(line 747,col 85)",
        "(line 748,col 9)-(line 748,col 85)",
        "(line 749,col 9)-(line 749,col 85)",
        "(line 750,col 9)-(line 750,col 85)",
        "(line 751,col 9)-(line 751,col 85)",
        "(line 752,col 9)-(line 752,col 85)",
        "(line 753,col 9)-(line 753,col 85)",
        "(line 754,col 9)-(line 754,col 85)",
        "(line 755,col 9)-(line 755,col 86)",
        "(line 756,col 9)-(line 756,col 86)",
        "(line 757,col 9)-(line 757,col 86)",
        "(line 758,col 9)-(line 758,col 86)",
        "(line 759,col 9)-(line 759,col 86)",
        "(line 760,col 9)-(line 763,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletonsChunked()",
      "begin_line": 766,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 95)",
        "(line 768,col 9)-(line 768,col 95)",
        "(line 769,col 9)-(line 769,col 95)",
        "(line 770,col 9)-(line 770,col 95)",
        "(line 771,col 9)-(line 771,col 95)",
        "(line 772,col 9)-(line 772,col 95)",
        "(line 773,col 9)-(line 773,col 95)",
        "(line 774,col 9)-(line 774,col 95)",
        "(line 775,col 9)-(line 775,col 95)",
        "(line 776,col 9)-(line 776,col 95)",
        "(line 777,col 9)-(line 777,col 96)",
        "(line 778,col 9)-(line 778,col 96)",
        "(line 779,col 9)-(line 779,col 96)",
        "(line 780,col 9)-(line 780,col 96)",
        "(line 781,col 9)-(line 781,col 96)",
        "(line 782,col 9)-(line 782,col 96)",
        "(line 783,col 9)-(line 783,col 96)",
        "(line 784,col 9)-(line 784,col 96)",
        "(line 785,col 9)-(line 785,col 96)",
        "(line 786,col 9)-(line 786,col 96)",
        "(line 787,col 9)-(line 787,col 96)",
        "(line 788,col 9)-(line 788,col 96)",
        "(line 789,col 9)-(line 789,col 96)",
        "(line 790,col 9)-(line 790,col 96)",
        "(line 791,col 9)-(line 791,col 96)",
        "(line 792,col 9)-(line 792,col 96)",
        "(line 793,col 9)-(line 793,col 96)",
        "(line 794,col 9)-(line 794,col 96)",
        "(line 795,col 9)-(line 795,col 96)",
        "(line 796,col 9)-(line 796,col 96)",
        "(line 797,col 9)-(line 797,col 96)",
        "(line 798,col 9)-(line 798,col 96)",
        "(line 799,col 9)-(line 799,col 96)",
        "(line 800,col 9)-(line 800,col 96)",
        "(line 801,col 9)-(line 801,col 96)",
        "(line 802,col 9)-(line 802,col 96)",
        "(line 803,col 9)-(line 803,col 96)",
        "(line 804,col 9)-(line 804,col 96)",
        "(line 805,col 9)-(line 805,col 96)",
        "(line 806,col 9)-(line 806,col 96)",
        "(line 807,col 9)-(line 807,col 96)",
        "(line 808,col 9)-(line 808,col 96)",
        "(line 809,col 9)-(line 809,col 96)",
        "(line 810,col 9)-(line 810,col 96)",
        "(line 811,col 9)-(line 811,col 96)",
        "(line 812,col 9)-(line 812,col 96)",
        "(line 813,col 9)-(line 813,col 96)",
        "(line 814,col 9)-(line 814,col 96)",
        "(line 815,col 9)-(line 815,col 96)",
        "(line 816,col 9)-(line 816,col 96)",
        "(line 817,col 9)-(line 817,col 96)",
        "(line 818,col 9)-(line 818,col 96)",
        "(line 819,col 9)-(line 819,col 96)",
        "(line 820,col 9)-(line 820,col 96)",
        "(line 821,col 9)-(line 821,col 96)",
        "(line 822,col 9)-(line 822,col 96)",
        "(line 823,col 9)-(line 823,col 96)",
        "(line 824,col 9)-(line 824,col 96)",
        "(line 825,col 9)-(line 825,col 96)",
        "(line 826,col 9)-(line 826,col 96)",
        "(line 827,col 9)-(line 827,col 96)",
        "(line 828,col 9)-(line 828,col 96)",
        "(line 829,col 9)-(line 829,col 96)",
        "(line 830,col 9)-(line 830,col 96)",
        "(line 831,col 9)-(line 831,col 96)",
        "(line 832,col 9)-(line 832,col 96)",
        "(line 833,col 9)-(line 833,col 96)",
        "(line 834,col 9)-(line 834,col 96)",
        "(line 835,col 9)-(line 835,col 96)",
        "(line 836,col 9)-(line 836,col 96)",
        "(line 837,col 9)-(line 837,col 96)",
        "(line 838,col 9)-(line 838,col 96)",
        "(line 839,col 9)-(line 839,col 96)",
        "(line 840,col 9)-(line 840,col 96)",
        "(line 841,col 9)-(line 841,col 96)",
        "(line 842,col 9)-(line 842,col 96)",
        "(line 843,col 9)-(line 843,col 96)",
        "(line 844,col 9)-(line 844,col 96)",
        "(line 845,col 9)-(line 845,col 96)",
        "(line 846,col 9)-(line 846,col 96)",
        "(line 847,col 9)-(line 847,col 96)",
        "(line 848,col 9)-(line 848,col 96)",
        "(line 849,col 9)-(line 849,col 96)",
        "(line 850,col 9)-(line 850,col 96)",
        "(line 851,col 9)-(line 851,col 96)",
        "(line 852,col 9)-(line 852,col 96)",
        "(line 853,col 9)-(line 853,col 96)",
        "(line 854,col 9)-(line 854,col 96)",
        "(line 855,col 9)-(line 855,col 96)",
        "(line 856,col 9)-(line 856,col 96)",
        "(line 857,col 9)-(line 857,col 96)",
        "(line 858,col 9)-(line 858,col 96)",
        "(line 859,col 9)-(line 859,col 96)",
        "(line 860,col 9)-(line 860,col 96)",
        "(line 861,col 9)-(line 861,col 96)",
        "(line 862,col 9)-(line 862,col 96)",
        "(line 863,col 9)-(line 863,col 96)",
        "(line 864,col 9)-(line 864,col 96)",
        "(line 865,col 9)-(line 865,col 96)",
        "(line 866,col 9)-(line 866,col 96)",
        "(line 867,col 9)-(line 867,col 97)",
        "(line 868,col 9)-(line 868,col 97)",
        "(line 869,col 9)-(line 869,col 97)",
        "(line 870,col 9)-(line 870,col 97)",
        "(line 871,col 9)-(line 871,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTriplets()",
      "begin_line": 874,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 104)",
        "(line 876,col 9)-(line 876,col 104)",
        "(line 877,col 9)-(line 877,col 104)",
        "(line 878,col 9)-(line 878,col 104)",
        "(line 879,col 9)-(line 879,col 104)",
        "(line 880,col 9)-(line 880,col 104)",
        "(line 881,col 9)-(line 881,col 104)",
        "(line 882,col 9)-(line 882,col 104)",
        "(line 883,col 9)-(line 883,col 104)",
        "(line 884,col 9)-(line 884,col 104)",
        "(line 885,col 9)-(line 885,col 105)",
        "(line 886,col 9)-(line 886,col 105)",
        "(line 887,col 9)-(line 887,col 105)",
        "(line 888,col 9)-(line 888,col 105)",
        "(line 889,col 9)-(line 889,col 105)",
        "(line 890,col 9)-(line 890,col 105)",
        "(line 891,col 9)-(line 891,col 105)",
        "(line 892,col 9)-(line 892,col 105)",
        "(line 893,col 9)-(line 893,col 105)",
        "(line 894,col 9)-(line 894,col 105)",
        "(line 895,col 9)-(line 895,col 105)",
        "(line 896,col 9)-(line 896,col 105)",
        "(line 897,col 9)-(line 897,col 105)",
        "(line 898,col 9)-(line 898,col 105)",
        "(line 899,col 9)-(line 899,col 105)",
        "(line 900,col 9)-(line 900,col 105)",
        "(line 901,col 9)-(line 901,col 105)",
        "(line 902,col 9)-(line 902,col 105)",
        "(line 903,col 9)-(line 903,col 105)",
        "(line 904,col 9)-(line 904,col 105)",
        "(line 905,col 9)-(line 905,col 105)",
        "(line 906,col 9)-(line 906,col 105)",
        "(line 907,col 9)-(line 907,col 105)",
        "(line 908,col 9)-(line 908,col 105)",
        "(line 909,col 9)-(line 909,col 105)",
        "(line 910,col 9)-(line 910,col 105)",
        "(line 911,col 9)-(line 911,col 105)",
        "(line 912,col 9)-(line 912,col 105)",
        "(line 913,col 9)-(line 913,col 105)",
        "(line 914,col 9)-(line 914,col 105)",
        "(line 915,col 9)-(line 915,col 105)",
        "(line 916,col 9)-(line 916,col 105)",
        "(line 917,col 9)-(line 917,col 105)",
        "(line 918,col 9)-(line 918,col 105)",
        "(line 919,col 9)-(line 919,col 105)",
        "(line 920,col 9)-(line 920,col 105)",
        "(line 921,col 9)-(line 921,col 105)",
        "(line 922,col 9)-(line 922,col 105)",
        "(line 923,col 9)-(line 923,col 105)",
        "(line 924,col 9)-(line 924,col 105)",
        "(line 925,col 9)-(line 925,col 105)",
        "(line 926,col 9)-(line 926,col 105)",
        "(line 927,col 9)-(line 927,col 105)",
        "(line 928,col 9)-(line 928,col 105)",
        "(line 929,col 9)-(line 929,col 105)",
        "(line 930,col 9)-(line 930,col 105)",
        "(line 931,col 9)-(line 931,col 105)",
        "(line 932,col 9)-(line 932,col 105)",
        "(line 933,col 9)-(line 933,col 105)",
        "(line 934,col 9)-(line 934,col 105)",
        "(line 935,col 9)-(line 935,col 105)",
        "(line 936,col 9)-(line 936,col 105)",
        "(line 937,col 9)-(line 937,col 105)",
        "(line 938,col 9)-(line 938,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTripletsChunked()",
      "begin_line": 941,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 115)",
        "(line 943,col 9)-(line 943,col 115)",
        "(line 944,col 9)-(line 944,col 115)",
        "(line 945,col 9)-(line 945,col 115)",
        "(line 946,col 9)-(line 946,col 115)",
        "(line 947,col 9)-(line 947,col 115)",
        "(line 948,col 9)-(line 948,col 115)",
        "(line 949,col 9)-(line 949,col 115)",
        "(line 950,col 9)-(line 950,col 115)",
        "(line 951,col 9)-(line 951,col 115)",
        "(line 952,col 9)-(line 952,col 116)",
        "(line 953,col 9)-(line 953,col 116)",
        "(line 954,col 9)-(line 954,col 116)",
        "(line 955,col 9)-(line 955,col 116)",
        "(line 956,col 9)-(line 956,col 116)",
        "(line 957,col 9)-(line 957,col 116)",
        "(line 958,col 9)-(line 958,col 116)",
        "(line 959,col 9)-(line 959,col 116)",
        "(line 960,col 9)-(line 960,col 116)",
        "(line 961,col 9)-(line 961,col 116)",
        "(line 962,col 9)-(line 962,col 116)",
        "(line 963,col 9)-(line 963,col 116)",
        "(line 964,col 9)-(line 964,col 116)",
        "(line 965,col 9)-(line 965,col 116)",
        "(line 966,col 9)-(line 966,col 116)",
        "(line 967,col 9)-(line 967,col 116)",
        "(line 968,col 9)-(line 968,col 116)",
        "(line 969,col 9)-(line 969,col 116)",
        "(line 970,col 9)-(line 970,col 116)",
        "(line 971,col 9)-(line 971,col 116)",
        "(line 972,col 9)-(line 972,col 116)",
        "(line 973,col 9)-(line 973,col 116)",
        "(line 974,col 9)-(line 974,col 116)",
        "(line 975,col 9)-(line 975,col 116)",
        "(line 976,col 9)-(line 976,col 116)",
        "(line 977,col 9)-(line 977,col 116)",
        "(line 978,col 9)-(line 978,col 116)",
        "(line 979,col 9)-(line 979,col 116)",
        "(line 980,col 9)-(line 980,col 116)",
        "(line 981,col 9)-(line 981,col 116)",
        "(line 982,col 9)-(line 982,col 116)",
        "(line 983,col 9)-(line 983,col 116)",
        "(line 984,col 9)-(line 984,col 116)",
        "(line 985,col 9)-(line 985,col 116)",
        "(line 986,col 9)-(line 986,col 116)",
        "(line 987,col 9)-(line 987,col 116)",
        "(line 988,col 9)-(line 988,col 116)",
        "(line 989,col 9)-(line 989,col 116)",
        "(line 990,col 9)-(line 990,col 116)",
        "(line 991,col 9)-(line 991,col 116)",
        "(line 992,col 9)-(line 992,col 116)",
        "(line 993,col 9)-(line 993,col 116)",
        "(line 994,col 9)-(line 994,col 116)",
        "(line 995,col 9)-(line 995,col 116)",
        "(line 996,col 9)-(line 996,col 116)",
        "(line 997,col 9)-(line 997,col 116)",
        "(line 998,col 9)-(line 998,col 116)",
        "(line 999,col 9)-(line 999,col 116)",
        "(line 1000,col 9)-(line 1000,col 116)",
        "(line 1001,col 9)-(line 1001,col 116)",
        "(line 1002,col 9)-(line 1002,col 116)",
        "(line 1003,col 9)-(line 1003,col 116)",
        "(line 1004,col 9)-(line 1004,col 116)",
        "(line 1005,col 9)-(line 1005,col 116)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUrlSafe()",
      "begin_line": 1011,
      "end_line": 1024,
      "comment": "\n     * Tests url-safe Base64 against random data, sizes 0 to 150.\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1022,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUUID()",
      "begin_line": 1033,
      "end_line": 1119,
      "comment": "\n     * Base64 encoding of UUID\u0027s is a common use-case, especially in URL-SAFE mode. This test case ends up being the\n     * \"URL-SAFE\" JUnit\u0027s.\n     * \n     * @throws DecoderException\n     *             if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1036,col 37)",
        "(line 1039,col 9)-(line 1039,col 81)",
        "(line 1042,col 9)-(line 1042,col 81)",
        "(line 1045,col 9)-(line 1045,col 81)",
        "(line 1049,col 9)-(line 1049,col 81)",
        "(line 1051,col 9)-(line 1051,col 42)",
        "(line 1052,col 9)-(line 1052,col 75)",
        "(line 1053,col 9)-(line 1053,col 75)",
        "(line 1054,col 9)-(line 1054,col 75)",
        "(line 1055,col 9)-(line 1055,col 75)",
        "(line 1057,col 9)-(line 1057,col 42)",
        "(line 1059,col 9)-(line 1059,col 75)",
        "(line 1060,col 9)-(line 1060,col 75)",
        "(line 1061,col 9)-(line 1061,col 75)",
        "(line 1062,col 9)-(line 1062,col 75)",
        "(line 1064,col 9)-(line 1064,col 42)",
        "(line 1066,col 9)-(line 1066,col 74)",
        "(line 1067,col 9)-(line 1067,col 74)",
        "(line 1068,col 9)-(line 1068,col 74)",
        "(line 1069,col 9)-(line 1069,col 74)",
        "(line 1071,col 9)-(line 1071,col 42)",
        "(line 1073,col 9)-(line 1073,col 73)",
        "(line 1074,col 9)-(line 1074,col 73)",
        "(line 1075,col 9)-(line 1075,col 73)",
        "(line 1076,col 9)-(line 1076,col 73)",
        "(line 1078,col 9)-(line 1118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testByteToStringVariations()",
      "begin_line": 1121,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 38)",
        "(line 1123,col 9)-(line 1123,col 60)",
        "(line 1124,col 9)-(line 1124,col 32)",
        "(line 1125,col 9)-(line 1125,col 25)",
        "(line 1126,col 9)-(line 1126,col 84)",
        "(line 1128,col 9)-(line 1128,col 96)",
        "(line 1129,col 9)-(line 1129,col 111)",
        "(line 1130,col 9)-(line 1130,col 73)",
        "(line 1131,col 9)-(line 1131,col 84)",
        "(line 1132,col 9)-(line 1132,col 75)",
        "(line 1133,col 9)-(line 1133,col 86)",
        "(line 1134,col 9)-(line 1134,col 97)",
        "(line 1135,col 9)-(line 1135,col 112)",
        "(line 1136,col 9)-(line 1136,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testStringToByteVariations()",
      "begin_line": 1139,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 37)",
        "(line 1141,col 9)-(line 1141,col 43)",
        "(line 1142,col 9)-(line 1142,col 23)",
        "(line 1143,col 9)-(line 1143,col 25)",
        "(line 1144,col 9)-(line 1144,col 52)",
        "(line 1145,col 9)-(line 1145,col 46)",
        "(line 1146,col 9)-(line 1146,col 84)",
        "(line 1148,col 9)-(line 1148,col 110)",
        "(line 1149,col 9)-(line 1149,col 126)",
        "(line 1150,col 9)-(line 1150,col 123)",
        "(line 1151,col 9)-(line 1151,col 92)",
        "(line 1152,col 9)-(line 1152,col 105)",
        "(line 1153,col 9)-(line 1153,col 94)",
        "(line 1154,col 9)-(line 1154,col 107)",
        "(line 1155,col 9)-(line 1155,col 79)",
        "(line 1156,col 9)-(line 1156,col 92)",
        "(line 1157,col 9)-(line 1157,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.toString(byte[])",
      "begin_line": 1160,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 46)",
        "(line 1162,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 30)"
      ]
    }
  ]
}