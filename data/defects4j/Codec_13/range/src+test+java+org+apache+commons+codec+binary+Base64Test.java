{
  "filepath": "/tmp/Codec-13b/src/test/java/org/apache/commons/codec/binary/Base64Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Base64Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 1258,
      "comment": "\n * Test cases for Base64 class.\n *\n * @see \u003ca href\u003d\"http://www.ietf.org/rfc/rfc2045.txt\"\u003eRFC 2045\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.getRandom()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * @return Returns the random.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsStringBase64()",
      "begin_line": 56,
      "end_line": 73,
      "comment": "\n     * Test the isStringBase64 method.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 39)",
        "(line 59,col 9)-(line 59,col 38)",
        "(line 60,col 9)-(line 60,col 103)",
        "(line 61,col 9)-(line 61,col 59)",
        "(line 63,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 96)",
        "(line 71,col 9)-(line 71,col 96)",
        "(line 72,col 9)-(line 72,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testBase64()",
      "begin_line": 78,
      "end_line": 100,
      "comment": "\n     * Test the Base64 implementation\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 45)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 85)",
        "(line 83,col 9)-(line 83,col 65)",
        "(line 84,col 9)-(line 84,col 81)",
        "(line 86,col 9)-(line 86,col 66)",
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 88,col 65)",
        "(line 89,col 9)-(line 89,col 81)",
        "(line 91,col 9)-(line 91,col 34)",
        "(line 92,col 9)-(line 92,col 69)",
        "(line 93,col 9)-(line 93,col 65)",
        "(line 94,col 9)-(line 94,col 81)",
        "(line 97,col 9)-(line 97,col 99)",
        "(line 98,col 9)-(line 98,col 70)",
        "(line 99,col 9)-(line 99,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithInnerPad()",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\n     * Test our decode with pad character in the middle.\n     * (Our current implementation:  halt decode and return what we\u0027ve got so far).\n     *\n     * The point of this test is not to say \"this is the correct way to decode base64.\"\n     * The point is simply to keep us aware of the current logic since 1.4 so we\n     * don\u0027t accidentally break it without realizing.\n     *\n     * Note for historians.  The 1.3 logic would decode to:\n     * \"Hello World\\u0000Hello World\" -- null in the middle ---\n     * and 1.4 unwittingly changed it to current logic.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 66)",
        "(line 117,col 9)-(line 117,col 59)",
        "(line 118,col 9)-(line 118,col 72)",
        "(line 119,col 9)-(line 119,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testChunkedEncodeMultipleOf76()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * Tests Base64.encodeBase64().\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 88)",
        "(line 130,col 9)-(line 130,col 102)",
        "(line 131,col 9)-(line 131,col 75)",
        "(line 132,col 9)-(line 132,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec68()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * CODEC-68: isBase64 throws ArrayIndexOutOfBoundsException on some non-BASE64 bytes\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)",
        "(line 141,col 9)-(line 141,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger1()",
      "begin_line": 144,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 66)",
        "(line 147,col 9)-(line 147,col 107)",
        "(line 149,col 9)-(line 149,col 77)",
        "(line 150,col 9)-(line 150,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger2()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 108)",
        "(line 158,col 9)-(line 158,col 77)",
        "(line 159,col 9)-(line 159,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger3()",
      "begin_line": 162,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 131)",
        "(line 165,col 9)-(line 167,col 82)",
        "(line 169,col 9)-(line 169,col 77)",
        "(line 170,col 9)-(line 170,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeInteger4()",
      "begin_line": 173,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 178,col 20)",
        "(line 179,col 9)-(line 184,col 56)",
        "(line 186,col 9)-(line 186,col 77)",
        "(line 187,col 9)-(line 187,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerEdgeCases()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodeIntegerNull()",
      "begin_line": 195,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructors()",
      "begin_line": 207,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 22)",
        "(line 210,col 9)-(line 210,col 30)",
        "(line 211,col 9)-(line 211,col 32)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 213,col 9)-(line 213,col 46)",
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 49)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 72)",
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean()",
      "begin_line": 243,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 70)",
        "(line 246,col 9)-(line 246,col 69)",
        "(line 247,col 9)-(line 247,col 73)",
        "(line 248,col 9)-(line 248,col 60)",
        "(line 249,col 9)-(line 249,col 65)",
        "(line 250,col 9)-(line 250,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testConstructor_Int_ByteArray_Boolean_UrlSafe()",
      "begin_line": 253,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 69)",
        "(line 257,col 9)-(line 257,col 69)",
        "(line 258,col 9)-(line 258,col 73)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 60)",
        "(line 261,col 9)-(line 261,col 58)",
        "(line 262,col 9)-(line 262,col 58)",
        "(line 263,col 9)-(line 263,col 65)",
        "(line 264,col 9)-(line 264,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex2()",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * Tests conditional true branch for \"marker0\" test.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadMarkerIndex3()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\n     * Tests conditional branches for \"marker1\" test.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 93)",
        "(line 281,col 9)-(line 281,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnly()",
      "begin_line": 284,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 85)",
        "(line 287,col 9)-(line 287,col 91)",
        "(line 289,col 9)-(line 289,col 84)",
        "(line 290,col 9)-(line 290,col 83)",
        "(line 291,col 9)-(line 291,col 82)",
        "(line 292,col 9)-(line 292,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodePadOnlyChunked()",
      "begin_line": 295,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 87)",
        "(line 298,col 9)-(line 298,col 93)",
        "(line 300,col 9)-(line 300,col 86)",
        "(line 301,col 9)-(line 301,col 85)",
        "(line 302,col 9)-(line 302,col 84)",
        "(line 303,col 9)-(line 303,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeWithWhitespace()",
      "begin_line": 306,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 55)",
        "(line 311,col 9)-(line 311,col 87)",
        "(line 312,col 9)-(line 312,col 87)",
        "(line 314,col 9)-(line 314,col 36)",
        "(line 315,col 9)-(line 315,col 37)",
        "(line 316,col 9)-(line 316,col 38)",
        "(line 317,col 9)-(line 317,col 38)",
        "(line 319,col 9)-(line 319,col 86)",
        "(line 320,col 9)-(line 320,col 72)",
        "(line 322,col 9)-(line 322,col 54)",
        "(line 324,col 9)-(line 324,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEmptyBase64()",
      "begin_line": 330,
      "end_line": 341,
      "comment": "\n     * Test encode and decode of empty byte array.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 35)",
        "(line 333,col 9)-(line 333,col 51)",
        "(line 334,col 9)-(line 334,col 62)",
        "(line 335,col 9)-(line 335,col 77)",
        "(line 337,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 338,col 44)",
        "(line 339,col 9)-(line 339,col 62)",
        "(line 340,col 9)-(line 340,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeRandom()",
      "begin_line": 344,
      "end_line": 354,
      "comment": " encode/decode a large random array",
      "child_ranges": [
        "(line 346,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecodeSmall()",
      "begin_line": 357,
      "end_line": 367,
      "comment": " encode/decode random arrays from size 0 to size 11",
      "child_ranges": [
        "(line 359,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize()",
      "begin_line": 369,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 33)",
        "(line 373,col 9)-(line 373,col 33)",
        "(line 374,col 9)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testCodec112()",
      "begin_line": 377,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 41)",
        "(line 380,col 9)-(line 380,col 49)",
        "(line 381,col 9)-(line 381,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeOverMaxSize(int)",
      "begin_line": 384,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIgnoringNonBase64InDecode()",
      "begin_line": 393,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 396,col 155)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsArrayByteBase64()",
      "begin_line": 399,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 65)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 54)",
        "(line 404,col 9)-(line 404,col 52)",
        "(line 405,col 9)-(line 405,col 69)",
        "(line 406,col 9)-(line 406,col 65)",
        "(line 407,col 9)-(line 407,col 53)",
        "(line 408,col 9)-(line 408,col 70)",
        "(line 409,col 9)-(line 409,col 63)",
        "(line 410,col 9)-(line 410,col 63)",
        "(line 411,col 9)-(line 411,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testIsUrlSafe()",
      "begin_line": 417,
      "end_line": 427,
      "comment": "\n     * Tests isUrlSafe.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 56)",
        "(line 420,col 9)-(line 420,col 54)",
        "(line 422,col 9)-(line 422,col 74)",
        "(line 423,col 9)-(line 423,col 71)",
        "(line 425,col 9)-(line 425,col 58)",
        "(line 426,col 9)-(line 426,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownDecodings()",
      "begin_line": 429,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 432,col 125)",
        "(line 433,col 9)-(line 434,col 133)",
        "(line 435,col 9)-(line 436,col 109)",
        "(line 437,col 9)-(line 438,col 133)",
        "(line 439,col 9)-(line 440,col 45)",
        "(line 441,col 9)-(line 441,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testKnownEncodings()",
      "begin_line": 444,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 447,col 107)",
        "(line 448,col 9)-(line 453,col 69)",
        "(line 454,col 9)-(line 455,col 113)",
        "(line 456,col 9)-(line 457,col 95)",
        "(line 458,col 9)-(line 459,col 113)",
        "(line 460,col 9)-(line 461,col 45)",
        "(line 462,col 9)-(line 462,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testNonBase64Test()",
      "begin_line": 465,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 36)",
        "(line 470,col 9)-(line 471,col 35)",
        "(line 473,col 9)-(line 484,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithInvalidParameter()",
      "begin_line": 487,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 40)",
        "(line 491,col 9)-(line 496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectDecodeWithValidParameter()",
      "begin_line": 500,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 47)",
        "(line 504,col 9)-(line 504,col 80)",
        "(line 506,col 9)-(line 506,col 40)",
        "(line 507,col 9)-(line 507,col 46)",
        "(line 508,col 9)-(line 508,col 51)",
        "(line 509,col 9)-(line 509,col 50)",
        "(line 511,col 9)-(line 511,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithInvalidParameter()",
      "begin_line": 514,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 40)",
        "(line 517,col 9)-(line 522,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncodeWithValidParameter()",
      "begin_line": 525,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 47)",
        "(line 529,col 9)-(line 529,col 65)",
        "(line 531,col 9)-(line 531,col 40)",
        "(line 532,col 9)-(line 532,col 52)",
        "(line 533,col 9)-(line 533,col 69)",
        "(line 534,col 9)-(line 534,col 47)",
        "(line 536,col 9)-(line 536,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testObjectEncode()",
      "begin_line": 539,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 40)",
        "(line 542,col 9)-(line 542,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testPairs()",
      "begin_line": 545,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 80)",
        "(line 548,col 9)-(line 551,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section2Dot1CrLfDefinition()",
      "begin_line": 557,
      "end_line": 560,
      "comment": "\n     * Tests RFC 2045 section 2.1 CRLF definition.\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc2045Section6Dot8ChunkSizeDefinition()",
      "begin_line": 565,
      "end_line": 568,
      "comment": "\n     * Tests RFC 2045 section 6.8 chuck size definition.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc1421Section6Dot8ChunkSizeDefinition()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Tests RFC 1421 section 4.3.2.4 chuck size definition.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Decode()",
      "begin_line": 592,
      "end_line": 601,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 80)",
        "(line 595,col 9)-(line 595,col 85)",
        "(line 596,col 9)-(line 596,col 86)",
        "(line 597,col 9)-(line 597,col 87)",
        "(line 598,col 9)-(line 598,col 92)",
        "(line 599,col 9)-(line 599,col 93)",
        "(line 600,col 9)-(line 600,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeWithCrLf()",
      "begin_line": 617,
      "end_line": 627,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 81)",
        "(line 620,col 9)-(line 620,col 87)",
        "(line 621,col 9)-(line 621,col 92)",
        "(line 622,col 9)-(line 622,col 93)",
        "(line 623,col 9)-(line 623,col 94)",
        "(line 624,col 9)-(line 624,col 99)",
        "(line 625,col 9)-(line 625,col 100)",
        "(line 626,col 9)-(line 626,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10Encode()",
      "begin_line": 643,
      "end_line": 652,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 82)",
        "(line 646,col 9)-(line 646,col 87)",
        "(line 647,col 9)-(line 647,col 88)",
        "(line 648,col 9)-(line 648,col 89)",
        "(line 649,col 9)-(line 649,col 94)",
        "(line 650,col 9)-(line 650,col 95)",
        "(line 651,col 9)-(line 651,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10DecodeEncode()",
      "begin_line": 668,
      "end_line": 677,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 29)",
        "(line 671,col 9)-(line 671,col 33)",
        "(line 672,col 9)-(line 672,col 33)",
        "(line 673,col 9)-(line 673,col 33)",
        "(line 674,col 9)-(line 674,col 37)",
        "(line 675,col 9)-(line 675,col 37)",
        "(line 676,col 9)-(line 676,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testDecodeEncode(java.lang.String)",
      "begin_line": 679,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 98)",
        "(line 681,col 9)-(line 681,col 101)",
        "(line 682,col 9)-(line 682,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testRfc4648Section10EncodeDecode()",
      "begin_line": 699,
      "end_line": 708,
      "comment": "\n     * Tests RFC 4648 section 10 test vectors.\n     * \u003cul\u003e\n     * \u003cli\u003eBASE64(\"\") \u003d \"\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"f\") \u003d \"Zg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fo\") \u003d \"Zm8\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foo\") \u003d \"Zm9v\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foob\") \u003d \"Zm9vYg\u003d\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"fooba\") \u003d \"Zm9vYmE\u003d\"\u003c/li\u003e\n     * \u003cli\u003eBASE64(\"foobar\") \u003d \"Zm9vYmFy\"\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see \u003ca href\u003d\"http://tools.ietf.org/html/rfc4648\"\u003ehttp://tools.ietf.org/html/rfc4648\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 29)",
        "(line 702,col 9)-(line 702,col 30)",
        "(line 703,col 9)-(line 703,col 31)",
        "(line 704,col 9)-(line 704,col 32)",
        "(line 705,col 9)-(line 705,col 33)",
        "(line 706,col 9)-(line 706,col 34)",
        "(line 707,col 9)-(line 707,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testEncodeDecode(java.lang.String)",
      "begin_line": 710,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 98)",
        "(line 712,col 9)-(line 712,col 98)",
        "(line 713,col 9)-(line 713,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletons()",
      "begin_line": 716,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 84)",
        "(line 719,col 9)-(line 719,col 84)",
        "(line 720,col 9)-(line 720,col 84)",
        "(line 721,col 9)-(line 721,col 84)",
        "(line 722,col 9)-(line 722,col 84)",
        "(line 723,col 9)-(line 723,col 84)",
        "(line 724,col 9)-(line 724,col 84)",
        "(line 725,col 9)-(line 725,col 84)",
        "(line 726,col 9)-(line 726,col 84)",
        "(line 727,col 9)-(line 727,col 84)",
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
        "(line 799,col 9)-(line 799,col 85)",
        "(line 800,col 9)-(line 800,col 85)",
        "(line 801,col 9)-(line 801,col 85)",
        "(line 802,col 9)-(line 802,col 85)",
        "(line 803,col 9)-(line 803,col 85)",
        "(line 804,col 9)-(line 804,col 85)",
        "(line 805,col 9)-(line 805,col 85)",
        "(line 806,col 9)-(line 806,col 85)",
        "(line 807,col 9)-(line 807,col 85)",
        "(line 808,col 9)-(line 808,col 85)",
        "(line 809,col 9)-(line 809,col 85)",
        "(line 810,col 9)-(line 810,col 85)",
        "(line 811,col 9)-(line 811,col 85)",
        "(line 812,col 9)-(line 812,col 85)",
        "(line 813,col 9)-(line 813,col 85)",
        "(line 814,col 9)-(line 814,col 85)",
        "(line 815,col 9)-(line 815,col 85)",
        "(line 816,col 9)-(line 816,col 85)",
        "(line 817,col 9)-(line 817,col 85)",
        "(line 818,col 9)-(line 818,col 86)",
        "(line 819,col 9)-(line 819,col 86)",
        "(line 820,col 9)-(line 820,col 86)",
        "(line 821,col 9)-(line 821,col 86)",
        "(line 822,col 9)-(line 822,col 86)",
        "(line 823,col 9)-(line 826,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testSingletonsChunked()",
      "begin_line": 829,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 95)",
        "(line 832,col 9)-(line 832,col 95)",
        "(line 833,col 9)-(line 833,col 95)",
        "(line 834,col 9)-(line 834,col 95)",
        "(line 835,col 9)-(line 835,col 95)",
        "(line 836,col 9)-(line 836,col 95)",
        "(line 837,col 9)-(line 837,col 95)",
        "(line 838,col 9)-(line 838,col 95)",
        "(line 839,col 9)-(line 839,col 95)",
        "(line 840,col 9)-(line 840,col 95)",
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
        "(line 912,col 9)-(line 912,col 96)",
        "(line 913,col 9)-(line 913,col 96)",
        "(line 914,col 9)-(line 914,col 96)",
        "(line 915,col 9)-(line 915,col 96)",
        "(line 916,col 9)-(line 916,col 96)",
        "(line 917,col 9)-(line 917,col 96)",
        "(line 918,col 9)-(line 918,col 96)",
        "(line 919,col 9)-(line 919,col 96)",
        "(line 920,col 9)-(line 920,col 96)",
        "(line 921,col 9)-(line 921,col 96)",
        "(line 922,col 9)-(line 922,col 96)",
        "(line 923,col 9)-(line 923,col 96)",
        "(line 924,col 9)-(line 924,col 96)",
        "(line 925,col 9)-(line 925,col 96)",
        "(line 926,col 9)-(line 926,col 96)",
        "(line 927,col 9)-(line 927,col 96)",
        "(line 928,col 9)-(line 928,col 96)",
        "(line 929,col 9)-(line 929,col 96)",
        "(line 930,col 9)-(line 930,col 96)",
        "(line 931,col 9)-(line 931,col 97)",
        "(line 932,col 9)-(line 932,col 97)",
        "(line 933,col 9)-(line 933,col 97)",
        "(line 934,col 9)-(line 934,col 97)",
        "(line 935,col 9)-(line 935,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTriplets()",
      "begin_line": 938,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 104)",
        "(line 941,col 9)-(line 941,col 104)",
        "(line 942,col 9)-(line 942,col 104)",
        "(line 943,col 9)-(line 943,col 104)",
        "(line 944,col 9)-(line 944,col 104)",
        "(line 945,col 9)-(line 945,col 104)",
        "(line 946,col 9)-(line 946,col 104)",
        "(line 947,col 9)-(line 947,col 104)",
        "(line 948,col 9)-(line 948,col 104)",
        "(line 949,col 9)-(line 949,col 104)",
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
        "(line 984,col 9)-(line 984,col 105)",
        "(line 985,col 9)-(line 985,col 105)",
        "(line 986,col 9)-(line 986,col 105)",
        "(line 987,col 9)-(line 987,col 105)",
        "(line 988,col 9)-(line 988,col 105)",
        "(line 989,col 9)-(line 989,col 105)",
        "(line 990,col 9)-(line 990,col 105)",
        "(line 991,col 9)-(line 991,col 105)",
        "(line 992,col 9)-(line 992,col 105)",
        "(line 993,col 9)-(line 993,col 105)",
        "(line 994,col 9)-(line 994,col 105)",
        "(line 995,col 9)-(line 995,col 105)",
        "(line 996,col 9)-(line 996,col 105)",
        "(line 997,col 9)-(line 997,col 105)",
        "(line 998,col 9)-(line 998,col 105)",
        "(line 999,col 9)-(line 999,col 105)",
        "(line 1000,col 9)-(line 1000,col 105)",
        "(line 1001,col 9)-(line 1001,col 105)",
        "(line 1002,col 9)-(line 1002,col 105)",
        "(line 1003,col 9)-(line 1003,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testTripletsChunked()",
      "begin_line": 1006,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 115)",
        "(line 1009,col 9)-(line 1009,col 115)",
        "(line 1010,col 9)-(line 1010,col 115)",
        "(line 1011,col 9)-(line 1011,col 115)",
        "(line 1012,col 9)-(line 1012,col 115)",
        "(line 1013,col 9)-(line 1013,col 115)",
        "(line 1014,col 9)-(line 1014,col 115)",
        "(line 1015,col 9)-(line 1015,col 115)",
        "(line 1016,col 9)-(line 1016,col 115)",
        "(line 1017,col 9)-(line 1017,col 115)",
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
        "(line 1052,col 9)-(line 1052,col 116)",
        "(line 1053,col 9)-(line 1053,col 116)",
        "(line 1054,col 9)-(line 1054,col 116)",
        "(line 1055,col 9)-(line 1055,col 116)",
        "(line 1056,col 9)-(line 1056,col 116)",
        "(line 1057,col 9)-(line 1057,col 116)",
        "(line 1058,col 9)-(line 1058,col 116)",
        "(line 1059,col 9)-(line 1059,col 116)",
        "(line 1060,col 9)-(line 1060,col 116)",
        "(line 1061,col 9)-(line 1061,col 116)",
        "(line 1062,col 9)-(line 1062,col 116)",
        "(line 1063,col 9)-(line 1063,col 116)",
        "(line 1064,col 9)-(line 1064,col 116)",
        "(line 1065,col 9)-(line 1065,col 116)",
        "(line 1066,col 9)-(line 1066,col 116)",
        "(line 1067,col 9)-(line 1067,col 116)",
        "(line 1068,col 9)-(line 1068,col 116)",
        "(line 1069,col 9)-(line 1069,col 116)",
        "(line 1070,col 9)-(line 1070,col 116)",
        "(line 1071,col 9)-(line 1071,col 116)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUrlSafe()",
      "begin_line": 1077,
      "end_line": 1091,
      "comment": "\n     * Tests url-safe Base64 against random data, sizes 0 to 150.\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1089,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testUUID()",
      "begin_line": 1100,
      "end_line": 1187,
      "comment": "\n     * Base64 encoding of UUID\u0027s is a common use-case, especially in URL-SAFE mode. This test case ends up being the\n     * \"URL-SAFE\" JUnit\u0027s.\n     *\n     * @throws DecoderException\n     *             if Hex.decode() fails - a serious problem since Hex comes from our own commons-codec!\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 43)",
        "(line 1107,col 9)-(line 1107,col 81)",
        "(line 1110,col 9)-(line 1110,col 81)",
        "(line 1113,col 9)-(line 1113,col 81)",
        "(line 1117,col 9)-(line 1117,col 81)",
        "(line 1119,col 9)-(line 1119,col 48)",
        "(line 1120,col 9)-(line 1120,col 75)",
        "(line 1121,col 9)-(line 1121,col 75)",
        "(line 1122,col 9)-(line 1122,col 75)",
        "(line 1123,col 9)-(line 1123,col 75)",
        "(line 1125,col 9)-(line 1125,col 48)",
        "(line 1127,col 9)-(line 1127,col 75)",
        "(line 1128,col 9)-(line 1128,col 75)",
        "(line 1129,col 9)-(line 1129,col 75)",
        "(line 1130,col 9)-(line 1130,col 75)",
        "(line 1132,col 9)-(line 1132,col 48)",
        "(line 1134,col 9)-(line 1134,col 74)",
        "(line 1135,col 9)-(line 1135,col 74)",
        "(line 1136,col 9)-(line 1136,col 74)",
        "(line 1137,col 9)-(line 1137,col 74)",
        "(line 1139,col 9)-(line 1139,col 48)",
        "(line 1141,col 9)-(line 1141,col 73)",
        "(line 1142,col 9)-(line 1142,col 73)",
        "(line 1143,col 9)-(line 1143,col 73)",
        "(line 1144,col 9)-(line 1144,col 73)",
        "(line 1146,col 9)-(line 1186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testByteToStringVariations()",
      "begin_line": 1189,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 9)-(line 1191,col 44)",
        "(line 1192,col 9)-(line 1192,col 66)",
        "(line 1193,col 9)-(line 1193,col 38)",
        "(line 1194,col 9)-(line 1194,col 31)",
        "(line 1195,col 9)-(line 1195,col 90)",
        "(line 1197,col 9)-(line 1197,col 96)",
        "(line 1198,col 9)-(line 1198,col 107)",
        "(line 1199,col 9)-(line 1199,col 73)",
        "(line 1200,col 9)-(line 1200,col 84)",
        "(line 1201,col 9)-(line 1201,col 75)",
        "(line 1202,col 9)-(line 1202,col 86)",
        "(line 1203,col 9)-(line 1203,col 97)",
        "(line 1204,col 9)-(line 1204,col 108)",
        "(line 1205,col 9)-(line 1205,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testStringToByteVariations()",
      "begin_line": 1208,
      "end_line": 1228,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 43)",
        "(line 1211,col 9)-(line 1211,col 49)",
        "(line 1212,col 9)-(line 1212,col 29)",
        "(line 1213,col 9)-(line 1213,col 31)",
        "(line 1214,col 9)-(line 1214,col 58)",
        "(line 1215,col 9)-(line 1215,col 52)",
        "(line 1216,col 9)-(line 1216,col 90)",
        "(line 1218,col 9)-(line 1218,col 110)",
        "(line 1219,col 9)-(line 1219,col 126)",
        "(line 1220,col 9)-(line 1220,col 123)",
        "(line 1221,col 9)-(line 1221,col 92)",
        "(line 1222,col 9)-(line 1222,col 105)",
        "(line 1223,col 9)-(line 1223,col 94)",
        "(line 1224,col 9)-(line 1224,col 107)",
        "(line 1225,col 9)-(line 1225,col 79)",
        "(line 1226,col 9)-(line 1226,col 92)",
        "(line 1227,col 9)-(line 1227,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.toString(byte[])",
      "begin_line": 1230,
      "end_line": 1239,
      "comment": "",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 54)",
        "(line 1232,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.binary.Base64Test.testHugeLineSeparator()",
      "begin_line": 1246,
      "end_line": 1256,
      "comment": "\n     * Tests a lineSeparator much bigger than DEFAULT_BUFFER_SIZE.\n     *\n     * @see \"\u003ca href\u003d\u0027http://mail-archives.apache.org/mod_mbox/commons-dev/201202.mbox/%3C4F3C85D7.5060706@snafu.de%3E\u0027\u003edev@commons.apache.org\u003c/a\u003e\"\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 56)",
        "(line 1250,col 9)-(line 1250,col 53)",
        "(line 1251,col 9)-(line 1251,col 88)",
        "(line 1252,col 9)-(line 1252,col 87)",
        "(line 1253,col 9)-(line 1253,col 49)",
        "(line 1254,col 9)-(line 1254,col 108)",
        "(line 1255,col 9)-(line 1255,col 73)"
      ]
    }
  ]
}