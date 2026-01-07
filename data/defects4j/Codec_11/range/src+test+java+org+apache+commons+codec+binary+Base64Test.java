{
  "filepath": "/tmp/Codec-11b/src/test/java/org/apache/commons/codec/binary/Base64Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 1239,
      "comment": "\n * Test cases for Base64 class.\n * \n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "_random"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.getRandom()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * @return Returns the _random.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsStringBase64()",
      "begin_line": 57,
      "end_line": 74,
      "comment": "\n     * Test the isStringBase64 method.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 33)",
        "(line 60,col 9)-(line 60,col 32)",
        "(line 61,col 9)-(line 61,col 97)",
        "(line 62,col 9)-(line 62,col 55)",
        "(line 64,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 96)",
        "(line 72,col 9)-(line 72,col 96)",
        "(line 73,col 9)-(line 73,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64()",
      "begin_line": 79,
      "end_line": 101,
      "comment": "\n     * Test the Base64 implementation\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 39)",
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 83,col 85)",
        "(line 84,col 9)-(line 84,col 65)",
        "(line 85,col 9)-(line 85,col 86)",
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 69)",
        "(line 89,col 9)-(line 89,col 65)",
        "(line 90,col 9)-(line 90,col 86)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 69)",
        "(line 94,col 9)-(line 94,col 65)",
        "(line 95,col 9)-(line 95,col 86)",
        "(line 98,col 9)-(line 98,col 93)",
        "(line 99,col 9)-(line 99,col 64)",
        "(line 100,col 9)-(line 100,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testChunkedEncodeMultipleOf76()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * Tests Base64.encodeBase64().\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 82)",
        "(line 111,col 9)-(line 111,col 96)",
        "(line 112,col 9)-(line 112,col 69)",
        "(line 113,col 9)-(line 113,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec68()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 63)",
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger1()",
      "begin_line": 125,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 101)",
        "(line 130,col 9)-(line 130,col 77)",
        "(line 131,col 9)-(line 131,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger2()",
      "begin_line": 134,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 60)",
        "(line 137,col 9)-(line 137,col 102)",
        "(line 139,col 9)-(line 139,col 77)",
        "(line 140,col 9)-(line 140,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger3()",
      "begin_line": 143,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 125)",
        "(line 146,col 9)-(line 148,col 82)",
        "(line 150,col 9)-(line 150,col 77)",
        "(line 151,col 9)-(line 151,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger4()",
      "begin_line": 154,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 159,col 20)",
        "(line 160,col 9)-(line 165,col 56)",
        "(line 167,col 9)-(line 167,col 77)",
        "(line 168,col 9)-(line 168,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerEdgeCases()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerNull()",
      "begin_line": 176,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructors()",
      "begin_line": 188,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 191,col 30)",
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 193,col 46)",
        "(line 194,col 9)-(line 194,col 46)",
        "(line 195,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 72)",
        "(line 221,col 9)-(line 221,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean()",
      "begin_line": 224,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 64)",
        "(line 227,col 9)-(line 227,col 63)",
        "(line 228,col 9)-(line 228,col 73)",
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 59)",
        "(line 231,col 9)-(line 231,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean_UrlSafe()",
      "begin_line": 234,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 63)",
        "(line 238,col 9)-(line 238,col 63)",
        "(line 239,col 9)-(line 239,col 73)",
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 243,col 58)",
        "(line 244,col 9)-(line 244,col 59)",
        "(line 245,col 9)-(line 245,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex2()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * Tests conditional true branch for \"marker0\" test.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex3()",
      "begin_line": 259,
      "end_line": 263,
      "comment": "\n     * Tests conditional branches for \"marker1\" test.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 86)",
        "(line 262,col 9)-(line 262,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnly()",
      "begin_line": 265,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 78)",
        "(line 268,col 9)-(line 268,col 84)",
        "(line 270,col 9)-(line 270,col 77)",
        "(line 271,col 9)-(line 271,col 76)",
        "(line 272,col 9)-(line 272,col 75)",
        "(line 273,col 9)-(line 273,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnlyChunked()",
      "begin_line": 276,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 80)",
        "(line 279,col 9)-(line 279,col 86)",
        "(line 281,col 9)-(line 281,col 79)",
        "(line 282,col 9)-(line 282,col 78)",
        "(line 283,col 9)-(line 283,col 77)",
        "(line 284,col 9)-(line 284,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithWhitespace()",
      "begin_line": 287,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 49)",
        "(line 292,col 9)-(line 292,col 74)",
        "(line 293,col 9)-(line 293,col 79)",
        "(line 295,col 9)-(line 295,col 36)",
        "(line 296,col 9)-(line 296,col 37)",
        "(line 297,col 9)-(line 297,col 38)",
        "(line 298,col 9)-(line 298,col 38)",
        "(line 300,col 9)-(line 300,col 73)",
        "(line 301,col 9)-(line 301,col 66)",
        "(line 303,col 9)-(line 303,col 48)",
        "(line 305,col 9)-(line 305,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEmptyBase64()",
      "begin_line": 311,
      "end_line": 322,
      "comment": "\n     * Test encode and decode of empty byte array.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 51)",
        "(line 315,col 9)-(line 315,col 62)",
        "(line 316,col 9)-(line 316,col 77)",
        "(line 318,col 9)-(line 318,col 28)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 320,col 62)",
        "(line 321,col 9)-(line 321,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeRandom()",
      "begin_line": 325,
      "end_line": 335,
      "comment": " encode/decode a large random array",
      "child_ranges": [
        "(line 327,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeSmall()",
      "begin_line": 338,
      "end_line": 348,
      "comment": " encode/decode random arrays from size 0 to size 11",
      "child_ranges": [
        "(line 340,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 34)",
        "(line 353,col 9)-(line 353,col 33)",
        "(line 354,col 9)-(line 354,col 33)",
        "(line 355,col 9)-(line 355,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec112()",
      "begin_line": 358,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 35)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize(int)",
      "begin_line": 365,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIgnoringNonBase64InDecode()",
      "begin_line": 374,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 377,col 148)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsArrayByteBase64()",
      "begin_line": 380,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 65)",
        "(line 383,col 9)-(line 383,col 55)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 52)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 65)",
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 70)",
        "(line 390,col 9)-(line 390,col 63)",
        "(line 391,col 9)-(line 391,col 63)",
        "(line 392,col 9)-(line 392,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsUrlSafe()",
      "begin_line": 398,
      "end_line": 408,
      "comment": "\n     * Tests isUrlSafe.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 50)",
        "(line 401,col 9)-(line 401,col 48)",
        "(line 403,col 9)-(line 403,col 74)",
        "(line 404,col 9)-(line 404,col 71)",
        "(line 406,col 9)-(line 406,col 52)",
        "(line 407,col 9)-(line 407,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownDecodings()",
      "begin_line": 410,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 413,col 118)",
        "(line 414,col 9)-(line 415,col 126)",
        "(line 416,col 9)-(line 417,col 102)",
        "(line 418,col 9)-(line 419,col 126)",
        "(line 420,col 9)-(line 421,col 38)",
        "(line 422,col 9)-(line 422,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownEncodings()",
      "begin_line": 425,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 428,col 100)",
        "(line 429,col 9)-(line 434,col 62)",
        "(line 435,col 9)-(line 436,col 106)",
        "(line 437,col 9)-(line 438,col 88)",
        "(line 439,col 9)-(line 440,col 106)",
        "(line 441,col 9)-(line 442,col 38)",
        "(line 443,col 9)-(line 443,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testNonBase64Test()",
      "begin_line": 446,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 30)",
        "(line 451,col 9)-(line 452,col 35)",
        "(line 454,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithInvalidParameter()",
      "begin_line": 468,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 34)",
        "(line 472,col 9)-(line 477,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithValidParameter()",
      "begin_line": 481,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 41)",
        "(line 485,col 9)-(line 485,col 67)",
        "(line 487,col 9)-(line 487,col 34)",
        "(line 488,col 9)-(line 488,col 40)",
        "(line 489,col 9)-(line 489,col 45)",
        "(line 490,col 9)-(line 490,col 44)",
        "(line 492,col 9)-(line 492,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithInvalidParameter()",
      "begin_line": 495,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 34)",
        "(line 498,col 9)-(line 503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithValidParameter()",
      "begin_line": 506,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 41)",
        "(line 510,col 9)-(line 510,col 52)",
        "(line 512,col 9)-(line 512,col 34)",
        "(line 513,col 9)-(line 513,col 46)",
        "(line 514,col 9)-(line 514,col 63)",
        "(line 515,col 9)-(line 515,col 41)",
        "(line 517,col 9)-(line 517,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncode()",
      "begin_line": 520,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 34)",
        "(line 523,col 9)-(line 523,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testPairs()",
      "begin_line": 526,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 80)",
        "(line 529,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section2Dot1CrLfDefinition()",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Tests RFC 2045 section 2.1 CRLF definition.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section6Dot8ChunkSizeDefinition()",
      "begin_line": 546,
      "end_line": 549,
      "comment": "\n     * Tests RFC 2045 section 6.8 chuck size definition.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc1421Section6Dot8ChunkSizeDefinition()",
      "begin_line": 554,
      "end_line": 557,
      "comment": "\n     * Tests RFC 1421 section 4.3.2.4 chuck size definition.\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Decode()",
      "begin_line": 573,
      "end_line": 582,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 80)",
        "(line 576,col 9)-(line 576,col 85)",
        "(line 577,col 9)-(line 577,col 86)",
        "(line 578,col 9)-(line 578,col 87)",
        "(line 579,col 9)-(line 579,col 92)",
        "(line 580,col 9)-(line 580,col 93)",
        "(line 581,col 9)-(line 581,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeWithCrLf()",
      "begin_line": 598,
      "end_line": 608,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 75)",
        "(line 601,col 9)-(line 601,col 87)",
        "(line 602,col 9)-(line 602,col 92)",
        "(line 603,col 9)-(line 603,col 93)",
        "(line 604,col 9)-(line 604,col 94)",
        "(line 605,col 9)-(line 605,col 99)",
        "(line 606,col 9)-(line 606,col 100)",
        "(line 607,col 9)-(line 607,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Encode()",
      "begin_line": 624,
      "end_line": 633,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 82)",
        "(line 627,col 9)-(line 627,col 87)",
        "(line 628,col 9)-(line 628,col 88)",
        "(line 629,col 9)-(line 629,col 89)",
        "(line 630,col 9)-(line 630,col 94)",
        "(line 631,col 9)-(line 631,col 95)",
        "(line 632,col 9)-(line 632,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeEncode()",
      "begin_line": 649,
      "end_line": 658,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeEncode(java.lang.String)",
      "begin_line": 660,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 92)",
        "(line 662,col 9)-(line 662,col 95)",
        "(line 663,col 9)-(line 663,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10EncodeDecode()",
      "begin_line": 680,
      "end_line": 689,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 29)",
        "(line 683,col 9)-(line 683,col 30)",
        "(line 684,col 9)-(line 684,col 31)",
        "(line 685,col 9)-(line 685,col 32)",
        "(line 686,col 9)-(line 686,col 33)",
        "(line 687,col 9)-(line 687,col 34)",
        "(line 688,col 9)-(line 688,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecode(java.lang.String)",
      "begin_line": 691,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 92)",
        "(line 693,col 9)-(line 693,col 92)",
        "(line 694,col 9)-(line 694,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletons()",
      "begin_line": 697,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 84)",
        "(line 700,col 9)-(line 700,col 84)",
        "(line 701,col 9)-(line 701,col 84)",
        "(line 702,col 9)-(line 702,col 84)",
        "(line 703,col 9)-(line 703,col 84)",
        "(line 704,col 9)-(line 704,col 84)",
        "(line 705,col 9)-(line 705,col 84)",
        "(line 706,col 9)-(line 706,col 84)",
        "(line 707,col 9)-(line 707,col 84)",
        "(line 708,col 9)-(line 708,col 84)",
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
        "(line 755,col 9)-(line 755,col 85)",
        "(line 756,col 9)-(line 756,col 85)",
        "(line 757,col 9)-(line 757,col 85)",
        "(line 758,col 9)-(line 758,col 85)",
        "(line 759,col 9)-(line 759,col 85)",
        "(line 760,col 9)-(line 760,col 85)",
        "(line 761,col 9)-(line 761,col 85)",
        "(line 762,col 9)-(line 762,col 85)",
        "(line 763,col 9)-(line 763,col 85)",
        "(line 764,col 9)-(line 764,col 85)",
        "(line 765,col 9)-(line 765,col 85)",
        "(line 766,col 9)-(line 766,col 85)",
        "(line 767,col 9)-(line 767,col 85)",
        "(line 768,col 9)-(line 768,col 85)",
        "(line 769,col 9)-(line 769,col 85)",
        "(line 770,col 9)-(line 770,col 85)",
        "(line 771,col 9)-(line 771,col 85)",
        "(line 772,col 9)-(line 772,col 85)",
        "(line 773,col 9)-(line 773,col 85)",
        "(line 774,col 9)-(line 774,col 85)",
        "(line 775,col 9)-(line 775,col 85)",
        "(line 776,col 9)-(line 776,col 85)",
        "(line 777,col 9)-(line 777,col 85)",
        "(line 778,col 9)-(line 778,col 85)",
        "(line 779,col 9)-(line 779,col 85)",
        "(line 780,col 9)-(line 780,col 85)",
        "(line 781,col 9)-(line 781,col 85)",
        "(line 782,col 9)-(line 782,col 85)",
        "(line 783,col 9)-(line 783,col 85)",
        "(line 784,col 9)-(line 784,col 85)",
        "(line 785,col 9)-(line 785,col 85)",
        "(line 786,col 9)-(line 786,col 85)",
        "(line 787,col 9)-(line 787,col 85)",
        "(line 788,col 9)-(line 788,col 85)",
        "(line 789,col 9)-(line 789,col 85)",
        "(line 790,col 9)-(line 790,col 85)",
        "(line 791,col 9)-(line 791,col 85)",
        "(line 792,col 9)-(line 792,col 85)",
        "(line 793,col 9)-(line 793,col 85)",
        "(line 794,col 9)-(line 794,col 85)",
        "(line 795,col 9)-(line 795,col 85)",
        "(line 796,col 9)-(line 796,col 85)",
        "(line 797,col 9)-(line 797,col 85)",
        "(line 798,col 9)-(line 798,col 85)",
        "(line 799,col 9)-(line 799,col 86)",
        "(line 800,col 9)-(line 800,col 86)",
        "(line 801,col 9)-(line 801,col 86)",
        "(line 802,col 9)-(line 802,col 86)",
        "(line 803,col 9)-(line 803,col 86)",
        "(line 804,col 9)-(line 807,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletonsChunked()",
      "begin_line": 810,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 95)",
        "(line 813,col 9)-(line 813,col 95)",
        "(line 814,col 9)-(line 814,col 95)",
        "(line 815,col 9)-(line 815,col 95)",
        "(line 816,col 9)-(line 816,col 95)",
        "(line 817,col 9)-(line 817,col 95)",
        "(line 818,col 9)-(line 818,col 95)",
        "(line 819,col 9)-(line 819,col 95)",
        "(line 820,col 9)-(line 820,col 95)",
        "(line 821,col 9)-(line 821,col 95)",
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
        "(line 867,col 9)-(line 867,col 96)",
        "(line 868,col 9)-(line 868,col 96)",
        "(line 869,col 9)-(line 869,col 96)",
        "(line 870,col 9)-(line 870,col 96)",
        "(line 871,col 9)-(line 871,col 96)",
        "(line 872,col 9)-(line 872,col 96)",
        "(line 873,col 9)-(line 873,col 96)",
        "(line 874,col 9)-(line 874,col 96)",
        "(line 875,col 9)-(line 875,col 96)",
        "(line 876,col 9)-(line 876,col 96)",
        "(line 877,col 9)-(line 877,col 96)",
        "(line 878,col 9)-(line 878,col 96)",
        "(line 879,col 9)-(line 879,col 96)",
        "(line 880,col 9)-(line 880,col 96)",
        "(line 881,col 9)-(line 881,col 96)",
        "(line 882,col 9)-(line 882,col 96)",
        "(line 883,col 9)-(line 883,col 96)",
        "(line 884,col 9)-(line 884,col 96)",
        "(line 885,col 9)-(line 885,col 96)",
        "(line 886,col 9)-(line 886,col 96)",
        "(line 887,col 9)-(line 887,col 96)",
        "(line 888,col 9)-(line 888,col 96)",
        "(line 889,col 9)-(line 889,col 96)",
        "(line 890,col 9)-(line 890,col 96)",
        "(line 891,col 9)-(line 891,col 96)",
        "(line 892,col 9)-(line 892,col 96)",
        "(line 893,col 9)-(line 893,col 96)",
        "(line 894,col 9)-(line 894,col 96)",
        "(line 895,col 9)-(line 895,col 96)",
        "(line 896,col 9)-(line 896,col 96)",
        "(line 897,col 9)-(line 897,col 96)",
        "(line 898,col 9)-(line 898,col 96)",
        "(line 899,col 9)-(line 899,col 96)",
        "(line 900,col 9)-(line 900,col 96)",
        "(line 901,col 9)-(line 901,col 96)",
        "(line 902,col 9)-(line 902,col 96)",
        "(line 903,col 9)-(line 903,col 96)",
        "(line 904,col 9)-(line 904,col 96)",
        "(line 905,col 9)-(line 905,col 96)",
        "(line 906,col 9)-(line 906,col 96)",
        "(line 907,col 9)-(line 907,col 96)",
        "(line 908,col 9)-(line 908,col 96)",
        "(line 909,col 9)-(line 909,col 96)",
        "(line 910,col 9)-(line 910,col 96)",
        "(line 911,col 9)-(line 911,col 96)",
        "(line 912,col 9)-(line 912,col 97)",
        "(line 913,col 9)-(line 913,col 97)",
        "(line 914,col 9)-(line 914,col 97)",
        "(line 915,col 9)-(line 915,col 97)",
        "(line 916,col 9)-(line 916,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTriplets()",
      "begin_line": 919,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 104)",
        "(line 922,col 9)-(line 922,col 104)",
        "(line 923,col 9)-(line 923,col 104)",
        "(line 924,col 9)-(line 924,col 104)",
        "(line 925,col 9)-(line 925,col 104)",
        "(line 926,col 9)-(line 926,col 104)",
        "(line 927,col 9)-(line 927,col 104)",
        "(line 928,col 9)-(line 928,col 104)",
        "(line 929,col 9)-(line 929,col 104)",
        "(line 930,col 9)-(line 930,col 104)",
        "(line 931,col 9)-(line 931,col 105)",
        "(line 932,col 9)-(line 932,col 105)",
        "(line 933,col 9)-(line 933,col 105)",
        "(line 934,col 9)-(line 934,col 105)",
        "(line 935,col 9)-(line 935,col 105)",
        "(line 936,col 9)-(line 936,col 105)",
        "(line 937,col 9)-(line 937,col 105)",
        "(line 938,col 9)-(line 938,col 105)",
        "(line 939,col 9)-(line 939,col 105)",
        "(line 940,col 9)-(line 940,col 105)",
        "(line 941,col 9)-(line 941,col 105)",
        "(line 942,col 9)-(line 942,col 105)",
        "(line 943,col 9)-(line 943,col 105)",
        "(line 944,col 9)-(line 944,col 105)",
        "(line 945,col 9)-(line 945,col 105)",
        "(line 946,col 9)-(line 946,col 105)",
        "(line 947,col 9)-(line 947,col 105)",
        "(line 948,col 9)-(line 948,col 105)",
        "(line 949,col 9)-(line 949,col 105)",
        "(line 950,col 9)-(line 950,col 105)",
        "(line 951,col 9)-(line 951,col 105)",
        "(line 952,col 9)-(line 952,col 105)",
        "(line 953,col 9)-(line 953,col 105)",
        "(line 954,col 9)-(line 954,col 105)",
        "(line 955,col 9)-(line 955,col 105)",
        "(line 956,col 9)-(line 956,col 105)",
        "(line 957,col 9)-(line 957,col 105)",
        "(line 958,col 9)-(line 958,col 105)",
        "(line 959,col 9)-(line 959,col 105)",
        "(line 960,col 9)-(line 960,col 105)",
        "(line 961,col 9)-(line 961,col 105)",
        "(line 962,col 9)-(line 962,col 105)",
        "(line 963,col 9)-(line 963,col 105)",
        "(line 964,col 9)-(line 964,col 105)",
        "(line 965,col 9)-(line 965,col 105)",
        "(line 966,col 9)-(line 966,col 105)",
        "(line 967,col 9)-(line 967,col 105)",
        "(line 968,col 9)-(line 968,col 105)",
        "(line 969,col 9)-(line 969,col 105)",
        "(line 970,col 9)-(line 970,col 105)",
        "(line 971,col 9)-(line 971,col 105)",
        "(line 972,col 9)-(line 972,col 105)",
        "(line 973,col 9)-(line 973,col 105)",
        "(line 974,col 9)-(line 974,col 105)",
        "(line 975,col 9)-(line 975,col 105)",
        "(line 976,col 9)-(line 976,col 105)",
        "(line 977,col 9)-(line 977,col 105)",
        "(line 978,col 9)-(line 978,col 105)",
        "(line 979,col 9)-(line 979,col 105)",
        "(line 980,col 9)-(line 980,col 105)",
        "(line 981,col 9)-(line 981,col 105)",
        "(line 982,col 9)-(line 982,col 105)",
        "(line 983,col 9)-(line 983,col 105)",
        "(line 984,col 9)-(line 984,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTripletsChunked()",
      "begin_line": 987,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 115)",
        "(line 990,col 9)-(line 990,col 115)",
        "(line 991,col 9)-(line 991,col 115)",
        "(line 992,col 9)-(line 992,col 115)",
        "(line 993,col 9)-(line 993,col 115)",
        "(line 994,col 9)-(line 994,col 115)",
        "(line 995,col 9)-(line 995,col 115)",
        "(line 996,col 9)-(line 996,col 115)",
        "(line 997,col 9)-(line 997,col 115)",
        "(line 998,col 9)-(line 998,col 115)",
        "(line 999,col 9)-(line 999,col 116)",
        "(line 1000,col 9)-(line 1000,col 116)",
        "(line 1001,col 9)-(line 1001,col 116)",
        "(line 1002,col 9)-(line 1002,col 116)",
        "(line 1003,col 9)-(line 1003,col 116)",
        "(line 1004,col 9)-(line 1004,col 116)",
        "(line 1005,col 9)-(line 1005,col 116)",
        "(line 1006,col 9)-(line 1006,col 116)",
        "(line 1007,col 9)-(line 1007,col 116)",
        "(line 1008,col 9)-(line 1008,col 116)",
        "(line 1009,col 9)-(line 1009,col 116)",
        "(line 1010,col 9)-(line 1010,col 116)",
        "(line 1011,col 9)-(line 1011,col 116)",
        "(line 1012,col 9)-(line 1012,col 116)",
        "(line 1013,col 9)-(line 1013,col 116)",
        "(line 1014,col 9)-(line 1014,col 116)",
        "(line 1015,col 9)-(line 1015,col 116)",
        "(line 1016,col 9)-(line 1016,col 116)",
        "(line 1017,col 9)-(line 1017,col 116)",
        "(line 1018,col 9)-(line 1018,col 116)",
        "(line 1019,col 9)-(line 1019,col 116)",
        "(line 1020,col 9)-(line 1020,col 116)",
        "(line 1021,col 9)-(line 1021,col 116)",
        "(line 1022,col 9)-(line 1022,col 116)",
        "(line 1023,col 9)-(line 1023,col 116)",
        "(line 1024,col 9)-(line 1024,col 116)",
        "(line 1025,col 9)-(line 1025,col 116)",
        "(line 1026,col 9)-(line 1026,col 116)",
        "(line 1027,col 9)-(line 1027,col 116)",
        "(line 1028,col 9)-(line 1028,col 116)",
        "(line 1029,col 9)-(line 1029,col 116)",
        "(line 1030,col 9)-(line 1030,col 116)",
        "(line 1031,col 9)-(line 1031,col 116)",
        "(line 1032,col 9)-(line 1032,col 116)",
        "(line 1033,col 9)-(line 1033,col 116)",
        "(line 1034,col 9)-(line 1034,col 116)",
        "(line 1035,col 9)-(line 1035,col 116)",
        "(line 1036,col 9)-(line 1036,col 116)",
        "(line 1037,col 9)-(line 1037,col 116)",
        "(line 1038,col 9)-(line 1038,col 116)",
        "(line 1039,col 9)-(line 1039,col 116)",
        "(line 1040,col 9)-(line 1040,col 116)",
        "(line 1041,col 9)-(line 1041,col 116)",
        "(line 1042,col 9)-(line 1042,col 116)",
        "(line 1043,col 9)-(line 1043,col 116)",
        "(line 1044,col 9)-(line 1044,col 116)",
        "(line 1045,col 9)-(line 1045,col 116)",
        "(line 1046,col 9)-(line 1046,col 116)",
        "(line 1047,col 9)-(line 1047,col 116)",
        "(line 1048,col 9)-(line 1048,col 116)",
        "(line 1049,col 9)-(line 1049,col 116)",
        "(line 1050,col 9)-(line 1050,col 116)",
        "(line 1051,col 9)-(line 1051,col 116)",
        "(line 1052,col 9)-(line 1052,col 116)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUrlSafe()",
      "begin_line": 1058,
      "end_line": 1072,
      "comment": "\n     * Tests url-safe Base64 against random data, sizes 0 to 150.\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1070,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUUID()",
      "begin_line": 1081,
      "end_line": 1168,
      "comment": "\n     * Base64 encoding of UUID\u0027s is a common use-case, especially in URL-SAFE mode. This test case ends up being the\n     * \"URL-SAFE\" JUnit\u0027s.\n     * \n     * @throws DecoderException\n     *             if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1085,col 37)",
        "(line 1088,col 9)-(line 1088,col 81)",
        "(line 1091,col 9)-(line 1091,col 81)",
        "(line 1094,col 9)-(line 1094,col 81)",
        "(line 1098,col 9)-(line 1098,col 81)",
        "(line 1100,col 9)-(line 1100,col 42)",
        "(line 1101,col 9)-(line 1101,col 75)",
        "(line 1102,col 9)-(line 1102,col 75)",
        "(line 1103,col 9)-(line 1103,col 75)",
        "(line 1104,col 9)-(line 1104,col 75)",
        "(line 1106,col 9)-(line 1106,col 42)",
        "(line 1108,col 9)-(line 1108,col 75)",
        "(line 1109,col 9)-(line 1109,col 75)",
        "(line 1110,col 9)-(line 1110,col 75)",
        "(line 1111,col 9)-(line 1111,col 75)",
        "(line 1113,col 9)-(line 1113,col 42)",
        "(line 1115,col 9)-(line 1115,col 74)",
        "(line 1116,col 9)-(line 1116,col 74)",
        "(line 1117,col 9)-(line 1117,col 74)",
        "(line 1118,col 9)-(line 1118,col 74)",
        "(line 1120,col 9)-(line 1120,col 42)",
        "(line 1122,col 9)-(line 1122,col 73)",
        "(line 1123,col 9)-(line 1123,col 73)",
        "(line 1124,col 9)-(line 1124,col 73)",
        "(line 1125,col 9)-(line 1125,col 73)",
        "(line 1127,col 9)-(line 1167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testByteToStringVariations()",
      "begin_line": 1170,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 9)-(line 1172,col 38)",
        "(line 1173,col 9)-(line 1173,col 60)",
        "(line 1174,col 9)-(line 1174,col 32)",
        "(line 1175,col 9)-(line 1175,col 25)",
        "(line 1176,col 9)-(line 1176,col 84)",
        "(line 1178,col 9)-(line 1178,col 96)",
        "(line 1179,col 9)-(line 1179,col 107)",
        "(line 1180,col 9)-(line 1180,col 73)",
        "(line 1181,col 9)-(line 1181,col 84)",
        "(line 1182,col 9)-(line 1182,col 75)",
        "(line 1183,col 9)-(line 1183,col 86)",
        "(line 1184,col 9)-(line 1184,col 97)",
        "(line 1185,col 9)-(line 1185,col 108)",
        "(line 1186,col 9)-(line 1186,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testStringToByteVariations()",
      "begin_line": 1189,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 37)",
        "(line 1192,col 9)-(line 1192,col 43)",
        "(line 1193,col 9)-(line 1193,col 23)",
        "(line 1194,col 9)-(line 1194,col 25)",
        "(line 1195,col 9)-(line 1195,col 52)",
        "(line 1196,col 9)-(line 1196,col 46)",
        "(line 1197,col 9)-(line 1197,col 84)",
        "(line 1199,col 9)-(line 1199,col 110)",
        "(line 1200,col 9)-(line 1200,col 126)",
        "(line 1201,col 9)-(line 1201,col 123)",
        "(line 1202,col 9)-(line 1202,col 92)",
        "(line 1203,col 9)-(line 1203,col 105)",
        "(line 1204,col 9)-(line 1204,col 94)",
        "(line 1205,col 9)-(line 1205,col 107)",
        "(line 1206,col 9)-(line 1206,col 79)",
        "(line 1207,col 9)-(line 1207,col 92)",
        "(line 1208,col 9)-(line 1208,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.toString(byte[])",
      "begin_line": 1211,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 46)",
        "(line 1213,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1219,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testHugeLineSeparator()",
      "begin_line": 1227,
      "end_line": 1237,
      "comment": "\n     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.\n     * \n     * @see \u003ca href\u003d\"http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E\"\u003edev@commons.apache.org\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 56)",
        "(line 1231,col 9)-(line 1231,col 53)",
        "(line 1232,col 9)-(line 1232,col 82)",
        "(line 1233,col 9)-(line 1233,col 81)",
        "(line 1234,col 9)-(line 1234,col 43)",
        "(line 1235,col 9)-(line 1235,col 102)",
        "(line 1236,col 9)-(line 1236,col 78)"
      ]
    }
  ]
}